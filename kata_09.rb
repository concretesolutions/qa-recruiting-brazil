RULE = { 
    "A" => { "unit_price" => 50, "special_price" => "3 for 130" },
    "B" => { "unit_price" => 30, "special_price" => "2 for 45" },
    "C" => { "unit_price" => 20, "special_price" => nil },
    "D" => { "unit_price" => 15, "special_price" => nil }
}

class CheckOut

    def initialize(rules)
        @rules = rules
        @list = Hash.new(0)
    end

    def scan(item)
        @list[item] += 1
    end

    def total
        total = 0
        @list.each do |key, quantity|
            if !@rules[key]['special_price'].nil?
                special_quantity = @rules[key]['special_price'].split(' ')[0].to_i
                special_value = @rules[key]['special_price'].split(' ')[2].to_i
                quotient = quantity / special_quantity
                remainder = quantity % special_quantity
                total += ((quotient * special_value) + (remainder * @rules[key]['unit_price']))
            else
                total += quantity * @rules[key]['unit_price']
            end
        end
        return total
    end

end

require "test/unit"

class TestPrice < Test::Unit::TestCase
    
    def price(goods)
        co = CheckOut.new(RULE)
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
        co = CheckOut.new(RULE)
        assert_equal(0, co.total)
        co.scan("A"); assert_equal( 50, co.total)
        co.scan("B"); assert_equal( 80, co.total)
        co.scan("A"); assert_equal(130, co.total)
        co.scan("A"); assert_equal(160, co.total)
        co.scan("B"); assert_equal(175, co.total)
    end
end
