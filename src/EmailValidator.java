
public class EmailValidator {
	
    private static final String EMAIL_REGEX = "^[\\w-\\.]+@(gmail\\.com|yahoo\\.com|hotmail\\.com)$";

    public static boolean isValidEmail(String email) {
        return email != null && email.matches(EMAIL_REGEX);
    }

}
