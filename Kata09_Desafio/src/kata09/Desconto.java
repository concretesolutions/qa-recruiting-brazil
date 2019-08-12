package kata09;
public class Desconto {

    private int valorDoDesconto;
    private int quantidadeRequerida;

    public Desconto(int valorDoDesconto, int quantidadeRequerida) {
        this.valorDoDesconto = valorDoDesconto;
        this.quantidadeRequerida = quantidadeRequerida;
    }

    public int calcularDesconto(int quantidade) {
        if(quantidade / this.quantidadeRequerida >= 1) {
            return quantidade / this.quantidadeRequerida * this.valorDoDesconto;
        }
        return 0;
    }
}
