package quiz;

import java.util.Scanner;

//import java.text.DecimalFormat;


public class B01_DollarExchange {
	
	/*
	 * 	달러를 입력 받으면 한국돈으로 얼마인지 알려주는 프로그램을 만들어 보세요.
	 * 	(환율은 구글링 하세요) 
	 * 
	 * 	환율 1223.66 원
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double dollar, won, hwan = 1223.66;
		
		System.out.print("달러를 입력하세요 : ");
		
		dollar = sc.nextDouble();
		won = dollar * hwan;
		
		System.out.printf("[환율 : %.2f]\n", hwan);
		System.out.printf("%.0f 달러는 %.2f 원 입니다. ", dollar, won);
		
		sc.close();
		
//		DecimalFormat df = new DecimalFormat("###,###.##");
//		String money = df.format(won);
//		System.out.printf("\n%.0f 달러는 %s 원 입니다. ", dollar, money);
		
	}

}
