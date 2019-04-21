package anim.com;

public class MyAnimals {

	public static void main(String[] args) {
		Animals[] an = new Animals[4];
		an[0] = new Cat();
		an[1] = new Cat();
		an[2] = new Dog();
		an[3] = new Dog();
		
		for (int i = 0; i < an.length; i++) {
			an[i].feed();
			an[i].voice();
		}

}
}
