require './pricerule.rb'

RULES = {
    A: PriceRule.new(50,3,20),
    B: PriceRule.new(30,2,15),
    C: PriceRule.new(20),
    D: PriceRule.new(15)
}

class CheckOut

    def initialize(rules)
        @rules = rules
        @items = Hash.new(0)
    end

    def scan(item)
        @items[item.to_sym] +=1
    end

    def total
        total = 0
        @items.each {|key,value|
            rule = @rules[key]
            total += rule.price * value - rule.calculate_discount(value)
        }
        total
    end

end