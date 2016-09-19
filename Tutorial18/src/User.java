
public class User {
	
	public User (String name, int age) {
		setName(name);
		setAge(age);
		System.out.println("User name is " + name + " and user is " + age + " years old.");
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
