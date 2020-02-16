import unittest

from checkout import Checkout,  InvalidProductException


class TestCheckout(unittest.TestCase):

    def test_calculate_checkout(self):
        rules = {
                "A": (50, 3, 130),
                "B": (30, 2, 45),
                "C": (20, None),
                "D": (15, None)
            }
        cashier = Checkout(rules)
        try:
            cashier.scan('A')
            cashier.scan('D')
            cashier.scan('A')
            cashier.scan('a')
            cashier.scan('B')
            cashier.scan('b')
            cashier.scan('d')
            cashier.scan('A')
            cashier.scan('b')
            cashier.scan('C')
            cashier.scan('A')
            cashier.scan('C')
            # expected total = 375
            self.assertEqual(cashier.calculate_checkout(), 375)
        except InvalidProductException as e:
            print(e.message)
            self.fail("No exception should have been raised here")
    
    def test_add_invalid_product(self):
        rules = {
                "A": (50, 3, 130),
                "D": (15, None)
            }
        cashier = Checkout(rules)
        with self.assertRaises(InvalidProductException):
            cashier.scan('A')
            cashier.scan('B')


if __name__ == "__main__":
    unittest.main()
