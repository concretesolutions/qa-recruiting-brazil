class CheckOut:

    def __init__(self, rules):
        self._total = 0
        self.item_count = {}
        self.rules = rules

        for i,v in rules.items():
            self.item_count[i] = 0

    def total(self):
        return self._total

    def scan(self, item):
        price = self.get_price(item)
        if price:
            self._total += price
            self.item_count[item] += 1
            self.apply_discount(item)

    def get_price(self, item):
        item = self.rules.get(item)
        if item:
            return item.get('price')
        return None

    def apply_discount(self, item):
        count = self.item_count.get(item)
        item_rule = self.rules.get(item)
        discount_qtd = item_rule.get('discount_qtd')

        if discount_qtd and (count == discount_qtd):
            item_price = item_rule.get('price')
            discount_price = item_rule.get('discount_price')
            discount = (discount_qtd * item_price) - discount_price
            self._total -= discount
            self.item_count[item] = 0

        return