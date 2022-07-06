
public class A06_Print {

	/*
	 * 	# 콘솔에 출력하는 함수들
	 * 
	 * 	 1. println()
	 * 
	 *		- ()안에 전달한 데이터를 콘솔에 출력하면서 줄을 자동으로 바꿔준다.
	 *
	 *	 2. print()
	 *		
	 *		- ()안에 전달한 데아토를 콘솔에 출력한다
	 * 
	 * 	 3. printf()
	 * 
	 * 		- print format
	 * 		- 서식을 이용해 원하는 출력 형태를미리 만들어 둘 수 있는 함구 
	 * 		- 서식 문자 자리에 값을 순서대로 채워서 사용한다
	 * 		- \n이 자동으로 추가되지 않으므로 주의해야 한다
	 * 
	 * 		※ 서식 문자의 종류https://www.msn.com/ko-kr/feed
	 * 
	 * 			%d : 해당 자리에 전달한 정수값을 10진수로 출력 (decimal)
	 * 			%x : 해당 자리에 전달한 정수값을 16진수로 출력 (hexa devimal 소문자)
	 * 			%X : 해당 자리에 전달한 정수값을 16진수로 출력 (hexa devimal 대문자)
	 * 			%o : 해당 자리에 전달한 정수값을 8진수로 출력
	 * 			%s : 문자열
	 * 			%c : 문자
	 * 			%f : 실수(float, double)
	 * 			%% : %를 출력하고 싶을때
	 * 
	 * 		※ 서식 문자의 옵션
	 * 
	 * 		 - 서식 문자의 %와 문자 사이에 넣어서 사용한다
	 * 
	 *  		1. %숫자d
	 *  		 - 자릿수를 숫자만큼 확보하면서 출력한다
	 *  
	 *  		2. %-숫자d
	 *  		 - 자릿수를 숫자만큼 확보하면서 왼쪽 정렬하여 출력한다
	 *  
	 *  		3. %0숫자d
	 *  		 - 자릿수를 숫자만큼 확보하면서 빈자리에 0 출력한다
	 *  
	 *  		4. %.숫자f
	 *  		 - 실수의 소수점 아래 자릿수를 설정한다
	 */
	public static void main(String[] args) {		
		 
		System.out.printf("%5d\n",1234);
		System.out.printf("%10d\n",1234);
		System.out.printf("%15d\n",1234);
		
		System.out.printf("%-5s : 10\n","score");
		System.out.printf("%-10s : 10\n","score");
		System.out.printf("%-15s : 10\n","score");
		System.out.printf("%-20s : 10\n","score");
		System.out.printf("%-25s : 10\n","score");
		
		System.out.printf("%04d\n",15);
		System.out.printf("%04d\n",3);
		
		System.out.printf("%010.3f\n",123.5555555555);
			
		System.out.println("Hello, world!");
		System.out.print("Hello, world!");
		System.out.println("Hello, world!");
		System.out.printf("오늘은 %d월 %d일 입니다. \n", 4, 30);
		
//		System.out.printf("30(10) : %d\n", 30);
//		System.out.printf("30(16) : %x\n", 30);
//		System.out.printf("30(16) : %X\n", 30);
//		System.out.printf("30(8) : %o\n", 30);
//		System.out.printf("오늘은 %s 입니다. \n", "목요일");
//		System.out.printf("오늘은 %c요일 입니다. \n", '木');		
//		System.out.printf("오늘의 온도: %.3f℃ \n", 27.8f);
//		System.out.printf("오늘의 온도: %.2f℃ \n", 27.8f);
//		System.out.printf("오늘의 온도: %.1f℃ \n", 27.8f);
//		System.out.printf("오늘의 온도: %.0f℃ \n", 27.8f);
		
		int year = 2022, month = 4, date = 13;
		int hour = 14, minute = 24, second = 55;
		
		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일이고, 현재 시간은 "
		+ hour + "시 " + minute + "분 " + second + "초 입니다.");
		System.out.printf("오늘은 %d년 %d월 %d일이고, 현재 시간은 %d시 %d분 %d초 입니다."
				, year, month, date, hour, minute, second);
	}
}



