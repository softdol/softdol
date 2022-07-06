package quiz;

import java.util.Scanner;

import myobj.Pirate.Player;
import myobj.Pirate.Tong;

public class C06_PirateCard {
	
	/*
	 * 	통아저씨 게임을 만들어 보세요
	 * 
	 * 	1. 게임이 시작되면 플레이어가 몇 명인지 정한다
	 * 
	 *  2. 여러 플레이어가 돌아가면서 원하는 위치에 칼을 찌른다
	 *  
	 *  3. 칼을 찌를 수 있는 홈은 20개가 있고 그 중 2개가 꽝이 된다. (꽝의 위치는 매 판마다 랜덤으로 설정)
	 *  
	 *  4. 잘못된 곳을 칼로 찌른 플레이어는 게임에 패배한다
	 *  
	 *  5. 게임은 계속 이어서 플레이 할 수 있고, 각 플레이어의 전적도 누적 집계되어야 한다
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
			System.out.print("플레이어의 수 >> ");			
			playerNum = sc.nextInt();
			
			//Player를 여러명 담을 수 있는 배열을 생성(배열 안의 내용은 비어있다)
			players = new Player[playerNum];
			
			// Player 인스턴스를 생성해 배열에 추가한다
			for(int i = 0; i < players.length; i++) {
				players[i] = new Player();
			}	
			
			while(true) {
				
				System.out.println("1. 새 게임");
				System.out.println("2. 전적 보기");
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
					System.out.println("플레이어는 2명 이상이어야 합니다.");
				}
				
				System.out.print("몇 명이 플레이 하시나요? ");
				
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
						System.out.print("[" + pList[playOrderNum].orderNum + "]번 플레이어님 찌를 곳을 입력해 주세요(1~"+t.maxHole+")");				
						t.inNum = sc.nextInt();				
					}
					
					if(!t.inCheck()) {
						
						t.arrInNum[t.inCount] = t.inNum;
						t.inCount++;	
						
						if(t.failCheck()) {					
							System.out.println(pList[playOrderNum].orderNum + "번 플레이어 님의 패배 입니다.");
							
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
				
				System.out.print("다시 플레이 하시려면 [Y] 를 입력해 주세요 >> ");
				
				char rePlay = 'N';
				
				rePlay = sc.next().charAt(0);
				
				if(rePlay != 'Y') {
					rePlayCheck = false;
				}			
				
			}
			
			System.out.println("---------- 집 계 --------------");
			for(int i = 0; i < pList.length; i++) {			
				System.out.println(pList[i].orderNum + "번 플레이어 승 : " + pList[i].winCount + " 패 : " + pList[i].lostCount);			
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
			System.out.printf("[%d턴] Player %d의 차례 >> ", turn + 1, currentPlayer + 1);

			int slotIndex = sc.nextInt();
			
			switch (tong.stab(slotIndex - 1)) {
				case 1:
					turn++;
					break;
				case 0:
					System.out.println("다른 곳을 선택해주세요.");
					break;
				case -1:
					System.out.printf("해적 아저씨가 날라갔습니다. Player %d님의 패배입니다.\n", currentPlayer + 1);
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









