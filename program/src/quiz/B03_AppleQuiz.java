package quiz;

import java.util.Scanner;

public class B03_AppleQuiz {
	/*
	 * 	����� 10���� ���� �� �ִ� �ٱ��ϰ� �ִ�.
	 * 	����ڰ� ����� ������ �Է��ϸ� ����� ��� ��� ���� �ʿ���
	 * 	�ٱ����� ������ �˷��ִ� ���α׷��� ����� ������.
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int BASKET_SIZE = 10;	//���
		
		System.out.print("����� ������ �Է��� �ּ��� >>");
		
		int apple = sc.nextInt();
		int basket = 0;
		
		sc.close();
		
		if (apple < 0) {
			System.out.printf("����� ������ �̻��մϴ�.\n", basket);
			//apple = 0;
		}else {		
			if (apple % 10 == 0) {
				basket = apple / BASKET_SIZE; 
			}else {
				basket = apple / BASKET_SIZE + 1;
			}
		}
			
		System.out.printf("�ʿ��� �ٱ����� ���� [%d] �Դϴ�.\n", basket);
		
		
		
		//System.out.println(answer);
		//answer.replace(/[`~!@#$%^&*()|+\=?;:'"<>\{\}\[\]\\\/ ]/g,'');
	}
}
