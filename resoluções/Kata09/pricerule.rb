class PriceRule

    def initialize(price,quantity = 1,discount = 0)
        @price = price
        @quantity = quantity
        @discount = discount
    end

    def calculate_discount(quantity)
        (quantity/@quantity).floor*@discount
    end

    def price
        @price
    end

end