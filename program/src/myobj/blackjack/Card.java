package myobj.blackjack;

import java.util.Arrays;

public class Card {

	final static String[] SHAPE = {"♠","♡","♣","◇"};
	final static String[] CARDS = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	
	public boolean[][] cardsUse = new boolean[4][13];
	
	public Card() {
				
	}
	
	/**
	 * i = 0 스페이스, 1 하트, 2 클로버, 3 다이아몬드
	 * [0] : 모양
	 * [1] : 번호
	 */
	public int[] getCard(){
		
		int[] cardNum = new int[2];
		
		while(true) {
				
			int shape = (int)(Math.random() * 4) ;
			int num = (int)(Math.random() * 13);
			
			if(cardsUse[shape][num] == false) {
				cardsUse[shape][num] = true;
				cardNum[0] = shape;
				cardNum[1] = num;
				break;
			}
		}		
		
		return cardNum;
	}
	
	public void viewAvailable() {
		for(boolean[] b : cardsUse) {
			System.out.println(Arrays.toString(b));
		}
	}
	
	public String getCardInfo(int shape, int num) {
		
		return SHAPE[shape] + CARDS[num];
		
	}
	
//	public int getPoint(int sum, int cardNum) {
//		
//		int point = cardNum + 1;
//		point = point > 10 ? 10 : point;
//		
//		if(cardNum == 0 && sum + point + 10 < 21) {		
//			sum += (point + 10);
//		}else {
//			sum += point;
//		}	
//		
//		return sum;
//	}

	
}
