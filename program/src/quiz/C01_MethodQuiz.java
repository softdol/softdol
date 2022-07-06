package quiz;

import java.util.Arrays;

public class C01_MethodQuiz {	
	
	public static void main(String[] args) {
		
		char ch = 'A';
		int num = 3;
		
		System.out.printf("전달 문자(%c)가 알파벳이면 : %b\n",ch, alphabet(ch));		
		
		System.out.println();
		
		num = 100;
		
		System.out.printf("전달 숫자(%d)가 3의 배수면 : %b\n", num , drainage(3));
		System.out.println();
		
		System.out.printf("전달 숫자(%d)가 %s\n" ,num, even(num) );
		System.out.println();
		
		System.out.printf("전달 숫자(%d)의 모든 약수 : %s\n",num , Arrays.toString(arrayNum(num)));
		System.out.println();
		
		num = 49;		
		System.out.printf("전달 정수(%d)가 소수인가요? %b\n", num, decimal(num));
		System.out.println();
		
		num = 5;
		System.out.printf("전달 정수(%d)의 팩토리얼 값 : " + factorial(num) + "\n", num );
		
		num = 4;
		System.out.printf("전달 정수(%d)의 팩토리얼 값 : " + refac(num), num );
	}
	
	/*
	 * 	# 재귀 (recursive)
	 * 
	 * 		 - 자기 자신을 불러서 사용하는 함수
	 * 		 - 탈출구를 만들어 놓지 않으면 계속해서 호출하다가 스택오버플로우를 일으킨다
	 * 		 - 성능은 일반 함수에 비해 떨어지지만 반드시 필요한 경우가 존재한다 
	 * 
	 * 		 ※ 스택오버플로우 : 한번에 너무 많은 함수를 호출해서 발생하는 에러
	 * 
	 */
	
	public static int refac(int num) {
		
		if(num == 1){
			return 1;
		}else {
			return num * refac(num -1);
		}
		
	}
	
	// 6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	//	factorial : (n) * (n -1) * (n-2) ... 3 * 2 * 1
	public static long factorial(int a) {
		long sum = 1;
		
//		while(a > 0) {
//			sum *= (long)a;
//			--a;
//		}	
		
		for(int i = a ;  i > 1; --i) {
			sum *= (long)i;
		}
		
		return sum;		
	}
	
	
	// 5. 전달한 정수가 소수라면 true를 반환하고 아니면 false를 반환하는 함수
	public static boolean decimal(int a) {

		boolean chk = true;
		
		for(int i = 2 ; i <= Math.sqrt(a) ; i ++) {			
			if(a % i == 0) {
				//chk = false;
				//break;
				return false;
			}
		}
		
		return chk;
	}
	
	// 4.숫자를 전달하면 해당 숫자의 모든 약수를 배열 형대로 반환하는 함수
	public static int[] arrayNum(int a) {		
		int idxCnt = 0;
		
//		for(int i = 1 ; i <= a ; ++i) {
//			idxCnt = a % i == 0 ? idxCnt + 1 : idxCnt; 
//		}
		
		// 1이랑 자기 자신은 제외
		for(int i = 2 ; i < a ; ++i) {
			idxCnt = a % i == 0 ? idxCnt + 1 : idxCnt; 
		}
		
		idxCnt += 2;
		
		int[] list = new int[idxCnt];
		
		int arrIdx = 0;
		
		for(int i = 1 ; i <= a / 2 ; ++i) {
			if(a % i == 0) {
				list[arrIdx] = i;
				++arrIdx;
			} 
		}

		list[idxCnt-1] = a;
				
		return list;
	}
	
	// 3.숫자를 하나 전달하면 문자열 짝수입니다. 또는 홀수입니다를 반환하는 함수
	public static String even(int a) {		
		return a % 2 == 0 ? "짝수입니다" : "홀수입니다";
	}
	
	// 2. 전달한 숫자가  3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	public static boolean drainage(int a) {		
		return a % 3 == 0 ;
	}
	
	// 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 false를 반환하는 함수
	public static boolean alphabet(char ch) {		
		return ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z';
	}

}

