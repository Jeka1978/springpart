package tdd;

import lombok.SneakyThrows;

import java.lang.reflect.Method;

/**
 * @author Evgeny Borisov
 */
public class TestRunner {

    @SneakyThrows
    public void runAllTests(String className) {
        Class<?> type = Class.forName(className);
        runAllTests(type);
    }

    @SneakyThrows
    public void runAllTests(Class type) {
        Object o = type.newInstance();
        runAllTests(o);
    }

    @SneakyThrows
    private void runAllTests(Object o) {
        Class<?> type = o.getClass();
        Method[] methods = type.getMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("test")|| method.isAnnotationPresent(Test.class)) {
                method.invoke(o);
            }
        }
    }
}
