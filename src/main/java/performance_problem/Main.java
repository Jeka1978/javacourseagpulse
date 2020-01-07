package performance_problem;

import java.util.*;

/**
 * @author Evgeny Borisov
 */
public class Main {

    public static final int INT = 1_000_0000;

    public static void main(String[] args) {

        Map<StringBuilder, Void> map = new WeakHashMap<>();
        Map<StringBuilder, Void> map2 = new HashMap<>();


        while (true) {
            Random random = new Random();
            int i = random.nextInt(100);
            StringBuilder builder = new StringBuilder(i).append(i).append(i);
            if (i == 2) {
                map.put(builder,null);
                if (random.nextBoolean()) {
                    map2.put(builder, null);
                }
            }
        }
    }
}
