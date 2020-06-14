package kata09;

public class Rules {

    int precoA;
    int precoB;
    int precoC;
    int precoD;
    int promA = 130;
    int promB = 45;

    public Rules() {
    }

    public Rules(int precoA, int precoB, int precoC, int precoD) {
        this.precoA = precoA;
        this.precoB = precoB;
        this.precoC = precoC;
        this.precoD = precoD;
    }

    public int getPrecoA() {
        return precoA;
    }

    public void setPrecoA(int precoA) {
        this.precoA = precoA;
    }

    public int getPrecoB() {
        return precoB;
    }

    public void setPrecoB(int precoB) {
        this.precoB = precoB;
    }

    public int getPrecoC() {
        return precoC;
    }

    public void setPrecoC(int precoC) {
        this.precoC = precoC;
    }

    public int getPrecoD() {
        return precoD;
    }

    public void setPrecoD(int precoD) {
        this.precoD = precoD;
    }

    public int getPromA() {
        return promA;
    }

    public void setPromA(int promA) {
        this.promA = promA;
    }

    public int getPromB() {
        return promB;
    }

    public void setPromB(int promB) {
        this.promB = promB;
    }
}
