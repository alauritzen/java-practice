package sololearn3;

public class application {

	public static void main(String[] args) {
		int[] arr = {42, 9, 7, 22, -9};
		for (int i: arr) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		// should print 9, 7, -9
	}

}
