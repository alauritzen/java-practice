package sololearn4;

public class Application {

	public static void main(String[] args) {
		Animal dog= new Animal(),
			horse = new Animal(),
			tiger = new Animal(),
			cat = new Animal();
		
		dog.noise("woof", 3);
		horse.noise("neigh", 1);
		tiger.noise("growl", 2);
		cat.noise("meow", 2);
	}

}
