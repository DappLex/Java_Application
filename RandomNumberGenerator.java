import java.util.Scanner;
import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        
        // Create Scanner object to collect user input
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int userNumber = scan.nextInt();  // Read the number entered by the user
        
        // Check if the user entered a number less than or equal to 0
        if (userNumber <= 0) {
            System.out.println("The number must be greater than 0");
        } else {
            // Generate a random number from 0 to userNumber (inclusive)
            int randomNum = random.nextInt(userNumber + 1);  // Use the correct assignment operator
            System.out.printf("The generated random number from 0 to %d is: %d%n", userNumber, randomNum);
        }

        // Close the scanner
        scan.close();
    }
}
