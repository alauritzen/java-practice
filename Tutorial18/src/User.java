
public class User {
	
	public User (String name, int age) {
		setName(name);
		setAge(age);
		System.out.println("Your name is " + name + " and you are " + age + " years old.");
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
