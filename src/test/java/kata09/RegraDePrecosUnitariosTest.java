package kata09;

import org.junit.Test;
import work.assisjrs.qa_recruiting_brazil.kata09.Rules;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class RegraDePrecosUnitariosTest {

    @Test
    public void caso_o_sku_seja_vazio_o_custo_e_zero(){
        final Rules rules = new Rules();

        final BigDecimal price = rules.getPrice("", 1);

        assertThat(price).isEqualTo(BigDecimal.ZERO);
    }

    @Test
    public void um_produto_A_custa_50(){
        final Rules rules = new Rules();

        final BigDecimal price = rules.getPrice("A", 1);

        assertThat(price).isEqualTo(new BigDecimal(50f));
    }

    @Test
    public void um_produto_B_custa_30(){
        final Rules rules = new Rules();

        final BigDecimal price = rules.getPrice("B", 1);

        assertThat(price).isEqualTo(new BigDecimal(30f));
    }

    @Test
    public void um_produto_C_custa_20(){
        final Rules rules = new Rules();

        final BigDecimal price = rules.getPrice("C", 1);

        assertThat(price).isEqualTo(new BigDecimal(20f));
    }

    @Test
    public void um_produto_D_custa_15(){
        final Rules rules = new Rules();

        final BigDecimal price = rules.getPrice("D", 1);

        assertThat(price).isEqualTo(new BigDecimal(15f));
    }
}
