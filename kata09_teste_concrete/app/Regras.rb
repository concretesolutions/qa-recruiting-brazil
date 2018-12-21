class Regras
  attr_accessor :produto, :preco, :montante

  def initialize(produto, preco, montante=1)
    @produto = produto
    @preco = preco
    @montante = montante
  end

end