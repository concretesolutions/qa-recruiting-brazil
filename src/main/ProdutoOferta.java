package main;
import java.util.*;

public class ProdutoOferta {

public static TreeMap<String, Produto> produtoOferta = new TreeMap<String, Produto>();

	
	static{
		produtoOferta.put("A", new Produto("A", 3, 130.0));
		produtoOferta.put("B", new Produto("B", 2, 45.0));
	}
	
}
