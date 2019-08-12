package testes;
import kata09.Desconto;
import kata09.RegrasDosPrecos;

public class TestesPrecos {
	RegrasDosPrecos regras() { // regra dos precos e descontos
        RegrasDosPrecos regraDosPrecos = new RegrasDosPrecos();

	    regraDosPrecos.adicionarRegraDosPrecos("A", 50);
	    regraDosPrecos.adicionarRegraDosPrecos("B", 30);
	    regraDosPrecos.adicionarRegraDosPrecos("C", 20);
	    regraDosPrecos.adicionarRegraDosPrecos("D", 15);

	    regraDosPrecos.adicionarRegraDoDesconto("A", new Desconto(20, 3));
	    regraDosPrecos.adicionarRegraDoDesconto("B", new Desconto(15, 2));
	    return regraDosPrecos;
    }
	

}
