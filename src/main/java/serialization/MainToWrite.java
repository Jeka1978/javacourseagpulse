package serialization;

import lombok.SneakyThrows;
import lombok_examples.Person;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * @author Evgeny Borisov
 */

public class MainToWrite {

    @SneakyThrows
    public static void main(String[] args) {
        File file = new File("c:\\tmp\\person.obj");
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Person person = Person.builder().age(18).name("Nofar").bonus(30).build();


        oos.writeObject(person);

    }
}
