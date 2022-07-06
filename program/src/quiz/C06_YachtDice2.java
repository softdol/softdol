package quiz;

import myobj.YachtDice.Dice;

public class C06_YachtDice2 {
	
	/*
	 * 	# YachtDice 게임을 만들어보세요
	 * 
	 * 
	 *  1. 플레이어는 다섯개의 주사위를 던진다.
	 *  
	 *  2. 다섯 개의 주사위 눈 결과를 통해 다음을 구분해야 한다.
	 *  
	 *  	(1) 풀 하우스 (같은 눈이 2개/3개) ex: 11133, 31313
	 *  	(2) 스몰 스트레이트(1234,2345,3456) ex: 42131
	 *  	(3) 라지 스트레이트(12345,23456) ex: 54123
	 *  	(4) 4다이스 (같은 숫자 4개) ex: 44441, 63666
	 *  	(5) Yacht(같은 숫자 5개) ex: 11111, 22222
	 *  	(6) 아무것도 만족하지 못한 경우 주사위 눈 합이 점수가 된다]
	 *  
	 *   3. 플레이어는 다시 던지고 싶은 주사위를 여러개 골라서 다시 던질 수 있다.(2회)	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		Dice dice = new Dice();
		System.out.println(dice);
		
		dice.reroll("123");
		System.out.println(dice);
		dice.reroll("345");
		System.out.println(dice);
		dice.reroll("135");
		System.out.println(dice);
		
		
	}
}
