
public class A05_VarNaming {

	/*
	 *	# 우리가 변수를 사용하는 이유 
	 *
	 * 	 1. 값을 한번에 변경할 수 있다(여러번 사용할 값을 미리 저장해두고 재사용 할 수 있다)
	 * 	 2. 가독성을 높일 수 있다
	 * 
	 * 	# 변수의 작명 규칙(권장)
	 * 
	 *	 1. 두 단어 이상을 이어붙인 변수명을 사용할 때 _를 활용한다.(snake_case)
	 *		ex> apple_price, apple_width, fav_movie, ...
	 *
	 *	 2. 두 단어 이상을 이어붙인 변수명을 사용할 때 대문자를 활용한다.(camelCase)
	 *		ex> applePrice, appleWidth, favMovie, ...
	 *
	 *	 3. 변수명의 첫 글자는 소문자를 사용한다
	 *	 4. 특정 유명한 값이나 프로그램 내에서 변하지 않을 값들은 모두 대문자를 사용한다
	 *		ex> MAX_APPLE_COUNT, MAX_PURCHASE_QTY, PI, ...
	 *
	 * 	 5. 클래스명은 첫 글자는 대문자를 사용한다
	 * 
	 * 	 6. 페키지명은 모두 소문자를 사용한다
	 * 
	 * 	 7. 해당 변수의 목적을 쉽게 파악할 수 있는 단어를 변수명으로 사용해야 한다
	 * 
	 * 	# 변수의 작명 규칙(필수)
	 *	 1. 변수의 첫 번째 글자에는 숫자를 사용할 수 없다
	 *		ex> 4pple, 1st, ...
	 *
	 *	 2. 변수명 사이에는 공백을 사용할 수 없다
	 *
	 *	 3. 특수문자는 _와 $만 사용할 수 있다 
	 *		ex> $_apple, $uperman, ...
	 *
	 *	 4. 이미 자바에서 사용하고 있는 키워드(예약어)들은 변수명으로 사용할 수 없다
	 *		(Eclipse에서는 예약어들을 보라색으로 표시해준다
	 *		ex> public, static, void, ...
	 *
	 *
	 */
	public static void main(String[] args) {
		
		int apple = 11, apple_price = 567;
		double apple_weight = 123.33;
		
		System.out.println("사과의 개수 : " + apple); 
		System.out.println("사과의 총 가격(￦) : " + apple * apple_price + "원");
		System.out.println("사과의 총 무게(g) : " + apple * apple_weight);
		
	}
	
}
