package quiz;

import java.util.Scanner;

public class B10_Prime {
	
	
	/*
	 * 	사용자로부터 숫자를 입력받으면
	 * 	1부터 입력한 숫자 사이에 존재하는 모든 소수를 출력해 보세요
	 * 
	 */
	
	public static void main(String[] args) {
				
		boolean self = false;
		
		if(!self) {
			
			Scanner sc = new Scanner(System.in);
			
			int num;			
			for(;;) {
				System.out.print("2 이상의 숫자를 입력해 주세요 >> ");
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
				 * 	(1) 1부터 자기 자신까지 나눴을 때 약수가 2개라면 소수다
				 * 	(2) 2부터 자기 자신 바로 전까지 나눴을 때 약수가 0개라면 소수다.
				 * 	(3) 2부터 해당 숫자의 제곱근까지 나눴을 떄 약수가 0개라며 소수다.
				 */
				double sqrt = Math.sqrt(i);
				for(int test = 2; test <= sqrt; ++test) {					
					if(i%test == 0) {						
						prime = false;
						break;
					}
				}
				
				if(prime) {
					System.out.printf("%d는 소수입니다.\n", i);
				}
//				else {
//					System.out.printf("%d는 소수가 아닙니다.\n", i);
//				}
				
				
			}
			
//			System.out.print("2 이상의 숫자를 입력해 주세요 >> ");			
//			for(num = sc.nextInt(); num < 2; num = sc.nextInt()) {				
//				System.out.println("다시 입력해주세요. " + num);
//				System.out.print("2 이상의 숫자를 입력해 주세요 >> ");				
//			}
//			
//			System.out.println("숫자가 제대로 입력되었습니다." + num);
			
			
		}
		else {
			
			int userNum;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("숫자(양수)를 입력해 주세요 >> ");
			
			userNum = sc.nextInt();
			
			for(int i = userNum; i < 0; ) {
				System.out.print("양수가 아닙니다.\n숫자(양수)를 입력해 주세요 >> ");
				
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
