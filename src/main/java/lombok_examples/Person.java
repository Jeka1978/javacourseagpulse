package lombok_examples;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author Evgeny Borisov
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {

    @Getter
    private String name;
    private int age;
    private int salary;
    private int bonus;


}
