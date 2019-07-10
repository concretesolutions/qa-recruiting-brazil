product_hash = {"A" => 50, "B" => 30, "C" => 20, "D" => 15}

@itemA = 0
@itemB = 0
@itemC = 0
@itemD = 0

@ask = 0
i = 0
vetorProduto = []

while @ask == 0
  puts "Digite um produto:"
  vetorProduto[i] = gets.chomp.to_s
    
  puts "Deseja continuar? (1) Sim ou (2) Não"
  cond = gets.chomp.to_i
    
  if (cond != 1)
      @ask = 1
  end
    
  i = i + 1
end

i_scan = vetorProduto.length.to_i

for i in (0...i_scan)
  if vetorProduto[i] == "A"
    @itemA = @itemA.to_i + 1
  elsif vetorProduto[i] == "B"
    @itemB = @itemB + 1
  elsif vetorProduto[i] == "C"
    @itemC = @itemC + 1
  elsif vetorProduto[i] == "D"
    @itemD = @itemD + 1
  end
end

precoSugerido = (product_hash["A"] * @itemA) + (product_hash["B"] * @itemB) + (product_hash["C"] * @itemC) + (product_hash["D"] * @itemD)

def self.desconto2(valorDesc)
  @itemB = @itemB / 2
  @itemB = @itemB.to_i

  return @itemB * valorDesc
end

def self.desconto3(valorDesc)
  @itemA = @itemA / 3
  @itemA = @itemA.to_i
  
  return @itemA * valorDesc
end

@precoFinal = precoSugerido - (desconto2(15) + desconto3(20))

puts "\n Total a pagar: #{@precoFinal}"


##############################################################
produto_total = @precoFinal
##############################################################

def test_total (produto)
  case produto
  when 0
    puts "\n Carrinho vazio."
  when 50
    puts "\n Produto(s) no carrinho: A"
  when 80
    puts "\n Produto(s) no carrinho: AB"
  when 115
    puts "\n Produto(s) no carrinho: CDBA"
  when 100
    puts "\n Produto(s) no carrinho: AA"
  when 130
    puts "\n Produto(s) no carrinho: AAA"
  when 180 
    puts "\n Produto(s) no carrinho: AAAA"
  when 230
    puts "\n Produto(s) no carrinho: AAAAA"
  when 260
    puts "\n Produto(s) no carrinho: AAAAAA"
  when 160
    puts "\n Produto(s) no carrinho: AAAB"
  when 175
    puts "\n Produto(s) no carrinho: AAABB"
  when 190
    puts "\n Produto(s) no carrinho: AAABBD"
  when 190
    puts "\n Produto(s) no carrinho: DABABA"
  end
end

test_total(produto_total)