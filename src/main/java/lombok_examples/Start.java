package lombok_examples;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
public class Start {
    public static void main(String[] args) {


        Person person = Person.builder()
                .name("Jeka")
                .age(41)
                .salary(40)
                .bonus(20)
                .beer("Tuborg",2)
                .beer("Leff",4)
                .דג("solomon")
                .דג("tuna")

                .build();


        person.setAge(12);
        System.out.println("person = " + person);

        Map<String, Integer> newBeers = Map.of("baltika", 1);
    }
}
