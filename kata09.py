PRICING_RULES = {
    'A': [50, '3 for 130'],
    'B': [30, '2 for 45'],
    'C': [20, ''],
    'D': [15, ''],
}


class Checkout:
    def __init__(self, pricing_rules):
        self.total = 0
        self.pricing_rules = pricing_rules
        self.stock = {}
        for key in self.pricing_rules.keys():
            self.stock[key] = 0

    def update_total(self):
        total = 0
        for key, rule in self.pricing_rules.items():
            quantity = self.stock[key]
            unit_price, special_offer = rule
            if special_offer == '':
                total += (unit_price * quantity)
            else:
                special_quantity, special_price = [int(value) for value in special_offer.split(" for ")]
                quotient = quantity // special_quantity
                remainder = quantity % special_quantity
                total += ((special_price * quotient) + (unit_price * remainder))
        self.total = total

    def scan(self, item):
        self.stock[item] += 1
        self.update_total()

    @staticmethod
    def new(pricing_rules):
        co = Checkout(pricing_rules)
        return co


class TestPrice:
    @staticmethod
    def price(goods):
        co = Checkout.new(PRICING_RULES)
        for item in goods: 
            co.scan(item)
        total = co.total
        return total

    @staticmethod
    def test_totals():
        assert TestPrice.price("") == 0, "Alguma coisa deu errado!"
        assert TestPrice.price("A") == 50, "Alguma coisa deu errado!"
        assert TestPrice.price("AB") == 80, "Alguma coisa deu errado!"
        assert TestPrice.price("CDBA") == 115, "Alguma coisa deu errado!"

        assert TestPrice.price("AA") == 100, "Alguma coisa deu errado!"
        assert TestPrice.price("AAA") == 130, "Alguma coisa deu errado!"
        assert TestPrice.price("AAAA") == 180, "Alguma coisa deu errado!"
        assert TestPrice.price("AAAAA") == 230, "Alguma coisa deu errado!"
        assert TestPrice.price("AAAAAA") == 260, "Alguma coisa deu errado!"

        assert TestPrice.price("AAAB") == 160, "Alguma coisa deu errado!"
        assert TestPrice.price("AAABB") == 175, "Alguma coisa deu errado!"
        assert TestPrice.price("AAABBD") == 190, "Alguma coisa deu errado!"
        assert TestPrice.price("DABABA") == 190, "Alguma coisa deu errado!"

    @staticmethod
    def test_incremental():
        co = Checkout.new(PRICING_RULES)
        assert co.total == 0, "Alguma coisa deu errado!"
        co.scan("A")
        assert co.total == 50, "Alguma coisa deu errado!"
        co.scan("B")
        assert co.total == 80, "Alguma coisa deu errado!"
        co.scan("A")
        assert co.total == 130, "Alguma coisa deu errado!"
        co.scan("A")
        assert co.total == 160, "Alguma coisa deu errado!"
        co.scan("B")
        assert co.total == 175, "Alguma coisa deu errado!"


if __name__ == "__main__":
    TestPrice.test_totals()
    TestPrice.test_incremental()
