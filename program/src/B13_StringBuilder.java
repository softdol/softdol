
public class B13_StringBuilder {
	
	public static void main(String[] args) {
		
		StringBuilder brute_pass = new StringBuilder();
		
		//	append(value)	: 맨 뒤에 해당 값을 추가한다
		//	insert(index, value) : 원하는 위치에 해당 값을 추가한다		
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
