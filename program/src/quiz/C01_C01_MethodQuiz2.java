package quiz;

import java.util.Arrays;
import java.util.Random;

public class C01_C01_MethodQuiz2 {
	
	/*
	 * 
	 */
	public static void main(String[] args) {
		
		int apple = -8;
		int size = 8;
		
		int bCount = basket(apple,size);
		
		switch (bCount) {
			case -2 : 
				System.out.println("����� ������ �̻��մϴ�.");
				break;
			case -1 : 
				System.out.println("�ٱ��� ũ�Ⱑ �̻��մϴ�.");
				break;
			default : 
				System.out.println("�ʿ��� �ٱ��ϴ� " + bCount + "�� �Դϴ�.");
				break;
		
		}
		
		//System.out.printf("1. ��� ���� : %d �ٱ��� ũ�� : %d �ʿ��� �ٱ��� : %d\n", apple, size, basket(apple, size));
		
		String s = "apple";
		
		System.out.printf("2. �Է��� ���ڿ� : %s ��ȯ ���ڿ� : %s \n",s, backwards(s));		
		
		System.out.printf("3. �Է��� ���ڿ� : %s ��ȯ ���ڿ� : %s \n",s, randomS(s));
		
	 	System.out.println("4. ���� 8�ڸ� : " + Arrays.toString(lotto(10)));
	}

	
	// 1. ����� ������ �ٱ����� ũ�⸦ �����ϸ� �ʿ��� �ٱ����� ������ �����ϴ� �޼���
	public static int basket(int apple, int size) {
		int count = 0;
		
		while(apple > 0) {
			count++;
			apple -= size;
		}		
		
		return count;
//		if(apple <= 0) {
//			return -1;
//		}else if(size <= 0) {
//			return -2;
//		}else if(apple % size == 0) {
//			return apple / size;			
//		}else {
//			return apple / size + 1;
//		}
	}
	
	// 2. ���ڿ��� �����ϸ� �ش� ���ڿ��� �������� �ڼ��� ����� ��ȯ�ϴ� �޼���
	public static String randomS(String s) {
		char[] ch = s.toCharArray();
		
		for(int i = 0 ;  i < ch.length ; ++i)
		{
			for(int j = 0 ; j < 100 ; ++j) {				
				int rndNum = new Random().nextInt(ch.length);
				char temp = ch[i];
				ch[i] = ch[rndNum];
				ch[rndNum] = temp;
			}
		}
		
		return new String(ch);
		//���ο� StringBuilder�� ���鶧 ���ڿ��� ������ �� �ִ�
//		StringBuilder sb = new StringBuilder(s);
		
//		for(int i = 0; i < s.length(); ++i) {
//			sb.insert(0, s.charAt(i));
//		}
		
//		for(int i = 0; i < sb.length(); ++i ) {
//			for(int j = 0 ; j < 100 ; ++j) {				
//				Random rnd = new Random();
//				
//				int rndNum = rnd.nextInt(sb.length());
//				char temp = sb.charAt(i);
//				sb.setCharAt(i,sb.charAt(rndNum));
//				sb.setCharAt(rndNum,temp);
//			}
//		}
		
//		return sb.toString();
	}
	
	
	// 3. ���ڿ��� �����ϸ� �ش� ���ڿ��� �Ųٷ��� ���ڿ��� ��ȯ�ϴ� �޼���
	public static String backwards(String s) {
		
//		StringBuilder sb = new StringBuilder(s);
//		
//		return sb.reverse().toString();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < s.length() ; ++i) {
			sb.insert(0,s.charAt(i));
		}
		
		return sb.toString();
		
	}
	
	// 4. �޼��带 ȣ���ϸ� 1 ~ 45 ������ �ߺ����� ���� 8���� �̷���� �迭�� ��ȯ�ϴ� �޼���
	public static int[] lotto(int a) {
		int[] num = new int[8];
		
		for(int i = 0 ; i < num.length; ++i) {
			Random rnd = new Random();
			int rNum = rnd.nextInt(a) + 1;
			//boolean numChk = true;
			num[i] = rNum;
					
			for(int j = 0 ; j < i ; ++j) {				
				if(rNum == num[j]) {
					//numChk = false;
					i--;
					break;
				}
			}
			
			//num[i] = numChk ? rNum : num[i];
		}
		
		return num;
	}
}
