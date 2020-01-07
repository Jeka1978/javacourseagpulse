package lombok_examples.immutable;

import lombok_examples.Person;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate localDate = date.withMonth(2);
        System.out.println("date = " + localDate);
        Person person = Person.builder().bonus(12).build();
        Person person1 = person.withAge(12).withName("Jeka").withSalary(10);
        System.out.println("person1 = " + person1);




        ArrayList<Number> list = new ArrayList<>();

        int i = 2;
        list.add(i);
        System.out.println("list = " + list);
    }
}
