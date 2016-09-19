
public class Application {

	public static void main(String[] args) {
		
		User user1 = new User();
		String message1 = user1.interaction("your");
		System.out.println(message1);
		
		User user2 = new User();
		String message2 = user2.interaction("your spouse's");
		System.out.println(message2);
		
	}

}
