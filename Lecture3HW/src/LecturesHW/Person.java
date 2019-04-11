package LecturesHW;

import java.time.LocalDateTime;

public class Person {
	private String name;
	private int birthYear;

	public Person() {
		
	}
	
	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public String getName() {
		return this.name;	
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirthYear() {
		return this.birthYear;	
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	public int getAge() {
		return LocalDateTime.now().getYear() - birthYear;
	}
	
	public void input (String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	public void output () {
		System.out.println("Name " + this.name + "Birth Date " + this.birthYear);
	}
	public void changeName(String name){
		this.name = name;
	}
}
