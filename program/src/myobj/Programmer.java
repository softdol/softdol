package myobj;


public class Programmer extends Person {
	
	public int salary;
	
	
	public void sayHi() {
		System.out.println("안녕하세요! 저는 " + salary + " 받고 일하는 "+ name +" 입니다.");
	}
	
	public void program(String toProgram) {
		if(salary < 500) {
			System.out.println(name + "씨는 \"" + toProgram + "\"을(를) 대충 만들기로 했습니다.");
		}else {
			System.out.println(name + "씨는 \"" + toProgram + "\"을(를) 아주 열심히 만들기로 했습니다.");
		}
		
	}
	
}
