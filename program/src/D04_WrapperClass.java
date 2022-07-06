
public class D04_WrapperClass {
	/*
	  	# Wrapper Class
	  	
	  	 - �⺻ Ÿ�Ե��� ������ Ÿ������ ����ϱ� ���� ���γ��� Ŭ������
	  	 - �� �⺻ Ÿ�Ե鿡 ���� ������ ��ɵ��� ���ִ�
	  	 
	  	# �⺻�� Ÿ�Ե�
	  	
	  	 - byte, short, char, int, long, float, double, boolean
	  	 
	  	# ������ Ÿ�Ե�
	  	
	  	 - Byte, Short, Character, Integer, Long, Float, Double, Boolean	 
	*/
	public static void main(String[] args) {		
		/*
		 	# Parsing
		 	
		 	 - ���ڿ��� �ش� Ÿ�� ������ ��ȯ�ϴ� ��
		 	 - �� Wrapper Ŭ������ �˸��� �޼��尡 �����Ѵ�
		*/
		int num = Integer.parseInt("55551234");
		System.out.println(num);
		num = Integer.parseInt("1000101010", 2); // radix : ����
		System.out.println(num);
		num = Integer.parseInt("��ö��//101012/A+", 5, 7, 4);
		System.out.println(num);
		
		float value = Float.parseFloat("123.12345678");
		System.out.println(value);
		
		boolean isPrime = Boolean.parseBoolean("abcd");
		System.out.println(isPrime);
		
		/*
		 	# toString
		 	
		 	 - �� Ÿ���� ���� ���ڿ��� ��ȯ�ϴ� ���		 
		*/
		String data = Integer.toString(12345678);
		data = Integer.toString(12345678, 2);
		data = Integer.toString(12345678, 16);
		System.out.println(data);
		
		// �� Ÿ���� �����
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE / 8 + " bytes");
		
		System.out.println(Character.MAX_CODE_POINT);
		System.out.println((int)Character.MAX_VALUE);
		System.out.println((int)Character.MIN_VALUE);
		System.out.println(Character.SIZE / 8 + " bytes");
		
		// Character���� ���ڸ� ���ϰ� �ٷ� �� �ִ� �޼������ ����
		System.out.println(Character.isAlphabetic('��'));
		System.out.println(Character.isAlphabetic('��'));
		System.out.println(Character.isAlphabetic('3'));
		System.out.println(Character.isAlphabetic('_'));
		
		// �ش� ������ Ÿ���� �˷��ִ� �޼���
		System.out.println(Character.getType('A'));
		System.out.println(Character.getType('��'));
		System.out.println(Character.UPPERCASE_LETTER);
		
		// �����̸� true�� �޼���
		System.out.println(Character.isSpaceChar(' '));
		System.out.println(Character.isSpaceChar('\t'));
		System.out.println(Character.isSpaceChar('\n'));
		
		// ��/�ҹ��ڸ� �������ִ� �޼���
		System.out.print("A�� �빮���Դϱ�? ");
		System.out.println(Character.isUpperCase('A'));
		System.out.print("a�� �ҹ����Դϱ�? ");
		System.out.println(Character.isLowerCase('a'));
		
		// �������� �������ִ� �޼���
		System.out.println("0�� �����ΰ���? " + Character.isDigit('0'));
		System.out.println("A�� �����ΰ���? " + Character.isDigit('A'));
		
		// �ڹ��� ������ ù ��°�� ����� �� �ִ� �������� �������ִ� �޼���
		System.out.println(Character.isJavaIdentifierStart('$'));
		System.out.println(Character.isJavaIdentifierStart('_'));
		System.out.println(Character.isJavaIdentifierStart(' '));
		System.out.println(Character.isJavaIdentifierStart('1'));	
		
	}
	
}
















