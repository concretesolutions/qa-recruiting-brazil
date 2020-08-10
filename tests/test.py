import unittest
from checkout.checkout import Checkout
from rules import prices

class CheckCartMethods(unittest.TestCase):
    def setUp(self):
        self.c = Checkout()

    def test_incremental(self):
        self.assertEqual(self.c.scanUnit(''), 0 )
        self.assertEqual(self.c.scanUnit('A'), 50)
        self.assertEqual(self.c.scanUnit('B'), 80)
        self.assertEqual(self.c.scanUnit('A'), 130)
        self.assertEqual(self.c.scanUnit('A'), 160)
        self.assertEqual(self.c.scanUnit('B'), 175)

    def test_totals(self):
        self.assertEqual(self.c.scanSKU(''), 0 )
        self.assertEqual(self.c.scanSKU('A'), 50)
        self.assertEqual(self.c.scanSKU('AB'), 80)
        self.assertEqual(self.c.scanSKU('CDBA'), 115)
        self.assertEqual(self.c.scanSKU('AA'), 100)
        self.assertEqual(self.c.scanSKU('AAA'), 130)
        self.assertEqual(self.c.scanSKU('AAAA'), 180)
        self.assertEqual(self.c.scanSKU('AAAAA'), 230)
        self.assertEqual(self.c.scanSKU('AAAAAA'), 260)
        self.assertEqual(self.c.scanSKU('AAAB'), 160)
        self.assertEqual(self.c.scanSKU('AAABB'), 175)
        self.assertEqual(self.c.scanSKU('AAABBD'), 190)
        self.assertEqual(self.c.scanSKU('DABABA'), 190)
