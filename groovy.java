/***************************************\                 
   _____                            
  / ____|                           
 | |  __ _ __ ___   _____   ___   _ 
 | | |_ | '__/ _ \ / _ \ \ / / | | |
 | |__| | | | (_) | (_) \ V /| |_| |
  \_____|_|  \___/ \___/ \_/  \__, |
                               __/ |
                              |___/ 

To run this script online use the link below (copy and paste)

https://groovyconsole.appspot.com

You can use SoapUI console to run it aswell.
  
\* Luckxander Sena Sidney => lusenabh@gmail.com => whatsapp +55 31 99134 7025 */


class Checkout {
	
   static void main(String[] args) {
   
   Price st = new Price();  

   println("Initial order itens => " + st.InicialOrder());
   println("Regular price => " + st.Total());
   println("Promotional order arrenged itens => " + st.PromotionalOrder());
   println("Promotional order price => " + st.TotalPromotional());
   }
} 

//THIS CLASS IS USED TO MANAGE PRODUCTS NAMES AND VALUES
class Product {
      
	/**** Suppose you have the table Products with names and itens values  
	Groovy sintax accepts "eachRow" command to read all lines from table ****/
	/*
	sql.eachRow('SELECT prod, value FROM Products') { p ->
         }
   */

   //This example has not a database so I inserted names and values manually  

   def prod = ["A", "B", "C", "D", "AAA", "BB"];
   def value = [50, 30, 20, 15, 130, 45];

   public Product() {}  
} 

//THIS CLASS IS USED TO CALCULATE ORDERS VALUES, IT CONSIDERS REGULAR PRICES AND SPECIAL/PROMOTIONAL PRICES
class Price extends Product {
   
   String itensInicial = "";
   String itens = "";
   int cont;
   int sum = 0;
   int sum2 = 0;
   int i;
   int j;
   int contA;
   int contB;
   int k;
   int l;
   int result;
   int result2;
   int m;
   int n;
   int result3;
   int result4;
   int p;
   int q;
   int r;
   
   /*############################################################################################################
   
   => ***  COMMENT/UNCOMMENT THE LINES BELOW TO TEST THE SCRIPT IN DIFFERENT WAYS */ 
   
   def order = ["A", "B", "A", "A", "D", "B", "C", "A", "A", "A", "A", "A", "A", "A", "A", "B", "B", "C", "B"];
   //def order = ["C", "B", "D", "A", "D", "B", "C", "A", "A", "A", "A", "A", "A", "B", "B", "C", "B"];
   //def order = ["A", "A", "A", "A", "A", "C", "D"];
   //def order = ["D", "C", "A", "A", "A", "C", "A", "A", "A", "A", "D", "A", "A", "D", "A", "B", "B", "C", "B"];
   //def order = ["B", "B", "B", "A", "A", "C"];
   //def order = ["C", "C", "B", "D", "A"];
   
   //You can create your own order to test it, just do like above
   
   /*###########################################################################################################*/
   
   
   String InicialOrder(){
	  //the regular order (without promotional combination)
	  for(i=0;i<order.size();i++){
		itensInicial = itensInicial + order[i] +  " " ;  
	  }
      return itensInicial;
   }
   
    //Calculate total price for regular order
    int Total() {
	  for(j=0;j<order.size();j++){
		if(order[j] == "A"){
			value[j] = 50;
		}
		else if(order[j] == "B"){
			value[j] = 30;
		}
		else if(order[j] == "C"){
			value[j] = 20;
		}
		else if(order[j] == "D"){
			value[j] = 15;
		}
		//this two below is just for reference, as in this case there is no special/promotional price
		else if(order[r] == "AAA"){
			value[r] = 130;
		}
		else(order[r] == "BB"){
			value[r] = 45;
		}
		sum = sum + value[j];  
	  }
      return sum;
    }
   
   
   /*############################################################################################################
   
    => BELOW YOU CAN ADJUST OR SETUP A NEW SPECIAL/PROMOTIONAL PRICE ***   */ 

   String PromotionalOrder(){
	  
	  //##### ESPECIAL PRICE FOR AAA #####
	  contA = order.count("A")
	  //check if there is only one occurence of AAA and adjust it
	  if(contA == 3){
		//exact value for one promotional combination, remove all the A 
	  	assert order.removeAll("A");
		//include the AAA regarding the promotional combination
		assert order.add("AAA");
	  }
	  //if there are more than 3 A we need to verify if there are more promotional combination
	  else if(contA > 3){
		k = (contA % 3); //verifica o resto da divisão (mais fácil explicar em português)
		result = (contA / 3);
		if(k == 0){
			//if remains zero from division I will remove all the A ("removeAll command")
		   assert order.removeAll("A");
		   //include the AAA regarding the promotional combination
		   for(l=0; l<result; l++){
			   assert order.add("AAA");	   
		   }	
		}
		else{
			//if does not remain zero from division I will remove only the combinations of 3 A ("remove" command insted of "removeAll")
			result2 = (result * 3)
			for(m=0; m<result2; m++){
				assert order.remove("A");
			}
			//include the AAA regarding the promotional combination
			for(l=0; l<result; l++){
			    assert order.add("AAA");	   
		    }		
		}  
	  }
	  
	  //##### ESPECIAL PRICE FOR BB #####
	  contB = order.count("B")
	  //check if there is only one occurence of BB and adjust it
	  if(contB == 2){
		//exact value for one promotional combination, remove all the B ("removeAll" command)
	  	assert order.removeAll("B");
		//include the BB regarding the promotional combination
		assert order.add("BB");
	  }
	  //if there are more than 2 B we need to verify if there are more promotional combination
	  else if(contB > 2){
		n = (contB % 2);
		result3 = (contB / 2);
		if(n == 0){
			//if remains zero from division I will remove all the B ("removeAll" command)
		   assert order.removeAll("B");
		   for(p=0; p<result3; p++){
			   assert order.add("BB");	   
		   }	
		}
		else{
			//if does not remain zero from division I will remove only the combinations of 2 B ("remove" command insted of "removeAll")
			result4 = (result3 * 2)
			for(p=0; p<result4; p++){
				assert order.remove("B");
			}
			//include the BB regarding the promotional combination
			for(q=0; q<result3; q++){
			    assert order.add("BB");	   
		    }		
		}  
	  }
	  
	  //the order with promotional combination
	  for(i=0;i<order.size();i++){
		itens = itens + order[i] +  " " ;  
	  }
      return itens;
   }
   
    //Calculate total price for special/promotional order
    int TotalPromotional() {
	  for(r=0;r<order.size();r++){
		if(order[r] == "A"){
			value[r] = 50;
		}
		else if(order[r] == "B"){
			value[r] = 30;
		}
		else if(order[r] == "C"){
			value[r] = 20;
		}
		else if(order[r] == "D"){
			value[r] = 15;
		}
		else if(order[r] == "AAA"){
			value[r] = 130;
		}
		else if(order[r] == "BB"){
			value[r] = 45;
		}
		sum2 = sum2 + value[r];  
	  }
      return sum2;
    }
	
   public Price() {
      super();
   } 
}   
​
