
public class C10_InnerClass {

	// ������ ����Ÿ���� �ʱⰪ null
	private String s1,s2,s3;	
	private Apple a1,a2,a3;
	
	// �⺻�� ����Ÿ���� �ʱⰪ�� 0, 0.0, false
	private int a,b,c;
	private static int d = 10,e = 20,f = 30;
	
	// Ŭ���� ������ ����ƽ Ŭ����
	static class Orange{
		
		int price;
		int sweet;
		
		public Orange() {
			price = d;
			sweet = e;
		}
		
		@Override
		public String toString() {		
			return "����: " + price + ", �絵: " + sweet;
		}
		
	}
	
	// Ŭ���� ���ο� Ŭ����
	class Sagwa {
		int price;
		int sweet;
		
		// Ŭ���� ������ Ŭ���������� �ٱ� Ŭ������ private �ڿ����� ��� �� �� �ִ�
		// ���� Ŭ���� �����̱� ������ private �ڿ��� ����� �� �ִ�
		public Sagwa() {
			price = a;
			sweet = b;
		}
		
		@Override
		public String toString() {		
			return "����: " + price + ", �絵: " + sweet;
		}
	}

	/*
	 * 	# Ŭ���� ���ο� Ŭ���� ����ϱ�
	 * 
	 * 		- Ŭ���� ���ο��� Ŭ������ �����ϰ� ����� �� �ִ�
	 * 		- Ŭ���� ���ο� �����ϴ� Ŭ������ �ٱ��� Ŭ������ �ν��Ͻ��� �����ؾ� ����� �� �ִ�
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
		
		//Ŭ���� ������ Ŭ������ �ν��Ͻ� �����ϱ�
		C10_InnerClass.Sagwa apple = instance.new Sagwa();		
		System.out.println(apple);
		
		instance.a = 300;
		instance.b = 400;
		
		C10_InnerClass.Sagwa apple2 = instance.new Sagwa();		
		System.out.println(apple2);
		
		// Ŭ���� ������ ����ƽ Ŭ������ �ν��Ͻ� �����ϱ�
		C10_InnerClass.Orange orange = new C10_InnerClass.Orange();
		System.out.println(orange);		
		
		C10_InnerClass.d = 50;
		C10_InnerClass.e = 60;
		
		C10_InnerClass.Orange orange2 = new C10_InnerClass.Orange();
		System.out.println(orange);
		System.out.println(orange2);
		
	}
}













