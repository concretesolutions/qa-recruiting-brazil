Kata09: Voltar para o Checkout
http://codekata.com/kata/kata09-back-to-the-checkout/

De volta ao supermercado. Nesta semana, implementaremos o código para um sistema de checkout que lida com esquemas de preços como “maçãs custam 50 centavos, três maçãs custam $ 1,30”.

Já em KataOne, pensamos em como modelar as várias opções de preços de supermercado. Analisamos coisas como "três por um dólar", "US $ 1,99 por libra" e "compre dois e ganhe um de graça".

Esta semana, vamos implementar o código para uma caixa de supermercado que calcula o preço total de vários itens. Em um supermercado normal, as coisas são identificadas usando unidades de manutenção de estoque ou SKUs. Em nossa loja, usaremos letras individuais do alfabeto (A, B, C e assim por diante). Nossos produtos são avaliados individualmente. Além disso, alguns itens têm vários preços: compre n deles e eles custarão y centavos. Por exemplo, o item 'A' pode custar 50 centavos individualmente, mas esta semana temos uma oferta especial: compre três 'A's e eles custarão $ 1,30. Na verdade, os preços desta semana são:

Item	Preço unitário	Preço especial
UMA	50	3 por 130
B	30	2 por 45
C	20
D	15
Nosso checkout aceita itens em qualquer ordem, de modo que, se escanearmos um B, um A e outro B, reconheceremos os dois B e os colocaremos no preço de 45 (para um preço total até agora de 95). Como os preços mudam com frequência, precisamos ser capazes de aprovar um conjunto de regras de preços cada vez que começarmos a lidar com uma transação de checkout.

A interface do checkout deve ser semelhante a:

	co = CheckOut.new(pricing_rules)
	co.scan(item)
	co.scan(item)
	price = co.total
Aqui está um conjunto de testes de unidade para uma implementação Ruby. O preço do método auxiliar permite que você especifique uma sequência de itens usando uma string, chamando o método de verificação do checkout em cada item por vez antes de finalmente retornar o preço total.

class TestPrice < Test::Unit::TestCase
def price(goods)
co = CheckOut.new(RULES)
goods.split(//).each { |item| co.scan(item) }
co.total
end

	def test_totals
		assert_equal(  0, price(""))
		assert_equal( 50, price("A"))
		assert_equal( 80, price("AB"))
		assert_equal(115, price("CDBA"))
		
		assert_equal(100, price("AA"))
		assert_equal(130, price("AAA"))
		assert_equal(180, price("AAAA"))
		assert_equal(230, price("AAAAA"))
		assert_equal(260, price("AAAAAA"))
		
		assert_equal(160, price("AAAB"))
		assert_equal(175, price("AAABB"))
		assert_equal(190, price("AAABBD"))
		assert_equal(190, price("DABABA"))
	end

	def test_incremental
		co = CheckOut.new(RULES)
		assert_equal( 0, co.total)
		co.scan("A"); assert_equal( 50, co.total)
		co.scan("B"); assert_equal( 80, co.total)
		co.scan("A"); assert_equal(130, co.total)
		co.scan("A"); assert_equal(160, co.total)
		co.scan("B"); assert_equal(175, co.total)
	end 
end
Existem muitas maneiras de implementar esse tipo de algoritmo; se você tiver tempo, experimente vários.

Objetivos do Kata
Até certo ponto, este é apenas um pequeno problema divertido. Mas, por baixo das cobertas, é um exercício furtivo de desacoplamento. A descrição do desafio não menciona o formato das regras de preços. Como isso pode ser especificado de forma que o caixa não conheça os itens específicos e suas estratégias de preços? Como podemos tornar o design flexível o suficiente para que possamos adicionar novos estilos de regra de precificação no futuro?