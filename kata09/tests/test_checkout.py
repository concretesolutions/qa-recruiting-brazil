import pytest

"""
Estes testes cobrem
o checkout de produtos.

Desafio Kata09
(http://codekata.com/kata/kata09-back-to-the-checkout/)
"""

from lib.checkout import CheckOut
from resources.rules import Rules


def price(items):
    """Método price

    Parameters:
    items (str): Lista de itens

    Returns:
    co.total (int): Valor total dos itens da lista items
    """
    rules_dict = Rules.dict_pricing_rules
    co = CheckOut(rules_dict)
    for item in items:
        co.scan(item)
    return co.total


def test_totals():

    # assert_equal(  0, price(""))
    total = price('')
    assert total == 0
    # assert_equal( 50, price("A"))
    total = price('A')
    assert total == 50
    # assert_equal( 80, price("AB"))
    total = price('AB')
    assert total == 80
    # assert_equal(115, price("CDBA"))
    total = price('CDBA')
    assert total == 115
    # assert_equal(100, price("AA"))
    total = price('AA')
    assert total == 100
    # assert_equal(130, price("AAA"))
    total = price('AAA')
    assert total == 130
    # assert_equal(180, price("AAAA"))
    total = price('AAAA')
    assert total == 180
    # assert_equal(230, price("AAAAA"))
    total = price('AAAAA')
    assert total == 230
    # assert_equal(260, price("AAAAAA"))
    total = price('AAAAAA')
    assert total == 260
    # assert_equal(160, price("AAAB"))
    total = price('AAAB')
    assert total == 160
    # assert_equal(175, price("AAABB"))
    total = price('AAABB')
    assert total == 175
    # assert_equal(190, price("AAABBD"))
    total = price('AAABBD')
    assert total == 190
    # assert_equal(190, price("DABABA"))
    total = price('DABABA')
    assert total == 190


def test_incremental():

    rules_dict = Rules.dict_pricing_rules
    co = CheckOut(rules_dict)
    # assert_equal(  0, co.total)
    assert co.total == 0
    # co.scan("A");  assert_equal( 50, co.total)
    co.scan('A')
    assert co.total == 50
    # co.scan("B");  assert_equal( 80, co.total)
    co.scan('B')
    assert co.total == 80
    # co.scan("A");  assert_equal(130, co.total)
    co.scan('A')
    assert co.total == 130
    # co.scan("A");  assert_equal(160, co.total)
    co.scan('A')
    assert co.total == 160
    # co.scan("B");  assert_equal(175, co.total)
    co.scan('B')
    assert co.total == 175
