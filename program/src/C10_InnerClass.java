
public class C10_InnerClass {

	// 참조형 변수타입의 초기값 null
	private String s1,s2,s3;	
	private Apple a1,a2,a3;
	
	// 기본형 변수타입의 초기값은 0, 0.0, false
	private int a,b,c;
	private static int d = 10,e = 20,f = 30;
	
	// 클래스 내부의 스태틱 클래스
	static class Orange{
		
		int price;
		int sweet;
		
		public Orange() {
			price = d;
			sweet = e;
		}
		
		@Override
		public String toString() {		
			return "가격: " + price + ", 당도: " + sweet;
		}
		
	}
	
	// 클래스 내부에 클래스
	class Sagwa {
		int price;
		int sweet;
		
		// 클래스 내부의 클래스에서는 바깥 클래스의 private 자원들을 사용 할 수 있다
		// 같은 클래스 내부이기 때문에 private 자원도 사용할 수 있다
		public Sagwa() {
			price = a;
			sweet = b;
		}
		
		@Override
		public String toString() {		
			return "가격: " + price + ", 당도: " + sweet;
		}
	}

	/*
	 * 	# 클래스 내부에 클래스 사용하기
	 * 
	 * 		- 클래스 내부에도 클래스를 정의하고 사용할 수 있다
	 * 		- 클래스 내부에 존재하는 클래스는 바깥쪽 클래스의 인스턴스가 존재해야 사용할 수 있다
	 */	
	public static void main(String[] args) {
		
		C10_InnerClass instance = new C10_InnerClass();
		
		instance.a = 100;
		instance.b = 200;
		
		System.out.println(instance.s1);
		System.out.println(instance.s2);
		System.out.println(instance.s3);
		
		System.out.println(instance.a1);
		System.out.println(instance.a2);
		System.out.println(instance.a3);
		
		//클래스 내부의 클래스로 인스턴스 생성하기
		C10_InnerClass.Sagwa apple = instance.new Sagwa();		
		System.out.println(apple);
		
		instance.a = 300;
		instance.b = 400;
		
		C10_InnerClass.Sagwa apple2 = instance.new Sagwa();		
		System.out.println(apple2);
		
		// 클래스 내부의 스태틱 클래스로 인스턴스 생성하기
		C10_InnerClass.Orange orange = new C10_InnerClass.Orange();
		System.out.println(orange);		
		
		C10_InnerClass.d = 50;
		C10_InnerClass.e = 60;
		
		C10_InnerClass.Orange orange2 = new C10_InnerClass.Orange();
		System.out.println(orange);
		System.out.println(orange2);
		
	}
}













