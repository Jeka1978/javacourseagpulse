package my_spring;

import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
public class Elf {

    @InjectRandomInt(min = 3, max = 11)
    private int power;
    @InjectRandomInt(min = 7, max = 17)
    private int speed;
}
