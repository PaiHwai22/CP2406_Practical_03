/* This class is a NumbersDemo application holding 2 int variables in main and values
are passed into 3 more methods. */

public class NumbersDemo {
    public static void main(String[] args) {

        int a = 5, b = 8;
        System.out.println("the int numbers are a = " + a + " and b = " + b + ".");
        displayNumberSquared(a,b);
        displayNumberPlusFive(a,b);
        displayTwiceTheNumber(a,b);

    }
    public static void displayTwiceTheNumber(int a, int b) {
        a = a * 2;
        b = b * 2;
        System.out.println("twice the number for a is: " + a + " and twice the number for b is: " + b);

    }

    public static void displayNumberPlusFive(int a, int b) {
        a = a + 5;
        b = b + 5;
        System.out.println("a plus 5 is: " + a + " and b + 5 is: " + b);

    }

    public static void displayNumberSquared(int a, int b) {
        a = a * a;
        b = b * b;
        System.out.println("a squared is: " + a + " and b squared is: " + b);

    }

}
