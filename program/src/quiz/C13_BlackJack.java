package quiz;

import java.util.Scanner;

import myobj.blackjack.Card;

public class C13_BlackJack {
	
	/*
	 * 	# 블랙잭을 만들어보세요
	 * 
	 * 	1. 컴퓨터(딜러)와 사람(플레이어)이 카드를 뽑는다.
	 * 
	 * 	2. 처음에는 둘 모드 2장씩 받는다. 이 때 딜러의 카드는 한장 가려놓는다.
	 * 
	 * 	3. 플레이어는 카드를 받은 후 상황을 보고 더 뽑을지(hit)
	 * 		여기서 멈출지(stand)를 결정할 수 있다.
	 * 
	 * 	4. 펠리이어가 멈추면 딜러가 가려져있던 카드를 오픈하고 규칙에 따라 카드를 계속 뽑는다.
	 * 		(딜러는 가지고 있는 카드 합이 16 이하일때 무저건 뽑고, 17이상이면 무조건 멈춰야 한다)
	 * 
	 * 	5. 플레이어의 카드 합이 딜러보다 높으면 숭리한다.
	 * 		플레이어의 카드 합이 정확하게 21이면 만들 수 있는 최대 값이므로 더 뽑지 않는다.(블랙잭)
	 * 		플레이어의 카드 합이 21보다 크면 패배한다.
	 * 
	 * 	6. A는 1로 쓸 수도 있고 11로 쓸 수도 있다.
	 * 
	 * 	# 참고 자료
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
			System.out.println("플레이어 Money : " + playerMoney);
			if(startChk) {
				System.out.println("1. 시작");
			}else {
				System.out.println("2. Hit");				
				System.out.println("3. Stand");
				System.out.println("4. Deal");
			}
			System.out.println("5. 종료");			
			System.out.print("> ");
			
			switch (sc.nextInt()) {
			case 1:				
				if(!startChk) {
					System.out.println("잘못된 입력입니다.");
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
					System.out.println("잘못된 입력입니다.");
					break;
				}
				receivePlayer(card.getCard(), true);
				socreView(card, false);
				
				if(playSum == 21) {										
					receiveStand();
				}else if(playSum > 21){
					socreView(card, true);
					System.out.println("플레이어의 패배 입니다.");					
					reStart();
				}
				break;
				
			case 3:	
				if(startChk) {
					System.out.println("잘못된 입력입니다.");
					break;
				}
				receiveStand();
				
				break;
			
			case 4:	
				
				if(startChk) {
					System.out.println("잘못된 입력입니다.");
					break;
				}
				
				while(dealMoney < 1 || dealMoney > maxMonmey) {
					System.out.print("금액(1 ~ " + maxMonmey + ")을 입력해 주세요 >>");
					
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
			System.out.println("플레이어의 승리 입니다.");
			playerMoney += totalDeal * 2;
		}else if(playSum < comSum) {
			System.out.println("플레이어의 패배 입니다.");			
		}else {
			System.out.println("무승부 입니다.");
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
			System.out.println("플레이어가 카드를 한장 받았습니다.");			
		}
	}
	
	public static void receiveCom(int[] cardInfo, boolean view) {
		comCards[comCardCount][0] = cardInfo[0];
		comCards[comCardCount][1] = cardInfo[1];
		comCardCount++;
		
		comSum = getPoint(comSum, cardInfo[1]);
		
		if(view) {
			System.out.println("딜러가 카드를 한장 받았습니다.");
		}
		
	}
	
	public static void socreView(Card card, boolean com) {
		
		if(com) {		
			System.out.printf("딜러(%d점) \t", comSum);
		}else {
			System.out.printf("플레이어(%d점)\t", playSum);
			for(int i = 0; i < playerCardCount; i++) {
				System.out.print(card.getCardInfo(playerCards[i][0], playerCards[i][1]) + "\t");
			}
			System.out.println();
			
			System.out.print("딜러 \t");			
		}
		
		for(int i = 0; i < comCardCount; i++) {
			if(i == 0 && com == false) {
				System.out.print("■■\t");
			}else {
				System.out.print(card.getCardInfo(comCards[i][0], comCards[i][1]) + "\t");
			}
		}
		System.out.println();
		
	}
}
