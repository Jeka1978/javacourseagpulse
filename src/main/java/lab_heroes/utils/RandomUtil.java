package lab_heroes.utils;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class RandomUtil {
    private final static Random random = new Random();

    public static int intBetween(int min, int max) {
        return random.nextInt(max - min) + min;
    }

}
