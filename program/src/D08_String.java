import java.util.Arrays;

public class D08_String {

	public static void main(String[] args) {
		
		String fruits = "apple/banana/kiwi/grape/orange/watermelon/pineapple";
		
		// split(delim) : ���ڿ��� ���ϴ� �������� �ڸ� ���ڿ� �迭�� ��ȯ�Ѵ�
		String[] split = fruits.split("/");
//		String[] split = fruits.split("e");
//		String[] split = fruits.split("an");
		
		System.out.println(Arrays.toString(split));
		
		// String.join(delimiter, CharSequence...) : �ڿ� ������ ���ڿ��� ��� �����Ѵ�		
		// String.join(delimiter, iterable) : �迭(�Ǵ� ����Ʈ ��)�� ��� ���ڿ��� �����Ѵ�
		String join = String.join(",", "tiger", "lion","bear", "hawk", "panda");
		System.out.println(join);
		
		join = String.join("/", split);
		System.out.println(join);
		
		// contains(seq) : �ش� ���ڿ��� ���ԵǾ� �ִ����� �˻��Ѵ�
		System.out.println("orange ? " + fruits.contains("orange")); 
		System.out.println("peach ? " + fruits.contains("peach"));
		
		// statrsWith(seq) : �ش� ���ڿ��� �����ϴ����� �˻��Ѵ�
		String url = "http://www.naver.com";
		
		System.out.println("www�� �����ϳ���? " + url.startsWith("www"));
		System.out.println("http�� �����ϳ���? " + url.startsWith("http"));
		System.out.println("https�� �����ϳ���? " + url.startsWith("https"));
		
		// endsWith(seq) : �ش� ���ڿ��� ���������� �˻��Ѵ�
		String fileName = "screenshot.pdf";
		
		System.out.println(".pdf�ΰ���? " + fileName.endsWith(".pdf"));
		System.out.println(".jpg�ΰ���? " + fileName.endsWith(".jpg"));
		System.out.println(".gif�ΰ���? " + fileName.endsWith(".gif"));
		
		// replace(old, new) : ���ڿ��� ��ü�� ���ο� ���ڿ��� ��ȯ�Ѵ�
		String email = "billgates@microsoft.com";		
		String replaced = email.replace("microsoft.com", "naver.com");
		System.out.println(replaced);
		
		// substring(start): ���ڿ��� ���� ��ġ���� �ڸ� ����� ��ȯ�Ѵ�		
		// substring(start, end): ���ڿ� start���� end�̸����� �ڸ� ����� ��ȯ�Ѵ�
		System.out.println(email.substring(5));
		System.out.println(email.substring(5, 10));
		
		// toUppercase() : ���ڿ��� ���ĺ��� ��� �빮�ڷ� ��ȯ�� �ν��Ͻ��� ��ȯ�Ѵ�
		System.out.println(email.toUpperCase());
		
		// toLowercase() : ���ڿ��� ���ĺ��� ��� �ҹ��ڷ� ��ȯ�� �ν��Ͻ��� ��ȯ�Ѵ�
		System.out.println(email
				.toUpperCase().toLowerCase().toUpperCase().toLowerCase());
		
		char[] arr = email.substring(9).toUpperCase().toCharArray();
		System.out.println(Arrays.toString(arr));
		
		// indexOf(seq) : ���ϴ� ���ڿ��� �� ��° �ε����� �ִ��� ��ȯ�Ѵ�
		// indexOf(seq, from) : from���� ���ϴ� ���ڿ��� �˻��Ͽ� �ε����� ��ȯ�Ѵ�
		System.out.println("@�� ��ġ : " + email.indexOf('@'));
		System.out.println("micro�� ��ġ : " + email.indexOf("micro"));
		
		String test = "apple@naver.com, abs@yahoo.co.kr, ddd@hanmail.net";	
		
		System.out.println(test.indexOf('@', 0));
		System.out.println(test.indexOf('@', 6));
		System.out.println(test.indexOf('@', 21));
		
		// String.format(format, args...) : ���ϴ� ���ڿ��� ������ �̿��� ������ �� �ִ�.
		
		
		fruits = "appleapple/banana/kiwi/grape/orange/watermelon/pineapple"
				+ "apple/banana/kiwi/grape/orange/watermelon/pineapple"
				+ "apple/banana/kiwi/grape/orange/watermelon/pineapple"
				+ "apple/banana/kiwi/grape/orange/watermelon/pineapple"
				+ "apple/banana/kiwi/grape/orange/watermelon/pineapple";
		
		// ��������: fruits���� ��� "apple"�� �ε����� ã�� ����� ������.
		int index = -1, i = 0;
		while((index = fruits.indexOf("apple", index + 1)) != -1) {
			System.out.printf("%d��° apple�� ��ġ: %d\n", i++, index);
		}
		
		int cnt = 1;
		for(int j = 0; j < fruits.length(); j++) {					
			if((j = fruits.indexOf("apple",j)) < 0) {
				break;
			}else {
				System.out.println(cnt++ + "��° apple : " + j);
			}
		}
		
		
		
		
		
		
		
		
	}
}
