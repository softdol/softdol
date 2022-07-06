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
	 * 	slotIndex - 찌르고 싶은 번호를 매개변수로 전달해야 합니다
	 * @return 
	 * 	당첨 번호를 선택한 경우 -1, 올바르게 찌르고 살아남은 경우 1, 
	 *  찔렀던 곳을 다시 찌른경우 0 
	 */
	public int stab(int slotIndex) {
		
		if(launch[0] == slotIndex || launch[1] == slotIndex) {
			return -1;
		}else if(!slot[slotIndex]) {
			slot[slotIndex] = true;
			return 1;
		}else {
			System.out.println("이미 찔렀던 곳입니다!");
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
	
	
	
	
	
	
	
	
	
	
	
	static int[] failHoleNum;	//꽝 번호
		
	public int maxHole;		//최대 칼집 수
	public int inCount;		//찔린 수
	public int inNum;			//찔린 번호
	public int[] arrInNum; 	//찔린 번호
	
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
				System.out.println(inNum + "번 자리는 이미 찌른 자리입니다.");
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
				System.out.println(inNum + "번 자리는 꽝입니다.");
				break;
			}
		}
		
		return check;
	}

}
