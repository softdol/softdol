
public class B01_Operator1 {
	
	/*
	 * 	# 연산자(Operator)
	 * 
	 * 		- 계산할 때 사용하는 것 
	 * 		- +, -, *, /, <, >, >=, <=, ...
	 * 
	 * 	# 산술 연산자
	 * 
	 * 		+ : 더하기 
	 * 		- : 빼기
	 * 		* : 곱하기
	 * 		/ : 나누기
	 * 		% : 나머지
	 * 
	 * 	# 논리 연산자
	 * 
	 * 		
	 */
	
	public static void main(String[] args) {
		
		int a = 33, b = 8;
		double c = 33, d = 8;
		
		System.out.println("a + b : " + (a + b));
		System.out.println("a - b : " + (a - b));
		System.out.println("a * b : " + a * b);
		
		// 정수와 정수를 나누면 몫만 구한다
		System.out.println("a / b : " + a / b);
		
		// 정수와 실수를 나누면 정확한 값을 구한다
		System.out.println("c / b : " + c / b);
		System.out.println("a / d : " + a / d);
		System.out.println("c / d : " + c / d);
		
		// 나머지 연산
		System.out.println("a % b : " + a % b);
		
		// n으로 나눈 나머지는 0부터 n-1까지 밖에 나올 수 없다
		System.out.println("19 % 10 : " + 19 % 10);
		System.out.println("20 % 10 : " + 20 % 10);
		System.out.println("21 % 10 : " + 21 % 10);
		System.out.println("22 % 10 : " + 22 % 10);
		
		// Matr.pow(a,b) : a제곱 b를 반환한다
		System.out.println("2 ^ 10 : " + Math.pow(2, 10));
		//System.out.println("2 ^ 10 : " + 2 ^ 10);	// XOR 연산
		
		// Matr.sqrt(a) : a의 제곱근을 구해서 반환한다
		System.out.println("2의 제곱근 : " + Math.sqrt(2));
		
		// Matr.abs(a) : a의 절대값을 반환한다
		System.out.println("-2의 절대값 : " + Math.abs(-2));
		
		// Matr.round(a) : a를 소수 첫째 자리에서 반올림한 결과를 반환한다
		double result = Math.round(123.555);
		System.out.println(result);
		
		// Matr.round()로 원하는 자릿수에서 반올림하기
		//	- 반올림하고 싶은 자리를 소수 첫번째 자리로 만든 후 다시 나눈다
		double value = 123.7777777777;
		
		value = Math.round(value*10000) / 10000.0;
		
		System.out.println(value);
	}

}

