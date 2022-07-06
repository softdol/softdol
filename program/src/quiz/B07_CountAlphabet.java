package quiz;

import java.util.Scanner;

public class B07_CountAlphabet {
	
	/*
	 * 	사용자가 문장과 검색하고 싶은 알파벳을 입력하면 
	 * 	해당 알파벳이 몇 회 등장하는지 알려주는 프로그램을 만들어보세요.
	 * 
	 * 	(대/소문자 모두 세어야 합니다.)
	 * 
	 */
	
	public static void main(String[] args){
		
		boolean self = false;
		
		if(!self) {
			
			Scanner sc = new Scanner(System.in);			
			
			String str, query;
			System.out.print("문장을 입력해 주세요 >> ");
			str = sc.nextLine();
			
			System.out.print("알파벳을 입력해 주세요 >> ");
			query = sc.next();
			
			System.out.println("문장 : " + str + ", 검색어: " + query);
			sc.close();
			
			if(query.length() != 1) {
				System.out.println("검색어는 하나만 입력하셔야 합니다.. 프로그램 강제 종료");
				return;
			}
			
			
			//사용자가 검색어로 소문자를 입력했다면 대문자를 q2에 추가하고
			//사용자가 검색어로 대문자를 입력했다면 소문자를 q2에 추가하고
			char q1 = query.charAt(0);
			char q2;
			
			if(q1 >= 'a' && q1 <='z') {
				q2 = (char)(q1 - 32);
			} else if (q1 >= 'A' && q1 <= 'Z') {
				q2 = (char)(q1 + 32);
			} else {
				System.out.println("검색어는 영어만 가능합니다... 프로그램을 종료합니다");
				return;
			}
			
			//System.out.println(Math.abs('A'- 'a'));
			int cnt= 0;
			
			for(int i = 0 ; i < str.length(); ++i) {
				char ch = str.charAt(i);
				
				if(ch == q1 || ch == q2) {
					++cnt;
				}
			}
			
			System.out.printf("%s에서 %c or %c는 %d회 등장합니다. \n", str, q1, q2, cnt);
			
		}else {
			
			String str = "I love strawberry ICECREAM";
			char search1 = ' ';	//소문자
			char search2;		//대문자
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("문장을 입력해 주세요 >> ");
			str = sc.nextLine();
			
			System.out.print("알파벳을 입력해 주세요 >> ");
			//search1 = sc.next(char a);
			search1 = sc.next().charAt(0);
			
			sc.close();
			
			if(search1 >= 97 && search1 <= 122) { //소문자
				search2 =  (char)(search1 - 32);
			}else if(search1 >= 65 && search1 <= 90) {	//대문자
				search2 = search1;
				search1 = (char)(search1 + 32);
			}else {	// 문자 아님
				System.out.println("알파벳이 아닙니다.");
				return;
			}
			
			int cnt = 0;
			
			for(int i = 0; i < str.length(); ++i) {
				char ch = str.charAt(i);
				
				if(ch == search1 || ch == search2) {
					++cnt;
				}
			}
			
			System.out.printf("\"%s\" 에서 \n '%c'또는 '%c'가 등장한 횟수는 %d회 입니다.\n", str, search1, search2, cnt);
			
		}
		
		
		
	}

}
