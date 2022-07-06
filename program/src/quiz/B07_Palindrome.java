package quiz;

import java.util.Scanner;

public class B07_Palindrome {
	
	/*
	 * 	사용자로부터 단어를 하나 입력받았을 떄
	 * 해당 단어가 완벅하게 대칭인지 아닌지 구분하는 프로그램을 만들어 보세요
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어를 입력해 주세요 >> ");
		
		//String userWord = "일요요일";
		String userWord = sc.nextLine();
		
		sc.close();
		
		boolean self = true;
		
		if(self) {		
		
			int wordSize = userWord.length() / 2;
			
			//System.out.println(wordSize);
			
			String lWord = "";
			String rWord = "";
			
			for(int i = 0; i < wordSize ; i++) {
				lWord += userWord.charAt(i);
			}
			
			//System.out.println(lWord);
	
			for(int i = userWord.length() - 1; i > wordSize ; --i) {
				rWord += userWord.charAt(i);
			}
					
			//System.out.println(rWord);
			
			if(lWord.equals(rWord)) {
				System.out.println("입력하신 단어는 좌우 대칭 단어 입니다.");
			}else {
				System.out.println("입력하신 단어는 좌우 대칭 단어가 아닙니다.");
			}
		}else {
			
			
			
		}
		
		
	}
}
