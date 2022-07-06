package quiz;

import java.util.Scanner;

public class B11_31Game {
	
	/*
	 * 	# 31������ ����� ������
	 * 
	 * 	1. ó�� ���α׷��� �����ϸ� �� ������ �������� �����Ѵ�.
	 * 	(�ο��� �ּ� 2�� �̻��̾�� �Ѵ�)
	 * 	2. ���� �÷��̾ ������ ���鼭 ���ڸ� �����Ѵ�
	 * 	(���ڴ� 1,2,3 �� ������ �� �ִ�.)
	 * 	3. ������ ���ڰ� 31 �̻��� �� �� ����� �й��Ѵ�.
	 * 
	 */

	public static void main(String[] args){
				
		boolean self = false;
		
		if(!self) {
			Scanner sc = new Scanner(System.in);
			int max_player;
			
			while(true) {			
				System.out.print("�� ��? ");
				max_player = sc.nextInt();
				
				if(max_player >= 2){
					break;
				}
				
				System.out.println("�ٽ� �Է� ");
			}
			
			sc.close();
			System.out.println("�÷��̾�� " + max_player + "�� �Դϴ�.");
			
			int num = 0;
			int current_player = 0;
			
			while(num < 31) {
				int user_num = -1;
				
				while(user_num < 1 || user_num > 3) {
					System.out.printf("�÷��̾�%d�� ���ڸ� �Է��ϼ��� >> ", current_player + 1);
					user_num = sc.nextInt();
				}
				
				num += user_num;
				
				if(num >= 31) {
					System.out.printf("�÷��̾�%d�� �й�!\n", current_player + 1);
				}
				
				System.out.println("���� ���ڴ� " + num + "�Դϴ�.");
				current_player = (current_player + 1) % max_player;
				
			}
			
			System.out.println("num�� 31�� �Ѿ while���� ������ϴ�.");
			
			
		}else {
			
			int cnt = 0;
			int maxCnt = 31;		
			int playNum = 1;
			
			int pCount;
			int inNum;
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.print("�÷��� �ο��� �����ּ���(�ּ�2�� �̻�) >> ");
				pCount = sc.nextInt();
				
				if(pCount > 1) {
					break;
				}
			}
			
			System.out.printf("["+playNum+"�� �÷��̾�]1~3���� ���ڸ� �Է��� �ּ��� >> ");
			inNum = sc.nextInt();		
			
			while(cnt <= maxCnt) {
				
				if(inNum < 4 && inNum > 0) {				
					
					for(int i = 1 ; i <= inNum; ++i  ) {
						System.out.println(">>>>> " + ++cnt);
						
						if(cnt >= maxCnt) {
							System.out.println("[���� ����]["+playNum +"�� �÷��̾� ���� �й��߽��ϴ�.]");
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
				
				System.out.print("["+playNum +"�� �÷��̾�]1~3���� ���ڸ� �Է��� �ּ��� >> ");
				inNum = sc.nextInt();			
				
			}		
			
			sc.close();
			
		}
		
		
		
	}
	
}
