import myobj.StudentTime;
import myobj.GameTime;
import myobj.Person;
import myobj.Police;
import myobj.Programmer;

public class C05_Extend {
	
	/*
	 * 	# Ŭ���� ���
	 * 
	 * 	 - �̹� ������� �ִ� Ŭ������ �����޾Ƽ� ����ϴ� ����
	 * 	 - �ڽ� Ŭ������ �θ� Ŭ������ ��� �ڿ��� �״�� ����� �� �ִ�
	 * 	 - �ڽ� Ŭ�������� �θ� Ŭ������ ���� ����� ���� �߰��ؼ� ����� �� �ִ�
	 * 	 - �ڽ� Ŭ������ �θ� Ŭ�������Լ� ���� ���� �޼��带 ������� ���ļ� ����� �� �ִ�(�������̵�)
	 * 	 - �ڽ� Ŭ������ �ݵ�� ���� ���� �θ��� �����ڸ� ȣ���ؾ� �Ѵ�
	 * 
	 * 	# supper
	 * 
	 * 	 - �ڽ� Ŭ������ ������ �ν��Ͻ��� �ΰ����� �з��ȴ�
	 * 	 - this�� ���� �ν��Ͻ� �� �ڽ� Ŭ������ �κ��� ���Ѵ�
	 * 	 - super�� ���� �ν��Ͻ� �� �θ� Ŭ������ �κ��� ���Ѵ�
	 * 	 - this()�� ���� Ŭ������ �����ڸ� �ǹ��ϵ��� super()�� �θ� Ŭ������ �����ڸ� �ǹ��Ѵ�
	 * 
	 */
	public static void main(String[] args) {
		Person dooly = new Person();
		dooly.name = "�Ѹ�";
		dooly.age = 7;		
		//p1.sayHi();
		
		Person chulsu = new Person();
		chulsu.name = "ö��";
		chulsu.age = 23;
		
		Programmer coder =  new Programmer();
		coder.name = "ö��";
		coder.age = 23;
		
		Police popo =  new Police();
		popo.name = "ö��";
		popo.age = 23;
		
		// Person�� �䱸�ϴ� �ڸ��� �ڽ� Ŭ������ Police�� programmer���� �� �� �ִ�(��ü�� ������)
//		dooly.sayHi(chulsu);
		//dooly.sayHi(popo);
//		chulsu.sayHi(dooly);
		
		Programmer p2 = new Programmer();
		p2.name = "��뿹";
		p2.age = 23;
		p2.salary = 700;
		p2.sayHi();
		p2.program("�¶��� ���� ����Ʈ");
		
		
		// Person�� name, age�� Police�� name, age�� ��� ������ ����
		Police p3 = new Police();
		p3.name = "������";
		p3.setName("������");
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
		kTime.name = "���̸�";
		kTime.viewDef();
		kTime.viewTime();
		kTime.plusHour(3);		
		
		System.out.println();
		
		StudentTime jTime = new StudentTime();
		
		jTime.hour = 10;
		jTime.minute = 20;
		jTime.seconds = 30;
		jTime.name = "�л�";
		jTime.viewTime();
		jTime.plusHour(3);
		jTime.viewTime();
		
		
		
		
	}

}
/*
 * 	#��������
 * 
 * 	- myobj ��Ű���� ��� ���迡 �ִ� �𷡽����� �����غ�����
 *  - �θ� Ŭ����, �ڽ� Ŭ����, �������̵带 ����� ��
 * 
 */


