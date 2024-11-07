import java.util.Scanner;

public class CsQs5 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for input
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        // Check if the year is a leap year using conditional statements
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        // Close the scanner
        scanner.close();
    }
}