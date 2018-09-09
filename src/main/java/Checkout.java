import java.util.*;


public class Checkout {

   int total;
   Map<String,Integer> orders = new HashMap<String, Integer>();
   Map<String,Integer> rule;
   Map<String,Integer[]> rulesDescount;

   public Checkout(Map<String,Integer> rule, Map<String,Integer[]> rulesDescount){
       this.rule = rule;
       this.rulesDescount = rulesDescount;

   }
    public void scan(String product){
       if (orders.containsKey(product)){
           int count = orders.get(product) +1;
           orders.put(product, count);
       }
       else {
           orders.put(product,1);
       }
   }

   public int calcDiscount(int total, int quant, int descont){
       return (total / quant) * descont;
   }
   public int getTotal(){
       total = 0;
       orders.forEach((item, quant) -> {
           if (rule.containsKey(item)){
               total = total + (rule.get(item) * quant);
               if (rulesDescount.containsKey(item) && quant >= rulesDescount.get(item)[0]){
                   total = total - calcDiscount(quant,rulesDescount.get(item)[0],rulesDescount.get(item)[1]);
               }
           }
           else if (!item.isEmpty()){
               System.out.println("Produto "+item+" não cadastrado");
           }
       });

       return total;
   }

}
