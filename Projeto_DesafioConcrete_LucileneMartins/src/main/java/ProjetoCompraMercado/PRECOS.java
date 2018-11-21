package ProjetoCompraMercado;

public enum PRECOS {

        OPCOES(50,30,20,15);

        private int valorA;
        private int valorB;
        private int valorC;
        private int valorD;

        PRECOS(int a, int b, int c, int d ) {

            this.valorA = a;
            this.valorB = b;
            this.valorC = c;
            this.valorD = d;

        }
        public int VALORA(){ return this.valorA;}
        public int VALORB(){ return this.valorB;}
        public int VALORC(){ return this.valorC;}
        public int VALORD(){ return this.valorD;}



}

