# Ely Chris Araujo
# Date: 21, february, 2021

import re
import rulesprice

class Checkout(object):

    def __init__(self):
        self.cart = {}

    def scan(self, codes):
        """
        Lê uma string com a sequencia do produto e guarda no carrinho (cart).
        :return none
        """
        for code in codes:
            if code in self.cart:
                self.cart[code] += 1
            else:
                self.cart[code] = 1

    def calculate_total(self):
        """
        Calcule o valor total considerando os itens do carrinho.
        :return total: int
        """
        total = 0

        # Faz a iteração no dicionário que contém os códigos dos produtos e 
        # suas ocorrências (quantas vezes eles apareceram na string lida).
        for code, occurence in self.cart.iteritems():
            counter = {}
            product = code * occurence
            prices_rules = list(reversed(sorted(rules.prices[code].keys())))

            # Repite as regras de preços e pesquisa quantas vezes o produto aparece na sequência 
            # da regra, depois calcule os totais. Ele faz isso recursivamente com o "resto" 
            # até que a lista de regras de preços seja concluída.
            for rule in prices_rules:
                counter[rule] = 0
                ls = re.findall('.{1,' + str(rule) + '}', product)
                for item in ls:
                    if len(item) != rule:
                        product = item
                    else:
                        product = ""
                        counter[rule] += 1

            # Calcule a quantidade total em toda a iteração do dicionário a partir 
            # do arquivo rules.py.
            for group, value in counter.iteritems():
                total += rules.prices[code][group] * value

        return total


if __name__ == '__main__':
    pass
