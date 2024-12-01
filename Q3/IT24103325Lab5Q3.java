import java.util.Scanner;

public class IT24103325Lab5Q3 {
    public static void main(String[] args) {
        final int ROOM_CHARGE = 48000;
        final int NO_DISCOUNT = 0;
        final int DISCOUNT_3_4_DAYS = 10;
        final int DISCOUNT_5_OR_MORE_DAYS = 20;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start date (1-31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter end date (1-31): ");
        int endDate = scanner.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than end date.");
            return;
        }

        int daysReserved = endDate - startDate;
        int discountRate;

        if (daysReserved < 3) {
            discountRate = NO_DISCOUNT;
        } else if (daysReserved <= 4) {
            discountRate = DISCOUNT_3_4_DAYS;
        } else {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        }

        int totalAmount = daysReserved * ROOM_CHARGE;
        int discountAmount = totalAmount * discountRate / 100;
        int amountToPay = totalAmount - discountAmount;

        System.out.println("Days Reserved: " + daysReserved);
        System.out.println("Total Amount: Rs " + totalAmount);
        System.out.println("Discount: Rs " + discountAmount);
        System.out.println("Amount to Pay: Rs " + amountToPay);
    }
}