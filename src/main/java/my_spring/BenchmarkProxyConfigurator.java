package my_spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
public class BenchmarkProxyConfigurator implements ProxyConfigurator {
    @Override
    public Object wrapWithProxy(Object t, Class type) {
        if (type.isAnnotationPresent(Benchmark.class) || Arrays.stream(type.getMethods()).anyMatch(m -> m.isAnnotationPresent(Benchmark.class))) {
            return Proxy.newProxyInstance(type.getClassLoader(), type.getInterfaces(), new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    Method classMethod = type.getMethod(method.getName(), method.getParameterTypes());
                    if (type.isAnnotationPresent(Benchmark.class) || classMethod.isAnnotationPresent(Benchmark.class)) {
                        System.out.println("********BENCHMARK STARTED for method " + method.getName() + "   started *******");
                        long start = System.nanoTime();
                        Object retVal = method.invoke(t, args);
                        long end = System.nanoTime();
                        System.out.println(end - start);
                        System.out.println("********BENCHMARK ENDED for method " + method.getName() + "   finished *******");
                        return retVal;
                    } else {
                        return method.invoke(t, args);
                    }


                }
            });
        } else {
            return t;
        }
    }
}
