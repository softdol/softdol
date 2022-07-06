package myobj.YachtDice;

import java.util.Arrays;

public class Dice {
	
	final static int GAME_SIZE = 5;
	final static int DICE_FACES = 6;
	
	int life = 2;	
	int[] dices;
	int[] count = new int[DICE_FACES];
	String made;
	
	
	public Dice() {
		dices = new int[GAME_SIZE];
		for(int i = 0; i < dices.length ; i++) {
			roll(i);
		}
		
		check();
		
		 
		//Arrays.fill(dices, roll());
	}
	
	// 개수를 새놓은 count 배열에 원하는 숫자가 있는지 체크하는 메서드
	boolean numberContains(int num) {
		return count[num - 1] > 0;
	}
	
	// "245"라고 전달받으면 2번째 4번째 5번째 주사ㅜ이를 다시 던질 예정
	public void reroll(String idxs) {
		
		if(life < 1) {
			return;
		}
		for(int i = 0 ; i < idxs.length(); i++) {
			//int index = idxs.charAt(i) - '0'
			roll(idxs.charAt(i) - '0' - 1);
		}
		
		life--;
		check();
		
	}
	
	// 개수를 새 놓은 count 배열에 원하는 횟수만큼 등장한 숫자가 있는지 체크하는 메서드
	boolean countContain(int cnt) {
		for(int i = 0; i < count.length; ++i) {
			if(count[i] == cnt) {
				return true;
			}
		}
		
		return false;
	}
	
	// 현재 dices의 값으로 어떤 숫자가 몇 개 있는지 세는 메서드
	void count() {
		// Arrays.fill(arr, val) 배열을 원하는 값으로 한번에 가득 채우는 함수
		Arrays.fill(count, 0);
		for(int i = 0; i < dices.length; i++) {
			count[dices[i] - 1]++;
		}
	}
	
	// 현재 dices의 값을 통해 족보를 구분하는 메서드
	void check() {
		count();
		
		if(countContain(5)) {
			made = "Yacht";
		}else if(countContain(4)) {
			made = "4 Dice";
		}else if(countContain(3) && countContain(2)) {
			made = "Full House!";
		}else if(numberContains(2) && numberContains(3) && numberContains(4)
				&& numberContains(5) && (numberContains(1) || numberContains(6))) {
			made = "Large Straight!";
		}else if(numberContains(3) && numberContains(4) && ((numberContains(1) && numberContains(2))
				|| (numberContains(2) && numberContains(5))
				|| (numberContains(5) && numberContains(6))
				)) {
				made = "Small Straight!";				
		}else {
			made = "" + (dices[0] + dices[1] + dices[2] + dices[3] + dices[4]);
		}
			
		
	}
	
	// 원하는 번쨰의 주사위를 다시 굴리는 메서드
	void roll(int index) {
		dices[index] = (int)(Math.random() * 6 + 1);
	}
	
	@Override
	public String toString() {
		return String.format("현재 주사위: %s\n"
				+ "현재 상태: %s", Arrays.toString(dices), made);
	}
	
	
	
	public int num;
	
//	public Dice() {
//		num = 1;
//	}
	
//	public void roll() {
//		num = (int)(Math.random() * 6 + 1);
//	}
	

}
