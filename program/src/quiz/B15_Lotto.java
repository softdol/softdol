package quiz;

import java.util.Arrays;

public class B15_Lotto {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 
		 * 
		 */
		int num = 45;
		
		//�ߺ� ���� ���� �����
		int[] win = new int[7];
		
		for(int i = 0; i < win.length; ++i) {
			int newNum = (int)(Math.random() * num + 1);			
			win[i] = newNum; 
			
			for(int j = 0; j < i ; ++j) {				
				if(newNum == win[j]) {
					--i;
					break;
				}				
			}
		}
		
		System.out.println("��÷ ��ȣ�� : " + Arrays.toString(win));
		
		int auto_cnt = 0;
		
		while(true) {
		
			int[] user = new int[7];
			
			for(int i = 0; i < win.length; ++i) {
				int newNum = (int)(Math.random() * num + 1);			
				user[i] = newNum; 
				
				for(int j = 0; j < i ; ++j) {				
					if(newNum == user[j]) {
						--i;
						break;
					}				
				}
			}
		
			//System.out.println("�ڵ� ��ȣ : " + Arrays.toString(win));
			int cnt = 0;
			for (int i = 0 ; i < user.length ; ++i) {
				for(int j = 0; j < win.length ; ++j) {
					if(user[i] == win[j]) {
						++cnt;
						break;
					}
				}
			}
			
			++auto_cnt;
			
			if(cnt == user.length) {
				System.out.printf("1�� ��÷�Դϴ�.! (%dȸ �õ���) \n", auto_cnt);
				System.out.println("��÷��ȣ : " + Arrays.toString(win));
				System.out.println("�ڵ���ȣ : " + Arrays.toString(user));
				break;				
			}else if(cnt == user.length - 1) {
				System.out.printf("2�� ��÷�Դϴ�.! (%dȸ �õ���) \n", auto_cnt);
				System.out.println("��÷��ȣ : " + Arrays.toString(win));
				System.out.println("�ڵ���ȣ : " + Arrays.toString(user));
			}
		}
		
		
		// Array.toString(arr) : ������ �迭�� ���� ���� ���ڿ��� ����� ��ȯ�Ѵ�.
		
//		System.out.println(Arrays.toString(user));
		
//		
//		
//		int[] lottoNum = new int[7];
//		int rndNum = 10;
//		
//		// 1~45�� �ߺ� ���� ���� ���� 7���� �����Ͽ� ��÷ ��ȣ�� ����� ������.
//		
//		int cnt = 0;		
//		while(true) {
//			if(lottoNum.length == cnt) {				
//				break;
//			}
//			
//			int num = (int)(Math.random() * rndNum + 1);
//			int chkNum2 = 0;
//			
//			for(int i = 0; i < lottoNum.length; ++i) {
//				chkNum2 = lottoNum[i] == num ? +1 : chkNum2;
//			}
//			
//			if(chkNum2 == 0) {
//				lottoNum[cnt] = num;
//				cnt++;
//			}
//		}
//		
//		cnt = 0;
//		
//		for(int i = 0; i < lottoNum.length; ++i) {
//			System.out.print(lottoNum[i] + " ");
//		}		
//		System.out.println();
//		System.out.println("-------------------------");
//		
//		int chkCount = 0;
//		
//		while(chkCount < lottoNum.length) {
//			
//			int[] lottoNum2 = new int[7];
//			cnt = 0;			
//			while(true) {
//				if (lottoNum2.length == cnt) {
//					break;
//				}
//				int num = (int) (Math.random() * rndNum + 1);
//				int chkNum2 = 0;
//
//				for (int i = 0; i < lottoNum2.length; ++i) {
//					chkNum2 = lottoNum2[i] == num ? +1 : chkNum2;
//				}
//
//				if (chkNum2 == 0) {
//					lottoNum2[cnt] = num;
//					cnt++;
//				}		
//				
//			}	
//			
//			for(int i = 0; i < lottoNum2.length; ++i) {
//				System.out.print(lottoNum2[i] + " ");
//			}
//			
//			System.out.println();
//		
//			for(int i = 0; i < lottoNum.length; ++i) {
//				for(int j = 0; j < lottoNum2.length; ++j) {
//					if(lottoNum[i] == lottoNum2[j]) {
//						chkCount++;
//					}
//				}						
//			}
//			
//			if(chkCount < lottoNum.length) {
//				chkCount = 0;
//			}
//		}
		
		System.out.println();
		
		
	}
	
	
	
}

