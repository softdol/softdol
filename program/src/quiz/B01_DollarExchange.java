package quiz;

import java.util.Scanner;

//import java.text.DecimalFormat;


public class B01_DollarExchange {
	
	/*
	 * 	�޷��� �Է� ������ �ѱ������� ������ �˷��ִ� ���α׷��� ����� ������.
	 * 	(ȯ���� ���۸� �ϼ���) 
	 * 
	 * 	ȯ�� 1223.66 ��
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double dollar, won, hwan = 1223.66;
		
		System.out.print("�޷��� �Է��ϼ��� : ");
		
		dollar = sc.nextDouble();
		won = dollar * hwan;
		
		System.out.printf("[ȯ�� : %.2f]\n", hwan);
		System.out.printf("%.0f �޷��� %.2f �� �Դϴ�. ", dollar, won);
		
		sc.close();
		
//		DecimalFormat df = new DecimalFormat("###,###.##");
//		String money = df.format(won);
//		System.out.printf("\n%.0f �޷��� %s �� �Դϴ�. ", dollar, money);
		
	}

}
