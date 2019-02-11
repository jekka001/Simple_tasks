package checking;


public class Checking {
    private final static String regDirectory = "^[A-Z]:(\\\\\\w*)*\\z";
    private final static String regLetter = "^([A-Z]|[a-z])\\z";
    private final static String regFileName = "^[A-Z]:(\\\\\\w*)+\\.txt\\z";

    public static boolean directory(String directory){
        return directory.matches(regDirectory);
    }

    public static boolean letter(String letter){
        return letter.matches(regLetter);
    }

    public static boolean fileName(String fileName){
       return fileName.matches(regFileName);
    }
}
