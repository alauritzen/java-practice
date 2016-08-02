public class Application {
	public static void main(String[] args) {
		int myInt = 0;
		boolean loop = true;
		
		while(loop)
		{
			System.out.println(myInt);
			myInt++;
			loop = myInt <= 10;
		}
		
	}
}
