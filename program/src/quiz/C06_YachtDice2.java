package quiz;

import myobj.YachtDice.Dice;

public class C06_YachtDice2 {
	
	/*
	 * 	# YachtDice ������ ��������
	 * 
	 * 
	 *  1. �÷��̾�� �ټ����� �ֻ����� ������.
	 *  
	 *  2. �ټ� ���� �ֻ��� �� ����� ���� ������ �����ؾ� �Ѵ�.
	 *  
	 *  	(1) Ǯ �Ͽ콺 (���� ���� 2��/3��) ex: 11133, 31313
	 *  	(2) ���� ��Ʈ����Ʈ(1234,2345,3456) ex: 42131
	 *  	(3) ���� ��Ʈ����Ʈ(12345,23456) ex: 54123
	 *  	(4) 4���̽� (���� ���� 4��) ex: 44441, 63666
	 *  	(5) Yacht(���� ���� 5��) ex: 11111, 22222
	 *  	(6) �ƹ��͵� �������� ���� ��� �ֻ��� �� ���� ������ �ȴ�]
	 *  
	 *   3. �÷��̾�� �ٽ� ������ ���� �ֻ����� ������ ��� �ٽ� ���� �� �ִ�.(2ȸ)	 * 
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
