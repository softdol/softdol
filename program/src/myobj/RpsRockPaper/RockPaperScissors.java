package myobj.RpsRockPaper;

public class RockPaperScissors {

	final String[] RPS_LIST = {"����", "����", "��"};
	
	// ���� ���� �� �����ֱ�
	public String viewShot(int num) {
		return RPS_LIST[num];
	};
		
	// ���� Ȯ�� 1: �÷��̾� �� 0: ���º� -1:��ǻ�� �¸�
	public int rpsResult(int player, int com) {
		
		int result = 0;
		
		//���� 0, ���� 1, ��2
		if(player == 0) {
			result = com == 2 ?  1 : result;
			result = com == 1 ?  -1 : result;
		//����
		}else if(player == 1) {
			result = com == 2 ?  -1 : result;
			result = com == 0 ?  1 : result;		
		//��
		}else {
			result = com == 1 ?  1 : result;
			result = com == 0 ?  -1 : result;
		}
		
		System.out.printf("[�÷��̾� : %s] [��ǻ�� : %s] : ", viewShot(player), viewShot(com));
		
		switch(result) {
		case 1:
			System.out.println("�÷��̾ �̰���ϴ�.");
			break;
		case 0:
			System.out.println("���º� �Դϴ�..");
			break;
		case -1:
			System.out.println("�÷��̾ �����ϴ�.");
			break;			
		}
		
		return result;
	};	
}
