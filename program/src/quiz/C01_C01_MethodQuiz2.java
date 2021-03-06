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
				System.out.println("사과의 개수가 이상합니다.");
				break;
			case -1 : 
				System.out.println("바구니 크기가 이상합니다.");
				break;
			default : 
				System.out.println("필요한 바구니는 " + bCount + "개 입니다.");
				break;
		
		}
		
		//System.out.printf("1. 사과 개수 : %d 바구니 크기 : %d 필요한 바구니 : %d\n", apple, size, basket(apple, size));
		
		String s = "apple";
		
		System.out.printf("2. 입력한 문자열 : %s 반환 문자열 : %s \n",s, backwards(s));		
		
		System.out.printf("3. 입력한 문자열 : %s 반환 문자열 : %s \n",s, randomS(s));
		
	 	System.out.println("4. 랜덤 8자리 : " + Arrays.toString(lotto(10)));
	}

	
	// 1. 사과의 개수와 바구니의 크기를 전달하면 필요한 바구니의 개수를 리턴하는 메서드
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
	
	// 2. 문자열을 전달하면 해당 문자열을 랜덤으로 뒤섞은 결과를 반환하는 메서드
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
		//새로운 StringBuilder를 만들때 문자열을 전달할 수 있다
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
	
	
	// 3. 문자열을 전달하면 해당 문자열을 거꾸로한 문자열을 반환하는 메서드
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
	
	// 4. 메서드를 호춯하면 1 ~ 45 사이의 중복없는 숫자 8개로 이루어진 배열을 반환하는 메서드
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
