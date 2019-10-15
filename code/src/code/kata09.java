package code;

public class kata09 {

	public static int price(String scan) {
		int valueA = 0,
			valueB = 0,
			valueC = 0,
			valueD = 0,
			discountA = 0,
			discountB = 0;
		
		if(scan == "") return 0;
		
		for(int x = 0; x<scan.length();x++) {
			if(scan.charAt(x)=='A') {
				valueA +=50;
				if(valueA == 150) {
					discountA += 130;
					valueA = 0;
				}
			}else if(scan.charAt(x)=='B') {
				valueB +=30;
				if(valueB==60) {
					discountB += 45;
					valueB = 0;
				}
			}else if(scan.charAt(x)=='C') {
				valueC += 20;
			}else {
				valueD += 15;
			}
		}
		return valueA+valueB+valueC+valueD+discountA+discountB;
	}
	
	public static String scan (String total,char item) {
		total = total.concat(String.valueOf(item).toUpperCase());
		
		return total;
	}

}
