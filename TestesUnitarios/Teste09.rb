require "test/unit"

# Itens do teste
module Item
    A = 50
    B = 30
    C = 20
    D = 15
end

# Valor do desconto ( quando aplicado )
module Descontos
    A = 20
    B = 15
end

# Quantidade necessária para aplicar o desconto
module QtdAplicaDesconto
    A = 3
    B = 2
end

 # Recebe um array de itens
def calcularPreco(itens)
    total = 0;qtdA = 0;qtdB = 0 
    if itens and itens.kind_of?(Array)
        itens.each { |i|
            (i == Item::A) ? qtdA += 1 : (i == Item::B) ? qtdB += 1 : 0
            total += i
            if qtdA == QtdAplicaDesconto::A
                total -= Descontos::A
                qtdA = 0
            end
            if qtdB == QtdAplicaDesconto::B
                total -= Descontos::B
                qtdB = 0
            end 
        }
        return total
    end 
    return total
end

class TestPrice < Test::Unit::TestCase 
    # Testando os totais
    def test_totals
        #flags = Foo::BAR | Foo::BAZ # flags = 3
        #Testes item A
        assert_equal(50, calcularPreco([Item::A]))
        assert_equal(100, calcularPreco([Item::A, Item::A]))
        assert_equal(130, calcularPreco([Item::A, Item::A, Item::A]))
        assert_equal(180, calcularPreco([Item::A, Item::A, Item::A, Item::A]))
        #Testes item B com e sem desconto
        assert_equal(30, calcularPreco([Item::B]))
        assert_equal(45, calcularPreco([Item::B, Item::B]))
        assert_equal(75, calcularPreco([Item::B, Item::B, Item::B]))
        #Testes item C e D
        assert_equal(20, calcularPreco([Item::C]))
        assert_equal(15, calcularPreco([Item::D]))
        #Testes com itens A e B, calculando itens com desconto!
        assert_equal(80, calcularPreco([Item::A, Item::B]))
        assert_equal(160, calcularPreco([Item::A, Item::A, Item::A, Item::B]))
        assert_equal(95, calcularPreco([Item::A, Item::B, Item::B]))
        assert_equal(175, calcularPreco([Item::A, Item::A, Item::A, Item::B, Item::B]))
        #Testes com itens diferentes, calculando itens com desconto em posições diferentes!
        assert_equal(115, calcularPreco([Item::A, Item::B, Item::C, Item::D]))
        assert_equal(210, calcularPreco([Item::A, Item::A, Item::A, Item::B, Item::B, Item::C, Item::D]))
        assert_equal(215, calcularPreco([Item::A, Item::B, Item::C, Item::B, Item::A, Item::C, Item::A]))
        # Teste de item vazio
        assert_equal(0, calcularPreco(""))
    end 
end