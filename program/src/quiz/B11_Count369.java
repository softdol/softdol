package quiz;

import java.util.Scanner;

public class B11_Count369 {
	
	/*
	 * 
	 * 	사용자로부터 정수를 하나 입력 받고
	 * 	해당 숫자까지 369 게임이 진행된다면 박수를 총 몇번 쳐야 하는지 출력해보세요
	 * 
	 */
	
	public static void main(String[] args) {
		
		boolean self = false;
		
		if(!self) {			
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("숫자를 입력 >> ");
			int num = sc.nextInt();
			int clap = 0;
			sc.close();
			for(int i = 1 ; i <= num ; ++i) {
				
				// 34567 => 7
				
				int chknum = i;
				System.out.printf("%d : ", i);
				
				while (chknum > 0) {
				
					int digit = chknum % 10;
				
					if(digit == 3 || digit == 6 || digit == 9) {
						System.out.print("짝");
						++clap;
					}
					
					chknum /= 10;
					
				}
				System.out.println();
				
			}
			
			System.out.print(clap + " : 짝\n");
			
			
			
//			//문자처리			
//			for (int i = 1; i <= num; ++i) {
//				System.out.printf("%d : ", i);
//				
//				String numStr = "" + i;
//				
//				for (int j = 0; j < numStr.length(); ++j) {
//					char ch = numStr.charAt(j);
//					
//					if(ch == '3' || ch == '6' || ch == '9') {
//						System.out.print("짝");
//						++clap;
//					}
//				}
//				
//				System.out.println();
//			}
			
//			Scanner sc = new Scanner(System.in);
//			
//			String num;
//			
//			while(true) {
//				System.out.print("숫자를 입력 >> ");
//				num = sc.nextLine();
//				boolean numeric = true;
//
//				for (int i = 0; i < num.length(); i++) {
//					char ch = num.charAt(i);
//
//					if (!(ch >= '0' && ch <= '9')) {
//						numeric = false;
//						break;
//					}
//				}
//
//				if (numeric) {
//					break;
//				}
//				
//				System.out.print("다시 ");
//			}
			
		}else {
			
			Scanner sc = new Scanner(System.in);
			
			sc.close();
			
			int num = 0;
			int cnt = 0;
					
			num = 1000;
			int chkNum = num;
			//int chkCount = 0;
			while(chkNum > 0) {
				chkNum /= 10;
				//chkCount++;
			}
					
			for(int i = 1; i <= num; ++i) {			
				
//				if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
//					cnt++;
//				}
//				
//				for(int j = 1; j < chkCount; ++j) {
//					if(i / (int)Math.pow(10, j) == 3 || i / (int)Math.pow(10, j) == 6 || i / (int)Math.pow(10, j) == 9) {
//						System.out.println(i);
//						cnt++;
//					}	
//				}
				
//				// 10^2 Math.pow(10, 2)
//				if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
//					//System.out.println(i);
//					cnt++;
//				}
//				
//				// 10^3 Math.pow(10, 3)
//				if(i / 100 == 3 || i / 100 == 6 || i / 100 == 9) {
//					//System.out.println(i);
//					cnt++;
//				}
				
				
				
										
				String sNum = String.valueOf(i);
				
				for(int j = 0; j < sNum.length(); ++j){
					if(sNum.charAt(j) == '3' || sNum.charAt(j) == '6' || sNum.charAt(j) == '9') {
						System.out.println(sNum);
						++cnt;
					}
				}
				
			}
			
			System.out.println(cnt+"번");
			
		}		
	}

}
