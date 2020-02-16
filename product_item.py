class Item(object):
    def __init__(self, unit_price, promo_size=None, promo_price=None):
        self.item_total = 0
        self.unit_price = unit_price
        self.promo_price = promo_price
        self.promo_size = promo_size
    
    def calculate_item_price(self):
        if self.has_special_price():
            price = (self.item_total//self.promo_size)*self.promo_price + \
                    (self.item_total%self.promo_size)*self.unit_price
        else:
            price = self.item_total*self.unit_price
        return price
    
    def increment_item_total(self):
        self.item_total += 1
    
    def get_item_total(self):
        return self.item_total

    def has_special_price(self):
        return bool(self.promo_price and self.promo_size)
    
