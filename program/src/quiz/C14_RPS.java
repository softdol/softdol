package quiz;

import java.util.Scanner;

import myobj.rps.Shape;

public class C14_RPS {

	/*
	 *	가위바위보 게임을 만들어 보세요
	 *
	 *	플레이어, 컴퓨터 승률 저장
	 *	
	 *	컴퓨터는 자주네는 패턴이 있음
	 *		(ex)확률상 바위를 더냄
	 *	0 : 가위 1: 바위 2: 보
	 */
	public static void main(String[] args) {
		
		
		
		// 0은 바위.. 1은 가위.. 2는 보자기..
		// 이런 것을 개발자가 외워야 하는 것을 매직 넘버라고 한다
		// 매직 넘버들은 개발한 당사자만 알고 있는 숫자이기 떄문에 썩 좋은 형태는 아니다
		//Shape user = new Shape(Shape.PAPER);
		
		
//		System.out.println("com : " + com.getName());
//		System.out.println("user : " + user.getName());
		
		//int result = Shape.versus(com, user);
		
		//System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			Shape com = Shape.random();
			Shape user;
			boolean error = false;
			
			System.out.print("가위(0) 바위(1) 보(2)를 선택하세요 >>");
			
			switch (sc.nextInt()) {
			case 0:
				user = Shape.SCISSORS;
				break;
			case 1:
				user = Shape.ROCK;
				break;
			case 2:
				user = Shape.PAPPER;
				break;
			default:
				System.out.println("다시 선택해주세요!");
				user = null;
				error = true;
				break;
			}
			
			sc.close();
			
			if(error) {
				continue;
			}
			
			System.out.printf("com: %s\tuser: %s\n", com.getName(), user.getName());
			
			switch(Shape.versus(com, user)) {
			case 1:
				System.out.println("컴퓨터 승");
				break;
			case 0:
				System.out.println("비김");
				break;
			case -1:
				System.out.println("당신 승");
				break;
			}
						
			
		}
		
		
//		RockPaperScissors rpsGame = new RockPaperScissors();
//		Player p1 = new Player();
//		
//		Computer com = new Computer();
//		
//		switch ((int)(Math.random()*2)) {
//		case 0:	
//			com = new RockCom();
//			break;
//		case 1:
//			com = new NomalCom();
//			break;
//		default :
//			com = new NomalCom();
//			break;
//		}		
//		
//		Scanner sc = new Scanner(System.in);
//		boolean start = false;
//		int userIn = 9;
//		int result = 0;
//		
//		while(true) {
//			if(!start) {
//				System.out.println("1. 시작");
//				System.out.println("5. 종료");
//			}else {
//				System.out.println("┌──────────────────────────────────┐");
//				System.out.println("│ 가위[0] 바위[1] 보[2] 를 입력해 주세요 │");
//				System.out.println("│                  전적[4] 종료[5]   │");
//				System.out.println("└──────────────────────────────────┘");
//			}			
//			System.out.print(">> ");
//			
//			userIn = sc.nextInt();
//			
//			switch (userIn) {
//			case 0:case 2:	
//				result = rpsGame.rpsResult(userIn, com.ranShot());
//				com.setInfo(result);
//				p1.setInfo(result);
//				break;
//			case 1:
//				if(start) {
//					result = rpsGame.rpsResult(userIn, com.ranShot());
//					com.setInfo(result);
//					p1.setInfo(result);
//				}else {
//					start = true;
//				}
//				break;
//			case 4:
//				p1.viewInfo();
//				com.viewInfo();				
//				break;
//			case 5:
//				System.out.println("게임이 종료 되었습니다.");
//
//				sc.close();
//				return;
//			default:				
//				break;
//			}
//		}
		
	}
	
}

