package regex;

public interface IRegex {
    final String STUDENT_CODE_REGEX = "^[a-zA-Z0-9]{6}$";
    final String NAME_REGEX = "^[A-Za-z]+(?:\\s[A-Za-z]+)?$";
    final String GENDER_REGEX = "^(MALE|FEMALE)|(Male|Female)|(male|female)";
    final String ADDRESS_REGEX = "^[\\w\\s\\d.,#-]+$";
}
