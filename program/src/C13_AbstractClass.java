import myobj.student.*;

public class C13_AbstractClass {
	
	/*
	 * 	# 추상 클래스 (abstract class)
	 * 
	 * 	 - 메서드의 형태만 선언해 놓고 해당 메서드의 완성은 자식 클래스에게 미루는 클래스
	 * 	 - 자식 클래스는 추상 클래스를 상속받으면 반드시 추상 메서드를 오버라이드 해야 한다
	 * 	 - 추상 메서드를 포함한 클래스 
	 * 
	 * 	# 추상 메서드 (abstract method)
	 * 
	 * 	 - 선언만 되어 있고 몸통은 없는 메서드
	 *   - 앞에 abstract가 붙어 있는 메서드는 body를 직접 추가할 수 없다
	 *   - 반드시 상속받은 후 자식 클래스에서 오버라이드하여 구현해야 한다
	 *   - abstract 메서드를 구현하지 않은 클래스는 인스턴스를 생성할 수 없다   
	 *      
	 */

	public static void main(String[] args) {
//		unitAttack(new Arecher());
//		unitAttack(new SowrdMan());
//		unitAttack(new Mage());
		
		/*
		 * 	# myobj 패키지에 다형성을 활용할 수 있는 abstract class를 하나 정의해 보세요
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
	
	// 자식 클래스는 이 메서드를 반드시 구현해야 한다
	abstract void attack();
	
//	void attack() {
//		System.out.println("모든 유닛은 각지의 방식으로 공격을 해야합니다.");
//	}
}

class Mage extends Unit{
	public Mage() {
		attack = 30;
		hp = 20;
	}

	@Override
	void attack() {
		System.out.println("마법을 사용해 공격했습니다. 데미지: " + attack);
		
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
		System.out.println("갈을 휘둘렀습니다. 데미지: " + attack);
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
			System.out.println("활이 명중했습니다. 데미지: " + attack);
		}else{
			System.out.println("활이 빗나갔습니다...");
		}
		
	}
}











