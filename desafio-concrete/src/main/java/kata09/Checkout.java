package kata09;

import java.util.ArrayList;
import java.util.List;

public class Checkout {

    Rules rules;
    List<String> itens = new ArrayList<>();
    private int qntA;
    private int qntB;
    private int qntC;
    private int qntD;

    public Checkout(Rules rules) {
        this.rules = rules;
    }

    public void scan(String item){
        itens.add(item);
    }

    public int getPromoA(int qntA){
        return (qntA / 3) * rules.getPromA();
    }

    public int getANoPromo(int qntA){
        return (qntA % 3) * rules.getPrecoA();
    }

    public int getPromoB(int qntB){
        return  (qntB / 2) * rules.getPromB();
    }

    public int getBNoPromo(int qntB){
        return (qntB % 2) * rules.getPrecoB();
    }

    public int getCNoPromo(int qntC){
        return qntC * rules.getPrecoC();
    }

    public int getDNoPromo(int qntD){
        return qntD * rules.getPrecoD();
    }

    public void getQnt(){
        for (String item : itens) {
            switch (item) {
                case "A":
                    qntA++;
                    break;
                case "B":
                    qntB++;
                    break;
                case "C":
                    qntC++;
                    break;
                case "D":
                    qntD++;
                    break;
            }
        }
    }
    public int total(){
        qntA=0;
        qntB=0;
        qntC=0;
        qntD=0;
        getQnt();
        int totalPrice = 0;

        totalPrice += getPromoA(qntA) + getANoPromo(qntA);

        totalPrice += getPromoB(qntB) + getBNoPromo(qntB);

        totalPrice += getCNoPromo(qntC);

        totalPrice += getDNoPromo(qntD);

        return totalPrice;
    }
}
