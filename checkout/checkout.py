import unittest
from rules import prices
from copy import deepcopy

class Checkout():
      
  def __init__(self):
    self.copy_prices = deepcopy(prices)
    self.total = 0

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

  def scanSKU(self,skus):
    self.total = 0
    self.copy_prices = deepcopy(prices)
    for sku in skus:
      self.scan(sku.upper())
    print(self.total)
    return self.total

  def scanUnit(self,skus):
    for sku in skus:
      self.scan(sku.upper())
    return self.total	
 