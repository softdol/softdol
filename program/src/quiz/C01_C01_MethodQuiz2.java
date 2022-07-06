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
				System.out.println("»ç°úÀÇ °³¼ö°¡ ÀÌ»óÇÕ´Ï´Ù.");
				break;
			case -1 : 
				System.out.println("¹Ù±¸´Ï Å©±â°¡ ÀÌ»óÇÕ´Ï´Ù.");
				break;
			default : 
				System.out.println("ÇÊ¿äÇÑ ¹Ù±¸´Ï´Â " + bCount + "°³ ÀÔ´Ï´Ù.");
				break;
		
		}
		
		//System.out.printf("1. »ç°ú °³¼ö : %d ¹Ù±¸´Ï Å©±â : %d ÇÊ¿äÇÑ ¹Ù±¸´Ï : %d\n", apple, size, basket(apple, size));
		
		String s = "apple";
		
		System.out.printf("2. ÀÔ·ÂÇÑ ¹®ÀÚ¿­ : %s ¹ÝÈ¯ ¹®ÀÚ¿­ : %s \n",s, backwards(s));		
		
		System.out.printf("3. ÀÔ·ÂÇÑ ¹®ÀÚ¿­ : %s ¹ÝÈ¯ ¹®ÀÚ¿­ : %s \n",s, randomS(s));
		
	 	System.out.println("4. ·£´ý 8ÀÚ¸® : " + Arrays.toString(lotto(10)));
	}

	
	// 1. »ç°úÀÇ °³¼ö¿Í ¹Ù±¸´ÏÀÇ Å©±â¸¦ Àü´ÞÇÏ¸é ÇÊ¿äÇÑ ¹Ù±¸´ÏÀÇ °³¼ö¸¦ ¸®ÅÏÇÏ´Â ¸Þ¼­µå
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
	
	// 2. ¹®ÀÚ¿­À» Àü´ÞÇÏ¸é ÇØ´ç ¹®ÀÚ¿­À» ·£´ýÀ¸·Î µÚ¼¯Àº °á°ú¸¦ ¹ÝÈ¯ÇÏ´Â ¸Þ¼­µå
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
		//»õ·Î¿î StringBuilder¸¦ ¸¸µé¶§ ¹®ÀÚ¿­À» Àü´ÞÇÒ ¼ö ÀÖ´Ù
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
	
	
	// 3. ¹®ÀÚ¿­À» Àü´ÞÇÏ¸é ÇØ´ç ¹®ÀÚ¿­À» °Å²Ù·ÎÇÑ ¹®ÀÚ¿­À» ¹ÝÈ¯ÇÏ´Â ¸Þ¼­µå
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
	
	// 4. ¸Þ¼­µå¸¦ È£­ŒÇÏ¸é 1 ~ 45 »çÀÌÀÇ Áßº¹¾ø´Â ¼ýÀÚ 8°³·Î ÀÌ·ç¾îÁø ¹è¿­À» ¹ÝÈ¯ÇÏ´Â ¸Þ¼­µå
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
