import java.util.Scanner;

public class IT24103325Lab5Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int first = scanner.nextInt();
        
        System.out.println("Enter the second number: ");
        int second = scanner.nextInt();
        
        System.out.println("Enter the third number: ");
        int third = scanner.nextInt();
        
        int smallest = first;
        int largest = first;
        
        if (second < smallest) {
            smallest = second;
        }
        
        if (third < smallest) {
            smallest = third;
        }
        
        if (second > largest) {
            largest = second;
        }
        
        if (third > largest) {
            largest = third;
        }
        
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
    }
}