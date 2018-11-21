package ProjetoCompraMercado;

public class CheckOut {


    public  int valorTotalDaCompra = 0;
    public  int valorTotalDaCompraIncremental;
    public String itemDigitado = "";

    ObjetoItensMercado obj = new ObjetoItensMercado();

    public void scan(String itens){

        itemDigitado+= itens;

    }

    public int total(){

        if(!itemDigitado.equals("")) {
            obj.setItemA(valorItem(itemDigitado, "A"));
            obj.setItemB(valorItem(itemDigitado, "B"));
            obj.setItemC(valorItem(itemDigitado, "C"));
            obj.setItemD(valorItem(itemDigitado, "D"));

        }
        return valorTotalDaCompraIncremental = obj.getItemA()+ obj.getItemB()+ obj.getItemC() +  obj.getItemD();

    }

    public  int Price(String itens){
        obj.setItemA(valorItem(itens,"A"));
        obj.setItemB(valorItem(itens,"B"));
        obj.setItemC(valorItem(itens,"C"));
        obj.setItemD(valorItem(itens,"D"));

        return valorTotalDaCompra = obj.getItemA()+ obj.getItemB()+ obj.getItemC() +  obj.getItemD();

    }

    private  int quantiaItensComprados(String itens, String itemPesquisado){

            int quantiaItem = 0;
            String [] listaItens;
            listaItens = itens.split("");

            for ( int i = 0; i < listaItens.length ; i++) {

                if (listaItens[i].equals(itemPesquisado)) {
                    quantiaItem += 1;
                }
            }

            return quantiaItem;
    }

    private int valorItem (String itens, String itemPesquisado){

        int quantiaItem = 0;
        int valorItem = 0;
        quantiaItem = quantiaItensComprados(itens, itemPesquisado);

            if (itemPesquisado.equals("A")) {

                if (quantiaItem >= 3) {
                    if ((quantiaItem % 3) == 0) {
                        valorItem = valorItemComPromocao(quantiaItem, itemPesquisado);
                    } else {
                        valorItem = valorItemComPromocao(quantiaItem, itemPesquisado) + valorItemSemPromocao(quantiaItem, itemPesquisado);
                    }
                }
                else{
                    valorItem = valorItemSemPromocao(quantiaItem,itemPesquisado);
                }
            }
            else  if (itemPesquisado.equals("B")){
                if(quantiaItem >= 2){
                    if((quantiaItem % 2) == 0){
                        valorItem = valorItemComPromocao(quantiaItem,itemPesquisado);
                    }
                    else{
                        valorItem = valorItemComPromocao(quantiaItem,itemPesquisado) + valorItemSemPromocao(quantiaItem,itemPesquisado);
                    }
                }
                else{
                    valorItem = valorItemSemPromocao(quantiaItem,itemPesquisado);
                }
            }
            else if(itemPesquisado.equals("C")){

                valorItem = valorItemSemPromocao(quantiaItem,itemPesquisado);
            }
            else if(itemPesquisado.equals("D")){
                valorItem = valorItemSemPromocao(quantiaItem,itemPesquisado);
            }

        return valorItem;
    }

    private int valorItemComPromocao (int quantiaItem, String itemPesquisado){

        int promocoes;
        int valorItem = 0;

        if (itemPesquisado.equals("A")) {

               promocoes = quantiaItem / 3;
               valorItem = promocoes * PRECOSESPECIAIS.OPCOES.VALORA();

        }
        else if (itemPesquisado.equals("B")){

               promocoes = quantiaItem / 2;
               valorItem = promocoes * PRECOSESPECIAIS.OPCOES.VALORB();

        }

        return valorItem;

    }

    private int valorItemSemPromocao (int quantiaItem, String itemPesquisado){

        int valorSemPromocoes = 0;
        int valorItem = 0;

        if (itemPesquisado.equals("A")) {
            if(quantiaItem > 3) {
                valorSemPromocoes = quantiaItem % 3;
            }
            else{
                valorSemPromocoes = quantiaItem;
            }
            valorItem = valorSemPromocoes * PRECOS.OPCOES.VALORA();
        }
        else if (itemPesquisado.equals("B")){

            if(quantiaItem > 2) {
                 valorSemPromocoes = quantiaItem % 2;
            }
            else{
                valorSemPromocoes = quantiaItem;
            }

            valorItem = valorSemPromocoes * PRECOS.OPCOES.VALORB();
        }
        else if(itemPesquisado.equals("C")) {
            valorSemPromocoes = quantiaItem;
            valorItem = valorSemPromocoes * PRECOS.OPCOES.VALORC();
        }
        else if(itemPesquisado.equals("D")) {
            valorSemPromocoes = quantiaItem;
            valorItem = valorSemPromocoes * PRECOS.OPCOES.VALORD();
        }

        return valorItem;
    }



}
