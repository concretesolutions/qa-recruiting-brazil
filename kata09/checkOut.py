from kata09.item import Item


# Class responsible for Managing checkout
class CheckOut:
    items = []
    item_queue: dict = {}
    total = 0

    # Class Constructor
    def __init__(self, pricing_rules):
        for rule in pricing_rules:
            item = Item(rule)
            self.items.append(item)

        self.total = 0
        self.item_queue = {}

    # Method responsible for scanning an item x
    def scan(self, item):
        # If item has not been included before, add to dict
        if item not in self.item_queue.keys():
            self.item_queue.update({item: 1})
        # else, increase item x count by 1
        else:
            self.item_queue.update({item: self.item_queue[item] + 1})

        # then, calculate new total after this scanning
        self.calculate_total()

    # Method responsible for calculating price total using a list of scanned products
    def calculate_total(self):
        total = 0
        # for each group of items (A, B, C or D)
        for key in self.item_queue.keys():

            # Get item rule and special price rules for it
            rule = [x for x in self.items if x.name == key]
            key_special_prices = rule[0].special_price

            # If there's a special rule for the item X, get max_amount (if there's more than one rule available -
            # flexibility)
            try:
                max_amount = max([int(s) for s in key_special_prices.keys()])
            # If not, max_amount is set as 0
            except ValueError as e:
                max_amount = 0

            # If there's a special rule and the amount of items of an item X is equal or greater than max_amount,
            # apply special rule for the groups of items and the others (mod) to be applied by unit_price
            if 0 < max_amount <= self.item_queue[key]:
                special_total = (self.item_queue[key] // max_amount * key_special_prices[max_amount])
                unit_total = (self.item_queue[key] % max_amount) * rule[0].unit_price
                total = total + unit_total + special_total

            # If not, just apply unit_price for the amount of items
            else:
                total = total + (self.item_queue[key] * rule[0].unit_price)

        self.total = total
