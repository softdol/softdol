import myobj.Person;

public class C11_LocalInnerClass {
	
	/*
	 * 	# 지역 내부 클래스
	 * 
	 * 		- 메서드 내부에 정의한 클래스
	 * 		- 해당 메서드가 끝나면 수명이 다하는 클래스
	 * 		- 해당 메서드 바깥에서는 접근할 수 없다
	 * 
	 */
	
	public static void main(String[] args) {
		
		int dPrice = 1000;
		char dGrade = 'B';
		
		Apple a = new Apple();
		System.out.println(a);
		
		// 지역 내부 클래스 (메서드 내부의 클래스)
		class Apple{
			int price;
			int grade;
			
			public Apple() {
				
				price = dPrice;
				grade = dGrade;
				
			}
			
			@Override
			public String toString() {
				return "price: " + price + ", grade: " + (char)grade;
			}
		}
		
		Apple apple = new Apple();
		System.out.println(apple);
		
		//--------------------------------------------------------------------//
		
		/*
		 * 	# 익명 지역 내부 클래스 
		 * 
		 *  	 - 메서드 내부에서 클래스를 직접 수정하며 사용하는 방식(생성과 동시에 상속)
		 * 		 - 이름이 없기 때문에 새로운 메서드를 추가해도 사용할 수 없다
		 * 		 - 기존의 메서드를 오버라이드해 사용하는 것은 가능하다 
		 */
		
		Person p = new Person() {
			{
				name = "둘리";
				age = 9;
			}
			
			@Override
			public void sayHi() {
				System.out.println("익명 클래스의 sayHi()입니다.");
				punch();
			}
			
			void punch() {
				System.out.println(name + "는 앞에 있는 사람을 때렸습니다.");
			}
		};
		
		p.sayHi();
	}

}





















