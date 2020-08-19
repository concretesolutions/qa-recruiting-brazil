# Domain class to manage items and prices (unit and special)
class Item:
    name = ""
    unit_price = 0
    special_price: dict = {}

    def __init__(self, price_rule):
        self.name = price_rule[0]
        self.unit_price = price_rule[1]
        self.special_price = {}
        for price in price_rule[2]:
            self.special_price.update({price[0]: price[1]})
