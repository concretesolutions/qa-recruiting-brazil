'*************************************************************************************************************************************************************************************************************************
'Challenge KATA 09
'Author: Fabio Damasceno
'*************************************************************************************************************************************************************************************************************************

Sub kata09()
	
	'In order to make things as simple as possible,I created a variable (shoppingList) that can be used instead of any capture method
	'This variable is the result of all itens that would be stored before the final price calculation
	'The default value of this variable is "A;B;C;D;A;A;B;B;C;D;X;D;A;D;D;D;A;A;B;C" or 6 A's, 4 B's, 3 C's and 6 D's resulting in a final price of $600 without discount and $530 with the discount
	shoppingList = "A;B;C;D;A;A;B;B;C;D;D;A;D;D;D;A;A;B;C;B"
	
	Wscript.Echo "Items purchased: " & shoppingList
	
	'Variables
	'The 4 first blocks of variables determinates the rules for pricing and promotions, considering that could have a backoffice application where the owner of the supermarket input these data
	'This is the full price of each item
	priceA = 50
	priceB = 30
	priceC = 20
	priceD = 15
	
	'Sets if there's any bundle promotion for each item (true or false)
	promoA = true
	promoB = true
	promoC = false
	promoD = false
	
	'Determine the number of each items in a bumdle in order to be qualified for te promotion
	bundleA = 3
	bundleB = 2
	bundleC = 2
	bundleD = 2
	
	'Sets the value of the bundle of items
	bundlePriceA = 130
	bundlePriceB = 45
	bundlePriceC = 0
	bundlePriceD = 0
	
	
	totalPrice = 0 'Without discount
	discountPrice = 0 'With discount
	
	totalAs = 0 'Total products A
	totalBs = 0 'Total products B
	totalCs = 0 'Total products C
	totalDs = 0 'Total products D
	totalProducts = 0
	
	'Spliting the shopping list and calculating how many of each item there is	
	indItems = Split(shoppingList,";")
	
	For each item in indItems
		If item = "A" Then
			totalAs = totalAs + 1
			Wscript.Echo "Produto A registrado"
		ElseIf item = "B" Then
			totalBs = totalBs + 1
			Wscript.Echo "Produto B registrado"
		ElseIf item = "C" Then
			totalCs = totalCs + 1
			Wscript.Echo "Produto C registrado"
		ElseIf item = "D" Then
			totalDs = totalDs + 1
			Wscript.Echo "Produto D registrado"
		End If		
	Next
	
	'Quantity of each product that will be bought
	Wscript.Echo "Total de produtos A: " & totalAs
	Wscript.Echo "Total de produtos B: " & totalBs
	Wscript.Echo "Total de produtos C: " & totalCs
	Wscript.Echo "Total de produtos D: " & totalDs
	'Price without discount
	totalPrice = totalAs * priceA + totalBs * priceB + totalCs * priceC + totalDs * priceD
	
	Wscript.Echo "O valor da compra sem desconto é R$" & totalPrice
	
	totalProducts = totalAs + totalBs + totalCs + totalDs
	
	'Check if the quantity of each product is enough to be considered inside of the promotions parameters	
	If promoA = true Then
		While totalAs >= bundleA
			discountPrice = discountPrice + bundlePriceA
			totalAs = totalAs - bundleA
		Wend
	End If
	
	If promoB = true Then
		While totalBs >= bundleB
			discountPrice = discountPrice + bundlePriceB
			totalBs = totalBs - bundleB
		Wend
	End If
	
	If promoC = true Then
		While totalCs >= bundleC
			discountPrice = discountPrice + bundlePriceC
			totalCs = totalCs - bundleC
		Wend
	End If
	
	If promoD = true Then
		While totalDs >= bundleD
			discountPrice = discountPrice + bundlePriceD
			totalDs = totalDs - bundleD
		Wend		
	End If
	
	'After calculating all discounts, calculates the price of the remaining products
	If totalAs > 0 Then
		discountPrice = discountPrice + (totalAs * priceA)
	End If
	If totalBs > 0 Then
		discountPrice = discountPrice + (totalBs * priceB)
	End If
	If totalCs > 0 Then
		discountPrice = discountPrice + (totalCs * priceC)
	End If
	If totalDs > 0 Then
		discountPrice = discountPrice + (totalDs * priceD)
	End If
			
	'Final value of the shopping list with discount
	Wscript.Echo "O valor final da compra com desconto é R$" & discountPrice
		
End Sub

kata09()
