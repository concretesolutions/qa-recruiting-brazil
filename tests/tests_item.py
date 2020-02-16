import unittest

from product_item import Item


class TestItem(unittest.TestCase):

    def test_item_total(self):
        item = Item(10, 2, 15)
        self.assertEqual(item.item_total, 0)
        for i in range(10):
            item.increment_item_total()
        self.assertEqual(item.item_total, 10)

    def test_calculate_special_price(self):
        item = Item(20, 2, 30)
        self.assertEqual(item.calculate_item_price(), 0)
        for i in range(5):
            item.increment_item_total()
        self.assertEqual(item.calculate_item_price(), 80)
    
    def test_calculate_regular_price(self):
        item = Item(20)
        self.assertEqual(item.calculate_item_price(), 0)
        for i in range(5):
            item.increment_item_total()
        self.assertEqual(item.calculate_item_price(), 100)


if __name__ == "__main__":
    unittest.main()
