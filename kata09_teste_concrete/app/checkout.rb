class Checkout

  def initialize(regras=[])
    @regras = regras
    @produtos_digitalizar = Hash.new
  end

  def digitalizar(item)
    if @produtos_digitalizar.has_key? item
      @produtos_digitalizar[item] += 1
    else
      @produtos_digitalizar[item] = 1
    end
  end

  def total
    checkout_total = 0
    @produtos_digitalizar.each do |item, montante|
      regras = get_regras_produto(item)

      while montante > 0
        regra = get_regra(regras, montante)
        checkout_total += regra.preco
        montante -= regra.montante
      end
    end
    return checkout_total
  end

  def get_regras_produto(produto)
    @regras.select{ |regra| regra.produto == produto }.sort_by{ |r| r.montante }.reverse!
  end


  def get_regra(regras, montante)
    return regras.select{ |regra| regra.montante <= montante }.first
  end

end