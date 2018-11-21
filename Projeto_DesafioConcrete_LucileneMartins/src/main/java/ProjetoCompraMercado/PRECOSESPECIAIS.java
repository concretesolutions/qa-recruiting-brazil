package ProjetoCompraMercado;

public enum PRECOSESPECIAIS {

    OPCOES(130,45);

    private int valorA;
    private int valorB;


    PRECOSESPECIAIS(int a, int b) {

        this.valorA = a;
        this.valorB = b;

    }
    public int VALORA(){ return this.valorA;}
    public int VALORB(){ return this.valorB;}




}
