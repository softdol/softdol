package quiz;

import java.util.Scanner;

public class B01_CelToFahr {
	
	/*
	 *	����ڷκ��� ����(��) �µ��� �Է¹����� ȭ��(��)�� �� ������ 
	 *	�˷��ִ� ���α׷��� ����� ������
	 *	(�µ� ��ȯ ������ ���۸� �� ��)
	 * 
	 * 
	 *  ������ ȭ����
	 * 		: (0��C �� 9/5) + 32 = 32��F
	 */
	public static void main(String[] args) {
		
		System.out.print("����(��)�� �Է��� �ּ��� : ");
		
		double celsius, fahrenheit;
		
		Scanner sc = new Scanner(System.in);
		
		celsius = sc.nextDouble();
		fahrenheit =  (celsius * 9/5) + 32;
		
		System.out.printf( "���� %.1f���� ȭ���� %.1f�� �Դϴ�.", celsius, fahrenheit);
	
		sc.close();
	}

}
