
public class Dog {

	public static void main(String[] args) {
		
		
		
		Dogdata a = new Dogdata();
		Dogdata b = new Dogdata();
		Dogdata c = new Dogdata();
		
		a.setName("test");
		b.setName("test");
		c.setName("test1");
		
		a.setAge (12);
		b.setAge (5);
		c.setAge (9);
		
		
		Dogdata d = new Dogdata("olddog", 23);
		
		System.out.println(a.getName().equals(b.getName()));
//		System.out.println(d.getName() == b.getName());
//		System.out.println(d.getName());
		System.out.println("The oldest dog has age " + oldest(a.getAge(),b.getAge(),c.getAge()));
		
		int maxage = oldestdog(a, b, d);
		System.out.println("The oldest dog has age " +  maxage);

	}


	
	public static int oldestdog (Dogdata number1, Dogdata number2, Dogdata number3){
		int maxNumber;
		if (number1.getAge() < number2.getAge()) {
			maxNumber = number2.getAge();
		} else {
			maxNumber = number1.getAge();
		}
		if (maxNumber < number3.getAge()) {
			maxNumber =  number3.getAge();
		} 
			
		
		return maxNumber;
	}
	
	
	public static int oldest (int number1, int number2, int number3){
		int maxNumber;
		if (number1 < number2) {
			maxNumber = number2;
		} else {
			maxNumber = number1;
		}
		if (maxNumber < number3) {
			maxNumber =  number3;
		} 
			
		
		return maxNumber;
	}
	
}
