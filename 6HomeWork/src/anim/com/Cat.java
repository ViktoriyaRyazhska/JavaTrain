package anim.com;

public class Cat implements Animals {

	@Override
	public void voice() {
		System.out.println("May");
	}
	@Override
	public void feed() {
		System.out.println("Citcat");
	}
}
