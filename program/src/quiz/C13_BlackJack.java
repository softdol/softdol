package quiz;

import java.util.Scanner;

import myobj.blackjack.Card;

public class C13_BlackJack {
	
	/*
	 * 	# ������ ��������
	 * 
	 * 	1. ��ǻ��(����)�� ���(�÷��̾�)�� ī�带 �̴´�.
	 * 
	 * 	2. ó������ �� ��� 2�徿 �޴´�. �� �� ������ ī��� ���� �������´�.
	 * 
	 * 	3. �÷��̾�� ī�带 ���� �� ��Ȳ�� ���� �� ������(hit)
	 * 		���⼭ ������(stand)�� ������ �� �ִ�.
	 * 
	 * 	4. �縮�̾ ���߸� ������ �������ִ� ī�带 �����ϰ� ��Ģ�� ���� ī�带 ��� �̴´�.
	 * 		(������ ������ �ִ� ī�� ���� 16 �����϶� ������ �̰�, 17�̻��̸� ������ ����� �Ѵ�)
	 * 
	 * 	5. �÷��̾��� ī�� ���� �������� ������ �����Ѵ�.
	 * 		�÷��̾��� ī�� ���� ��Ȯ�ϰ� 21�̸� ���� �� �ִ� �ִ� ���̹Ƿ� �� ���� �ʴ´�.(����)
	 * 		�÷��̾��� ī�� ���� 21���� ũ�� �й��Ѵ�.
	 * 
	 * 	6. A�� 1�� �� ���� �ְ� 11�� �� ���� �ִ�.
	 * 
	 * 	# ���� �ڷ�
	 * 		https://www.247blackjack.com
	 * 
	 */
	static int[][] playerCards;
	static int[][] comCards;
	static int playerCardCount;
	static int comCardCount;
	static int playSum;
	static int comSum;
	static Scanner sc;
	static Card card;
	static boolean startChk;
	static int playerMoney;
	static int totalDeal;
	
	public static void main(String[] args) {
		
		card = new Card();
	
		playerCards = new int[10][2];
		comCards = new int[10][2];
		playerCardCount = 0;
		comCardCount = 0;
		playSum = 0;
		comSum = 0;
		playerMoney = 2500;
		int maxMonmey = playerMoney; 
		int dealMoney = 0;
		totalDeal = 0;
		
		sc = new Scanner(System.in);
		
		startChk = true;
		
		while(true) {
			
			System.out.println("Deal Money : " + totalDeal);
			System.out.println("�÷��̾� Money : " + playerMoney);
			if(startChk) {
				System.out.println("1. ����");
			}else {
				System.out.println("2. Hit");				
				System.out.println("3. Stand");
				System.out.println("4. Deal");
			}
			System.out.println("5. ����");			
			System.out.print("> ");
			
			switch (sc.nextInt()) {
			case 1:				
				if(!startChk) {
					System.out.println("�߸��� �Է��Դϴ�.");
					break;
				}
				receivePlayer(card.getCard(), false);
				receiveCom(card.getCard(), false);
				receivePlayer(card.getCard(), false);
				receiveCom(card.getCard(), false);
				
				socreView(card, false);
				
				startChk = false;
				
				if(playSum == 21) {
					receiveStand();
				}
				
				break;
				
			case 2:
				if(startChk) {
					System.out.println("�߸��� �Է��Դϴ�.");
					break;
				}
				receivePlayer(card.getCard(), true);
				socreView(card, false);
				
				if(playSum == 21) {										
					receiveStand();
				}else if(playSum > 21){
					socreView(card, true);
					System.out.println("�÷��̾��� �й� �Դϴ�.");					
					reStart();
				}
				break;
				
			case 3:	
				if(startChk) {
					System.out.println("�߸��� �Է��Դϴ�.");
					break;
				}
				receiveStand();
				
				break;
			
			case 4:	
				
				if(startChk) {
					System.out.println("�߸��� �Է��Դϴ�.");
					break;
				}
				
				while(dealMoney < 1 || dealMoney > maxMonmey) {
					System.out.print("�ݾ�(1 ~ " + maxMonmey + ")�� �Է��� �ּ��� >>");
					
					dealMoney = sc.nextInt();
				}
				maxMonmey -= dealMoney;
				totalDeal += dealMoney;
				playerMoney -= dealMoney;
				
				dealMoney = 0;
				
				break;
			case 5:
				sc.close();
				return;
				
			default :
				break;
			}
			
		}
		
	}
	
	public static void reStart() {
		card = new Card();
		
		playerCards = new int[10][2];
		comCards = new int[10][2];
		playerCardCount = 0;
		comCardCount = 0;
		playSum = 0;
		comSum = 0;
		startChk = true;
		totalDeal = 0;
	}
	
	public static void receiveStand() {
		
		boolean loopCheck = false;
		
		while(comSum < 17 && comSum <= playSum) {
			receiveCom(card.getCard(), true);
			socreView(card, true);
			loopCheck = true;
		}
		
		if(!loopCheck) {
			socreView(card, true);
		}
		
		if(playSum > comSum || comSum > 21) {			
			System.out.println("�÷��̾��� �¸� �Դϴ�.");
			playerMoney += totalDeal * 2;
		}else if(playSum < comSum) {
			System.out.println("�÷��̾��� �й� �Դϴ�.");			
		}else {
			System.out.println("���º� �Դϴ�.");
			playerMoney += totalDeal;
		}
		reStart();
		
	}
	
	public static int getPoint(int sum, int cardNum) {
		
		int point = cardNum + 1;
		point = point > 10 ? 10 : point;
		
		if(cardNum == 0 && sum + point + 10 < 21) {		
			sum += (point + 10);
		}else {
			sum += point;
		}	
		
		return sum;
	}
	
	public static void receivePlayer(int[] cardInfo, boolean view) {		
		playerCards[playerCardCount][0] = cardInfo[0];
		playerCards[playerCardCount][1] = cardInfo[1];
		playerCardCount++;
		
		playSum = getPoint(playSum, cardInfo[1]);
				
		if(view) {
			System.out.println("�÷��̾ ī�带 ���� �޾ҽ��ϴ�.");			
		}
	}
	
	public static void receiveCom(int[] cardInfo, boolean view) {
		comCards[comCardCount][0] = cardInfo[0];
		comCards[comCardCount][1] = cardInfo[1];
		comCardCount++;
		
		comSum = getPoint(comSum, cardInfo[1]);
		
		if(view) {
			System.out.println("������ ī�带 ���� �޾ҽ��ϴ�.");
		}
		
	}
	
	public static void socreView(Card card, boolean com) {
		
		if(com) {		
			System.out.printf("����(%d��) \t", comSum);
		}else {
			System.out.printf("�÷��̾�(%d��)\t", playSum);
			for(int i = 0; i < playerCardCount; i++) {
				System.out.print(card.getCardInfo(playerCards[i][0], playerCards[i][1]) + "\t");
			}
			System.out.println();
			
			System.out.print("���� \t");			
		}
		
		for(int i = 0; i < comCardCount; i++) {
			if(i == 0 && com == false) {
				System.out.print("���\t");
			}else {
				System.out.print(card.getCardInfo(comCards[i][0], comCards[i][1]) + "\t");
			}
		}
		System.out.println();
		
	}
}
