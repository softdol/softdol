import myobj.student.*;

public class C13_AbstractClass {
	
	/*
	 * 	# �߻� Ŭ���� (abstract class)
	 * 
	 * 	 - �޼����� ���¸� ������ ���� �ش� �޼����� �ϼ��� �ڽ� Ŭ�������� �̷�� Ŭ����
	 * 	 - �ڽ� Ŭ������ �߻� Ŭ������ ��ӹ����� �ݵ�� �߻� �޼��带 �������̵� �ؾ� �Ѵ�
	 * 	 - �߻� �޼��带 ������ Ŭ���� 
	 * 
	 * 	# �߻� �޼��� (abstract method)
	 * 
	 * 	 - ���� �Ǿ� �ְ� ������ ���� �޼���
	 *   - �տ� abstract�� �پ� �ִ� �޼���� body�� ���� �߰��� �� ����
	 *   - �ݵ�� ��ӹ��� �� �ڽ� Ŭ�������� �������̵��Ͽ� �����ؾ� �Ѵ�
	 *   - abstract �޼��带 �������� ���� Ŭ������ �ν��Ͻ��� ������ �� ����   
	 *      
	 */

	public static void main(String[] args) {
//		unitAttack(new Arecher());
//		unitAttack(new SowrdMan());
//		unitAttack(new Mage());
		
		/*
		 * 	# myobj ��Ű���� �������� Ȱ���� �� �ִ� abstract class�� �ϳ� ������ ������
		 * 
		 * 
		 */
		
//		play(new ElementaryStudent());
//		play(new MiddleSchooler());
//		play(new HighSchool());
		
		
	}
	
	public static void unitAttack(Unit u) {
		u.attack();
	}
	
	public void exam(Student s) {
		//s.exam();
	}
	
	public static void play(Student s) {
		//s.favoriteGame();
	}
}

abstract class Unit{
	int attack;
	int hp;
	
	// �ڽ� Ŭ������ �� �޼��带 �ݵ�� �����ؾ� �Ѵ�
	abstract void attack();
	
//	void attack() {
//		System.out.println("��� ������ ������ ������� ������ �ؾ��մϴ�.");
//	}
}

class Mage extends Unit{
	public Mage() {
		attack = 30;
		hp = 20;
	}

	@Override
	void attack() {
		System.out.println("������ ����� �����߽��ϴ�. ������: " + attack);
		
	}
}

class SowrdMan extends Unit{
	public SowrdMan() {
		attack = 10;
		hp = 50;
	} 
	@Override
	void attack() {
		// TODO Auto-generated method stub
		slash();
	}
	void slash() {
		System.out.println("���� �ֵѷ����ϴ�. ������: " + attack);
	}
}

class Arecher extends Unit{
	double accuracy;
	
	public Arecher() {
		attack = 8;
		hp = 30;
		accuracy = 0.88;
	}
	
	@Override
	void attack() {
		shot();
	}
	
	void shot() {
		if(Math.random() < accuracy) {
			System.out.println("Ȱ�� �����߽��ϴ�. ������: " + attack);
		}else{
			System.out.println("Ȱ�� ���������ϴ�...");
		}
		
	}
}











