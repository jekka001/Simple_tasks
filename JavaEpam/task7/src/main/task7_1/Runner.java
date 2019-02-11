package main.task7_1;

import java.lang.reflect.Field;

public class Runner {
    public void run() throws NoSuchFieldException, IllegalAccessException {
        String str = "Hello";//1
        System.out.println(str);
        Class <?> clazz = str.getClass();
        Field field = clazz.getDeclaredField("value");
        field.setAccessible(true);
        field.set(str,"New value".toCharArray());
        System.out.println("new ->" + str);
    }
}
