import checkout_supermarket
import pytest

pricing_rules = {
    'A': {'price': 50, 'discount_qtd': 3, 'discount_price': 130},
    'B': {'price': 30, 'discount_qtd': 2, 'discount_price': 45},
    'C': {'price': 20},
    'D': {'price': 15}
}

def price(items):
    co = checkout_supermarket.CheckOut(pricing_rules)
    for item in items:
        co.scan(item)
    return co.total()


def test_totals():
    total = price('')
    assert 0 == total
    total = price('A')
    assert 50 == total
    total = price('AB')
    assert 80 == total
    total = price('CDBA')
    assert 115 == total

    total = price('AA')
    assert 100 == total
    total = price('AAA')
    assert 130 == total
    total = price('AAAA')
    assert 180 == total
    total = price('AAAAA')
    assert 230 == total

    total = price('BBBB')
    assert 90 == total
    total = price('AAAAAA')
    assert 260 == total

    total = price('AAAB')
    assert 160 == total
    total = price('AAABB')
    assert 175 == total
    total = price('AAABBD')
    assert 190 == total
    total = price('DABABA')
    assert 190 == total

@pytest.fixture
def checkout():
    co = checkout_supermarket.CheckOut(pricing_rules)
    return co

def test_incremental(checkout):
    co = checkout

    co.scan('')
    assert 0 == co.total()
    co.scan('A')
    assert 50 == co.total()
    co.scan('B')
    assert 80 == co.total()
    co.scan('A')
    assert 130 == co.total()
    co.scan('A')
    assert 160 == co.total()
    co.scan('B')
    assert 175 == co.total()
    co.scan('B')
    assert 205 == co.total()
    co.scan('B')
    assert 220 == co.total()
