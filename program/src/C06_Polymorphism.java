import myobj.*;

public class C06_Polymorphism {

	/*
	 * 	# ��ü�� ������
	 * 
	 * 	 - ��ü�� �پ��� ���¸� ���� �� �ִ�.
	 * 	 - ������ �����̱⵵ �ϰ� ����̱⵵ �ϴ�.	(��ĳ����)
	 * 	 - ����� ��������� ������ �ƴ� ���� �ִ�.	(�ٿ�ĳ����)
	 * 
	 * 	# �� ĳ����
	 * 
	 * 	 - �ڽ� Ÿ���� �θ� Ÿ���� ��� ���� �����ϰ� �ִ�.
	 * 	 - �ڽ� Ÿ���� �������� ���ٸ� ���� ���� �θ� Ÿ���� �� �� �ִ�. 
	 * 
	 * 	# �ٿ� ĳ����
	 * 
	 * 	 - �θ� Ÿ���� Ÿ�� ĳ������ ���� �ڽ� Ÿ���� �� �� �ִ�
	 *	 - ������, ���� �ڽ� Ÿ���̾��ٰ� ��ĳ���� �� ��찡 �ƴ϶�� ������ �߻��Ѵ�
	 * 
	 */
	
	public static void main(String[] args) {
		//	* �� ĳ����
		Person p;
		
		p = new Person();
		p = new Police();	// �ڽ� Ÿ���� �������� ������ Ÿ��ĳ���� ���� �θ� Ÿ���� �� �� �ִ�
		
		// * �ٿ� ĳ���� 
		Person person;
		Police popo;
		
		//���� Person�̴� �ν��Ͻ��� �ٿ�ĳ�����ϸ� ������ �߻��Ѵ�
		person = new Person();
		//popo = (Police) person;	//class myobj.Person cannot be cast to class myobj.Police (myobj.Person and myobj.Police are in unnamed module of loader 'app')
		
		// ���� Police���ٰ� Person�� �� �ν��Ͻ��� �ٿ�ĳ�����ϴ� ���� �����ϴ�
		person = new Police();
		popo = (Police) person;
		
		popo.name = "��ü��";
		popo.sayHi();
		
		Person p10 = new Person();
		
		// ��ĳ������ �� �ڽ� �ν��Ͻ��� �ڽ� Ŭ�������� ������ �ִ� ����� ����� �� ����
		Person p11 = new Defender();
		//p11.bash()	// p11�� ���� bash()�� ������ ������ ����� �� ���� ���� ���Ұ�
		
		// ��ĳ���� �� ���¿����� �θ� Ÿ���� �ڿ��� �״�� ����� �� �ִ�
		p11.name = "��ö����";
		p11.age = 33;
		
		// �� ��ĳ���� �� ���¿����� �������̵��� �޼���� �ڽ��� ������ ���ȴ�
		p11.sayHi();
		
		// �ڽ� Ŭ�������� ������ ���� �ٽ� ����ϱ� ���ؼ��� �ٿ� ĳ������ �ʿ��ϴ�
		((Defender)p11).bash();
		((Defender)p11).block();
		
		// ��ĳ������ ���� ���� ���¿����� ������ ����� ����� �� �ִ�
		Defender d1 = new Defender();
		
		d1.name = "�����";
		d1.sayHi();
		d1.bash();
		d1.block();
		
		
	}
	
}


//class 






















