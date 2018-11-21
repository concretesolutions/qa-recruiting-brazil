package TestesUnitarios;

import ProjetoCompraMercado.CheckOut;
import ProjetoCompraMercado.ObjetoItensMercado;
import org.junit.Assert;
import org.junit.Test;


public class TesteCompraMercado {

    @Test
    public void testeTotal(){

        CheckOut co = new CheckOut();

        Assert.assertEquals(0, co.Price(""));
        Assert.assertEquals(50,  co.Price("A"));
        Assert.assertEquals(80,  co.Price("AB"));
        Assert.assertEquals(115,  co.Price("CDBA"));

        Assert.assertEquals(100,  co.Price("AA"));
        Assert.assertEquals(130,  co.Price("AAA"));
        Assert.assertEquals(180,  co.Price("AAAA"));
        Assert.assertEquals(230,  co.Price("AAAAA"));
        Assert.assertEquals(260,  co.Price("AAAAAA"));
        
        Assert.assertEquals(160,  co.Price("AAAB"));
        Assert.assertEquals(175,  co.Price("AAABB"));
        Assert.assertEquals(190,  co.Price("AAABBD"));
        Assert.assertEquals(190,  co.Price("DABABA"));
        

    }

    @Test
    public void testeIncremental(){

        CheckOut co = new CheckOut();

        Assert.assertEquals(0,co.total());
        co.scan("A");
        Assert.assertEquals(50,co.total());
        co.scan("B");
        Assert.assertEquals(80,co.total());
        co.scan("A");
        Assert.assertEquals(130,co.total());
        co.scan("A");
        Assert.assertEquals(160,co.total());
        co.scan("B");
        Assert.assertEquals(175,co.total());

       


    }

}
