import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String name;
		
		int age;
		
		// ask for user name
		System.out.println("What is your name?");
		
		// take input as name
		name = input.nextLine();
		
		//ask for user age
		System.out.println("What is your age?");
		age = input.nextInt();
		
		new User(name, age);
		
	}

}
