package java8_examples;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class PrintNumbersRunnable implements Runnable{

    @Override
    @SneakyThrows
    public void run() {
        int i=0;
        while (true) {
            System.out.println(i++);
            Thread.sleep(10);
        }
    }
}
