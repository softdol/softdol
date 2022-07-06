package quiz;

import java.util.Scanner;

public class B06_ForQuiz2 {

	/*
	 * 
	 * 사용자로 부터 숫자를 입력 받으면 1부터 해당 숫자 사이에 있는 5의 배수를 모두 출력해 보세요.
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 숫자를 입력해 주세요 >> ");

		int num = sc.nextInt();
		sc.close();

		int trNum = 1;
		int iNum = 1;

		if (num < 0) {
			num = -num;
			trNum = -1;
			iNum = 0;
		}

		for (int i = iNum, cnt = 0; i <= num; ++i) {

			if (i % 5 == 0) {

				System.out.printf("%-6d ", i * trNum);

				if (cnt++ % 7 == 6) {

					System.out.println();

				}

			}

		}

//		}else {
//		
//			for(int cnt = 0; num <= 1 ; ++num) {
//				
//				if( num% 5 == 0)
//				{
//					
//					System.out.printf("%-6d ", num);
//					if( ++cnt % 7 == 0) {	
//						
//						System.out.println();
//						
//					}
//					
//				}	
//				
//			}
//		}

	}

}
