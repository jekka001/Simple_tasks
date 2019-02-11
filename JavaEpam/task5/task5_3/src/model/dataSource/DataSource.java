package model.dataSource;

import java.util.HashMap;

public abstract class DataSource {

    public static HashMap<String, String> getDictionary(){
        HashMap<String, String> result = new HashMap<>();
        result.put("my","мой");
        result.put("i","я");
        result.put("put","положил");
        result.put("horse","конь");
        result.put("boy","парень");
        result.put("need","нужно");
        result.put("car","машину");
        result.put("take","возьми");
        result.put("touch","трогать");
        result.put("girl","девушка");
        result.put("doll","кукла");
        result.put("what","что");
        result.put("where","где");
        result.put("but","но");
        result.put("joy","радость");
        result.put("music","музыка");
        result.put("bus","автобус");
        result.put("no","нет");
    return result;
    }
}
