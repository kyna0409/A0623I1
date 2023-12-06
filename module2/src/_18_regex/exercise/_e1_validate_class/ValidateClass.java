package _18_regex.exercise._e1_validate_class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String NAME_CLASS ="^[CAP][0-9]{4}[GHIKLM]$";

    public ValidateClass() {
        pattern= Pattern.compile(NAME_CLASS);
    }
    public boolean validate(String regex)
    {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
