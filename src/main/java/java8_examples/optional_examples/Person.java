package java8_examples.optional_examples;

import lombok.Data;

import java.util.Optional;

/**
 * @author Evgeny Borisov
 */
@Data
public class Person {
    private Car car;

    public Optional<Car> getCar() {
        return Optional.ofNullable(car);
    }
}
