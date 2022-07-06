package quiz;

import java.util.ArrayList;
import java.util.HashSet;

public class D04_IsJavaVariable {
	
	public static HashSet<String> keywords = new HashSet<>();
	
	static {
		keywords.add("int");
		keywords.add("assert");
		keywords.add("break");
		keywords.add("continue");
		keywords.add("byte");
		keywords.add("switch");
		keywords.add("case");
		keywords.add("if");
		keywords.add("public");
	}
	/*
	 * 문자열을 전달하면 해당 문자열이 자바의 
	 * 변수로서 사용될 수 있는지 판별해주는 메서드를 정의해보세요. 
	 */
	
	public static boolean isJavaVar(String word) {
		
		//예약어 검사
		if(keywords.contains(word)) {
			System.out.printf("%s는 등록된 예약어이므로 변수가 될 수 없습니다.\n", word);
			return false;
		}
		
		ArrayList<Character> list = new ArrayList<>();
		for(Character ch : word.toCharArray()) {
			list.add(ch);
		}
		
		// 첫 글자 검사
		if(!Character.isJavaIdentifierStart(list.get(0))) {
			System.out.printf("%s는 첫 번째 글자가 %c이므로 변수가 될 수 없습니다.\n", word, list.get(0));
			return false;
		}
		
		for(int i = 0; i < list.size(); i++) {
			char ch = list.get(i);
			
			if(!Character.isJavaIdentifierPart(ch)) {
				System.out.printf("%s는 index %d번의 글자가 %c이므로 변수가 될 수 없습니다.\n", word, i, ch);
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		isJavaVar("sdf#1234");
		//isJavaVar("1sdf1234");
		
//		String name = "dou0ble";
//		String do0uble = "";
//		//String aㅁ41 = "111";
//		//System.out.println(aㅁ41);
//		
//		if(name.length() < 1) {
//			System.out.println("변수명은 1글자 이상이어야 합니다.");
//			return;
//		}
//		
//		//변수의 첫 번째 글자에는 숫자를 사용할 수 없다
//		if(!Character.isJavaIdentifierStart(name.charAt(0))) {
//			System.out.println("첫 번째로 사용할 수 없는 문자입니다 : [" + name.charAt(0) + "]");
//			return;
//		}
//		
//		Set<String> wordList = new HashSet<>();
//		Collections.addAll(wordList, "byte", "short", "char", "int", "long"
//				, "float", "double", "boolean", "Byte", "Short", "Character"
//				, "Integer", "Long", "Float", "Double", "Boolean");
//		
//		//이미 자바에서 사용하고 있는 키워드(예약어)들은 변수명으로 사용할 수 없다
//		if(wordList.contains(name)) {
//			System.out.println("자바에서 사용하고 있는 키워드(예약어)들은 \n변수명으로 사용할 수 없습니다. :"
//					+ " [" + name + "]");
//			return;
//		}
//		
//		char[] arrName = name.toCharArray();
//		for(char ch : arrName) {
//			//변수명 사이에는 공백을 사용할 수 없다
//			if(Character.isSpaceChar(ch)) {
//				System.out.println("변수명 사이에는 공백을 사용할 수 없습니다.");
//				return;
//			}
//			
//			//특수문자는 _와 $만 사용할 수 있다
//			if(!Character.isAlphabetic(ch) && !Character.isDigit(ch) && ch != '_' && ch != '$') {
//				System.out.println("변수명 사용할 수 없는 문자입니다 : [" + ch + "]");
//				return;
//			}
//			
//		}
//
//		System.out.println("자바의 변수명으로 사용할 수 있는 문자 입니다. : " + name);
		
	}
	
}
