
public class E08_StringOfflen {

	public static void main(String[] args) {
		
		char[] arr = new char[] {'a','b','c','d','e','f','g','h'};
		
		System.out.println(new String(arr));
		System.out.println(new String(arr, 3, 2));	// 3���� 2���� ���ڸ� ����� ���ڿ� ����
		System.out.println(new String(arr, 3, 3));	// 3���� 3���� ���ڸ� ����� ���ڿ� ����
		System.out.println(new String(arr, 3, 4));	// 3���� 4���� ���ڸ� ����� ���ڿ� ����
		System.out.println(new String(arr, 0, 5));	// 0���� 5���� ���ڸ� ����� ���ڿ� ����
		
	}
	
}
