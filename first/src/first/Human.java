package first;

public class Human {
	
	private int age;
	private String name;
	
	public Human() {
		this.age = 0;
		this.name = null;
	}
	
	public Human(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void sayHello() {
		System.out.println(this.getName() + " says HEELLOOO!");
	}
	
	public void getOld() {
		this.age++;
		System.out.println(this.getName() + " is now "+ this.getAge());
	}
	
}
