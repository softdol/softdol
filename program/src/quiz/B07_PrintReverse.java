package quiz;

import java.util.Scanner;

public class B07_PrintReverse {

	/*
	 * 	사용자로부터 문장을 입력받으면 그 문장을 거꾸로 출력하는 프로그래을 만들어 보세요
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 단어를 입력해 주세요 >> ");
		
		String userWord = sc.nextLine();		
		
		sc.close();
		for(int i = 0; i < userWord.length(); i++) {
			
			char front_ch = userWord.charAt(i);
			char back_ch = userWord.charAt(userWord.length() - 1 - i);
			
			System.out.println( i + "번째 글자 : " + front_ch);
			System.out.println( i + "번째 글자 : " + back_ch);
//			System.out.println( i + "번째 글자 : " + front_ch);
//			System.out.println( i + "번째 글자 : " + back_ch);
			
			//System.out.print(userWord.charAt(userWord.length()- i));
		}
		
		//System.out.println();
		
//		for(int i = userWord.length()-1 ; i >= 0 ; --i) {
//			System.out.print(userWord.charAt(i));
//		}
		
		//System.out.println();
		
	}
}
