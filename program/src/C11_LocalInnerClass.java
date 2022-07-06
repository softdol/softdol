import myobj.Person;

public class C11_LocalInnerClass {
	
	/*
	 * 	# ���� ���� Ŭ����
	 * 
	 * 		- �޼��� ���ο� ������ Ŭ����
	 * 		- �ش� �޼��尡 ������ ������ ���ϴ� Ŭ����
	 * 		- �ش� �޼��� �ٱ������� ������ �� ����
	 * 
	 */
	
	public static void main(String[] args) {
		
		int dPrice = 1000;
		char dGrade = 'B';
		
		Apple a = new Apple();
		System.out.println(a);
		
		// ���� ���� Ŭ���� (�޼��� ������ Ŭ����)
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
		 * 	# �͸� ���� ���� Ŭ���� 
		 * 
		 *  	 - �޼��� ���ο��� Ŭ������ ���� �����ϸ� ����ϴ� ���(������ ���ÿ� ���)
		 * 		 - �̸��� ���� ������ ���ο� �޼��带 �߰��ص� ����� �� ����
		 * 		 - ������ �޼��带 �������̵��� ����ϴ� ���� �����ϴ� 
		 */
		
		Person p = new Person() {
			{
				name = "�Ѹ�";
				age = 9;
			}
			
			@Override
			public void sayHi() {
				System.out.println("�͸� Ŭ������ sayHi()�Դϴ�.");
				punch();
			}
			
			void punch() {
				System.out.println(name + "�� �տ� �ִ� ����� ���Ƚ��ϴ�.");
			}
		};
		
		p.sayHi();
	}

}





















