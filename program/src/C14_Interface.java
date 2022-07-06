
public class C14_Interface {

	/*
	 *	# �������̽� (Interface)
	 * 
	 * 		 - �ڹ��� Ŭ������ ����� �ѹ��� ������ ���� �� ����
	 * 		 - �ش� Ŭ������ �������� ���¸� �ο��ϱ� ���ؼ��� �������̽��� ����ؾ� �Ѵ�
	 * 		 - �������̽� ���ο� �����ϴ� ��� �޼���� �ڵ����� abstract public �� �ȴ�
	 * 		 - �������̽� ���ο� �����ϴ� ������ �ڵ����� final static�� �ȴ�
	 * 		 - �������̽��� �ν��Ͻ�ȭ �� �� ����
	 * 		 - �������̽� ������ �޼��� �տ� default�� ���̸� �������̵� ���� �ʾ��� ���� 
	 * 		   �⺻ ������ ������ �� �ִ� 
	 */
	public static void main(String[] args) {
		
		Human h1 = new Human();
		Runner r1 = h1;		
		Swimmer s1 = h1;
		Bear b1 = new Bear();
		
		Runner r2 = new Runner() {
		};
		
		System.out.println(r2.a);
		r2.run();
		
		h1.run();
		h1.swim();
		
		r1.run();
		s1.swim();
		
	}
	
}
interface Breedable{
	void feed();
	
	void sit();
	
	void standup();
}

interface Runner{
	int a = 10;
	// �������̵� ���� �ʾ��� ���� �⺻ ������ ������ ���� �� �ִ�
	default void run() {
		System.out.println("run() �̱���");
	}
}

interface Swimmer {
	// default�� �������� �ʴ� ��� �ݵ�� �����ؾ��ϴ� abstract �޼��尡 �ȴ�
	void swim();
}

class Human implements Runner, Swimmer{
	@Override
	public void swim() {
		
	}
	
//	@Override
//	public void run() {
//		
//	}
}

class Bear implements Runner, Swimmer, Breedable{
	@Override
	public void swim() {
		
	}

	@Override
	public void run() {
		
	}

	@Override
	public void feed() {
	}

	@Override
	public void sit() {
	}

	@Override
	public void standup() {
	}
}

class Shark implements Runner, Swimmer{
	@Override
	public void swim() {
		
	}

	@Override
	public void run() {
		
	}
}