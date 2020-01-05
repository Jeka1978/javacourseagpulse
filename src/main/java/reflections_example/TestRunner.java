package reflections_example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



/**
 * @author Evgeny Borisov
 */
public class TestRunner {
    public void runAllTests(Object o) throws InvocationTargetException, IllegalAccessException {
        Class<?> type = o.getClass();
        Method[] methods = type.getMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("test")) {
                method.invoke(o);
            }
        }

        //Evgeny Borisov
    }

}
