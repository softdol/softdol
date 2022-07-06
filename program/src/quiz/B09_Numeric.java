package quiz;

import java.util.Scanner;

public class B09_Numeric {
	/*
	 * 	사용자가 어떤 문자열를 입력했을 때
	 * 	해당 단어가 모두 숫자로만 구성되어 있는지 검사해보세요
	 * 
	 */
	
	public static void main(String[] args) {

		boolean self = false;
		
		Scanner sc = new Scanner(System.in);
		String str = "0125489963";
		
		if(!self) {
			
			System.out.print("아무거나 입력 >> ");
			
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
			
			System.out.println("숫자로만 이루어져있나요?" + numbersOnly);
			
		}else {
			
			boolean check = true;
			
			System.out.print("문자를 입력해 주세요 >> ");
			
			str = sc.nextLine();		
			
			sc.close();
		
			for(int i = 0; i < str.length(); ++i) {
			
				if(!(str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
					System.out.println("숫자가 아닌 문자가 있습니다.");
					check = false;
					break;
				}
				
			}
			
			if(check) {
				System.out.println("숫자 입니다.");
			}
		}
		
	}
}
