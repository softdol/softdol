package quiz;

import java.util.Scanner;

public class B07_PrintReverse {

	/*
	 * 	����ڷκ��� ������ �Է¹����� �� ������ �Ųٷ� ����ϴ� ���α׷��� ����� ������
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ϴ� �ܾ �Է��� �ּ��� >> ");
		
		String userWord = sc.nextLine();		
		
		sc.close();
		for(int i = 0; i < userWord.length(); i++) {
			
			char front_ch = userWord.charAt(i);
			char back_ch = userWord.charAt(userWord.length() - 1 - i);
			
			System.out.println( i + "��° ���� : " + front_ch);
			System.out.println( i + "��° ���� : " + back_ch);
//			System.out.println( i + "��° ���� : " + front_ch);
//			System.out.println( i + "��° ���� : " + back_ch);
			
			//System.out.print(userWord.charAt(userWord.length()- i));
		}
		
		//System.out.println();
		
//		for(int i = userWord.length()-1 ; i >= 0 ; --i) {
//			System.out.print(userWord.charAt(i));
//		}
		
		//System.out.println();
		
	}
}
