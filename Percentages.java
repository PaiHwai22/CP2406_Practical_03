/*This class computes percentages using 2 variables. */
public class Percentages {
    public static void main(String[] args) {
        double a = 5.9;
        double b = 9.1;
        System.out.println("Your 2 numbers are: " + a + " and " + b + ".");
        computePercent(a, b);
        computePercent(b, a);
    }

    public static void computePercent(double a, double b) {
        double percentage = (a / b) * 100;
        System.out.println(a + " is " + percentage + "% of " + b + ".");
    }
}
