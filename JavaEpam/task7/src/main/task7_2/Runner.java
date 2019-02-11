package main.task7_2;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {
    public void run() throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException, InstantiationException {
        Class<?> clazz = UnaryOperation.class;
        Constructor constructor = clazz.getConstructor();
        UnaryOperation unaryOperation = (UnaryOperation) constructor.newInstance();
        System.out.println(unaryOperation);
        Method[] methods = clazz.getMethods();
        for(Method method : methods) {
            if (method.getName().startsWith("set")) {
                method.invoke(unaryOperation, 0.0);
                System.out.println(unaryOperation);
            }
            if (method.getName().startsWith("inc")) {
                method.invoke(unaryOperation);
                System.out.println(unaryOperation);
            }
        }

    }
}
