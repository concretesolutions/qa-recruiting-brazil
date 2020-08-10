import unittest
from rules import prices
from copy import deepcopy

class Checkout():

  def __init__(self):
    self.copy_prices = deepcopy(prices)
    self.total = 0

  @staticmethod
  def new(newRules):
    return Checkout()
    
  def scan(self,sku):
    self.count(sku)    
    if self.has_discount(sku):
      self.apply_discount(sku)
    else:
      self.total += self.copy_prices[sku]['price']

  def has_discount(self,sku):
    if(self.copy_prices[sku]['specialQtd'] != 0 and self.copy_prices[sku]['repeat'] % self.copy_prices[sku]['specialQtd'] == 0):
      return True
    else:
      return False

  def apply_discount(self, sku):
    self.total += self.copy_prices[sku]['price']
    self.total -= (self.copy_prices[sku]['repeat'] * self.copy_prices[sku]['price'])
    self.total += self.copy_prices[sku]['specialPrice']
    self.copy_prices[sku]['repeat'] = 0

  def count(self, sku):
    if self.copy_prices[sku]['repeat'] == 0:
      self.copy_prices[sku]['repeat'] = 1
      
    elif(self.copy_prices[sku]['repeat'] == 0 and self.copy_prices[sku]['specialPrice'] == 0):
      self.copy_prices[sku]['repeat'] = 0
    else:
      self.copy_prices[sku]['repeat'] += 1

class TestStringMethods(unittest.TestCase):
  def scanSKU(self,skus):
    c = Checkout.new(prices)
    for sku in skus:
      c.scan(sku)
    print(c.total)
    return c.total

  def test_totals(self):
    self.assertEqual(self.scanSKU(''), 0 )
    self.assertEqual(self.scanSKU('A'), 50)
    self.assertEqual(self.scanSKU('AB'), 80)
    self.assertEqual(self.scanSKU('CDBA'), 115)
    self.assertEqual(self.scanSKU('AA'), 100)
    self.assertEqual(self.scanSKU('AAA'), 130)
    self.assertEqual(self.scanSKU('AAAA'), 180)
    self.assertEqual(self.scanSKU('AAAAA'), 230)
    self.assertEqual(self.scanSKU('AAAAAA'), 260)
    self.assertEqual(self.scanSKU('AAAB'), 160)
    self.assertEqual(self.scanSKU('AAABB'), 175)
    self.assertEqual(self.scanSKU('AAABBD'), 190)
    self.assertEqual(self.scanSKU('DABABA'), 190)

if __name__ == '__main__':
  unittest.main()