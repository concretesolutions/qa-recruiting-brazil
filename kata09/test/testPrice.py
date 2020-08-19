import unittest

from kata09.checkOut import CheckOut


# Test Class (Structure copied from Kata09.md)
class TestPrice(unittest.TestCase):
    PRICING_RULES = [
        ("A", 50, [(3, 130)]),
        ("B", 30, [(2, 45)]),
        ("C", 20, []),
        ("D", 15, [])
    ]

    def price(self, goods):
        co = CheckOut(self.PRICING_RULES)
        if goods == "":
            return 0
        else:
            for item in goods:
                co.scan(item)

            # print(co.total)
            return co.total

    def test_totals(self):
        self.assertEqual(0, self.price(""))
        self.assertEqual(50, self.price("A"))
        self.assertEqual(80, self.price("AB"))
        self.assertEqual(115, self.price("CDBA"))
        self.assertEqual(100, self.price("AA"))
        self.assertEqual(130, self.price("AAA"))
        self.assertEqual(180, self.price("AAAA"))
        self.assertEqual(230, self.price("AAAAA"))
        self.assertEqual(260, self.price("AAAAAA"))

        self.assertEqual(160, self.price("AAAB"))
        self.assertEqual(175, self.price("AAABB"))
        self.assertEqual(190, self.price("AAABBD"))
        self.assertEqual(190, self.price("DABABA"))

    def test_incremental(self):
        co = CheckOut(self.PRICING_RULES)
        self.assertEqual(0, co.total)
        co.scan("A")
        self.assertEqual(50, co.total)
        co.scan("B")
        self.assertEqual(80, co.total)
        co.scan("A")
        self.assertEqual(130, co.total)
        co.scan("A")
        self.assertEqual(160, co.total)
        co.scan("B")
        self.assertEqual(175, co.total)
