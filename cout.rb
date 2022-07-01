
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

  def price_for(quantity)
    quantity * @starts_at - discount_for(quantity)
  end

  def discount_for(quantity)
    @discounts.inject(0) do |mem, discount|
      mem + discount.calculate_for(quantity)
    end
  end
end

RULES = {
  'A' => PricePolicy.new(50, Discount.new(20, 3)), 
  'B' => PricePolicy.new(30, Discount.new(15, 2)),
  'C' => PricePolicy.new(20),
  'D' => PricePolicy.new(15),
}

class CheckOut

  def initialize(rules)
    @rules = rules
    @items = Hash.new
  end

  def scan(item)
    @items[item] ||= 0
    @items[item] += 1
  end

  def total
    @items.inject(0) do |mem, (item, quantity)|
      mem + price_for(item, quantity)
    end
  end

  private
  def price_for(item, quantity)
    if rule_for(item)
      rule_for(item).price_for(quantity)
    else
      raise "Invalid item '#{item}'"
    end
  end

  def rule_for(item)
    @rules[item]
  end
end
