public class EmailTest {
    private static Email emailExample;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        emailExample = new Email();
        for (String email : validEmail
        ) {
            boolean isValid = emailExample.valid(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }
        for (String email : invalidEmail
        ) {
            boolean isValid = emailExample.valid(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }
    }
}
