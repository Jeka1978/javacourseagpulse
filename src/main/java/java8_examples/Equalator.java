package java8_examples;

/**
 * @author Evgeny Borisov
 */
public interface Equalator<T> {
    boolean isEqual(T t1, T t2);
}
