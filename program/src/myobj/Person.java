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
			System.out.println("�ȳ�? �� �̸��� "+ this.name +"��. ���̴� "+ this.age +"���̾�.");
		}else if(age < 20) {
			System.out.println("�ȳ��ϼ���~ �� �̸��� "+ this.name +"��. ���̴� "+ this.age +"���̾�.");
		}else{
			System.out.println("�ȳ��Ͻʴϱ�. �� �̸��� "+ this.name +"��. ���̴� "+ this.age +"���̾�.");
		}
			
	}
}
