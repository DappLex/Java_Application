import java.util.Random;

public class RandomNumbers {
    public static void main(String args[]) {
        Random random = new Random();

        // Create a variable to store the random number generated.
        int randomNum = random.nextInt();

        // Print the random number
        System.out.printf("Random Number is: %d%n", randomNum);

        // Generating an integer within a range
        int randomNumInRange = random.nextInt(20); // Generates a number between 0 and 19

        System.out.printf("Random Number In Range is: %d%n", randomNumInRange);

        // Generating a floating-point number
        double floatpointNum = random.nextDouble();

        // Print floating-point number
        System.out.printf("Random Double Number is: %.2f%n", floatpointNum);

        // Generating a floating-point value within a range
        double min = 10.0;
        double max = 20.0;

        double randomFloatPointInRange = min + (max - min) * random.nextDouble();

        // Print floating-point number within the range
        System.out.printf("Random Double Number In Range is: %.2f%n", randomFloatPointInRange);

        // Generate a random boolean value
        boolean booleanValue = random.nextBoolean();

        // Print random boolean value
        System.out.printf("Random Boolean Value is: %b%n", booleanValue);
    }
}
cd documents