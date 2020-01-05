package lombok_examples;

import static java.lang.Math.*;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        sqrt(2);
        person.setName("Moshe");
        person.setAge(12);

        Person person2 = new Person();
        person2.setName("Moshe");
        person2.setAge(12);


        System.out.println("person = " + person);
        System.out.println("person2 = " + person2);

        System.out.println(person==person2);
        System.out.println(person.equals(person2));
    }
}
