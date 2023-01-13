/* This is FormLetterWriter class. */
class FormLetterWriter {
    // overload method using one string parameter.
    private static void displaySalutation(String lastName) {
        System.out.println("Dear Mr. or Ms. " + lastName);
        System.out.println("Thank you for your recent order. ");

    }
    // overload method using two string parameter.
    private static void displaySalutation(String firstName, String lastName) {
        System.out.println("Dear " + firstName + " " + lastName);
        System.out.println("Thank you for your recent order. ");

    }
    // main method to test two overloaded methods.
    public static void main(String[] args) {
        String firstName = "Allen";
        String lastName = "Carr";
        displaySalutation(lastName);
        displaySalutation(firstName,lastName);
    }
}
