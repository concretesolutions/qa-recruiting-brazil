import unittest

rules = {}
rules['A'] = {'price': 50, 'ammount': 3, 'discount': 130}
rules['B'] = {'price': 30, 'ammount': 2, 'discount': 45}
rules['C'] = {'price': 20}
rules['D'] = {'price': 15}

class checkout():

    def __init__(self, checkout_rules):
        self.checkout_rules = checkout_rules
        self.total = 0
        self.qnt_per_item = rules

        for a in self.qnt_per_item:
            self.qnt_per_item[a]['qnt'] = 0

    @staticmethod
    def new(checkout_rules):
        return checkout(checkout_rules)

    def scan(self, item):
        self.increment_item_list(item)
        self.total += self.checkout_rules[item]['price']
        self.apply_discount(item)
        return self.total

    def increment_item_list(self, item):
        self.qnt_per_item[item]['qnt'] += 1

    def apply_discount(self, item):        
        diff = 0
        for a in self.qnt_per_item:
            if 'ammount' in self.checkout_rules[item] and self.qnt_per_item[a]['qnt'] >= int(self.checkout_rules[item]['ammount']):
                diff = self.checkout_rules[item]['price'] - (self.checkout_rules[item]['discount'] / self.checkout_rules[item]['ammount'])
        self.total -= diff * (self.qnt_per_item[item]['qnt'])

    def enable_discount(self, item):
        if 'discount' in self.checkout_rules[item].keys():
            if self.qnt_per_item[item]['qnt'] >= self.checkout_rules[item]['ammount']:
                return True
        return False

class TestStringMethods(unittest.TestCase):

    def runTest(self,items, total):
        co = checkout.new(rules)
        for item in items:
            co.scan(item)

    def test_totals(self):
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



    def test_incremental(self):
        co = checkout.new(rules)
        self.assertEqual(0, co.total)
        co.scan('A')
        self.assertEqual(50, co.total)
        co.scan('B')
        self.assertEqual(80, co.total)
        co.scan('A')
        self.assertEqual(130, co.total)
        co.scan('A')
        self.assertEqual(160, co.total)
        co.scan('B')
        self.assertEqual(175, co.total)


if __name__ == '__main__':
    unittest.main()