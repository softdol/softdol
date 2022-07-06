package myobj;

public class T26_Phone20220525_s {
	/*
	 * 	�� ��ȭ Ű�е忡�� �޼հ� �������� �����հ������� �̿��ؼ� ���ڸ��� �Է��Ϸ��� �մϴ�.
		�� ó�� �޼� �����հ����� * Ű�е忡 ������ �����հ����� # Ű�е� ��ġ���� �����ϸ�, 
		�����հ����� ����ϴ� ��Ģ�� ������ �����ϴ�.

		�����հ����� �����¿� 4���� �������θ� �̵��� �� ������ Ű�е� �̵� �� ĭ�� �Ÿ��� 1�� �ش��մϴ�.
		���� ���� 3���� ���� 1, 4, 7�� �Է��� ���� �޼� �����հ����� ����մϴ�.
		������ ���� 3���� ���� 3, 6, 9�� �Է��� ���� ������ �����հ����� ����մϴ�.
		��� ���� 4���� ���� 2, 5, 8, 0�� �Է��� ���� �� �����հ����� ���� Ű�е��� ��ġ���� �� ����� �����հ����� ����մϴ�.
		4-1. ���� �� �����հ����� �Ÿ��� ���ٸ�, ���������̴� ������ �����հ���, �޼����̴� �޼� �����հ����� ����մϴ�.
		������� ���� ��ȣ�� ��� �迭 numbers, �޼��������� ������������ ���� ��Ÿ���� ���ڿ� hand�� �Ű������� �־��� ��, �� ��ȣ�� ���� �����հ����� �޼��� �� �������� ���� ��Ÿ���� ���ӵ� ���ڿ� ���·� return �ϵ��� solution �Լ��� �ϼ����ּ���.

		[���ѻ���]
		numbers �迭�� ũ��� 1 �̻� 1,000 �����Դϴ�.
		numbers �迭 ������ ���� 0 �̻� 9 ������ �����Դϴ�.
		hand�� "left" �Ǵ� "right" �Դϴ�.
		"left"�� �޼�����, "right"�� ���������̸� �ǹ��մϴ�.
		�޼� �����հ����� ����� ���� L, ������ �����հ����� ����� ���� R�� ������� �̾�ٿ� ���ڿ� ���·� return ���ּ���.
		
		����� ��
		numbers								hand		result
		[1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]	"right"		"LRLLLRLLRRL"
														[LRLLLRLLRRL]
		[7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2]	"left"		"LRLLRRLLLRR"
														[LRLLRRLLLRR]
		[1, 2, 3, 4, 5, 6, 7, 8, 9, 0]		"right"		"LLRLLRLLRL"
														[LLRLLRLLRL]
	 * 
	 */
	
	public static void main(String[] args) {
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
		String hand = "left";
		
		System.out.println("[" + solution(numbers, hand) + "]");
	}
	
	public static String solution(int[] numbers, String hand) {
        String answer = "";
        
        char handC = hand.charAt(0);
        int prevLnum = 10;
        int prevRnum = 12;        
        int number = 0;
        for(int i = 0; i < numbers.length; i++) {
        	String sumHand = "";
        	number = numbers[i] == 0 ? 11 : numbers[i];
        	if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
        		sumHand = "L";
        	}else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {        		
        		sumHand = "R";
        	}else {
        		//2,5,8,0        		
        		int moveL = moveNum(prevLnum, number);
        		int moveR = moveNum(prevRnum, number);        		
        		//System.out.println(numbers[i] + " : L > " + moveL + " | R > " + moveR);
        		System.out.printf("%d : L(%d) > %d || R(%d) > %d\n", 
        				number, prevLnum, moveL, prevRnum, moveR);
        		
        		if(moveL > moveR) {
        			sumHand = "R";
        		}else if (moveL < moveR){
        			sumHand = "L";
        		}else {
        			if(handC == 'r') {
        				sumHand = "R";
        			}else {
        				sumHand = "L";
        			}
        		}
        	}
        	
        	if(sumHand.equals("L")) {
        		prevLnum = number;
        	}else {
        		prevRnum = number;
        	}
        	answer += sumHand;
        	number = 0;
        	
        }
        
        return answer;
    }
	
	public static int moveNum(int a, int b) {
		
		return (int)Math.abs(a -b) / 3 + (int)Math.abs(a -b) % 3;
	}
}
