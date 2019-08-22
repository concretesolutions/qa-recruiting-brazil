require 'minitest/autorun'
# importa o arquivo para rodar os testes
require './checkout.rb'

class Testpreco < MiniTest::Unit::TestCase

  def preco(goods)
    co = CheckOut.new(REGRAS)
    goods.split(//).each { |item| co.scan(item) }
    co.total
  end

  def test_totals
    assert_equal(  0, preco(""))
    assert_equal( 50, preco("A"))
    assert_equal( 80, preco("AB"))
    assert_equal(115, preco("CDBA"))

    assert_equal(100, preco("AA"))
    assert_equal(130, preco("AAA"))
    assert_equal(180, preco("AAAA"))
    assert_equal(230, preco("AAAAA"))
    assert_equal(260, preco("AAAAAA"))

    assert_equal(160, preco("AAAB"))
    assert_equal(175, preco("AAABB"))
    assert_equal(190, preco("AAABBD"))
    assert_equal(190, preco("DABABA"))
  end

  def test_incremental
    co = CheckOut.new(REGRAS)
    assert_equal(  0, co.total)
    co.scan("A");  assert_equal( 50, co.total)
    co.scan("B");  assert_equal( 80, co.total)
    co.scan("A");  assert_equal(130, co.total)
    co.scan("A");  assert_equal(160, co.total)
    co.scan("B");  assert_equal(175, co.total)
  end
end
