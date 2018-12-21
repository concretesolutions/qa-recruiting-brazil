require 'minitest/autorun'
require 'pry'

require_relative '../app/checkout'
require_relative '../app/Regras'


class CheckoutTest < MiniTest::Test

  def preco(mercadorias)
    @regas = [Regras.new('A',50),
             Regras.new('A',130,3),
             Regras.new('B',30),
             Regras.new('B',45,2),
             Regras.new('C',20),
             Regras.new('D',15)]

    co = Checkout.new(@regas)
    mercadorias.split(//).each do |item|
      co.digitalizar(item)
    end
    co.total
  end

  def test_nenhum_item
    assert_equal(0, preco(""))
  end

  def test_um_tem
    assert_equal(50, preco("A"))
  end

  def test_dois_itens
    assert_equal(80, preco("AB"))
  end

  def test_muitos_itens
    assert_equal(165, preco("ABACD"))
  end

  def test_desconto_soma_tres_a
    assert_equal(130, preco("AAA"))
  end

  def test_desconto_em_mais_itens
    assert_equal(180, preco("AABCA"))
  end

  def test_desconto_e_soma_restante
    assert_equal(180, preco("AAAA"))
  end

  def test_dois_desconto_ab
    assert_equal(175, preco("AAABB"))
  end

  def test_diversas_afirmacoes
    assert_equal(160, preco("AAAB"))
    assert_equal(175, preco("AAABB"))
    assert_equal(190, preco("AAABBD"))
    assert_equal(190, preco("DABABA"))
    assert_equal(270, preco("DABBABAA"))
  end

end