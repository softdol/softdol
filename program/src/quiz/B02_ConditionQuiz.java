package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz {
	/*
	 * 	# 알맞은 비교 연산을 만들어 보세요
	 * 
	 * 	1. int형 변수 a가 10보다 크고 20보다 작을 때 true
	 * 	2. int형 변수 b가 짝수일 때 true
	 *  3. int형 변수 c가 7의 배수일때 true
	 * 	4. int형 변수 hour가 0미만 24이상이 아니고,  12이상일 떄 true
	 * 	5. int형 변수 d와 edml 차이가 30일때 true
	 * 	6. int형 변수 year가 400으로 나누어 떨어지거나 또는 4로
	 * 		나누어 떨어지고 100으로 나누어 떨어지지 않을때 true
	 * 	7. 민수가 철수보다 생일이 3달 빠르면 true
	 * 	8. boolean형 변수 powerOn이 false일때 true
	 * 	9. 문자열 참조변수 str이  "yes"일떄 true
	 */
	
	public static void main(String[] args) {
		
//		1. int형 변수 a가 10보다 크고 20보다 작을 때 true		
		int a = 10;
		System.out.println("1번 : " + (a > 10 && a < 20));
		
//	  	2. int형 변수 b가 짝수일 때 true		
		int b = 30;
		System.out.println("2번 : " + (b % 2 == 0));
		
//		3. int형 변수 c가 7의 배수일때 true		
		int c = 17;
		System.out.println("3번 : " + (c % 7 == 0));
		
//		4. int형 변수 hour가 0미만 24이상이 아니고,  12이상일 떄 true		?????
		int hour = 12;
		//System.out.println("4번 : " + ( (hour >= 0 && hour < 24) || (hour >= 0 && hour >= 12)));

		System.out.println("4번 : " + (!(hour < 0 && hour >=24) && hour >= 12));
		
		// 시간은 0 이상 24 미만이고 12이상일 때
		//System.out.println("4번 : " + (hour >= 0 && hour < 24 && hour >= 12));
		
		//System.out.println("4번 : " + (!(hour < 0)));
		//System.out.println("4번 : " + (hour <= 24));
		//System.out.println("4번 : " + (hour >= 12));
		
//		5. int형 변수 d와 e의 차이가 30일때 true
		int d = -5, e = 25;
		System.out.println("5번 : " + (d - e == 30 || d - e == -30));		
		
//		6. int형 변수 year가 400으로 나누어 떨어지거나 또는 4로
//			나누어 떨어지고 100으로 나누어 떨어지지 않을때 true
		int year = 404;
		System.out.println("6번 : " + (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)));
		
//		7. 민수가 철수보다 생일이 3달 빠르면 true
		int minBmon = 10;
		int chulBmon = 1;
		System.out.println("7번 : " + (minBmon - chulBmon == 9 || minBmon - chulBmon == -3 ));
		System.out.println("**7번 : " + ((minBmon + 3) % 12 == chulBmon));
		
//		8. boolean형 변수 powerOn이 false일때 true
		boolean powerOn = true; 
		System.out.println("8번 : " + (powerOn == false));
		
//		9. 문자열 참조변수 str이  "yes"일떄 true
		Scanner sc = new Scanner(System.in);
		
		String str = "yes";
		String str2;
		
		System.out.print("yes를 입력하세요 > ");
		str2 = sc.next();
		sc.close();
		System.out.println("9번 : " + (str == "yes"));
		System.out.println("9번 : " + (str2 == "yes"));
		
		// # 참조형 변수는 == 으로 비교하면 안된다
		// 실제 값을 통한 비교(가지고 있는 실제 값이 같은지 비교)
		// 실제 값이 동일한지 비교할때는 해당 참조형 변수에 딸려있는 equals()를 사용한다
		System.out.println("9번 : " + str2.equals("yes"));
	}

}

