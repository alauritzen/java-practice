package sololearn4;

public class Animal {
	void noise(String sound, int number) {
		String result = "";
		for (int i = 1; i <= number; i++) {
			result += (sound + " ");
		}
		System.out.println(result);
	}
}
