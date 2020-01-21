package java8_examples.optional_examples;

import java.util.Optional;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.getCar()
                .map(car -> car.getInsurance().get())
                .orElse("no name");
    }
}
