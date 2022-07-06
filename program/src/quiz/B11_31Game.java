package quiz;

import java.util.Scanner;

public class B11_31Game {
	
	/*
	 * 	# 31게임을 만들어 보세요
	 * 
	 * 	1. 처음 프로그램을 실행하면 몇 몇으로 시작할지 선택한다.
	 * 	(인원은 최소 2명 이상이어야 한다)
	 * 	2. 여러 플레이어가 번갈아 가면서 숫자를 선택한다
	 * 	(숫자는 1,2,3 만 선택할 수 있다.)
	 * 	3. 누적된 숫자가 31 이상일 때 그 사람이 패배한다.
	 * 
	 */

	public static void main(String[] args){
				
		boolean self = false;
		
		if(!self) {
			Scanner sc = new Scanner(System.in);
			int max_player;
			
			while(true) {			
				System.out.print("몇 명? ");
				max_player = sc.nextInt();
				
				if(max_player >= 2){
					break;
				}
				
				System.out.println("다시 입력 ");
			}
			
			sc.close();
			System.out.println("플레이어는 " + max_player + "명 입니다.");
			
			int num = 0;
			int current_player = 0;
			
			while(num < 31) {
				int user_num = -1;
				
				while(user_num < 1 || user_num > 3) {
					System.out.printf("플레이어%d님 숫자를 입력하세요 >> ", current_player + 1);
					user_num = sc.nextInt();
				}
				
				num += user_num;
				
				if(num >= 31) {
					System.out.printf("플레이어%d의 패배!\n", current_player + 1);
				}
				
				System.out.println("현재 숫자는 " + num + "입니다.");
				current_player = (current_player + 1) % max_player;
				
			}
			
			System.out.println("num이 31을 넘어서 while문을 벗어났습니다.");
			
			
		}else {
			
			int cnt = 0;
			int maxCnt = 31;		
			int playNum = 1;
			
			int pCount;
			int inNum;
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.print("플레이 인원을 정해주세요(최소2명 이상) >> ");
				pCount = sc.nextInt();
				
				if(pCount > 1) {
					break;
				}
			}
			
			System.out.printf("["+playNum+"번 플레이어]1~3사이 숫자를 입력해 주세요 >> ");
			inNum = sc.nextInt();		
			
			while(cnt <= maxCnt) {
				
				if(inNum < 4 && inNum > 0) {				
					
					for(int i = 1 ; i <= inNum; ++i  ) {
						System.out.println(">>>>> " + ++cnt);
						
						if(cnt >= maxCnt) {
							System.out.println("[게임 종료]["+playNum +"번 플레이어 님이 패배했습니다.]");
							break;
						}
					}
					
					playNum++;
					
				}
				
				playNum = playNum % pCount;
				if(playNum == 0) {
					playNum = pCount;
				}
				
				if(cnt >= maxCnt) {
					sc.close();
					break;
				}
				
				System.out.print("["+playNum +"번 플레이어]1~3사이 숫자를 입력해 주세요 >> ");
				inNum = sc.nextInt();			
				
			}		
			
			sc.close();
			
		}
		
		
		
	}
	
}
