class ProdutItem
    attr_reader :item, :price_unit, :qtde
  
    def initialize(item, price_unit, qtde)
      @item = item
      @price_unit = price_unit
      @qtde = qtde
    end
  
    def calc_qtde
      (price_unit * qtde)
    end
  
  end
  
  class CalcDiscount
    attr_reader :discount
  
    def initialize(discount)
      @discount = discount
    end
  
    def calc_desc(product)
      (product.price_unit * product.qtde) - discount
    end
  end
  
  RULES = [A: {prodA: ProdutItem.new("A", 0.50, 3), descA: CalcDiscount.new(0.20)},
           B: {prodB: ProdutItem.new("B", 0.30, 2), descB: CalcDiscount.new(0.15)},
           C: {prodC: ProdutItem.new("C", 0.20, 0), descC: CalcDiscount.new(0.00)},
           D: {prodD: ProdutItem.new("D", 0.15, 0), descD: CalcDiscount.new(0.00)}
          ]
  
  class CheckOut
  
    def initialize(rules)
        @rules = rules
        @itens = Hash.new
      end
  
    def price(item, quantidade)
      if regras(item)
         regras(item).price(quantidade)
      else
        raise "O item '#{item}' é invalido"
      end
    end
  
    def scan(item)
      @items[item] ||= 0
      @items[item] += 1
    end
  
    def regras(item)
      @regras[item]
    end
  
  
  end