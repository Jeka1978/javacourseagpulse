package java8_examples.optional_examples;

import lombok.Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
@Data
public class Car {
    private String insurance;

    public Optional<String> getInsurance() {
        return Optional.ofNullable(insurance);
    }


    public void handleFile(File file) {
        if (file.exists()) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
            } catch (FileNotFoundException e) {
               // it will never happen
            }
        }
    }
















}

