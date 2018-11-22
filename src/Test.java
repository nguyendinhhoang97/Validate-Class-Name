public class Test {
    private static ValidateNameOfClass validateNameOfClass;
    public static final String[] validName = new String[] { "C0318G" };
    public static final String[] invalidName = new String[] { "M0318G" };

    public static void main(String args[]) {
        validateNameOfClass = new ValidateNameOfClass();
        for (String email : validName) {
            boolean isvalid = validateNameOfClass.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
        for (String email : invalidName) {
            boolean isvalid = validateNameOfClass.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }
}
