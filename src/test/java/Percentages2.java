import java.util.Scanner;
/*This is percentages class using user input for 2 variables. */
public class Percentages2 {
    public static void main(String[] args) {
        Scanner getDouble = new Scanner(System.in);
        System.out.println("Enter two decimal numbers for a and  b: " );
        double a = getDouble.nextDouble();
        double b = getDouble.nextDouble();
        System.out.println("Your 2 numbers are: " + a + " and " + b + ".");
        computePercent(a, b);
        computePercent(b, a);
    }

    public static void computePercent(double a, double b) {
        double percentage = (a / b) * 100;
        System.out.println(a + " is " + percentage + "% of " + b + ".");
    }

}
