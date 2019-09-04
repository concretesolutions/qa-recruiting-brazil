package codeKata;

public class TotalPrice {
	
    public int sumOfValues(int valueA, int valueB, int valueC, int valueD, int specialPriceA, int specialPriceB) {
	    int finalValue = valueA + valueB + valueC + valueD + specialPriceA + specialPriceB;
	    System.out.println(finalValue);
	    return finalValue;
    }
}
