
public class B13_StringBuilder {
	
	public static void main(String[] args) {
		
		StringBuilder brute_pass = new StringBuilder();
		
		//	append(value)	: �� �ڿ� �ش� ���� �߰��Ѵ�
		//	insert(index, value) : ���ϴ� ��ġ�� �ش� ���� �߰��Ѵ�		
		brute_pass.insert(0, "z");
		brute_pass.insert(0, "a");
		brute_pass.insert(0,"a");
		brute_pass.insert(0, "a");
		
		brute_pass.append("z");
		brute_pass.append("a");
		brute_pass.append("a");
		brute_pass.append("a");
		
		System.out.println(brute_pass);
		
		StringBuilder builder1 = new StringBuilder("abc");
		
		builder1.append(123);
		builder1.insert(0, 456);
		builder1.insert(2, 789);
		
		System.out.println(builder1);
		
	}

}
