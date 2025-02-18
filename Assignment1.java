// Import libraries here
import java.util.Scanner;
import java.util.Random;

public class Assignment1 {
    public static void main(String[] args) {
        // Print initials
        System.out.println("EEEEEEE    RRRRRRRRR");
        System.out.println("EEE        RRR    RRR");
        System.out.println("EEE        RRR    RRR");
        System.out.println("EEEEEE     RR RRR");
        System.out.println("EEE        RRR  RRR");
        System.out.println("EEE        RRR    RRR");
        System.out.println("EEEEEEE    RRR      RRR\n");

        // Create scanner object
        Scanner scan = new Scanner(System.in);

        // Get Fahrenheit input
        System.out.println("Please enter a number in Fahrenheit:");
        double fahrenheit = scan.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Get 5-character string input
        System.out.println("Please enter a 5-character string:");
        String inputString = scan.next();
        String trimmedReversedString = inputString.substring(3, 4) + inputString.substring(2, 3) + inputString.substring(1, 2);

        // Generate random number
        System.out.println("Generating random number. Continuing...\n");
        Random rand = new Random();
        int randomNumber = rand.nextInt(16384 - 32 + 1) + 32;

        // Print results
        System.out.println("Your new string is " + celsius + trimmedReversedString + randomNumber);

        // Close scanner
        scan.close();
    }
}
