package verification;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Verification {

    public static boolean menuNumber(int number){
        if(number >= 0 && number < 3)
            return true;
        else
           return false;
    }

    public static boolean surnameAndName(String name){
        String regul = "^[A-Z][a-z]+\\z";
        Pattern patern = Pattern.compile(regul);
        Matcher matcher = patern.matcher(name);
        if(matcher.find())
            return true;
        else
            return false;
    }

    public static boolean birth(String birth){
        String regul = "^(0?[1-9]|[12][0-9]|3[01])\\.(0?[1-9]|1[0-2])\\.((19|20)\\d\\d)\\z";
        Pattern pattern = Pattern.compile(regul);
        Matcher matcher = pattern.matcher(birth);
        if(matcher.find()) {
            String day = matcher.group(1);
            String month = matcher.group(2);
            int year = Integer.parseInt(matcher.group(3));
            return monthsChecking(day, month, year);
        }else
            return false;
    }

    private static boolean monthsChecking(String day, String month, int year){
        if("31".equals(day)){
            return Arrays.asList(new String[]{"1","01","3","03","5","05","7","07","8","08","10","12"}).contains(month);
        }else if("2".equals(month) || "02".equals(month)){
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return Integer.parseInt(day) <= 29;
                    }
                    return Integer.parseInt(day) <= 28;
                }
                return Integer.parseInt(day) <= 29;
            } else {
                return Integer.parseInt(day) <= 28;
            }
        }else{
            return true;
        }
    }

    public static boolean phoneNumber(String phoneNumber){
        String regul = "^\\+[1-9]\\d{1,2}\\(\\d{2}\\)(\\d{2}-){2}\\d{3}\\z";
        Pattern pattern = Pattern.compile(regul);
        Matcher matcher = pattern.matcher(phoneNumber);
        if(matcher.find())
            return true;
        else
            return false;
    }

    public static boolean address(String address){
        String regul = "^([A-Z][a-z]+|[A-Z][a-z]+ [A-Z][a-z]+),(0?[1-9]+|[1-9][0-9]*),[1-9][0-9]*\\z";
        Pattern pattern = Pattern.compile(regul);
        Matcher matcher = pattern.matcher(address);
        if(matcher.find())
            return true;
        else
            return false;
    }

}
