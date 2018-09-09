import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;


public class CheckoutTest extends TestCase {

    Map<String, Integer> rulesTest = new HashMap<>();
    Map<String,Integer[]> ruleDescount = new HashMap<String, Integer[]>();

   public void rules(){
       rulesTest.put("A",50);
       rulesTest.put("B",30);
       rulesTest.put("C",20);
       rulesTest.put("D",15);

   }
   public void rulesDescount(){
       ruleDescount.put("A", new Integer[]{3, 20});
       ruleDescount.put("B", new Integer[]{2, 15});
   }

   public int price(String goods){
       rules();
       rulesDescount();
       Checkout checkout = new Checkout(rulesTest,ruleDescount);
       String[] itens = goods.split("");
       for (String item: itens){
           checkout.scan(item);
       }
       return checkout.getTotal();

   }
   public void test_total(){
       assertEquals(0,price(""));
       assertEquals(50,price("A"));
       assertEquals(80,price("AB"));
       assertEquals(115,price("CDBA"));

       assertEquals(100,price("AA"));
       assertEquals(130,price("AAA"));
       assertEquals(180,price("AAAA"));
       assertEquals(230,price("AAAAA"));
       assertEquals(260,price("AAAAAA"));

       assertEquals(160,price("AAAB"));
       assertEquals(175,price("AAABB"));
       assertEquals(190,price("AAABBD"));
       assertEquals(190,price("DABABA"));


   }

   public void test_incremental(){
       rules();
       rulesDescount();
       Checkout checkout = new Checkout(rulesTest,ruleDescount);
       assertEquals(0,checkout.getTotal());
       checkout.scan("A");
       assertEquals(50,checkout.getTotal());
       checkout.scan("B");
       assertEquals(80,checkout.getTotal());
       checkout.scan("A");
       assertEquals(130,checkout.getTotal());
       checkout.scan("A");
       assertEquals(160,checkout.getTotal());
       checkout.scan("B");
       assertEquals(175,checkout.getTotal());
   }



}
