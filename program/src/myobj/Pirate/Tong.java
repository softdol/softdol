package myobj.Pirate;

import java.util.Arrays;

public class Tong {
	
	final static int GAME_SIZE = 20;
	
	boolean[] slot = new boolean[GAME_SIZE];	
	int[] launch = new int[2];
	
	public Tong() {
		rewind();
	}
	
	public void rewind() {
		slot = new boolean[GAME_SIZE];
		launch[0] = (int)(Math.random() * GAME_SIZE);
		
		while(true) {
			launch[1] = (int)(Math.random() * GAME_SIZE);
			if(launch[0] != launch[1]) {
				break;
			}
		}
	}
	
	/**	 * 
	 * @param 
	 * 	slotIndex - ��� ���� ��ȣ�� �Ű������� �����ؾ� �մϴ�
	 * @return 
	 * 	��÷ ��ȣ�� ������ ��� -1, �ùٸ��� ��� ��Ƴ��� ��� 1, 
	 *  �񷶴� ���� �ٽ� ���� 0 
	 */
	public int stab(int slotIndex) {
		
		if(launch[0] == slotIndex || launch[1] == slotIndex) {
			return -1;
		}else if(!slot[slotIndex]) {
			slot[slotIndex] = true;
			return 1;
		}else {
			System.out.println("�̹� �񷶴� ���Դϴ�!");
		}
		
		return -1;
	}
	
	public void print() {
		
		for(int i = 0; i < GAME_SIZE; i++) {
			
			if(!slot[i]) {
				System.out.printf("[%02d]\t", i + 1);
			}else {
				System.out.print("[XX]\t");
			}
			
			if(i % 5 == 4) {
				System.out.println();
			}
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	static int[] failHoleNum;	//�� ��ȣ
		
	public int maxHole;		//�ִ� Į�� ��
	public int inCount;		//�� ��
	public int inNum;			//�� ��ȣ
	public int[] arrInNum; 	//�� ��ȣ
	
//	public Tong() {
//		this(20, 2);
//	}
	
	public Tong(int maxHole, int failCount){
		this.maxHole = maxHole;
		this.arrInNum = new int[maxHole];
		failHoleNum = new int[failCount];
		for(int i = 0; i < failHoleNum.length; i++) {
			int temp = (int)(Math.random() * maxHole + 1);
			
			for(int j = 0; j < 1 ; j++) {
				if(failHoleNum[j] == temp) {
					i--;
					break;
				}
			}			
			failHoleNum[i] = temp;			
		}
		
		System.out.println(Arrays.toString(failHoleNum));
	}	
	
	public boolean inCheck() {
		boolean check = false;
		
		for(int i = 0; i < inCount; i++) {
			if(arrInNum[i] == inNum) {
				check = true;
				System.out.println(inNum + "�� �ڸ��� �̹� � �ڸ��Դϴ�.");
				break;
			}
		}
		
		return check;
	}
	
	public boolean failCheck() {
		boolean check = false;
		
		for(int i = 0; i < failHoleNum.length; i++) {
			if(inNum == failHoleNum[i]) {
				check = true;
				System.out.println(inNum + "�� �ڸ��� ���Դϴ�.");
				break;
			}
		}
		
		return check;
	}

}
