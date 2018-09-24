import unittest

rules = {};
rules['A'] = {'price': 50, 'discount': {3: 130}};
rules['B'] = {'price': 30, 'discount': {2: 45}};
rules['C'] = {'price': 20}
rules['D'] = {'price': 15}

class Checkout():

  def __init__(self, pricing_rules):
    self.pricing_rules = pricing_rules
    self.total = 0
    self.items_without_discount={}
    self.items_with_discount={}

  @staticmethod
  def new(pricing_rules):
    return Checkout(pricing_rules)

  def scan(self,sku):
    self.increment_item_without_discount(sku)

    if sku in self.pricing_rules:
      item_rule = self.pricing_rules[sku]

      if self.should_apply_discount(sku):
        self.apply_discount(sku)
      else:
        self.total += item_rule['price']

  def should_apply_discount(self, sku):
    item_rule = self.pricing_rules[sku]
    if 'discount' in item_rule:
      if self.items_without_discount[sku] in item_rule['discount']:
        return  True

    return False

  def apply_discount(self, sku):
      item_rule = self.pricing_rules[sku]
      discount = item_rule['discount']
      number_of_items = self.items_without_discount[sku]

      self.items_without_discount[sku] -= number_of_items
      self.items_with_discount[sku] += number_of_items
      self.total -= item_rule['price'] * (number_of_items - 1)
      self.total += discount[number_of_items]

  def increment_item_without_discount(self, sku):
    if sku in self.items_without_discount:
      self.items_without_discount[sku] += 1
    else:
      self.items_without_discount[sku] = 1

    if sku not in self.items_with_discount:
      self.items_with_discount[sku] = 0

class TestStringMethods(unittest.TestCase):

  def runTest(self,to_scan, total):
    c = Checkout.new(rules)
    for sku in to_scan:
      c.scan(sku)
    self.assertEquals(total, c.total)

#  def testCreateWithoutRules(self):
#    c = Checkout.new([])
#    self.assertIsInstance(c, Checkout)

#  def testTotalIsZero(self):
#    c = Checkout.new(rules)
    c.scan('')
    self.assertEquals(0, c.total)

  def testOneA(self):
    self.runTest('A', 50)
    self.runTest('AB', 80)
    self.runTest('CDBA', 115)
    self.runTest('AA', 100)
    self.runTest('AAA', 130)
    self.runTest('AAAA', 180)
    self.runTest('AAAAA', 230)
    self.runTest('AAAAAA', 260)
    self.runTest('AAAAAAAAAAAA', 520)
    self.runTest('AAAB', 160)
    self.runTest('AAABB', 175)
    self.runTest('AAABBD', 190)
    self.runTest('DABABA', 190)

  def testScanLittleByLittle(self):
    c = Checkout.new(rules)
    self.assertEquals(0, c.total)
    c.scan('A')
    self.assertEquals(50, c.total)
    c.scan('B')
    self.assertEquals(80, c.total)
    c.scan('A')
    self.assertEquals(130, c.total)
    c.scan('A')
    self.assertEquals(160, c.total)
    c.scan('B')
    self.assertEquals(175, c.total)


if __name__ == '__main__':
    unittest.main()