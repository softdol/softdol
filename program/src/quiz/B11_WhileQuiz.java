package quiz;

public class B11_WhileQuiz {

	/*
	 * 	While���� ����Ͽ� ������ ���Ͻÿ�
	 * 
	 */
	
	public static void main(String[] args) {
		
		boolean self = false;
		
		if(!self) {
			
			int i = 500, sum = 0;
			while(i <= 1200) {
				if(i % 3 == 0) {
					sum += i;
				}					
				++i;
			}
			System.out.println("Q1 : [" + sum + "]");
			
			i = 30;
			
			while(i > 0) {
				
				System.out.printf("%d\t", i);
				if(i % 5 == 1) {
					System.out.println();
				}
				--i;
			}
			
			i = 1;
			sum = 0;
			
			while(i <= 200) {				
				if(i % 2 != 0 && i % 3 != 0) {
					sum += i;
				}				
				i++;				
			}	
			
			System.out.println("Q3 : [" + sum + "]");
			
		}else {
			
			//	1. 500 ~ 1200 ��ÿ� �ִ� ��� 3�� ����� ����
			int num = 500, sum = 0;
			
			while(num <= 1200) {				
				if(num % 3 == 0) {
					sum += num;				
				}				
				num++;				
			}			
			System.out.println("500 ~ 1200 ��ÿ� �ִ� ��� \n3�� ����� ���� : [" + sum + "]");
			System.out.println();
			
			//	2. 30���� 1���� �� �ٿ� ���ڸ� 5���� ���
			num = 30;
					
			while(num > 0) {	
				
				System.out.printf("%d\t", num);
				if(num % 5 == 1) {
					System.out.println();
				}				
				num--;				
			}			
			System.out.println();
			
			//	3. 1���� 200������ ���� �� 2�� ����� �ƴϰ� 3�� ����� �ƴ� ���ڵ��� ����			
			num = 0;
			sum = 0;
			
			while(num <= 200) {				
				if(!(num % 3 == 0 || num % 2 == 0)) {
					sum += num;
				}				
				num++;				
			}			
			System.out.println("1���� 200������ ���� �� 2�� ����� �ƴϰ� \n3�� ����� �ƴ� ���ڵ��� ���� : [" + sum + "]");
			System.out.println();
			
		}		
	}
}


