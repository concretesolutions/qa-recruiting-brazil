class CheckOut():

    """
    Classe Checkout.
    Desafio Kata09
    (http://codekata.com/kata/kata09-back-to-the-checkout/)
    """

    def __init__(self, rules):
        """
        Método construtor

        Parameters:
        rules (dict): Dicionário com as regras dos itens, preços e
                      descontos.
        """
        self.total = 0
        self.rules = rules
        self.count_itens = {}

        for item, value in rules.items():
            self.count_itens[item] = 0

    def scan(self, item):
        """Método scan

        Parameters:
        item (str): Item
        """
        price = self.get_price(item)
        if price:
            self.total += price
            self.count_itens[item] += 1
            self.special_price(item)

    def special_price(self, item):
        """Método special_price

        Parameters:
        item (str): Item
        """
        count = self.count_itens.get(item)
        item_rule = self.rules.get(item)
        special_qtd = item_rule.get('special_qtd')

        if special_qtd and (count == special_qtd):
            item_price = item_rule.get('unit_price')
            discount_price = item_rule.get('special_price')
            discount = (special_qtd * item_price) - discount_price
            self.total -= discount
            self.count_itens[item] = 0

    def get_price(self, item):
        """Método get_price

        Parameters:
        item (str): Item

        Returns:
        unit_price (int): Preço do item
        """
        item = self.rules.get(item)
        if item:
            return item.get('unit_price')
        return None
