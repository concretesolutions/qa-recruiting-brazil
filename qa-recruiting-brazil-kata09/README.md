# Resposta do exercício 09 do site CodeKata

Resposta do exercício 09 do site CodeKata utilizando Java

## Desafio

Implementar um sistema para ser usado em um caixa de supermercado, o sistema deve calcular o preço total de vários itens que serão idenficados por SKU's, esses SKU's vão utilizar letras individuais do alfabeto (A, B, C e assim por diante).

### Regras:

- Os produtos serão avaliados individualmente.
- Deve criar uma estratégias de preços nos itens específicos.
- Não há formato das regras de preços, podemos ver na tabela como deve ser os preços:
    - Compre "N" quantidade de produtos e esses produtos custarão "Y" valor de centavos. 
    - Por exemplo, o item 'A' pode custar 50 centavos individualmente, mas esta semana temos uma oferta especial: compre três "A" e eles custarão R$ 1,30. Na verdade, os preços desta semana são:

        | Item | Unit Price | Special Price |
        |------|------------|---------------|
        | A    | 50         |   3 for 130   |
        | B    | 30         |   2 for 45    |
        | C    | 20         |   ---------   |
        | D    | 15         |   ---------   |
    
    - *Detalhe importante:* Nosso sistema dever aceitar os itens em qualquer ordem de venda. Por exemplo: O produto B for vendido em seguida produto A e novamente um produto B, então vamos ter dois produtos B no preço de R$ 45 e um produto A no preço de R$ 50, somando os três produtos vamos ter um preço total de R$ 95. Com isso precisamos ser capazes de aprovar um conjunto de regras de preços cada vez que começarmos a lidar com uma transação da saída desse produtod isso por que os preços mudam com frequência.

- A seguinte regra deve ser seguida:
```
	co = CheckOut.new(pricing_rules)
	co.scan(item)
	co.scan(item)
	price = co.total
```	 

- Também dever ser implementado teste unitário apos a contrução do sistema utilizando a regra: 
    - O método auxiliar do preço deve permiter especificar uma sequência de itens usando uma string, esse deve então chamar o método de verificação do checkout em cada item por vez antes de finalmente retornar o preço total.

    - Segue um modelo de conjunto de testes de unidade desenvolvido em Ruby:
        ```
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
        ```
- Tornar o design flexível o suficiente para que possamos adicionar novos estilos de regras de precificação no futuro.


## Método

Os procedimentos adotados foi o uso de algumas ferramentas como suporte para o desenvolvimento do projeto. Um computador com Sistema Operacional Windows 10 home Single Language (Desktop) foi utilizado e nele foram instalados algumas ferramentas:


1. IntelliJ IDEA Community Edition 2020.2
2. Dependências do Maven
    - Junit Jupiter Params 5.6.2
    - Junit Platform Launcher 1.6.2
    - Assertj Core 3.16.1
    - Mockito Scala Cats 1.15.0

### Instalação

#### 1. Para instalar IntelliJ IDEA Community Edition 2020.2
No site da [Jetbrains.com](https://confluence.jetbrains.com/pages/viewpage.action?pageId=54920165) você encontra os passos necessário para instalar o _IntelliJ IDEA Community Edition 2020.2_ em seu computador.

#### 2. Dependências Maven do Projeto
**_Junit Jupiter Params:_**

```sh
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-params</artifactId>
    <version>5.6.2</version>
</dependency>
```

**_Junit Platform Launcher:_**
```sh
<dependency>
    <groupId>org.junit.platform</groupId>
    <artifactId>junit-platform-launcher</artifactId>
    <version>1.6.2</version>
</dependency>
```

**_Assertj Core:_**
```sh
<dependency>
    <groupId>org.assertj</groupId>
    <artifactId>assertj-core</artifactId>
    <version>3.16.1</version>
</dependency>
```

**_Mockito Scala Cats:_**
```sh
<dependency>
    <groupId>org.mockito</groupId>
    <artifactId>mockito-scala-cats_2.13</artifactId>
    <version>1.15.0</version>
</dependency>
```        
 
## Histórico de lançamentos

* 0.1.0
    * O primeiro lançamento adequado
* 0.0.1
    * Trabalho em andamento

## Meta

Raul Batalha – [@raulbatalha ](https://twitter.com/raulbatalha)

[https://github.com/raulbatalha](https://github.com/raulbatalha/)