
public class C03_Constructor {
	
	/*
	 * 	# Ŭ������ ������(Constructor)
	 * 
	 * 	 - Ŭ������ �̸��� �Ȱ��� �̸��� ���� �޼���
	 * 	 - ���� Ÿ���� �������� �ʴ´�
	 * 	 - ���ο� �ν��Ͻ��� ������ �� new�� �Բ� �����ڸ� ȣ���Ѵ�
	 * 	 - ���ο� �����ڸ� �������� ���� Ŭ������ ������ �ʴ� �⺻ �����ڰ� �����Ѵ�
	 * 		(�⺻ �����ڴ� �ƹ��͵� ���� �ʰ� �ν��Ͻ��� �����Ѵ�)
	 */
	public static void main(String[] args) {
		
		Orange o = new Orange();		
		o.print();
		
		Orange o2 = new Orange(9999);		
		o2.print();
		
		Orange o3 = new Orange(7000, 777.777);		
		o3.print();
		
		// �⺻ �������� ����� ���Ƴ��� Ŭ����
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
	
	//	�⺻ ������(�Ű������� ���� ������)
	Orange(){		
		this(800);		
	}
	
	// �Ű������� �ִ� ������
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