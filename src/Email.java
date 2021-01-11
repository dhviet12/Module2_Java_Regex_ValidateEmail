import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    private static final String VALID_EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)";
    private Matcher matcher;
    private static Pattern pattern;

    public Email() {
        pattern= Pattern.compile(VALID_EMAIL);
    }
    public boolean valid(String regex){
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }
}
