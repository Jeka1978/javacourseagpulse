package enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.SneakyThrows;

import java.io.FileNotFoundException;

/**
 * @author Evgeny Borisov
 */
@Data
@AllArgsConstructor
public class Human {
    private String name;
    private MaritalStatus maritalStatus;

    @SneakyThrows
    public static void main(String[] args) {

        MaritalStatus maritalStatus = MaritalStatus.findByDbCode(1);

        String hebrewDesc = maritalStatus.getHebrewDesc();

        System.out.println("hebrewDesc = " + hebrewDesc);


    }
}
