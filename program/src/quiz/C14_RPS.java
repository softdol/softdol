package quiz;

import java.util.Scanner;

import myobj.rps.Shape;

public class C14_RPS {

	/*
	 *	���������� ������ ����� ������
	 *
	 *	�÷��̾�, ��ǻ�� �·� ����
	 *	
	 *	��ǻ�ʹ� ���ֳ״� ������ ����
	 *		(ex)Ȯ���� ������ ����
	 *	0 : ���� 1: ���� 2: ��
	 */
	public static void main(String[] args) {
		
		
		
		// 0�� ����.. 1�� ����.. 2�� ���ڱ�..
		// �̷� ���� �����ڰ� �ܿ��� �ϴ� ���� ���� �ѹ���� �Ѵ�
		// ���� �ѹ����� ������ ����ڸ� �˰� �ִ� �����̱� ������ �� ���� ���´� �ƴϴ�
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
			
			System.out.print("����(0) ����(1) ��(2)�� �����ϼ��� >>");
			
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
				System.out.println("�ٽ� �������ּ���!");
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
				System.out.println("��ǻ�� ��");
				break;
			case 0:
				System.out.println("���");
				break;
			case -1:
				System.out.println("��� ��");
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
//				System.out.println("1. ����");
//				System.out.println("5. ����");
//			}else {
//				System.out.println("������������������������������������������������������������������������");
//				System.out.println("�� ����[0] ����[1] ��[2] �� �Է��� �ּ��� ��");
//				System.out.println("��                  ����[4] ����[5]   ��");
//				System.out.println("������������������������������������������������������������������������");
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
//				System.out.println("������ ���� �Ǿ����ϴ�.");
//
//				sc.close();
//				return;
//			default:				
//				break;
//			}
//		}
		
	}
	
}

