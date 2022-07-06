package myobj.RpsRockPaper;

public class RockPaperScissors {

	final String[] RPS_LIST = {"가위", "바위", "보"};
	
	// 가위 바위 보 보여주기
	public String viewShot(int num) {
		return RPS_LIST[num];
	};
		
	// 승패 확인 1: 플레이어 승 0: 무승부 -1:컴퓨터 승리
	public int rpsResult(int player, int com) {
		
		int result = 0;
		
		//가위 0, 바위 1, 보2
		if(player == 0) {
			result = com == 2 ?  1 : result;
			result = com == 1 ?  -1 : result;
		//바위
		}else if(player == 1) {
			result = com == 2 ?  -1 : result;
			result = com == 0 ?  1 : result;		
		//보
		}else {
			result = com == 1 ?  1 : result;
			result = com == 0 ?  -1 : result;
		}
		
		System.out.printf("[플레이어 : %s] [컴퓨터 : %s] : ", viewShot(player), viewShot(com));
		
		switch(result) {
		case 1:
			System.out.println("플레이어가 이겼습니다.");
			break;
		case 0:
			System.out.println("무승부 입니다..");
			break;
		case -1:
			System.out.println("플레이어가 졌습니다.");
			break;			
		}
		
		return result;
	};	
}
