package quiz;

import java.util.Scanner;

public class B09_Numeric {
	/*
	 * 	����ڰ� � ���ڿ��� �Է����� ��
	 * 	�ش� �ܾ ��� ���ڷθ� �����Ǿ� �ִ��� �˻��غ�����
	 * 
	 */
	
	public static void main(String[] args) {

		boolean self = false;
		
		Scanner sc = new Scanner(System.in);
		String str = "0125489963";
		
		if(!self) {
			
			System.out.print("�ƹ��ų� �Է� >> ");
			
			str = sc.next();		
			
			sc.close();
			
			boolean numbersOnly = true;
			
			for(int i = 0; i < str.length(); ++i) {
				
				char ch = str.charAt(i);
				
				if(ch < '0' || ch > '9') {					
					numbersOnly = false;
					break;
				}
				
			}
			
			System.out.println("���ڷθ� �̷�����ֳ���?" + numbersOnly);
			
		}else {
			
			boolean check = true;
			
			System.out.print("���ڸ� �Է��� �ּ��� >> ");
			
			str = sc.nextLine();		
			
			sc.close();
		
			for(int i = 0; i < str.length(); ++i) {
			
				if(!(str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
					System.out.println("���ڰ� �ƴ� ���ڰ� �ֽ��ϴ�.");
					check = false;
					break;
				}
				
			}
			
			if(check) {
				System.out.println("���� �Դϴ�.");
			}
		}
		
	}
}
