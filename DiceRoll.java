import java.security.SecureRandom;

public class DiceRoll {
	public static voild main(String[] args) {
		SecureRandom randomNumbers = new SecureRandom();
		int dieeRoll = randomNumbers.nextInt(6) + 1;
		System.out.printIn("You rolled a: " dieRoll);
	}
};