package myobj.pocketmon;

public class Pikachu extends Pocketmon {
	
	//final static int PIKACHU_STAT_VALUE = 100;
	
	static String defaultName = "Pikachu"; 
	
	public Pikachu() {
		super(
				defaultName,
				(int)(Math.random() * 50 + 100),
				(int)(Math.random() * 50 + 100),
				(int)(Math.random() * 50 + 100),
				(int)(Math.random() * 50 + 100),
				(int)(Math.random() * 50 + 100),
				(int)(Math.random() * 50 + 100)
			);
	}

	public void thunder() {
		System.out.println("��ī��� ���� ������ �ֽ��ϴ�. �������� " + sAtk * 1.5 + "�Դϴ�.");
	}

}
