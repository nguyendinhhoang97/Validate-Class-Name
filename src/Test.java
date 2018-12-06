class Test {
    private static ClassName exampleClassName;
    private static final String[] valiClassName = new String[] {"C0318G"};
    private static final String[] invaliClassName = new String[] { "M0318G", "P0323A"};

    public static void main(String[] args) {

        exampleClassName = new ClassName();

        for (String className:valiClassName) {
            boolean isValid = exampleClassName.validate(className);
            System.out.println("Class name is " + className +" is valid: "+ isValid);
        }

        for (String className:invaliClassName) {
            boolean isValid = exampleClassName.validate(className);
            System.out.println("Class name is " + className + " is valid: " + isValid);
        }

    }
}