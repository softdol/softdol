
public class B02_Operator2 {
	
	/*
	 * 	# 비교 연산자
	 * 		
	 * 		- 두 값을 비교하는 연산
	 * 		- 비교 연산의 결과는 항상 참(true) 또는(false) 거짓이다.
	 * 		  (비교 연산의 결과는 boolean 타입이다)
	 * 		- 산술 연산과 비교 연산이 함께 있으면 산술 연산을 먼저 계산한다
	 * 
	 * 	# 논리 연산자
	 * 
	 * 		- boolean 타입 값으로 하는 연산
	 * 		- && : 두 값이 모두 true일때 true (AND 연산)
	 * 		- || : 둘 중 하나만 true여도 true (OR 연산)
	 * 		- ! : true면 false, false면 true (NOT 연산)
	 */
	
	public static void main(String[] args) {
		
		int a = 10, b = 7;
		
		char ch1 = 'A', ch2 = 'K';
		
		System.out.println(a > b);	// > : 왼쪽이 크면 true
		System.out.println(a < b);	// < : 오른쪽이 크면 true
		System.out.println(a >= b);	// >= : 왼쪽이 크거나 같으면 true
		System.out.println(a <= b);	// <= : 오른쪽이 크거나 같으면 true
		System.out.println(a == b);	// <= : 두 값이 같으면 true
		System.out.println(a != b);	// <= : 두값이 다르면 true
		
		System.out.println(a + 5 == 15);
		System.out.println(a % 3 != 0);
		
		System.out.println(ch1 < ch2);
		
		System.out.println("#### AND ####");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);
		
		System.out.println("#### OR ####");
		//System.out.println(true || true);
		//System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("#### NOT ####");
		System.out.println(!true);
		System.out.println(!false);
		
		a = 95;
		
		System.out.println(a < 100 && a % 5 == 0);
		
	}

}



