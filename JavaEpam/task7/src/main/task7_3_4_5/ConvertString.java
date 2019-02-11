package main.task7_3_4_5;

@FunctionalInterface
public interface ConvertString {
     String convert(String str);
    default boolean isNull(String string) {
        return string == null || string.trim().equals("");
    }
}
