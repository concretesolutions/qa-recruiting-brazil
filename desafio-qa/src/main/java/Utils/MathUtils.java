package Utils;

import java.util.List;

public class MathUtils {

    public static long sum(List<Long> list) {
        int sum = 0;
        for (Long i: list) {
            sum += i;
        }
        return sum;
    }
}
