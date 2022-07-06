
public class A02_ASCII {
	/*
	 * 	# ASCII 코드
	 * 
	 * 	 - 숫자 0 ~ 127 까지 대응하는 문자를 ASCII 코드라고 한다
	 * 	 - 65 : 'A'
	 * 	 - 97 : 'a'
	 * 	 - 48 : '0'
	 */
	public static void main(String[] args) {
		/*
		 * 	모든 데이터는 실제로 0과 1로 변환되어 저장된다
		 * 	문자는 바로 0과 1로 변환할 수 없기 때문에 문자에 해당하는 숫자값이 존재한다.
		 * 
		 * 	그 값들 중 0 ~ 127번 까지를 ASCII 코드라고 한다.
		 * 
		 * 	10	----encoding---->	1010	
		 * 	A	->	65	----encoding---->	0100 0001
		 *	A	->	65	<----decoding----	0100 0001
		 * 	Z	->	90
		 * 	a	->	97
		 * 	z	->	122
		 * 	0	->	48
		 */
		
		System.out.println("ABCDEFG!!");
		System.out.println('0');	//	문자 0 - 실제로는 48이라는 값을 가지고 있음
		System.out.println(0);		//	숫자 0 - 실제로 0
		
		//	문자 타입 리터럴의 실제 값을 보고 싶다면 앞에 (int)를 붙인다
		System.out.println((int)'0');
		System.out.println((int)'A');
		
		//	문자 타입 리터럴의 문자 형태를 보고 싶다면 앞에 (char)를 붙인다
		System.out.println((char)97);
		System.out.println((char)122);
		
		//	문자 타입 리터럴도 실제로는 숫자값(코드값)을 갖고 있기 때문에 계산이 가능하다		
		System.out.println('A' + 100);	//결과는 기본적으로 숫자다
		System.out.println((char)('A' + 20));	// A로부터 20번 뒤에 있는 문자를 찾는 방법
		System.out.println((char)('Z' - 13));	// Z로부터 13번 앞에 있는 문자를 찾는 방법
		System.out.println('A' - 'a');	//	대문자와 소문자의 거리
		System.out.println((char)('k' + ('A' - 'a')));
		System.out.println((char)('k' - 32));
		System.out.println('L' - 'A');	//	몇 번쩨 알파벳인지 알아낼 수 있음
		
		//문자열은 문자가 여러게 저장될 수 있는 타입이기 때문에 숫자코드로 변환할 수 없다
		System.out.println("A" + 10);	//결과는 기본적으로 숫자다
		System.out.println("ABCD1234" + 10);	//결과는 기본적으로 숫자다
		
		String sVal = "ABCD";
		System.out.println(sVal.length());
		
		
		
	}
}
