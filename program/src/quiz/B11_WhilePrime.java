package quiz;

import java.util.Scanner;

public class B11_WhilePrime {
	
	public static void main(String[] args) {
		
		boolean self = false;
		
		if(!self) {
			
			Scanner sc = new Scanner(System.in);
			int bound;
			
			while(true) {
				System.out.print("2 �̻��� ���ڸ� �Է��� �ּ��� >> ");
				bound = sc.nextInt();
				
				if(bound > 1) {
					break;
				}
			}
			
			sc.close();
			
			int num = 2;
			while ( num <= bound) {
				boolean prime = true;
				
				int chk = 2;
				double sqrt = Math.sqrt(num);
				while(chk <= sqrt) {
					
					if(num % chk == 0) {
						prime = false;
						break;
					}					
					++chk;
				}
				
				if(prime) {
					System.out.printf("%d�� �Ҽ��Դϴ�.\n", num);
				}
				++num;
			}
			
		}else {
			
			Scanner sc = new Scanner(System.in);
			
			int num = 0;
			int i = 2;
			
			while( num < 2) {
				System.out.print("2 �̻��� ���ڸ� �Է��� �ּ��� >> ");
				num = sc.nextInt();
			}
			
			sc.close();
			
			while(i <= num){
				
				boolean prime = true;
				double sqrt = Math.sqrt(i);
				int test = 2;
				
				/*
				 * 	(1) 1���� �ڱ� �ڽű��� ������ �� ����� 2����� �Ҽ���
				 * 	(2) 2���� �ڱ� �ڽ� �ٷ� ������ ������ �� ����� 0����� �Ҽ���.
				 * 	(3) 2���� �ش� ������ �����ٱ��� ������ �� ����� 0����� �Ҽ���.
				 */
				
				while(test < sqrt) {
				
					if(i%test == 0) {
						prime = false;
						break;
					}
					++test;
				}			
				
				if(prime) {
					System.out.printf("%d�� �Ҽ��Դϴ�.\n", i);
				}
				
				++i;
			}
			
		}
		
	}

}
