package java8_examples;

import lombok.SneakyThrows;
import lombok_examples.Person;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author Evgeny Borisov
 */
public class ListUtil {


    @SneakyThrows
    public static void main(String[] args) {
        Thread thread = new Thread(new PrintNumbersRunnable());
        thread.start();
        thread.stop();
        while (true) {
            System.out.println(-1);
            Thread.sleep(1);
        }



    }

    @SneakyThrows
    public static <T> void forEachWithDelay(List<T> list, int delay, Action<T> action) {
        for (T t : list) {
            action.doAction(t);
            Thread.sleep(delay);
        }
    }

    @SneakyThrows
    public static <T> void forEachWithDelay(List<T> list, int delay, Consumer<T> action) {

        for (T t : list) {
            action.accept(t);
            Thread.sleep(delay);
        }
    }
//


    public static <T> int countDuplicates(List<T> list, T t) {
        int counter=0;
        for (T t1 : list) {
            if (t1.equals(t)) {
                counter++;
            }
        }
        return counter;
    }

    public static <T> int countDuplicates(List<T> list, T t,Equalator<T> equalator) {
        int counter=0;
        for (T t1 : list) {
            if (equalator.isEqual(t,t1)) {
                counter++;
            }
        }
        return counter;
    }
}
