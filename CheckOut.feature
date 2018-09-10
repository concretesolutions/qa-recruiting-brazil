Feature: CheckOut
	In order to avoid silly mistakes
	As a math idiot
	I want to be told the sum of two numbers

@mytag
Scenario: Add two numbers
	Given O produto 'A' possui valor unitário 'uA' e valor promocional 'pA'
	And O produto 'B' possui valor unitário 'uB' e valor promocional 'pB'
	And O produto 'C' possui valor unitário 'uC'
	And O produto 'B' possui valor unitário 'uD'
	When seleciono 'nA' produtos 'A'
	And seleciono 'nB' produtos 'B'
	And seleciono 'nC' produtos 'C'
	And seleciono 'nD' produtos 'C'
	Then o caixa registra o total correto