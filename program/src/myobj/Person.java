package myobj;

public class Person {
	public String name;
	public int age;
	
//	public Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//	
	public void sayHi() {		
		
		if(age < 10) {
			System.out.println("안녕? 내 이름은 "+ this.name +"야. 나이는 "+ this.age +"살이야.");
		}else if(age < 20) {
			System.out.println("안녕하세요~ 내 이름은 "+ this.name +"야. 나이는 "+ this.age +"살이야.");
		}else{
			System.out.println("안녕하십니까. 내 이름은 "+ this.name +"야. 나이는 "+ this.age +"살이야.");
		}
			
	}
}
