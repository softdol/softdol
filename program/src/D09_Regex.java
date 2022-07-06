import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D09_Regex {
	
	/*
	 * 	# ����ǥ���� (Regular Expression)
	 * 
	 * 	 - ���ڿ��� �������� �˻��� �� �ִ� ǥ����
	 * 	 - Ư�� ���α׷��� ���� �ִ� ���� �ƴ� ������ ��Ģ�̴�
	 * 	 - ������ ����ǥ���� ���ϰ� ��ġ�ϴ� ���ڿ��� �ɷ��� �� �ִ�
	 * 
	 * 	# Java�� ����ǥ���� Ŭ����
	 * 
	 * 	 - Pattern
	 * 	 - Matcher
	 * 
	 */
	
	public static void main(String[] args) {
		
		// Pattern.matches(regex, input) : input�� regex�� �ش��ϴ� ���ڿ����� �˻��ϴ� �޼���		
		System.out.println(Pattern.matches("sleep", "sleep"));
		
		// [] : �ش� ��ġ�� �� ���ڿ� �� �� �ִ� ���ڵ��� �����ϴ� ǥ����
		System.out.println(Pattern.matches("s[lhk]eep", "sleep"));
		System.out.println(Pattern.matches("s[lhk]eep", "sheep"));
		System.out.println(Pattern.matches("s[lhk]eep", "skeep"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "sleep"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "sleek"));
		System.out.println(Pattern.matches("s[lhk]ee[pkz]", "sleepz"));
		
		// \�� ����ǥ���Ŀ����� Ư�� �������� ���Ǳ� ������ \\�����Ͼ� �׳� �������ø� �ǹ��Ѵ�
		System.out.println(Pattern.matches("s[lhk]ee[pkz\\\\]", "slee\\"));
		
		/*
		 * 	[abc] : a �Ǵ� b �Ǵ� c�� ��� ���
		 *  [a-z] : a���� z���� ��� ���
		 *  [A-Z] : A���� Z���� ��� ���
		 *  [a-e&&c-g] : a-e�� c-g�� ��� ���� ��Ű�� ���ڸ� ���
		 * 
		 */
		
		System.out.println(Pattern.matches("s[c-kC-K \t]eep", "s eep"));
		
		/*
		 * 	# �ϳ��� ���� ���ڸ� ��Ÿ���� �͵�
		 * 
		 * 	 .  : ��� ����. [.]�� �׳� ���� ��Ÿ����
		 *   \d : ��� ���� 
		 * 	 \D : ���ڸ� ������ ��� ��
		 * 	 \s : ��� ����(\t, \n, , \r)
		 * 	 \S : ������ ������ ��� ��
		 *   \w : �Ϲ����� ���ڵ��� ��� [a-zA-Z0-9_]
		 *   \W : \w�� ������ ��� ���� ���
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
		 * 	#�ش� ������ ����� ������ ������ �����ϴ� ���
		 * 
		 * 	 .{n} 	: {}���� ������ n�� ��ġ�ؾ� �Ѵ�
		 * 	 .{n,m} : {}���� ������ n�� �̻� m�� ���� ��ġ�ؾ� �Ѵ� 
		 * 	 .{n,}	: {}���� ������ n�� �̻� ��ġ�ؾ� �Ѵ�
		 * 	 .?		: ? ���� ������ 0�� �Ǵ� �ѹ� ���;� �Ѵ�
		 *   .+		: + ���� ������ �ּ� �ѹ� �̻� ���;� �Ѵ�
		 *   .*		: * ���� ������ 0���̻� ���;� �Ѵ�
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
		// ����1: �ش� ���ڿ��� �ڵ��� ��ȣ���� �˻��� �� �ִ� ����ǥ������ ��������
		// 01087987789
		String pNum = "01384473368";
		System.out.println(Pattern.matches("01[01679]\\d{7,8}", pNum));
		// ����2: �ش� ���ڿ��� �̸������� �˻��� �� �ִ� ����ǥ������ ����� ������
		// softdol@naver.com
		String email = "x@lje.jpohbcom";
		System.out.println(Pattern.matches("[a-zA-Z0-9 ][a-zA-Z0-9 -.]?@[a-zA-Z0-9][a-zA-Z0-9-]{1,20}[a-zA-Z0-9][.][a-zA-Z]{1,10}", email));
		System.out.println(Pattern.matches("\\w+@\\w+\\.[a-zA-Z]+(\\.[a-zA-Z]+)*", email));
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		// Matcher Ŭ���� ����ϱ�
		String text = "apple/banana/orange/kiwi/pineapple/grape/grapeapple/mango";
		
		//Pattern applePattern = Pattern.compile("\\w+apple");
		// 1. ����ǥ������ �������Ͽ� ���� �ν��Ͻ��� ����
		Pattern applePattern = Pattern.compile("(\\w+)(apple)");
		
		// 2. �ش� ���� �ν��Ͻ��� ���ڿ��� �˻�
		Matcher matchResult =  applePattern.matcher(text);
		
		// 3. ��ġ ����� �ݺ����� Ȱ���� ��� Ž���� �� �ִ�
		while (matchResult.find()) {
			
			System.out.println("---- Group 0 (��ü) ----");
			System.out.println("ã�� �� : " + matchResult.group(0));
			System.out.println("���� �ε��� : " + matchResult.start(0));
			System.out.println("������ �ε��� : " + matchResult.end(0));
			
			System.out.println("---- Group 1 (���� ǥ������ ù ��° ��ȣ) ----");
			System.out.println("ã�� �� : " + matchResult.group(1));
			System.out.println("���� �ε��� : " + matchResult.start(1));
			System.out.println("������ �ε��� : " + matchResult.end(1));
			
			System.out.println("---- Group 2 (���� ǥ������ �� ��° ��ȣ) ----");
			System.out.println("ã�� �� : " + matchResult.group(2));
			System.out.println("���� �ε��� : " + matchResult.start(2));
			System.out.println("������ �ε��� : " + matchResult.end(2));
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
