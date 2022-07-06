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
	 * ���ڿ��� �����ϸ� �ش� ���ڿ��� �ڹ��� 
	 * �����μ� ���� �� �ִ��� �Ǻ����ִ� �޼��带 �����غ�����. 
	 */
	
	public static boolean isJavaVar(String word) {
		
		//����� �˻�
		if(keywords.contains(word)) {
			System.out.printf("%s�� ��ϵ� ������̹Ƿ� ������ �� �� �����ϴ�.\n", word);
			return false;
		}
		
		ArrayList<Character> list = new ArrayList<>();
		for(Character ch : word.toCharArray()) {
			list.add(ch);
		}
		
		// ù ���� �˻�
		if(!Character.isJavaIdentifierStart(list.get(0))) {
			System.out.printf("%s�� ù ��° ���ڰ� %c�̹Ƿ� ������ �� �� �����ϴ�.\n", word, list.get(0));
			return false;
		}
		
		for(int i = 0; i < list.size(); i++) {
			char ch = list.get(i);
			
			if(!Character.isJavaIdentifierPart(ch)) {
				System.out.printf("%s�� index %d���� ���ڰ� %c�̹Ƿ� ������ �� �� �����ϴ�.\n", word, i, ch);
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
//		//String a��41 = "111";
//		//System.out.println(a��41);
//		
//		if(name.length() < 1) {
//			System.out.println("�������� 1���� �̻��̾�� �մϴ�.");
//			return;
//		}
//		
//		//������ ù ��° ���ڿ��� ���ڸ� ����� �� ����
//		if(!Character.isJavaIdentifierStart(name.charAt(0))) {
//			System.out.println("ù ��°�� ����� �� ���� �����Դϴ� : [" + name.charAt(0) + "]");
//			return;
//		}
//		
//		Set<String> wordList = new HashSet<>();
//		Collections.addAll(wordList, "byte", "short", "char", "int", "long"
//				, "float", "double", "boolean", "Byte", "Short", "Character"
//				, "Integer", "Long", "Float", "Double", "Boolean");
//		
//		//�̹� �ڹٿ��� ����ϰ� �ִ� Ű����(�����)���� ���������� ����� �� ����
//		if(wordList.contains(name)) {
//			System.out.println("�ڹٿ��� ����ϰ� �ִ� Ű����(�����)���� \n���������� ����� �� �����ϴ�. :"
//					+ " [" + name + "]");
//			return;
//		}
//		
//		char[] arrName = name.toCharArray();
//		for(char ch : arrName) {
//			//������ ���̿��� ������ ����� �� ����
//			if(Character.isSpaceChar(ch)) {
//				System.out.println("������ ���̿��� ������ ����� �� �����ϴ�.");
//				return;
//			}
//			
//			//Ư�����ڴ� _�� $�� ����� �� �ִ�
//			if(!Character.isAlphabetic(ch) && !Character.isDigit(ch) && ch != '_' && ch != '$') {
//				System.out.println("������ ����� �� ���� �����Դϴ� : [" + ch + "]");
//				return;
//			}
//			
//		}
//
//		System.out.println("�ڹ��� ���������� ����� �� �ִ� ���� �Դϴ�. : " + name);
		
	}
	
}
