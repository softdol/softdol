
package quiz;

import java.util.Arrays;

public class B15_Sort {
	
	/*
	 * 	
	 * 	# 선택 정열
	 * 
	 * 		1. 배열 전체에서 가장 작은 값을 찾아 맨 앞에 넣는다.
	 * 		2. 맨 앞을 제외한 배열 전체에서 가장 작은 값을 찾아 두번째 자리에 넣는다
	 * 		3. ... 
	 */

	public static void main(String[] args) {

		boolean self = false;
		
		if(!self) {
			
			int[] data = new int[10];
			
			for(int i = 0; i < data.length; ++i) {
				
				data[i] = (int)(Math.random() * 100000);
				
			}
			
			int[] asc = new int[data.length];
			int[] desc = new int[data.length];
			
			for(int i = 0; i < data.length; ++i) {
				asc[i] = data[i];
				desc[i] = data[i];
			}
			
			// # 선택 정렬 
			for(int step = 0 ; step < asc.length -1 ; ++step) {
				
				// [1단계] 최소값의 위치를 찾는다.
				int min_index = step;
				
				for(int i = step + 1; i < asc.length; ++i) {
					// 숫자를 비교하여 더 작으면 작은 값의 인덱스를 아니면 기존 인덱스를 저장함
					min_index = asc[min_index] > asc[i] ? i : min_index;					
				}
				
				// [2단계] 최소값을 맨 앞(현재의 단계 인덱스)으로 이동시킨다
				// 숫자열에서 step번째 값을 저장				
				int temp = asc[step];
				// step번쨰 값을 제일 작은 값으로 변환
				asc[step] = asc[min_index];
				// 가장 작은 값을 가지고 있던 값에 step번쨰의 값을 저장
				asc[min_index] = temp;
				
				System.out.printf("%d 단계 : %s\n", step, Arrays.toString(asc));
				
			}
			
			System.out.println();
			System.out.println();
			
			//	# 버블 정렬
			
			for(int step = 0; step < desc.length - 1; ++step) {
				
				for(int i = 0; i < desc.length -1 - step; ++i ) {
					if(desc[i] < desc[i+1]) {
						int temp = desc[i];
						desc[i] = desc[i + 1];
						desc[i + 1] = temp;
					}
				}
				
				System.out.printf("%d 단계 : %s\n", step, Arrays.toString(desc));
				
			}
			
		}else {
			
			int[] arrNum = new int[100];
			int[] arrANum = new int[arrNum.length];
			int[] arrDNum = new int[arrNum.length];

			int num = 10000;
			
			for(int i = 0 ; i < arrNum.length ; ++i) {
				arrNum[i] = (int)(Math.random() * num);
			}
			
			System.out.println(Arrays.toString(arrNum));
			
			for(int i = 0 ; i < arrNum.length ; ++i) {
				int temp = arrNum[i];
				
				for(int j = 0 ; j < i; ++j){					
					if(temp < arrNum[j]) {						
						arrNum[i] = arrNum[j]; 
						arrNum[j] = temp;					
						i--;
						break;
					}
				}				
				arrANum[i] = arrNum[i];
			}
			
			System.out.println(Arrays.toString(arrNum));
			
			for(int i = 0 ; i < arrNum.length ; ++i) {
				int temp = arrNum[i];		
				
				for(int j = 0 ; j < i; ++j){					
					if(temp > arrNum[j]) {						
						arrNum[i] = arrNum[j]; 
						arrNum[j] = temp;
						i--;
						break;				
					}
				}
				
				arrDNum[i] = temp;

			}		
			
			System.out.println(Arrays.toString(arrNum));
			
		}
		
	}
	
}

