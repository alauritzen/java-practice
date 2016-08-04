package sololearn3;

public class application {

	public static void main(String[] args) {
		int[] arr = {42, 9, 7, 22, -9};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				continue;
			}
			System.out.println(arr[i]);
		}
		// should print 9, 7, -9
	}

}
