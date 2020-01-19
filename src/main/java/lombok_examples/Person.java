package lombok_examples;

import lombok.*;
import lombok.experimental.Wither;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Data
@Builder
@Wither
public class Person implements Serializable {



    private String name;
    private transient int age;
    private double tax;
    private int salary;
    @Singular
    private Map<String, Integer> beers;

    @Singular("דג")
    private List<String> fish;

    @NonNull
    private Integer bonus;

    public void printName() {
        System.out.println(name);
    }



}




