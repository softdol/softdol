package quiz;

public class B02_ConditionQuiz2 {
	/*
	 * 	#�˸��� ���ǽ��� ��������
	 * 
	 * 		1. char�� ���� a�� 'q'�Ǵ� 'Q'�� �� true 
	 * 		2. char�� ���� b�� �����̳� ���� �ƴ� �� true
	 * 		3. char�� ���� c�� '0' ~ '9'�� �� true
	 * 		4. char�� ���� d�� ������{�빮�� �Ǵ� �ҹ���)�� �� true
	 * 		5. char�� ���� e�� �ѱ��� �� true
	 * 		6. char�� ���� f�� �Ϻ����� �� true
	 * 		7. ����ڰ� �Է��� ���ڿ��� exit�϶� true
	 * 	  
	 */
	public static void main(String[] args) {
		
//		1. char�� ���� a�� 'q'�Ǵ� 'Q'�� �� true
		char a = 'w';
		System.out.println("1�� : " + (a == 'Q' || a == ('Q' + 32)));
		//System.out.println((int)a == 113 || (int)a == 81);
		
//		2. char�� ���� b�� �����̳� ���� �ƴ� �� true
		char b = '4';
		System.out.println("2�� : " + (!(b == 32 || b == 9)));
		
//		3. char�� ���� c�� '0' ~ '9'�� �� true
		char c = '4';
		//System.out.println((int)'z');
		System.out.println("3�� : " + (c >= 48 && c <= 57));
		
//		4. char�� ���� d�� ������{�빮�� �Ǵ� �ҹ���)�� �� true
		char d = '1';
		System.out.println("4�� : " + (d >= 65 && d <= 122));
		
//		5. char�� ���� e�� �ѱ��� �� true
		char e = '��';
		System.out.println("5�� : "+ e + " -> " + 
		//((e >= 12592 && e <= 12687) || (e >= 44032 && e <= 50808)));
		((e >= 12592 && e <= 12687) || (e >= 0xAC00 && e <= 0xD7AF)));
		//44032, 50808
//		6. char�� ���� f�� �Ϻ����� �� true
		char f = '��';	//�Ҫ骬��
		System.out.println((int)f);
		System.out.println("6�� : " + f + " -> " +
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
		
//	 	7. ����ڰ� �Է��� ���ڿ��� exit�϶� true
//		Scanner sc = new Scanner(System.in);
//				
//		System.out.print("exit�� �Է��ϼ��� > ");
//		String str = sc.next();
//		System.out.println("7�� : " + str.equals("exit"));
		
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

