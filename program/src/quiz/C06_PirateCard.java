package quiz;

import java.util.Scanner;

import myobj.Pirate.Player;
import myobj.Pirate.Tong;

public class C06_PirateCard {
	
	/*
	 * 	������� ������ ����� ������
	 * 
	 * 	1. ������ ���۵Ǹ� �÷��̾ �� ������ ���Ѵ�
	 * 
	 *  2. ���� �÷��̾ ���ư��鼭 ���ϴ� ��ġ�� Į�� ���
	 *  
	 *  3. Į�� � �� �ִ� Ȩ�� 20���� �ְ� �� �� 2���� ���� �ȴ�. (���� ��ġ�� �� �Ǹ��� �������� ����)
	 *  
	 *  4. �߸��� ���� Į�� � �÷��̾�� ���ӿ� �й��Ѵ�
	 *  
	 *  5. ������ ��� �̾ �÷��� �� �� �ְ�, �� �÷��̾��� ������ ���� ����Ǿ�� �Ѵ�
	 * 
	 * 
	 */
	
	static int playerNum;
	static Player[] players;
	static Tong tong;
	static Scanner sc;
	static int turn;
	
	public static void main(String[] args) {
		
		
		boolean self = false;
		
		if(!self) {
			
			sc = new Scanner(System.in);
			tong = new Tong();
			System.out.print("�÷��̾��� �� >> ");			
			playerNum = sc.nextInt();
			
			//Player�� ������ ���� �� �ִ� �迭�� ����(�迭 ���� ������ ����ִ�)
			players = new Player[playerNum];
			
			// Player �ν��Ͻ��� ������ �迭�� �߰��Ѵ�
			for(int i = 0; i < players.length; i++) {
				players[i] = new Player();
			}	
			
			while(true) {
				
				System.out.println("1. �� ����");
				System.out.println("2. ���� ����");
				System.out.print("> ");
				
				switch (sc.nextInt()) {
					case 1:
						game();
						break;
					case 2:
						recode();
						break;
					default : 
						break;
				}
			}
			
		}else {
			
			Scanner sc = new Scanner(System.in);
			
			int playNun = 0;
			boolean playCheck = false;
			
			while(playNun < 2) {
				
				if(playCheck) {
					System.out.println("�÷��̾�� 2�� �̻��̾�� �մϴ�.");
				}
				
				System.out.print("�� ���� �÷��� �Ͻó���? ");
				
				playNun = sc.nextInt();
				
				playCheck = true;				
				
			}
			
			Player[] pList = new Player[playNun];
			
			for(int i = 0; i < pList.length; i++) {
				Player tempP = new Player();
				tempP.orderNum = i + 1;
				pList[i] = tempP;
			}
			boolean rePlayCheck = true;
			
			while(rePlayCheck) {
				
				//Tong t = new Tong(10, 2);
				Tong t = new Tong();
				t.inCount = 0;
				
				int playOrderNum = 0;
				
				while(true) {
					
					t.inNum = 0;
								
					while(t.inNum < 1 || t.inNum > t.maxHole) {				
						System.out.print("[" + pList[playOrderNum].orderNum + "]�� �÷��̾�� � ���� �Է��� �ּ���(1~"+t.maxHole+")");				
						t.inNum = sc.nextInt();				
					}
					
					if(!t.inCheck()) {
						
						t.arrInNum[t.inCount] = t.inNum;
						t.inCount++;	
						
						if(t.failCheck()) {					
							System.out.println(pList[playOrderNum].orderNum + "�� �÷��̾� ���� �й� �Դϴ�.");
							
							for(int i = 0; i < pList.length; i++) {
								Player tempP = pList[i];
								if(playOrderNum == i) {
									tempP.lostCount++;
								}else {
									tempP.winCount++;
								}						
							}
							
							break;
						}else {
							playOrderNum++;
							playOrderNum = playOrderNum < pList.length ? playOrderNum : 0;
						}
					}
				}
				
				System.out.print("�ٽ� �÷��� �Ͻ÷��� [Y] �� �Է��� �ּ��� >> ");
				
				char rePlay = 'N';
				
				rePlay = sc.next().charAt(0);
				
				if(rePlay != 'Y') {
					rePlayCheck = false;
				}			
				
			}
			
			System.out.println("---------- �� �� --------------");
			for(int i = 0; i < pList.length; i++) {			
				System.out.println(pList[i].orderNum + "�� �÷��̾� �� : " + pList[i].winCount + " �� : " + pList[i].lostCount);			
			}
			System.out.println("------------------------------");
			System.out.println();
			
			sc.close();
		}
		
	}
	
	static void recode() {
		for(int i = 0 ; i < playerNum; i++) {
			players[i].print();
			//System.out.println();
		}
	}
	
	
	static void game() {
		
		tong.rewind();
		turn = 0;
		
		while(true){
			int currentPlayer = turn % playerNum;
			
			tong.print();
			System.out.printf("[%d��] Player %d�� ���� >> ", turn + 1, currentPlayer + 1);

			int slotIndex = sc.nextInt();
			
			switch (tong.stab(slotIndex - 1)) {
				case 1:
					turn++;
					break;
				case 0:
					System.out.println("�ٸ� ���� �������ּ���.");
					break;
				case -1:
					System.out.printf("���� �������� ���󰬽��ϴ�. Player %d���� �й��Դϴ�.\n", currentPlayer + 1);
					for(int i = 0; i < playerNum; ++i) {
						if(i == currentPlayer) {
							players[i].lose();
						}else {
							players[i].win();
						}
					}
					return;				
			}
		}
		
		
	}
	
	
}









