package java8_examples;

import lombok_examples.Person;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {


        Stream.of("java","scala","groovy")
                .filter(s -> s.equals("java"))
                .reduce((s, s2) -> s+", "+s2)
                .ifPresent(System.out::println);



//        List<Person> people = List.of(
//                Person.builder().name("Tal").age(18).build(),
//                Person.builder().name("Shlomi").age(32).build(),
//                Person.builder().name("Daniel").age(32).build()
//        );
//
//        people.forEach(Person::printName);











    }
}
