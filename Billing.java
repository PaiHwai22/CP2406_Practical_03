public class Billing {
    private static float computeBill(float priceBook) {
        float tax = (priceBook/100) * 8;  // get 8% tax
        float total_due = tax + priceBook; // add tax to total
        return total_due;
    }
    private static float computeBill(float priceBook, int numBook) {
        float total= priceBook * numBook; // get total
        float tax = (total/100) * 8; // get 8% tax
        float total_due = total + tax; // add tax to total
        return total_due;
    }
    private static float computeBill(float priceBook, int numBook, int couponValue) {
        float total = (priceBook * numBook) - couponValue; // get total
        float tax = (total/100) * 8; // get 8% tax
        float total_due = total + tax; // add tax to total
        return total_due;
    }
    public static void main(String[] args) {
        System.out.println(computeBill(13.5F));
        System.out.println(computeBill(14.05F,3));
        System.out.println(computeBill(16.0F,5, 14));
    }
}
