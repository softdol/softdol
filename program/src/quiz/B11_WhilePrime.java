package quiz;

import java.util.Scanner;

public class B11_WhilePrime {
	
	public static void main(String[] args) {
		
		boolean self = false;
		
		if(!self) {
			
			Scanner sc = new Scanner(System.in);
			int bound;
			
			while(true) {
				System.out.print("2 이상의 숫자를 입력해 주세요 >> ");
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
					System.out.printf("%d는 소수입니다.\n", num);
				}
				++num;
			}
			
		}else {
			
			Scanner sc = new Scanner(System.in);
			
			int num = 0;
			int i = 2;
			
			while( num < 2) {
				System.out.print("2 이상의 숫자를 입력해 주세요 >> ");
				num = sc.nextInt();
			}
			
			sc.close();
			
			while(i <= num){
				
				boolean prime = true;
				double sqrt = Math.sqrt(i);
				int test = 2;
				
				/*
				 * 	(1) 1부터 자기 자신까지 나눴을 때 약수가 2개라면 소수다
				 * 	(2) 2부터 자기 자신 바로 전까지 나눴을 때 약수가 0개라면 소수다.
				 * 	(3) 2부터 해당 숫자의 제곱근까지 나눴을 떄 약수가 0개라며 소수다.
				 */
				
				while(test < sqrt) {
				
					if(i%test == 0) {
						prime = false;
						break;
					}
					++test;
				}			
				
				if(prime) {
					System.out.printf("%d는 소수입니다.\n", i);
				}
				
				++i;
			}
			
		}
		
	}

}
