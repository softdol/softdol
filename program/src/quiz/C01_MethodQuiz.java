package quiz;

import java.util.Arrays;

public class C01_MethodQuiz {	
	
	public static void main(String[] args) {
		
		char ch = 'A';
		int num = 3;
		
		System.out.printf("���� ����(%c)�� ���ĺ��̸� : %b\n",ch, alphabet(ch));		
		
		System.out.println();
		
		num = 100;
		
		System.out.printf("���� ����(%d)�� 3�� ����� : %b\n", num , drainage(3));
		System.out.println();
		
		System.out.printf("���� ����(%d)�� %s\n" ,num, even(num) );
		System.out.println();
		
		System.out.printf("���� ����(%d)�� ��� ��� : %s\n",num , Arrays.toString(arrayNum(num)));
		System.out.println();
		
		num = 49;		
		System.out.printf("���� ����(%d)�� �Ҽ��ΰ���? %b\n", num, decimal(num));
		System.out.println();
		
		num = 5;
		System.out.printf("���� ����(%d)�� ���丮�� �� : " + factorial(num) + "\n", num );
		
		num = 4;
		System.out.printf("���� ����(%d)�� ���丮�� �� : " + refac(num), num );
	}
	
	/*
	 * 	# ��� (recursive)
	 * 
	 * 		 - �ڱ� �ڽ��� �ҷ��� ����ϴ� �Լ�
	 * 		 - Ż�ⱸ�� ����� ���� ������ ����ؼ� ȣ���ϴٰ� ���ÿ����÷ο츦 ����Ų��
	 * 		 - ������ �Ϲ� �Լ��� ���� ���������� �ݵ�� �ʿ��� ��찡 �����Ѵ� 
	 * 
	 * 		 �� ���ÿ����÷ο� : �ѹ��� �ʹ� ���� �Լ��� ȣ���ؼ� �߻��ϴ� ����
	 * 
	 */
	
	public static int refac(int num) {
		
		if(num == 1){
			return 1;
		}else {
			return num * refac(num -1);
		}
		
	}
	
	// 6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
	//	factorial : (n) * (n -1) * (n-2) ... 3 * 2 * 1
	public static long factorial(int a) {
		long sum = 1;
		
//		while(a > 0) {
//			sum *= (long)a;
//			--a;
//		}	
		
		for(int i = a ;  i > 1; --i) {
			sum *= (long)i;
		}
		
		return sum;		
	}
	
	
	// 5. ������ ������ �Ҽ���� true�� ��ȯ�ϰ� �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	public static boolean decimal(int a) {

		boolean chk = true;
		
		for(int i = 2 ; i <= Math.sqrt(a) ; i ++) {			
			if(a % i == 0) {
				//chk = false;
				//break;
				return false;
			}
		}
		
		return chk;
	}
	
	// 4.���ڸ� �����ϸ� �ش� ������ ��� ����� �迭 ����� ��ȯ�ϴ� �Լ�
	public static int[] arrayNum(int a) {		
		int idxCnt = 0;
		
//		for(int i = 1 ; i <= a ; ++i) {
//			idxCnt = a % i == 0 ? idxCnt + 1 : idxCnt; 
//		}
		
		// 1�̶� �ڱ� �ڽ��� ����
		for(int i = 2 ; i < a ; ++i) {
			idxCnt = a % i == 0 ? idxCnt + 1 : idxCnt; 
		}
		
		idxCnt += 2;
		
		int[] list = new int[idxCnt];
		
		int arrIdx = 0;
		
		for(int i = 1 ; i <= a / 2 ; ++i) {
			if(a % i == 0) {
				list[arrIdx] = i;
				++arrIdx;
			} 
		}

		list[idxCnt-1] = a;
				
		return list;
	}
	
	// 3.���ڸ� �ϳ� �����ϸ� ���ڿ� ¦���Դϴ�. �Ǵ� Ȧ���Դϴٸ� ��ȯ�ϴ� �Լ�
	public static String even(int a) {		
		return a % 2 == 0 ? "¦���Դϴ�" : "Ȧ���Դϴ�";
	}
	
	// 2. ������ ���ڰ�  3�� ����̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	public static boolean drainage(int a) {		
		return a % 3 == 0 ;
	}
	
	// 1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	public static boolean alphabet(char ch) {		
		return ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z';
	}

}

