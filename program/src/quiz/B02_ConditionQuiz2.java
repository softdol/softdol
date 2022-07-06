package quiz;

public class B02_ConditionQuiz2 {
	/*
	 * 	#알맞은 조건식을 만들어보세요
	 * 
	 * 		1. char형 변수 a가 'q'또는 'Q'일 때 true 
	 * 		2. char형 변수 b가 공백이나 탭이 아닐 떄 true
	 * 		3. char형 변수 c가 '0' ~ '9'일 때 true
	 * 		4. char형 변수 d가 영문자{대문자 또는 소문자)일 때 true
	 * 		5. char형 변수 e가 한글일 때 true
	 * 		6. char형 변수 f가 일본어일 때 true
	 * 		7. 사용자가 입력한 문자열이 exit일때 true
	 * 	  
	 */
	public static void main(String[] args) {
		
//		1. char형 변수 a가 'q'또는 'Q'일 때 true
		char a = 'w';
		System.out.println("1번 : " + (a == 'Q' || a == ('Q' + 32)));
		//System.out.println((int)a == 113 || (int)a == 81);
		
//		2. char형 변수 b가 공백이나 탭이 아닐 떄 true
		char b = '4';
		System.out.println("2번 : " + (!(b == 32 || b == 9)));
		
//		3. char형 변수 c가 '0' ~ '9'일 때 true
		char c = '4';
		//System.out.println((int)'z');
		System.out.println("3번 : " + (c >= 48 && c <= 57));
		
//		4. char형 변수 d가 영문자{대문자 또는 소문자)일 때 true
		char d = '1';
		System.out.println("4번 : " + (d >= 65 && d <= 122));
		
//		5. char형 변수 e가 한글일 때 true
		char e = '박';
		System.out.println("5번 : "+ e + " -> " + 
		//((e >= 12592 && e <= 12687) || (e >= 44032 && e <= 50808)));
		((e >= 12592 && e <= 12687) || (e >= 0xAC00 && e <= 0xD7AF)));
		//44032, 50808
//		6. char형 변수 f가 일본어일 때 true
		char f = 'な';	//ひらがな
		System.out.println((int)f);
		System.out.println("6번 : " + f + " -> " +
		((f >= 12352 && f <= 12447) || (f >= 12448 && f <= 12543) || (f >= 12784 && f <= 12799)));
//		System.out.println(Integer.parseInt("3040",16));		
//		System.out.println(Integer.parseInt("309F",16));
//		
//		System.out.println(Integer.parseInt("30A0",16));
//		System.out.println(Integer.parseInt("30FF",16));
//		
//		System.out.println(Integer.parseInt("31F0",16));
//		System.out.println(Integer.parseInt("31FF",16));
		//System.out.println(e >= 12592 && e <= 12687);
		
//	 	7. 사용자가 입력한 문자열이 exit일때 true
//		Scanner sc = new Scanner(System.in);
//				
//		System.out.print("exit를 입력하세요 > ");
//		String str = sc.next();
//		System.out.println("7번 : " + str.equals("exit"));
		
		String str2 = "...bat..y.abcdefghijklm";
		str2 = str2.replace("..", ".");
		str2 = str2.replace("..", ".");
		
		System.out.println(str2.charAt(0));
		if (str2.charAt(0) == '.') {
			str2 = str2.replaceFirst(".","");
		}
		str2 = str2.substring(0,16);
		System.out.println(str2);
				
	}
}

