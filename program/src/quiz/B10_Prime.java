package quiz;

import java.util.Scanner;

public class B10_Prime {
	
	
	/*
	 * 	����ڷκ��� ���ڸ� �Է¹�����
	 * 	1���� �Է��� ���� ���̿� �����ϴ� ��� �Ҽ��� ����� ������
	 * 
	 */
	
	public static void main(String[] args) {
				
		boolean self = false;
		
		if(!self) {
			
			Scanner sc = new Scanner(System.in);
			
			int num;			
			for(;;) {
				System.out.print("2 �̻��� ���ڸ� �Է��� �ּ��� >> ");
				num = sc.nextInt();
				
				if(num >= 2) {

					sc.close();
					break;
				}
				
			}
			
			for(int i = 2 ; i <= num; ++i)
			{
				//int cnt = 0;
				boolean prime = true;
				
				/*
				 * 	(1) 1���� �ڱ� �ڽű��� ������ �� ����� 2����� �Ҽ���
				 * 	(2) 2���� �ڱ� �ڽ� �ٷ� ������ ������ �� ����� 0����� �Ҽ���.
				 * 	(3) 2���� �ش� ������ �����ٱ��� ������ �� ����� 0����� �Ҽ���.
				 */
				double sqrt = Math.sqrt(i);
				for(int test = 2; test <= sqrt; ++test) {					
					if(i%test == 0) {						
						prime = false;
						break;
					}
				}
				
				if(prime) {
					System.out.printf("%d�� �Ҽ��Դϴ�.\n", i);
				}
//				else {
//					System.out.printf("%d�� �Ҽ��� �ƴմϴ�.\n", i);
//				}
				
				
			}
			
//			System.out.print("2 �̻��� ���ڸ� �Է��� �ּ��� >> ");			
//			for(num = sc.nextInt(); num < 2; num = sc.nextInt()) {				
//				System.out.println("�ٽ� �Է����ּ���. " + num);
//				System.out.print("2 �̻��� ���ڸ� �Է��� �ּ��� >> ");				
//			}
//			
//			System.out.println("���ڰ� ����� �ԷµǾ����ϴ�." + num);
			
			
		}
		else {
			
			int userNum;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("����(���)�� �Է��� �ּ��� >> ");
			
			userNum = sc.nextInt();
			
			for(int i = userNum; i < 0; ) {
				System.out.print("����� �ƴմϴ�.\n����(���)�� �Է��� �ּ��� >> ");
				
				i = sc.nextInt();
				userNum = i;
			}
			
			sc.close();
			
			for(int i = 2; i <= userNum; ++i) {
				
				boolean chk = true;
				
				for(int j = 2; j < i ; ++j) {				
					if(i % j == 0) {					
						chk = false;
						break;
					}							
				}
				
				if(chk) {
					System.out.println(i);
				}
				
			}
		}
		
		
	}

}
