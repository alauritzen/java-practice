import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scanner spouse = new Scanner(System.in);
		
		String name;
		
		int age;
		
		// ask for user name
		System.out.println("What is your name?");
		
		// take input as name
		name = input.nextLine();
		
		//ask for user age
		System.out.println("What is your age?");
		
		// take input as user's age
		age = input.nextInt();
		
		new User(name, age);
		
		// ask for 2nd user name
		System.out.println("What is your spouse's name?");
		
		// take input as 2nd user's name
		name = spouse.nextLine();
		
		//ask for 2nd user age
		System.out.println("What is your spouse's age?");
		
		// take input as 2nd user's age
		age = spouse.nextInt();
		
		new User(name, age);
	}

}
