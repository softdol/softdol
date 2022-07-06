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
		System.out.println("피카츄는 번개 공격이 있습니다. 데미지는 " + sAtk * 1.5 + "입니다.");
	}

}
