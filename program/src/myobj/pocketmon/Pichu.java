package myobj.pocketmon;

public class Pichu extends Pocketmon {
	
static String defaultName = "Pichu"; 
	
	public Pichu() {
		super(
				defaultName,
				(int)(Math.random() * 30 + 70),
				(int)(Math.random() * 30 + 70),
				(int)(Math.random() * 30 + 70),
				(int)(Math.random() * 30 + 70),
				(int)(Math.random() * 30 + 70),
				(int)(Math.random() * 30 + 70)
			);
	}
	
	public void takle() {
		System.out.println(name + "�� �����ġ���  " + atk * 0.7 + "�� ������� ������.");
	}

}
