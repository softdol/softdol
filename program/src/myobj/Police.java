package myobj;

public class Police extends Person {

	public String name;
	public int age;
	
	public void hi() {
		//super.sayHi();
	}
	
	// @Override
	public void sayHi() {
		System.out.println("안녕하십니까~ " + name + " 입니다.");
	}
	
	public void setName(String name) {
		super.name = name;		
	}
	
	public void setAge(int age) {
		super.age = age;
	}
	
}
