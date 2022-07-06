package quiz;

import java.util.Scanner;

public class B03_AppleQuiz {
	/*
	 * 	사과를 10개씩 담을 수 있는 바구니가 있다.
	 * 	사용자가 사과의 개수를 입력하면 사과를 모두 담기 위해 필요한
	 * 	바구니의 개수를 알려주는 프로그램을 만들어 보세요.
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int BASKET_SIZE = 10;	//상수
		
		System.out.print("사과를 개수를 입력해 주세요 >>");
		
		int apple = sc.nextInt();
		int basket = 0;
		
		sc.close();
		
		if (apple < 0) {
			System.out.printf("사과의 개수가 이상합니다.\n", basket);
			//apple = 0;
		}else {		
			if (apple % 10 == 0) {
				basket = apple / BASKET_SIZE; 
			}else {
				basket = apple / BASKET_SIZE + 1;
			}
		}
			
		System.out.printf("필요한 바구니의 수는 [%d] 입니다.\n", basket);
		
		
		
		//System.out.println(answer);
		//answer.replace(/[`~!@#$%^&*()|+\=?;:'"<>\{\}\[\]\\\/ ]/g,'');
	}
}
