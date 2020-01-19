package java8_examples.labs;

import lombok.*;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Developer {
    private int salary;

    @Singular
    private List<Beer> beers;














}
