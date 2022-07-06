package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E01_InputRightThing {
	
	/*
	 * 	사용자로부터 숫자를 입력받되 숫자를 제대로 입력받을때까지 계속 입력받는 프로그램을 만들어 보세요
	 * 
	 */
	public static int inputInt() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("숫자를 입력해주세요 >> ");		
				return sc.nextInt();				
			}catch (InputMismatchException e) {
				sc.nextLine();	// 스캐너에 남아있던 잘못 입력된 단어를 버려줘야 한다
			}
			sc.close();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		int a = inputInt();
		int b = inputInt();
		
		System.out.println(a + " : " + b );
		
		//int c = inputInt();
		
	}
}
