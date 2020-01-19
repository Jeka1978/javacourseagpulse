package java8_examples.multiple_inheritance;

/**
 * @author Evgeny Borisov
 */
public interface Mother {


    default void talkToChildren(){
        System.out.println("COME TO ME!!!");
    }
}
