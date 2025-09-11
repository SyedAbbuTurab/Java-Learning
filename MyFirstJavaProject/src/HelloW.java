import java.util.Scanner;
import java.util.Random;

public class HelloW {
	public static void main(String[] args) {
		System.out.println("Let's roll die!");
		
		Scanner scanner = new Scanner(System.in);
		
		Random random = new Random();
		
		int total = 0;
		
		System.out.println("Enter # of dice to roll");
		int numOfDice = scanner.nextInt();
		
		if(numOfDice > 0) {
			for (int i = 0; i < numOfDice; i++) {
				int roll = random.nextInt(1, 7);
				System.out.println("You rolled " + roll);
				total+=roll;
			}
		} else {
			System.out.println("Number of dice cannot be Negative or Zero");
		}
		
		System.out.println("Your total is " + total);
	}

}
