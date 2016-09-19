import java.util.Scanner;

public class User {
	
//	public User (String name, int age) {
//		setName(name);
//		setAge(age);
//		System.out.println("User name is " + name + " and user is " + age + " years old.");
//	}
	
	public String interaction(String user) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("What is " + user + " name?");
		
		setName(input.nextLine());
		
		System.out.println("What is " + user + " age?");
		
		setAge(input.nextInt());
		
		return user + " name is " + name + " and " + user + " age is " + age + " years old.";
	}
	
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
}
