
package quiz;

import java.util.Arrays;

public class B15_Sort {
	
	/*
	 * 	
	 * 	# ���� ����
	 * 
	 * 		1. �迭 ��ü���� ���� ���� ���� ã�� �� �տ� �ִ´�.
	 * 		2. �� ���� ������ �迭 ��ü���� ���� ���� ���� ã�� �ι�° �ڸ��� �ִ´�
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
			
			// # ���� ���� 
			for(int step = 0 ; step < asc.length -1 ; ++step) {
				
				// [1�ܰ�] �ּҰ��� ��ġ�� ã�´�.
				int min_index = step;
				
				for(int i = step + 1; i < asc.length; ++i) {
					// ���ڸ� ���Ͽ� �� ������ ���� ���� �ε����� �ƴϸ� ���� �ε����� ������
					min_index = asc[min_index] > asc[i] ? i : min_index;					
				}
				
				// [2�ܰ�] �ּҰ��� �� ��(������ �ܰ� �ε���)���� �̵���Ų��
				// ���ڿ����� step��° ���� ����				
				int temp = asc[step];
				// step���� ���� ���� ���� ������ ��ȯ
				asc[step] = asc[min_index];
				// ���� ���� ���� ������ �ִ� ���� step������ ���� ����
				asc[min_index] = temp;
				
				System.out.printf("%d �ܰ� : %s\n", step, Arrays.toString(asc));
				
			}
			
			System.out.println();
			System.out.println();
			
			//	# ���� ����
			
			for(int step = 0; step < desc.length - 1; ++step) {
				
				for(int i = 0; i < desc.length -1 - step; ++i ) {
					if(desc[i] < desc[i+1]) {
						int temp = desc[i];
						desc[i] = desc[i + 1];
						desc[i + 1] = temp;
					}
				}
				
				System.out.printf("%d �ܰ� : %s\n", step, Arrays.toString(desc));
				
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

