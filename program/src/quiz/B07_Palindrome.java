package quiz;

import java.util.Scanner;

public class B07_Palindrome {
	
	/*
	 * 	����ڷκ��� �ܾ �ϳ� �Է¹޾��� ��
	 * �ش� �ܾ �Ϲ��ϰ� ��Ī���� �ƴ��� �����ϴ� ���α׷��� ����� ������
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ܾ �Է��� �ּ��� >> ");
		
		//String userWord = "�Ͽ����";
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
				System.out.println("�Է��Ͻ� �ܾ�� �¿� ��Ī �ܾ� �Դϴ�.");
			}else {
				System.out.println("�Է��Ͻ� �ܾ�� �¿� ��Ī �ܾ �ƴմϴ�.");
			}
		}else {
			
			
			
		}
		
		
	}
}
