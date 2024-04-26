import java.util.Random;
import java.util.Scanner;

public class CC15PigDice {

	public static void main(String[] args) {

		System.out.println("Welcome to Pig Dice App!");
		Scanner sc = new Scanner(System.in);
		String choice = "y";

		System.out.println("Would you like to play a game? (y/n)");
		choice = sc.next();

		while (choice.equalsIgnoreCase("y")) {
			int rollCount = 0;
			int score = 0;

			while (true) {
				int singleRoll = rollDice();

				rollCount++;

				if (singleRoll == 1) {
					System.out.println("You rolled a 1! \nGame Over!\nYour final score is: " + score);
					System.out.println("Total rolls for this game is: " + rollCount);
					break;
				} else {
					score += singleRoll;
				}

			}

			System.out.println("Would you like to play again? (y/n)");
			choice = sc.next();
		}

		sc.close();

		System.out.println("Goodbye!");

	}

	public static int rollDice() {
		Random random = new Random();
		return random.nextInt(6) + 1;
	}

}
