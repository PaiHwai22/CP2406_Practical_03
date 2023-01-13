import java.util.Scanner;

/* This class is a NumbersDemo application that takes the int values from the user. */
public class NumbersDemo2 {
    public static void main(String[] args) {
        Scanner getInt = new Scanner(System.in);
        System.out.println("Enter 2 integer numbers for a and  b: ");
        int a = getInt.nextInt();
        int b = getInt.nextInt();
        displayNumberSquared(a, b);
        displayNumberPlusFive(a, b);
        displayTwiceTheNumber(a, b);

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
