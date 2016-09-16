import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Output the prompt
		System.out.println("What is your favorite color: ");
		
		// Wait for user input
		String line = input.nextLine();
		
		// Recall user input
		System.out.println("You answered, '" + line + "'. That is correct!");
		
	}

}
