package kata09;

import org.junit.Test;
import work.assisjrs.qa_recruiting_brazil.kata09.Checkout;
import work.assisjrs.qa_recruiting_brazil.kata09.Product;
import work.assisjrs.qa_recruiting_brazil.kata09.Rules;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutVariosProdutosIndividuaisTest {

    private static final Rules PRICING_RULES = new Rules();

    @Test
    public void se_na_cesta_existir_um_produto_A_e_um_produto_B_o_total_deve_ser_80(){
        final Checkout co = new Checkout(PRICING_RULES);

        co.scan(new Product("A"));
        co.scan(new Product("B"));

        final BigDecimal price = co.getTotal();

        assertThat(price).isEqualTo(new BigDecimal(80f));
    }

    @Test
    public void uma_cesta_com_os_skus_CDBA_deve_custar_115(){
        final Checkout co = new Checkout(PRICING_RULES);

        co.scan(new Product("C"));
        co.scan(new Product("D"));
        co.scan(new Product("B"));
        co.scan(new Product("A"));

        final BigDecimal price = co.getTotal();

        assertThat(price).isEqualTo(new BigDecimal(115f));
    }

    @Test
    public void uma_cesta_com_os_skus_AA_deve_custar_100(){
        final Checkout co = new Checkout(PRICING_RULES);

        co.scan(new Product("A"));
        co.scan(new Product("A"));

        final BigDecimal price = co.getTotal();

        assertThat(price).isEqualTo(new BigDecimal(100f));
    }

    @Test
    public void uma_cesta_com_os_skus_ABA_deve_custar_130(){
        final Checkout co = new Checkout(PRICING_RULES);

        co.scan(new Product("A"));
        co.scan(new Product("B"));
        co.scan(new Product("A"));

        final BigDecimal price = co.getTotal();

        assertThat(price).isEqualTo(new BigDecimal(130f));
    }
}
