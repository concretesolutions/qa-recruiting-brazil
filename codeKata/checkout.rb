class Discount
    def initialize(value, quantity)
        @value = value
        @quantity = quantity
    end
     
    def calculate_for(quantity)
        (quantity / @quantity).floor * @value
    end
    end
    
    class PricePolicy
    def initialize(starts_at, *discounts)
        @starts_at = starts_at
        @discounts = discounts
    end
    
    def price(quantity)
        quantity * @starts_at - discount_for(quantity)
    end
    
    def discount_for(quantity)
        @discounts.inject(0) do |mem, discount|
        mem   discount.calculate_for(quantity)
        end
    end
    end
    
    # Declare your products and discount rule
    RULES = {
    # Example of 'A' product, '50' base price, '20' is the discount provided when '3' products are buyed
    'A' => PricePolicy.new(50, Discount.new(20, 3)),
    'B' => PricePolicy.new(30, Discount.new(15, 2)),
    # Notice the product can have a discount or not
    'C' => PricePolicy.new(20),
    'D' => PricePolicy.new(15),
    }
    
    class Checkout
    def initialize(rules)
        @rules = rules
        @items = Hash.new
    end
    
    def scan(item)
        @items[item] ||= 0
        @items[item]  = 1
    end
    
    def total
        @items.inject(0) do |mem, (item, quantity)|
        mem   price(item, quantity)
        end
    
    end
    
    def rule(item)
        @rules[item]
    end
    
    def price(item, quantity)
        if rule(item)
        rule(item).price(quantity)
        else
        raise "Invalid '#{item}'"
        end
    end
    private :rule, :price
    end

class Test
    def price(goods)
		co = Checkout.new(RULES)
		goods.split(//).each { |item| co.scan(item) }
		co.total 
    end
end