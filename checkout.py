from product_item import Item


class InvalidProductException(Exception):
    def __init__(self):
        self.message = "This product is not part of catalog"


class Checkout(object):
    def __init__(self, pricing_rules):
        self.pricing_rules = pricing_rules  # dict
        self.product_list = list()
    
    def scan(self, product_code):
        if product_code.upper() in self.pricing_rules:
            self.product_list.append(product_code)
        else:
            raise InvalidProductException
    
    def calculate_item_total_price(self, product_code, product_list):
        item_price = Item(*self.pricing_rules[product_code.upper()])
        for product in product_list:
            if product == product_code:
                item_price.increment_item_total()
        item_price.calculate_item_price()
        return item_price.calculate_item_price()

    def calculate_checkout(self):
        total_price = 0
        product_set = set(self.product_list)
        for product in product_set:
            total_price += self.calculate_item_total_price(product, self.product_list)
        return total_price


