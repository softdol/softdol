package quiz;

import java.util.Scanner;

public class B11_Count369 {
	
	/*
	 * 
	 * 	����ڷκ��� ������ �ϳ� �Է� �ް�
	 * 	�ش� ���ڱ��� 369 ������ ����ȴٸ� �ڼ��� �� ��� �ľ� �ϴ��� ����غ�����
	 * 
	 */
	
	public static void main(String[] args) {
		
		boolean self = false;
		
		if(!self) {			
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("���ڸ� �Է� >> ");
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
						System.out.print("¦");
						++clap;
					}
					
					chknum /= 10;
					
				}
				System.out.println();
				
			}
			
			System.out.print(clap + " : ¦\n");
			
			
			
//			//����ó��			
//			for (int i = 1; i <= num; ++i) {
//				System.out.printf("%d : ", i);
//				
//				String numStr = "" + i;
//				
//				for (int j = 0; j < numStr.length(); ++j) {
//					char ch = numStr.charAt(j);
//					
//					if(ch == '3' || ch == '6' || ch == '9') {
//						System.out.print("¦");
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
//				System.out.print("���ڸ� �Է� >> ");
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
//				System.out.print("�ٽ� ");
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
			
			System.out.println(cnt+"��");
			
		}		
	}

}
