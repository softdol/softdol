package quiz;

import java.util.Scanner;

public class B15_CountAlphabet {
	
	/*
	 * 	����ڷκ��� ������ �Է¹�����
	 * 	�ش� ���忡 ���ĺ��� ������ Ƚ���� �迭�� ������ ��
	 * 	1ȸ �̻� ������ ���ĺ��� ��ȸ �����ߴ��� ����غ�����.
	 * 	(�빮��, �ҹ��ڴ� ���� �����ؾ� ��)
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		boolean self = false;
		
		if(!self) {
			
			System.out.print("���� >> ");
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
			
			System.out.print("������ �Է��� �ּ��� >> ");
			
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
