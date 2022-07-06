package quiz;

import java.util.Arrays;
import java.util.Random;

public class B16_Array2Quiz {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int[][] numArr = new int[][] {
			{1,1,1,1,1},
			{1,1,1},
			{1,1,1,1,1,1,1},
			{1,1},
			{1,1,1,1}
		};
		
		boolean self = false;
		
		if(!self) {
			
			for(int i = 0; i < numArr.length; ++i) {
//				System.out.printf("%d번째 배열의 길이: %d\n", i, numArr[i].length);
//				System.out.printf("0부터 %d번까지 반복해야합니다.\n", numArr[i].length - 1);
				for(int j = 0; j < numArr[i].length; ++j) {
					numArr[i][j] = ran.nextInt(101);
				}
				
				System.out.println(Arrays.toString(numArr[i]));
			}
			
			int sum = 0;
			int size = 0;			
			for(int i = 0; i < numArr.length; ++i) {
				int len = numArr[i].length;
				size += len;
				for(int j = 0; j < len; ++j) {
					sum += numArr[i][j];
				}
			}
			
			System.out.printf("총합 : %d, 평균 : %.2f\n", sum, sum / (double) size);
			
			int maxColumnSize = 0;
			
			for(int i = 0; i < numArr.length; ++i) {
				int rowSum = 0;
				for(int j = 0; j < numArr[i].length; ++j) {
					rowSum += numArr[i][j];
				}
				
				System.out.printf("%d행의 총합 : %d\n", i, rowSum);
			}
			
			//int numArrSize = numArr.length;
			
			
			for(int i = 0; i < numArr.length; ++i) {
				int len = numArr[i].length;
				maxColumnSize = Math.max(len, maxColumnSize);
				//maxColumnSize = len > maxColumnSize ? len : maxColumnSize;				
				int rowSum = 0;
				for(int j = 0; j < len; ++j) {
					rowSum += numArr[i][j];
				}				
				System.out.printf("%d행의 총합: %d\n", i, rowSum);				
			}
			
			System.out.println();
			
//			for(int col = 0; col < maxColumnSize ; ++col) {
//				int colSum = 0;
//				for(int row = 0; row < numArr.length; ++row) {
//					if(col < numArr[row].length) {
//						colSum += numArr[row][col];
//					}
//				}
//				
//				System.out.printf("%d열의 총합: %d\n", col, colSum);
//			}			
			
			int[] colsum = new int[maxColumnSize];
			for(int row = 0; row < numArr.length; ++row) {
				for(int col = 0 ; col < numArr[row].length; ++row) {
					colsum[col] += numArr[row][col];
				}
			}

			
			
		}else {
			
//			1. numArr의 모든 값을 0~100 사이의 랜덤 정수로 바꾸기
			for(int i = 0; i < numArr.length; ++i) {
				for(int j = 0; j < numArr[i].length; ++j) {
					int ranNum = ran.nextInt(101);
					numArr[i][j] = ranNum; 
				}
			}
			
			//	2. 랜덤으로 바뀐 numArr의 모든 값을 출력하고 총합과 평균을 출력
			int sum = 0;
			int cnt = 0;
			for(int i = 0; i < numArr.length; ++i) {
				for(int j = 0; j < numArr[i].length; ++j) {
					System.out.print("[" + numArr[i][j] + "]\t");
					++cnt;
					sum += numArr[i][j];
				}
				System.out.println();
			}
			System.out.printf("총합 :  %d 평균 : %.2f\n", sum, (double)sum / cnt);
			System.out.println();
			
			//	3. numArr의 각 행(row)의 합을 구해서 출력하기
			sum = 0;
			int colCount = 0;
			for(int i = 0; i < numArr.length; ++i) {
				for(int j = 0; j < numArr[i].length; ++j) {				
					sum += numArr[i][j];
					colCount = j + 1 > colCount ? j + 1 : colCount;
				}
				System.out.printf("%d 행(row)의 합 : %d\n", i, sum);
				sum = 0;
			}
			System.out.println();		
			
			// 	4. numArr의 각 열(column)의 합을 구해서 출력하기
			
			int[] col = new int[colCount];
			for(int i = 0; i < numArr.length; ++i) {
				for(int j = 0; j < numArr[i].length; ++j) {				
					col[j] += numArr[i][j];
				}
			}
			
			for(int i = 0 ; i < col.length; ++i) {
				System.out.printf("%d 행(row)의 합 : %d\n", i, col[i]);
			}
			
		}
		
		
		
		
	}
}
