package myobj;

public class Fruit {
	
	int price;
	double sweet;
	
	Fruit(int price, double sweet){
		this.price = price;
		this.sweet = sweet;
	}

}

// 자식 클래스는 반드시 부모의 생성자를 가장 첫 줄에 호출해야 한다.
// 부모 클래스에 기본 생성자가 없다면 super()를 반드시 명시해야 한다.
class Peach extends Fruit{
	
	Peach(){
		super(1500, 9.9);
	}
	
}
