package quiz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C01_Test {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int userCount = 0;
		
		while(userCount <= 0) {
		
			System.out.print("���ϴ� Ƚ���� �Է��� �ּ��� >>");
		
			userCount = sc.nextInt();
		}
		
		sc.close();
		
		int maxNum = 45;		
		int[] lottoNum = rndNum(7, maxNum);
		int[] rank = new int[5];
		
		System.out.println("��÷ ��ȣ : " + Arrays.toString(lottoNum));
		
		if(userCount > 0) {			
			//System.out.println("============ �� �� ============");
		
			for(int i = 0 ; i < userCount; ++i) {
				int[] tempNum = rndNum(6, maxNum);
				int tempRank = matching(lottoNum,tempNum); 
				System.out.printf("%dȸ ������ȣ %s : ��� : %d��\n", i+1, Arrays.toString(tempNum), tempRank);
				
				if(tempRank < 6) {
					rank[tempRank - 1]++;
				}  
			}
			
			System.out.println("======= [ �� : " + userCount + "ȸ ] �� �� ============");
			
			for(int i = 0 ; i < rank.length ; ++i) {				
				System.out.printf("%d�� %dȸ ��÷\n", i+1, rank[i]);
			}
		}
		
	}
	
	// ���� ��ȣ ����(������, �ְ��)
	public static int[] rndNum(int size, int maxNum) {
		
		int[] num = new int[size];

		for (int i = 0; i < num.length; ++i) {
			Random rnd = new Random();
			int rNum = rnd.nextInt(maxNum) + 1;
			num[i] = rNum;

			for (int j = 0; j < i; ++j) {
				if (rNum == num[j]) {
					i--;
					break;
				}
			}
		}

		return num;
	}
	
	//��÷ ��� Ȯ��
	public static int matching(int[] arrOrg, int[] arrUser) {
		
		int count = 0;
		int rank = 6;
		
		for (int i = 0 ; i < arrUser.length ; ++i) {
			for(int j = 0; j < arrOrg.length - 1 ; ++j) {
				if(arrUser[i] == arrOrg[j]) {
					++count;
					break;
				}
			}
		}
		
		switch(count) {
			case 6:
				rank = 1;
				break;
			case 5:
				rank = 3;
				
				int sCount = 0;
				for (int i = 0 ; i < arrUser.length ; ++i) {
					for(int j = 0; j < arrOrg.length ; ++j) {
						if(arrUser[i] == arrOrg[j]) {
							++sCount;
							break;
						}
					}
				}
				
				rank = sCount == 6 ? 2 : rank;
				
				break;
			case 4:
				rank = 4;
				break;
			case 3:
				rank = 5;
				break;			
			default :
				rank = 6;
				break;
		}
		
		return rank;
	}
	
}
