package java8_examples.multiple_inheritance;

/**
 * @author Evgeny Borisov
 */
public interface Father {
     default void talkToChildren(){
         System.out.println("come to me");
     }
}
