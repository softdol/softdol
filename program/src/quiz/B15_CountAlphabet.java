package quiz;

import java.util.Scanner;

public class B15_CountAlphabet {
	
	/*
	 * 	사용자로부터 문장을 입력받으면
	 * 	해당 문장에 알파벳이 등장한 횟수를 배열에 저장한 후
	 * 	1회 이상 등장한 알파벳만 몇회 등장했는지 출력해보세요.
	 * 	(대문자, 소문자는 따로 집계해야 함)
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		boolean self = false;
		
		if(!self) {
			
			System.out.print("문장 >> ");
			Scanner sc = new Scanner(System.in);
			String text = sc.nextLine();
			
			sc.close();
			
			int[] lower = new int[26];
			int[] upper = new int[26];
			
			for(int i = 0; i < text.length(); ++i) {
				char ch = text.charAt(i);
				
				if(ch >= 'a' && ch <= 'z') {
					lower[ch - 'a']++;					
				}else if(ch >= 'A' && ch <= 'Z') {
					upper[ch - 'A']++;
				}
			}
			
			
			for(int i = 0; i < 26; ++i) {				
				if(lower[i] != 0 ) {
					System.out.printf("%c : %d\n" , i + 'a', lower[i]);
				}
				
				if(upper[i] != 0 ) {
					System.out.printf("%c : %d\n" , i + 'a', upper[i]);
				}				
			}
			
			
		}else {
			
			Scanner sc = new Scanner(System.in);
			
			String str = "APpLe APPLE[\\]^_` apple Apple";
			//[\]^_`
			
			System.out.print("문장을 입력해 주세요 >> ");
			
			str = sc.nextLine();
			
			sc.close();
			
			int[] chrCount = new int[(int)'z' + 1];
			char[] chUser = str.toCharArray();
			
			for(int i = 0 ; i < chUser.length; ++i) {
				for(char c = 'A'; c <= 'z' ; ++c) {
					if(!(chUser[i] >= '[' && chUser[i] <= '`')) {
						chrCount[c] = chUser[i] == c ? chrCount[c]+1 :  chrCount[c];
					}
				}
			}
			
			for(char c = 'A'; c <= 'z' ; ++c) {	
				if(chrCount[c] != 0) {
					System.out.println(c + " : " + chrCount[c]);
				}
			}
			
		}
		
		
		
	}

}
