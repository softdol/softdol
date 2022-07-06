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
	
	// ������ ������ count �迭�� ���ϴ� ���ڰ� �ִ��� üũ�ϴ� �޼���
	boolean numberContains(int num) {
		return count[num - 1] > 0;
	}
	
	// "245"��� ���޹����� 2��° 4��° 5��° �ֻ���̸� �ٽ� ���� ����
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
	
	// ������ �� ���� count �迭�� ���ϴ� Ƚ����ŭ ������ ���ڰ� �ִ��� üũ�ϴ� �޼���
	boolean countContain(int cnt) {
		for(int i = 0; i < count.length; ++i) {
			if(count[i] == cnt) {
				return true;
			}
		}
		
		return false;
	}
	
	// ���� dices�� ������ � ���ڰ� �� �� �ִ��� ���� �޼���
	void count() {
		// Arrays.fill(arr, val) �迭�� ���ϴ� ������ �ѹ��� ���� ä��� �Լ�
		Arrays.fill(count, 0);
		for(int i = 0; i < dices.length; i++) {
			count[dices[i] - 1]++;
		}
	}
	
	// ���� dices�� ���� ���� ������ �����ϴ� �޼���
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
	
	// ���ϴ� ������ �ֻ����� �ٽ� ������ �޼���
	void roll(int index) {
		dices[index] = (int)(Math.random() * 6 + 1);
	}
	
	@Override
	public String toString() {
		return String.format("���� �ֻ���: %s\n"
				+ "���� ����: %s", Arrays.toString(dices), made);
	}
	
	
	
	public int num;
	
//	public Dice() {
//		num = 1;
//	}
	
//	public void roll() {
//		num = (int)(Math.random() * 6 + 1);
//	}
	

}
