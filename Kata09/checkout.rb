REGRAS = {
  'A' => { preco_unico: 50, desconto_regra: { qnt: 3, custo_desconto: 130 } },
  'B' => { preco_unico: 30, desconto_regra: { qnt: 2, custo_desconto: 45 } },
  'C' => { preco_unico: 20 },
  'D' => { preco_unico: 15 }
}

class CheckOut
  def initialize(regras)
    @regras = regras
    @itens = Hash.new(0)
  end

  def scan(item)
    @itens[item] += 1
  end

  def total
    total_atual = 0
    @regras.each do |chave, regra|
      if regra[:desconto_regra]
        desconto = @itens[chave] / regra[:desconto_regra][:qnt]
        preco_normal = @itens[chave] % regra[:desconto_regra][:qnt]
        total_atual += preco_normal * regra[:preco_unico] + desconto * regra[:desconto_regra][:custo_desconto]
      else
        total_atual += regra[:preco_unico] * @itens[chave]
      end
    end
    total_atual
  end
end
