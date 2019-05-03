package kata09;

import org.junit.Test;
import work.assisjrs.qa_recruiting_brazil.kata09.Rules;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class RegraDePrecosEspeciaisTest {
    @Test
    public void tres_produtos_A_custam_130(){
        final Rules rules = new Rules();

        final BigDecimal price = rules.getPrice("A", 3L);

        assertThat(price).isEqualTo(new BigDecimal(130f));
    }

    @Test
    public void quatro_produtos_A_custam_180(){
        final Rules rules = new Rules();

        final BigDecimal price = rules.getPrice("A", 4L);

        assertThat(price).isEqualTo(new BigDecimal(180f));
    }

    @Test
    public void dois_produtos_B_custam_45(){
        final Rules rules = new Rules();

        final BigDecimal price = rules.getPrice("B", 2L);

        assertThat(price).isEqualTo(new BigDecimal(45f));
    }

    @Test
    public void tres_produtos_B_custam_75(){
        final Rules rules = new Rules();

        final BigDecimal price = rules.getPrice("B", 3L);

        assertThat(price).isEqualTo(new BigDecimal(75f));
    }
}
