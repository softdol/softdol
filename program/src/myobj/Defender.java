package myobj;

public class Defender extends Person {
	
	@Override
	public void sayHi() {
		System.out.println(name + "���� ���и� ���� �ε�Ƚ��ϴ�.");
	}
	
	public void block() {
		System.out.println(name + "���� ���з� ȭ���� ���ҽ��ϴ�.");
	}
	
	public void bash() {
		System.out.println(name + "���� ���з� �տ� �ִ� ����� ���Ƚ��ϴ�.");
	}

}
