package anim.com;
public class Dog implements Animals {

	@Override
	public void voice() {
		System.out.println("gav");
	}
	
	@Override
	public void feed() {
		System.out.println("Pedigree");
	}
	
}
