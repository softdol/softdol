package quiz;

import java.util.Scanner;

public class B06_ForQuiz2 {

	/*
	 * 
	 * ����ڷ� ���� ���ڸ� �Է� ������ 1���� �ش� ���� ���̿� �ִ� 5�� ����� ��� ����� ������.
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� ���ڸ� �Է��� �ּ��� >> ");

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
