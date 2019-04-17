
public class Dogdata {

	private String name;
	private String breed;
	private int age;
	
	public Dogdata(String name, int age) {    //конструктор
		this.name = name;
		this.age = age;
		
	}
	public Dogdata() {}          //дефолтний конструктор
	
	
	public String getName() {       //гетери сетери
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getBreed() {
		return breed;
	}
	void setBreed(String breed) {
		this.breed = breed;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	
	
	
}
