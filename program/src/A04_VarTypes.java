
public class A04_VarTypes {
	
	/*
	 * 	# 정수 타입
	 * 
	 * 	 - byte		(1byte)	: -128 ~ 127(2^8)
	 * 		0000 0000 : 0
	 *		0111 1111 : 127 
	 * 	 - short	(2byte) : -32768 ~ 32767(2^16)
	 * 		0000 0000 0000 0000 : 0
	 * 		...
	 * 		0111 1111 1111 1111 : 32767
	 * 		1000 0000 0000 0000 : -32768
	 * 		...
	 * 		1111 1111 1111 1111 : -1
	 * 		0000 0000 0000 0000 : 0
	 * 
	 * 	 - char		(2byte, 부호비트 없음) : 0 ~ 65535 까지 표현, 문자 코드를 저장할 때 사용하는 타입이다.
	 * 
	 * 	 - int		(4byte)	: 약43억개의 정수(2^32)
	 * 
	 * 		0000 0000 0000 0000 0000 0000 0000 0000
	 * 
	 * 	 - long		(8byte) : 아주 많은 정수(2^64)
	 * 
	 * 		0000 0000 0000 0000 0000 0000 0000 0000
	 * 		0000 0000 0000 0000 0000 0000 0000 0000
	 * 
	 *  # 실수 타입
	 *  
	 *   - float	(4byte)
	 *   - double	(8byte) 
	 *  
	 *  # 참/거짓 타입
	 *  
	 *   - boolean	(1bit)
	 *  
	 *  # 참조형 타입 (클래스)
	 *  
	 *   - String
	 *   - 그 외 대문자로 시작하는 모든 타입
	 */
	
	public static void main(String[] args) {
		
		// 각 타입의 크기에 따라 최소 최대 값이 정해져 있다
		//byte b1, b2, b3;
		//short s1, s2, s3;
		char c1, c2;
		
		//b1 = 127;
		//b2 = -128;
		//b3 = -129;	//에러
		
		//s1 = 32767;
		//s2 = -32768;
		//s3 = 32768;	//에러
		
		//char 타입에는 정수값을 저장하지만 출력할때는 문자로 출력한다
		c1 = 65;
		c2 = 'a';
		System.out.println(c1);
		System.out.println();
		System.out.println((int)c2 + " --> " + c2);
		
		
		//그냥 소수는 기본적으로 double타입 리터럴이기 때문에 F를 붙여야 float타입 리터럴이 된다
		//double은 8byte고 float은 4byte이기 때문에 8byte값을 4byte에 넣으려고 할때 에러가 발생한다
		//float f1 = 123.1234f;
		//float f1 = 123.1234;	//에러
		//double d1 = 123.1234;
		
		// 그냥 정수는 기본적으로 int타입 리터럴이기 때문에 뒤에 L을 불텨야 long타입 리터럴이 된다.
		// int의 범위를 벗어나는 아주 크거나 아주 작은 리터럴을 사용하고 싶을때는 L을 붙여야 한다.
		//int i1 = 1_000_000_000;
		//long l1 = 100_000_000_000_000_000L;
		
		// boolean 타입 변수에는 true/false만 저장할 수 있다.
		//boolean programer = true;
		//boolean ateLunch = false;
		//boolean wearGlasses = true;
		
		String message = "환영합니다.";
		System.out.println(message);
	}

}
