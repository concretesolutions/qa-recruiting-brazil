package kata09;

import org.junit.Test;
import work.assisjrs.qa_recruiting_brazil.kata09.Checkout;
import work.assisjrs.qa_recruiting_brazil.kata09.Product;
import work.assisjrs.qa_recruiting_brazil.kata09.Rules;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutApenasUmProdutoTest {

    private static final Rules PRICING_RULES = new Rules();

    @Test
    public void caso_exista_apenas_um_produto_A_deve_considerar_o_preco_50(){
        final Checkout co = new Checkout(PRICING_RULES);

        final Product product = new Product("A");

        co.scan(product);

        final BigDecimal price = co.getTotal();

        assertThat(price).isEqualTo(new BigDecimal(50f));
    }

    @Test
    public void caso_exista_apenas_um_produto_B_deve_considerar_o_preco_30(){
        final Checkout co = new Checkout(PRICING_RULES);

        final Product product = new Product("B");

        co.scan(product);

        final BigDecimal price = co.getTotal();

        assertThat(price).isEqualTo(new BigDecimal(30f));
    }

    @Test
    public void caso_exista_apenas_um_produto_C_deve_considerar_o_preco_20(){
        final Checkout co = new Checkout(PRICING_RULES);

        final Product product = new Product("C");

        co.scan(product);

        final BigDecimal price = co.getTotal();

        assertThat(price).isEqualTo(new BigDecimal(20f));
    }

    @Test
    public void caso_exista_apenas_um_produto_D_deve_considerar_o_preco_15(){
        final Checkout co = new Checkout(PRICING_RULES);

        final Product product = new Product("D");

        co.scan(product);

        final BigDecimal price = co.getTotal();

        assertThat(price).isEqualTo(new BigDecimal(15f));
    }
}
