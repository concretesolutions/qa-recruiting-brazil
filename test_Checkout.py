from unittest import TestCase
from supermarket import Checkout


class CheckoutTest(TestCase):
    def setUp(self):
        self.c = Checkout()

    def test_total_with_empty_scan(self):
        self.c.scan('')
        self.assertEqual(0, self.c.total())

    def test_total_with_AAA_scan(self):
        self.c.scan('AAA')
        self.assertEqual(130, self.c.total())

    def test_total_with_AAAAAA_scan(self):
        self.c.scan('AAAAAA')
        self.assertEqual(260, self.c.total())

    def test_total_with_B_scan(self):
        self.c.scan('B')
        self.assertEqual(30, self.c.total())

    def test_total_with_BB_scan(self):
        self.c.scan('BB')
        self.assertEqual(45, self.c.total())

    def test_total_with_BB_scan(self):
        self.c.scan('BBB')
        self.assertEqual(75, self.c.total())

    def test_total_with_C_scan(self):
        self.c.scan('C')
        self.assertEqual(20, self.c.total())

    def test_total_with_CC_scan(self):
        self.c.scan('CC')
        self.assertEqual(40, self.c.total())

    def test_total_with_CCC_scan(self):
        self.c.scan('CCC')
        self.assertEqual(60, self.c.total())

    def test_total_with_D_scan(self):
        self.c.scan('C')
        self.assertEqual(20, self.c.total())

    def test_total_with_DD_scan(self):
        self.c.scan('CC')
        self.assertEqual(40, self.c.total())

    def test_total_with_DDD_scan(self):
        self.c.scan('CCC')
        self.assertEqual(60, self.c.total())

    def test_total_with_ABAABDACCD_scan(self):
        self.c.scan('ABAABDACCD')
        self.assertEqual(295, self.c.total())

    def test_total_with_E_scan(self):
        self.c.scan('E')
        self.assertEqual(0, self.c.total())

    def test_total_with_11_scan(self):
        self.c.scan(11)
        self.assertEqual(0, self.c.total())

    def test_total_scan_11AAABE(self):
        self.c.scan('11AAABBE')
        self.assertEqual(175, self.c.total())
