import myobj.StudentTime;
import myobj.GameTime;
import myobj.Person;
import myobj.Police;
import myobj.Programmer;

public class C05_Extend {
	
	/*
	 * 	# 클래스 상속
	 * 
	 * 	 - 이미 만들어져 있는 클래스를 물려받아서 사용하는 문법
	 * 	 - 자식 클래스는 부모 클래스의 모든 자원을 그대로 사용할 수 있다
	 * 	 - 자식 클래스에는 부모 클래스에 없던 기능을 새로 추가해서 사용할 수 있다
	 * 	 - 자식 클래스는 부모 클래스에게서 물려 받은 메서드를 마음대로 고쳐서 사용할 수 있다(오버라이드)
	 * 	 - 자식 클래스는 반드시 가장 먼저 부모의 생성자를 호출해야 한다
	 * 
	 * 	# supper
	 * 
	 * 	 - 자식 클래스로 생성된 인스턴스는 두가지로 분류된다
	 * 	 - this는 현재 인스턴스 중 자식 클래스의 부분을 뜻한다
	 * 	 - super는 현재 인스턴스 중 부모 클래스의 부분을 뜻한다
	 * 	 - this()가 현재 클래스의 생성자를 의미하듯이 super()는 부모 클래스의 생성자를 의미한다
	 * 
	 */
	public static void main(String[] args) {
		Person dooly = new Person();
		dooly.name = "둘리";
		dooly.age = 7;		
		//p1.sayHi();
		
		Person chulsu = new Person();
		chulsu.name = "철수";
		chulsu.age = 23;
		
		Programmer coder =  new Programmer();
		coder.name = "철수";
		coder.age = 23;
		
		Police popo =  new Police();
		popo.name = "철수";
		popo.age = 23;
		
		// Person을 요구하는 자리에 자식 클래스인 Police와 programmer등이 들어갈 수 있다(객체의 다형성)
//		dooly.sayHi(chulsu);
		//dooly.sayHi(popo);
//		chulsu.sayHi(dooly);
		
		Programmer p2 = new Programmer();
		p2.name = "김노예";
		p2.age = 23;
		p2.salary = 700;
		p2.sayHi();
		p2.program("온라인 교육 사이트");
		
		
		// Person의 name, age와 Police의 name, age를 모두 가지고 있음
		Police p3 = new Police();
		p3.name = "김형사";
		p3.setName("이형사");
		p3.age = 20;
		p3.setAge(20);
		p3.sayHi();
		p3.hi();
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		GameTime kTime = new GameTime();		
		
		kTime.hour = 10;
		kTime.minute = 20;
		kTime.seconds = 30;
		kTime.name = "게이머";
		kTime.viewDef();
		kTime.viewTime();
		kTime.plusHour(3);		
		
		System.out.println();
		
		StudentTime jTime = new StudentTime();
		
		jTime.hour = 10;
		jTime.minute = 20;
		jTime.seconds = 30;
		jTime.name = "학생";
		jTime.viewTime();
		jTime.plusHour(3);
		jTime.viewTime();
		
		
		
		
	}

}
/*
 * 	#연습문제
 * 
 * 	- myobj 패키지에 상속 관계에 있는 쿨래스들을 정의해보세요
 *  - 부모 클래스, 자식 클래스, 오버라이드를 사용할 것
 * 
 */


