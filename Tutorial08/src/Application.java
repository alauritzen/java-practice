import java.util.Scanner;
import java.util.Random;

public class Application {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int count = 0;
		
		Random rand = new Random();
		
		int number = rand.nextInt(10) + 1;
		
		int value;
		
		do {
			System.out.println("Enter a number between 1 and 10: ");
			
			value = input.nextInt();
			
			count ++;
			
			if (value > number) {
				System.out.println("It's lower than that!");
			} else if (value < number) {
				System.out.println("It's higher than that!");
			}
			
		} while (value != number);
		
		System.out.println("That's right! It took you " + count + " guesses!");
		
	}
	
	
	
	
}
