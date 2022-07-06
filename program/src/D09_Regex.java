import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {
	
	/*
	 * 	# 정규표현식 (Regular Expression)
	 * 
	 * 	 - 문자열을 패턴으로 검사할 수 있는 표현식
	 * 	 - 특정 프로그래밍 언어에만 있는 것이 아닌 공통의 규칙이다
	 * 	 - 정의한 정규표현식 패턴과 일치하는 문자열을 걸러낼 수 있다
	 * 
	 * 	# Java의 정규표현식 클래스
	 * 
	 * 	 - Pattern
	 * 	 - Matcher
	 * 
	 */
	
	public static void main(String[] args) {
		
		// Pattern.matches(regex, input) : input이 regex에 해당하는 문자열인지 검사하는 메서드		
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// [] : 해당 위치의 한 글자에 올 수 있는 문자들을 정의하는 표현식
		System.out.println(Pattern.matches("s[lhk]eep", "sleep"));
		System.out.println(Pattern.matches("s[lhk]eep", "sheep"));
		System.out.println(Pattern.matches("s[lhk]eep", "skeep"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "sleep"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "sleek"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "sleepz"));
		
		// \는 정규표현식에서도 특수 문법으로 사용되기 때문에 \\를저겅야 그냥 역슬레시를 의미한다
		System.out.println(Pattern.matches("s[lhk]ee[pkz\\\\]", "slee\\"));
		
		/*
		 * 	[abc] : a 또는 b 또는 c를 모두 허용
		 *  [a-z] : a부터 z까지 모두 허용
		 *  [A-Z] : A부터 Z까지 모두 허용
		 *  [a-e&&c-g] : a-e와 c-g를 모두 만족 시키는 문자를 허용
		 * 
		 */
		
		System.out.println(Pattern.matches("s[c-kC-K \t]eep", "s eep"));
		
		/*
		 * 	# 하나로 여러 문자를 나타내는 것들
		 * 
		 * 	 .  : 모든 문자. [.]은 그냥 점을 나타낸다
		 *   \d : 모든 숫자 
		 * 	 \D : 숫자를 제외한 모든 것
		 * 	 \s : 모든 공백(\t, \n, , \r)
		 * 	 \S : 공백을 제외한 모든 것
		 *   \w : 일반적인 문자들을 허용 [a-zA-Z0-9_]
		 *   \W : \w를 제외한 모든 것을 허용
		 * 
		 */
		
		System.out.println("sleep : " + Pattern.matches("soeep", "s1eep"));
		System.out.println(Pattern.matches("s.eep", "s1eep"));
		System.out.println(Pattern.matches("s.eep", "s$eep"));
		System.out.println(Pattern.matches("s[.]eep", "s.eep"));
		System.out.println(Pattern.matches("\\d\\d\\d", "111"));
		System.out.println(Pattern.matches("\\d\\d\\s\\d", "11 1"));
		System.out.println(Pattern.matches("\\d..", "111"));
		
		/*
		 * 	#해당 패턴이 적용될 문자의 개수를 지정하는 방법
		 * 
		 * 	 .{n} 	: {}앞의 패턴이 n개 일치해야 한다
		 * 	 .{n,m} : {}앞의 패턴이 n개 이상 m개 이하 일치해야 한다 
		 * 	 .{n,}	: {}앞의 패턴이 n개 이상 일치해야 한다
		 * 	 .?		: ? 앞의 패턴이 0번 또는 한번 나와야 한다
		 *   .+		: + 앞의 패턴이 최소 한번 이상 나와야 한다
		 *   .*		: * 앞의 패턴이 0번이상 나와야 한다
		 */
		System.out.println(Pattern.matches("\\d{5}", "11111"));
		System.out.println(Pattern.matches("\\d{2,5}", "12222"));
		System.out.println(Pattern.matches("\\d{2,}", "12222"));
		System.out.println(Pattern.matches("\\d{1,5}", "12222"));
		System.out.println(Pattern.matches("abc[JQK]?", "abc"));
		System.out.println(Pattern.matches("abc[JQK]?", "abcQ"));
		System.out.println(Pattern.matches("abc[JQK]+", "abcQAAA"));
		System.out.println(Pattern.matches("abc[JQK]*", "abcQK"));
		System.out.println(Pattern.matches("abc[JQK]*\\d", "abcQAA12A"));
		System.out.println();
		System.out.println();
		// 연습1: 해당 문자열이 핸드폰 번호인지 검사할 수 있는 정규표현식을 만들어보세요
		// 01087987789
		String pNum = "01384473368";
		System.out.println(Pattern.matches("01[01679]\\d{7,8}", pNum));
		// 연습2: 해당 문자열이 이메일인지 검사할 수 있는 정규표현식을 만들어 보세요
		// softdol@naver.com
		String email = "x@lje.jpohbcom";
		System.out.println(Pattern.matches("[a-zA-Z0-9 ][a-zA-Z0-9 -.]?@[a-zA-Z0-9][a-zA-Z0-9-]{1,20}[a-zA-Z0-9][.][a-zA-Z]{1,10}", email));
		System.out.println(Pattern.matches("\\w+@\\w+\\.[a-zA-Z]+(\\.[a-zA-Z]+)*", email));
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		// Matcher 클래스 사용하기
		String text = "apple/banana/orange/kiwi/pineapple/grape/grapeapple/mango";
		
		//Pattern applePattern = Pattern.compile("\\w+apple");
		// 1. 정규표현식을 컴파일하여 패턴 인스턴스를 생성
		Pattern applePattern = Pattern.compile("(\\w+)(apple)");
		
		// 2. 해당 패턴 인스턴스로 문자열을 검사
		Matcher matchResult =  applePattern.matcher(text);
		
		// 3. 매치 결과를 반복문을 활용해 모두 탐색할 수 있다
		while (matchResult.find()) {
			
			System.out.println("---- Group 0 (전체) ----");
			System.out.println("찾은 것 : " + matchResult.group(0));
			System.out.println("시작 인덱스 : " + matchResult.start(0));
			System.out.println("마지막 인덱스 : " + matchResult.end(0));
			
			System.out.println("---- Group 1 (정규 표현식의 첫 번째 괄호) ----");
			System.out.println("찾은 것 : " + matchResult.group(1));
			System.out.println("시작 인덱스 : " + matchResult.start(1));
			System.out.println("마지막 인덱스 : " + matchResult.end(1));
			
			System.out.println("---- Group 2 (정규 표현식의 두 번째 괄호) ----");
			System.out.println("찾은 것 : " + matchResult.group(2));
			System.out.println("시작 인덱스 : " + matchResult.start(2));
			System.out.println("마지막 인덱스 : " + matchResult.end(2));
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
