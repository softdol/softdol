package myobj;

public class Fruit {
	
	int price;
	double sweet;
	
	Fruit(int price, double sweet){
		this.price = price;
		this.sweet = sweet;
	}

}

// �ڽ� Ŭ������ �ݵ�� �θ��� �����ڸ� ���� ù �ٿ� ȣ���ؾ� �Ѵ�.
// �θ� Ŭ������ �⺻ �����ڰ� ���ٸ� super()�� �ݵ�� ����ؾ� �Ѵ�.
class Peach extends Fruit{
	
	Peach(){
		super(1500, 9.9);
	}
	
}
