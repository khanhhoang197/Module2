package validate_phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static final String[] validPhone = new String[]{"+84978489648", "0232489642","0909909909"};
    public static final String[] invalidPhone = new String[]{"(a8)-(22222222)","012345678910"};
    private static final String PHONE_REGEX ="^^[0][1-9][0-9]{8,9}$";

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        PhoneNumber phone = new PhoneNumber();
        for (String phoneNumber : validPhone) {
            boolean isValid = phone.validate(phoneNumber);
            System.out.println("Email is " + phoneNumber + " is valid: " + isValid);
        }
        for (String phoneNumber : invalidPhone) {
            boolean isValid = phone.validate(phoneNumber);
            System.out.println("Email is " + phoneNumber + " is valid: " + isValid);
        }
    }
}
