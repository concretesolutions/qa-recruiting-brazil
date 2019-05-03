package kata09;

import org.junit.Test;
import work.assisjrs.qa_recruiting_brazil.kata09.Checkout;
import work.assisjrs.qa_recruiting_brazil.kata09.Product;
import work.assisjrs.qa_recruiting_brazil.kata09.Rules;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class CheckoutVariosProdutosComPrecoEspecialTest {

    private static final Rules PRICING_RULES = new Rules();

    @Test
    public void se_existir_3_produtos_A_na_cesta_entao_o_preco_especial_sera_130(){
        final Checkout co = new Checkout(PRICING_RULES);

        co.scan(new Product("A"));
        co.scan(new Product("A"));
        co.scan(new Product("A"));

        final BigDecimal price = co.getTotal();

        assertThat(price).isEqualTo(new BigDecimal(130f));
    }

    @Test
    public void caso_tenha_4_produtos_A_3_o_total_sera_180(){
        final Checkout co = new Checkout(PRICING_RULES);

        co.scan(new Product("A"));
        co.scan(new Product("A"));
        co.scan(new Product("A"));
        co.scan(new Product("A"));

        final BigDecimal price = co.getTotal();

        assertThat(price).isEqualTo(new BigDecimal(180f));
    }

    @Test
    public void se_existir_2_produtos_B_na_cesta_entao_o_preco_especial_sera_45(){
        final Checkout co = new Checkout(PRICING_RULES);

        co.scan(new Product("B"));
        co.scan(new Product("B"));

        final BigDecimal price = co.getTotal();

        assertThat(price).isEqualTo(new BigDecimal(45f));
    }

    @Test
    public void se_existir_3_produtos_B_na_cesta_entao_o_preco_especial_sera_75(){
        final Checkout co = new Checkout(PRICING_RULES);

        co.scan(new Product("B"));
        co.scan(new Product("B"));
        co.scan(new Product("B"));

        final BigDecimal price = co.getTotal();

        assertThat(price).isEqualTo(new BigDecimal(75f));
    }
}
