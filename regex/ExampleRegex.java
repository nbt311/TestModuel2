package regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExampleRegex implements IRegex {
    private  static Pattern pattern;
    private static Matcher matcher;

    public static boolean checkStudentCode(String studentCode){
        pattern = Pattern.compile(STUDENT_CODE_REGEX);
        matcher = pattern.matcher(studentCode);
        return matcher.matches();
    }
    public static boolean checkName(String name){
        pattern = Pattern.compile(NAME_REGEX);
        matcher = pattern.matcher(name);
        return  matcher.matches();
    }
    public static boolean checkGender(String gender){
        pattern = Pattern.compile(GENDER_REGEX);
        matcher = pattern.matcher(gender);
        return matcher.matches();
    }
    public static  boolean checkAddress(String address){
        pattern = Pattern.compile(ADDRESS_REGEX);
        matcher = pattern.matcher(address);
        return matcher.matches();
    }
}
