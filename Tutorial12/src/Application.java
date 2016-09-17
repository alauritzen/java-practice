
public class Application {

	public static void main(String[] args) {
		
		String[][] names = { { "Tom", "Dick", "Harry" }, { "Cat", "Jane", "Sally" } };
		
		/* for (String[] name1 : names) {
			for (String name2 : name1) {
				System.out.println(name2);
			}
		} */
		
		for (int row = 0; row < names.length; row++) {
			for (int col = 0; col < names[row].length; col++)
				System.out.println(names[row][col]);
		}
		
	}

}
