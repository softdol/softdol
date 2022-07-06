
public class B01_Operator1 {
	
	/*
	 * 	# ������(Operator)
	 * 
	 * 		- ����� �� ����ϴ� �� 
	 * 		- +, -, *, /, <, >, >=, <=, ...
	 * 
	 * 	# ��� ������
	 * 
	 * 		+ : ���ϱ� 
	 * 		- : ����
	 * 		* : ���ϱ�
	 * 		/ : ������
	 * 		% : ������
	 * 
	 * 	# �� ������
	 * 
	 * 		
	 */
	
	public static void main(String[] args) {
		
		int a = 33, b = 8;
		double c = 33, d = 8;
		
		System.out.println("a + b : " + (a + b));
		System.out.println("a - b : " + (a - b));
		System.out.println("a * b : " + a * b);
		
		// ������ ������ ������ �� ���Ѵ�
		System.out.println("a / b : " + a / b);
		
		// ������ �Ǽ��� ������ ��Ȯ�� ���� ���Ѵ�
		System.out.println("c / b : " + c / b);
		System.out.println("a / d : " + a / d);
		System.out.println("c / d : " + c / d);
		
		// ������ ����
		System.out.println("a % b : " + a % b);
		
		// n���� ���� �������� 0���� n-1���� �ۿ� ���� �� ����
		System.out.println("19 % 10 : " + 19 % 10);
		System.out.println("20 % 10 : " + 20 % 10);
		System.out.println("21 % 10 : " + 21 % 10);
		System.out.println("22 % 10 : " + 22 % 10);
		
		// Matr.pow(a,b) : a���� b�� ��ȯ�Ѵ�
		System.out.println("2 ^ 10 : " + Math.pow(2, 10));
		//System.out.println("2 ^ 10 : " + 2 ^ 10);	// XOR ����
		
		// Matr.sqrt(a) : a�� �������� ���ؼ� ��ȯ�Ѵ�
		System.out.println("2�� ������ : " + Math.sqrt(2));
		
		// Matr.abs(a) : a�� ���밪�� ��ȯ�Ѵ�
		System.out.println("-2�� ���밪 : " + Math.abs(-2));
		
		// Matr.round(a) : a�� �Ҽ� ù° �ڸ����� �ݿø��� ����� ��ȯ�Ѵ�
		double result = Math.round(123.555);
		System.out.println(result);
		
		// Matr.round()�� ���ϴ� �ڸ������� �ݿø��ϱ�
		//	- �ݿø��ϰ� ���� �ڸ��� �Ҽ� ù��° �ڸ��� ���� �� �ٽ� ������
		double value = 123.7777777777;
		
		value = Math.round(value*10000) / 10000.0;
		
		System.out.println(value);
	}

}

