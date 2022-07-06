
public class C03_Constructor {
	
	/*
	 * 	# 클래스의 생성자(Constructor)
	 * 
	 * 	 - 클래스의 이름과 똑같은 이름을 가진 메서드
	 * 	 - 리턴 타입을 지정하지 않는다
	 * 	 - 새로운 인스턴스를 생성할 때 new와 함께 생성자를 호출한다
	 * 	 - 내부에 생성자를 정의하지 않은 클래스는 보이지 않는 기본 생성자가 존재한다
	 * 		(기본 생성자는 아무것도 하지 않고 인스턴스만 생성한다)
	 */
	public static void main(String[] args) {
		
		Orange o = new Orange();		
		o.print();
		
		Orange o2 = new Orange(9999);		
		o2.print();
		
		Orange o3 = new Orange(7000, 777.777);		
		o3.print();
		
		// 기본 생성자의 사용을 막아놓은 클래스
		Mango m = new Mango(3333,123);
		
	}
}
class Mango{
	int price;
	double sweet;
	
	Mango(int price, double sweet){
		this.price = price;
		this.sweet = sweet;
	}
	
}

class Orange{
	int price;
	double sweet;
	
	//	기본 생정자(매개변수가 없는 생성자)
	Orange(){		
		this(800);		
	}
	
	// 매개변수가 있는 생성자
	Orange(int price){
		this.price = price;
		sweet = 8.0;
	}
	
	Orange(int price, double sweet){
		this.price = price;
		this.sweet = sweet;
	}
	
	void print() {
		System.out.println("price: " + price);
		System.out.println("sweet: " + sweet);
	}
	
	
	
}