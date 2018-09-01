"""
Regras do Checkout

1. product custa 50
2. 'B' custa 30
3. 'C' custa 20
4. 'D' custa 15
5. 3 'A' custa 130
6. 2 'B' custa 45
"""
class Checkout:
    def __init__(self):
        self.products = ''
        self.rules = {'A': 50, 'B': 30, 'C': 20, 'D': 15}

    def scan(self, product):
        if type(product) == str:
            self.products += product.upper()
        else:
            self.products += str(product)

    def total(self):
        product_list = ['A', 'B', 'C', 'D']
        price = 0
        for product in product_list:
            count_product = self.products.count(product)
            if count_product == 0:
                continue
                #     a.scan('BAAAA')
            elif product == 'A':
                module_product = self.products.count(product) % 3
                if module_product == 0:
                    price += count_product / 3 * 130

                elif module_product != 0:
                    if count_product < 3:
                        price += count_product * self.rules[product]

                    else:
                        count_product = count_product - module_product
                        price += module_product * self.rules[product]
                        price += (count_product / 3) * 130

            elif product == 'B':
                module_product = self.products.count(product) % 2
                if module_product == 0:
                    price += count_product / 2 * 45

                elif module_product != 0:
                    if count_product < 2:
                        price += count_product * self.rules[product]

                    else:
                        count_product = count_product - module_product
                        price += module_product * self.rules[product]
                        price += (count_product / 2) * 45

            elif product == 'C':
                count_product = self.products.count(product)
                price += count_product * self.rules[product]

            elif product == 'D':
                count_product = self.products.count(product)
                price += count_product * self.rules[product]

            else:
                price += 0

        return price


if __name__ == '__main__':
    pass
