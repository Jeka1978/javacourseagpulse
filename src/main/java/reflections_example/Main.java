package reflections_example;

import access_modifiers.Parent;

import java.lang.reflect.InvocationTargetException;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {


        Stream.of(1, 2, 3);

        TestClass testObject = new TestClass();
        TestRunner testRunner = new TestRunner();

        testRunner.runAllTests(testObject);
    }
}
