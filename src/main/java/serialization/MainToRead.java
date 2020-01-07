package serialization;

import lombok.SneakyThrows;
import lombok_examples.Person;

import java.io.*;

/**
 * @author Evgeny Borisov
 */

public class MainToRead {

    @SneakyThrows
    public static void main(String[] args) {
        File file = new File("c:\\tmp\\person.obj");
        FileInputStream fos = new FileInputStream(file);
        ObjectInputStream oos = new ObjectInputStream(fos);

        Person person = Person.builder().age(18).name("Nofar").bonus(30).build();


        Object o = oos.readObject();
        System.out.println(o);

    }
}
