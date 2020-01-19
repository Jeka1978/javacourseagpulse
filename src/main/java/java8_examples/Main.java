package java8_examples;

import lombok_examples.Person;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                Person.builder().name("Tal").age(18).build(),
                Person.builder().name("Shlomi").age(32).build(),
                Person.builder().name("Daniel").age(32).build()
        );

        people.forEach(Person::printName);











    }
}
