import java.util.Arrays;

public class D08_String {

	public static void main(String[] args) {
		
		String fruits = "apple/banana/kiwi/grape/orange/watermelon/pineapple";
		
		// split(delim) : 문자열을 원하는 기준으로 자른 문자열 배열을 반환한다
		String[] split = fruits.split("/");
//		String[] split = fruits.split("e");
//		String[] split = fruits.split("an");
		
		System.out.println(Arrays.toString(split));
		
		// String.join(delimiter, CharSequence...) : 뒤에 나열한 문자열을 모두 연결한다		
		// String.join(delimiter, iterable) : 배열(또는 리스트 등)의 모든 문자열을 연결한다
		String join = String.join(",", "tiger", "lion","bear", "hawk", "panda");
		System.out.println(join);
		
		join = String.join("/", split);
		System.out.println(join);
		
		// contains(seq) : 해당 문자열이 포함되어 있는지를 검사한다
		System.out.println("orange ? " + fruits.contains("orange")); 
		System.out.println("peach ? " + fruits.contains("peach"));
		
		// statrsWith(seq) : 해당 문자열로 시작하는지를 검사한다
		String url = "http://www.naver.com";
		
		System.out.println("www로 시작하나요? " + url.startsWith("www"));
		System.out.println("http로 시작하나요? " + url.startsWith("http"));
		System.out.println("https로 시작하나요? " + url.startsWith("https"));
		
		// endsWith(seq) : 해당 문자열로 끝나는지를 검사한다
		String fileName = "screenshot.pdf";
		
		System.out.println(".pdf인가요? " + fileName.endsWith(".pdf"));
		System.out.println(".jpg인가요? " + fileName.endsWith(".jpg"));
		System.out.println(".gif인가요? " + fileName.endsWith(".gif"));
		
		// replace(old, new) : 문자열을 교체한 새로운 문자열을 반환한다
		String email = "billgates@microsoft.com";		
		String replaced = email.replace("microsoft.com", "naver.com");
		System.out.println(replaced);
		
		// substring(start): 문자열을 시작 위치부터 자른 결과를 반환한다		
		// substring(start, end): 문자열 start부터 end미만까지 자른 결과를 반환한다
		System.out.println(email.substring(5));
		System.out.println(email.substring(5, 10));
		
		// toUppercase() : 문자열의 알파벳을 모두 대문자로 변환한 인스턴스를 반환한다
		System.out.println(email.toUpperCase());
		
		// toLowercase() : 문자열의 알파벳을 모두 소문자로 변환한 인스턴스로 반환한다
		System.out.println(email
				.toUpperCase().toLowerCase().toUpperCase().toLowerCase());
		
		char[] arr = email.substring(9).toUpperCase().toCharArray();
		System.out.println(Arrays.toString(arr));
		
		// indexOf(seq) : 원하는 문자열이 몇 번째 인덱스에 있는지 반환한다
		// indexOf(seq, from) : from부터 원하는 문자열을 검색하여 인덱스를 반환한다
		System.out.println("@의 위치 : " + email.indexOf('@'));
		System.out.println("micro의 위치 : " + email.indexOf("micro"));
		
		String test = "apple@naver.com, abs@yahoo.co.kr, ddd@hanmail.net";	
		
		System.out.println(test.indexOf('@', 0));
		System.out.println(test.indexOf('@', 6));
		System.out.println(test.indexOf('@', 21));
		
		// String.format(format, args...) : 원하는 문자열을 서식을 이용해 생성할 수 있다.
		
		
		fruits = "appleapple/banana/kiwi/grape/orange/watermelon/pineapple"
				+ "apple/banana/kiwi/grape/orange/watermelon/pineapple"
				+ "apple/banana/kiwi/grape/orange/watermelon/pineapple"
				+ "apple/banana/kiwi/grape/orange/watermelon/pineapple"
				+ "apple/banana/kiwi/grape/orange/watermelon/pineapple";
		
		// 연습문제: fruits에서 모든 "apple"의 인덱스를 찾아 출력해 보세요.
		int index = -1, i = 0;
		while((index = fruits.indexOf("apple", index + 1)) != -1) {
			System.out.printf("%d번째 apple의 위치: %d\n", i++, index);
		}
		
		int cnt = 1;
		for(int j = 0; j < fruits.length(); j++) {					
			if((j = fruits.indexOf("apple",j)) < 0) {
				break;
			}else {
				System.out.println(cnt++ + "번째 apple : " + j);
			}
		}
		
		
		
		
		
		
		
		
	}
}
