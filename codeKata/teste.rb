
require "rspec"
require "C:/Users/julia.kawata/Desktop/DesafioJúlia/codeKata/checkout.rb"

describe "CheckoutItems" do
    it "Assert - A" do
      calc = Test.new()
      price_item = calc.price("A")
      expect(price_item).to eq(50)
    end

    it "Assert - AB" do
        calc = Test.new()
        price_item = calc.price("AB")
        expect(price_item).to eq(80)
    end
    
    it "Assert - CDBA" do
        calc = Test.new()
        price_item = calc.price("CDBA")
        expect(price_item).to eq(115)
    end
    
    it "Assert - AA" do
        calc = Test.new()
        price_item = calc.price("AA")
        expect(price_item).to eq(100)
    end
        
    it "Assert - AAA" do
        calc = Test.new()
        price_item = calc.price("AAA")
        expect(price_item).to eq(130)
    end
        
    it "Assert - AAAA" do
        calc = Test.new()
        price_item = calc.price("AAAA")
        expect(price_item).to eq(180)
    end
            
    it "Assert - AAAAA" do
        calc = Test.new()
        price_item = calc.price("AAAAA")
        expect(price_item).to eq(230)
    end
    
    it "Assert - AAAAAA" do
        calc = Test.new()
        price_item = calc.price("AAAAAA")
        expect(price_item).to eq(260)
    end
            
    it "Assert - AAAB" do
        calc = Test.new()
        price_item = calc.price("AAAB")
        expect(price_item).to eq(160)
    end
            
    it "Assert - AAABB" do
        calc = Test.new()
        price_item = calc.price("AAABB")
        expect(price_item).to eq(175)
    end
            
    it "Assert - AAABBD" do
        calc = Test.new()
        price_item = calc.price("AAABBD")
        expect(price_item).to eq(190)
    end
    
    it "Assert - DABABA" do
        calc = Test.new()
        price_item = calc.price("DABABA")
        expect(price_item).to eq(190)
    end

end



	