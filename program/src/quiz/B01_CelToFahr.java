package quiz;

import java.util.Scanner;

public class B01_CelToFahr {
	
	/*
	 *	사용자로부터 섭씨(℃) 온도를 입력받으면 화씨(℉)로 몇 도인지 
	 *	알려주는 프로그램을 만들어 보세요
	 *	(온도 변환 공식은 구글링 할 것)
	 * 
	 * 
	 *  섭씨를 화씨로
	 * 		: (0°C × 9/5) + 32 = 32°F
	 */
	public static void main(String[] args) {
		
		System.out.print("섭씨(℃)를 입력해 주세요 : ");
		
		double celsius, fahrenheit;
		
		Scanner sc = new Scanner(System.in);
		
		celsius = sc.nextDouble();
		fahrenheit =  (celsius * 9/5) + 32;
		
		System.out.printf( "섭씨 %.1f℉는 화씨는 %.1f℉ 입니다.", celsius, fahrenheit);
	
		sc.close();
	}

}
