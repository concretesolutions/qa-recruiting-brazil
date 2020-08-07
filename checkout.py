import unittest

regras = {}
regras['A'] = {'preco': 50, 'desconto': {3: 130}}
regras['B'] = {'preco': 30, 'desconto': {2: 45}}
regras['C'] = {'preco': 20}
regras['D'] = {'preco': 15}

class Checkout():

  def __init__(self, regras_de_precos):
    self.regras_de_precos = regras_de_precos
    self.total = 0
    self.itens_sem_desconto={}
    self.itens_com_desconto={}

  @staticmethod
  def carrinho(regras_de_precos):
    return Checkout(regras_de_precos)

  def adicionar_ao_carrinho(self,item):
    self.adiciona_item_sem_desconto(item)

    if item in self.regras_de_precos:
      regra_item = self.regras_de_precos[item]

      if self.validar_desconto(item):
        self.aplicar_desconto(item)
      else:
        self.total += regra_item['preco']

  def validar_desconto(self, item):
    regra_item = self.regras_de_precos[item]
    if 'desconto' in regra_item:
      if self.itens_sem_desconto[item] in regra_item['desconto']:
        return True

    return False

  def aplicar_desconto(self, item):
      regra_item = self.regras_de_precos[item]
      desconto = regra_item['desconto']
      numero_de_itens = self.itens_sem_desconto[item]

      self.itens_sem_desconto[item] -= numero_de_itens
      self.itens_com_desconto[item] += numero_de_itens
      self.total -= regra_item['preco'] * (numero_de_itens - 1)
      self.total += desconto[numero_de_itens]

  def adiciona_item_sem_desconto(self, item):
    if item in self.itens_sem_desconto:
      self.itens_sem_desconto[item] += 1
    else:
      self.itens_sem_desconto[item] = 1

    if item not in self.itens_com_desconto:
      self.itens_com_desconto[item] = 0

class TestCheckout(unittest.TestCase):

  def validar_preco_total(self, itens, total):
    c = Checkout.carrinho(regras)
    for item in itens:
      c.adicionar_ao_carrinho(item)
    self.assertEqual(total, c.total)

  def teste_total_itens(self):
    self.validar_preco_total('', 0)
    self.validar_preco_total('A', 50)
    self.validar_preco_total('AB', 80)
    self.validar_preco_total('CDBA', 115)

    self.validar_preco_total('AA', 100)
    self.validar_preco_total('AAA', 130)
    self.validar_preco_total('AAAA', 180)
    self.validar_preco_total('AAAAA', 230)
    self.validar_preco_total('AAAAAA', 260)
    self.validar_preco_total('AAAAAAA', 310)
    self.validar_preco_total('AAAAAAAA', 360)
    self.validar_preco_total('AAAAAAAAA', 390)
    self.validar_preco_total('AAAAAAAAAA', 440)
    self.validar_preco_total('AAAAAAAAAAA', 490)
    self.validar_preco_total('AAAAAAAAAAAA', 520)

    self.validar_preco_total('AAAB', 160)
    self.validar_preco_total('AAABB', 175)
    self.validar_preco_total('AAABBD', 190)
    self.validar_preco_total('DABABA', 190)

  def teste_um_a_um(self):
    c = Checkout.carrinho(regras)
    self.assertEqual(0, c.total)
    c.adicionar_ao_carrinho('A')
    self.assertEqual(50, c.total)
    c.adicionar_ao_carrinho('B')
    self.assertEqual(80, c.total)
    c.adicionar_ao_carrinho('A')
    self.assertEqual(130, c.total)
    c.adicionar_ao_carrinho('A')
    self.assertEqual(160, c.total)
    c.adicionar_ao_carrinho('B')
    self.assertEqual(175, c.total)

if __name__ == '__main__':
    unittest.main()
