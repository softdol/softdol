
public class B16_Array2 {
	
	public static void main(String[] args) {
		
		//	�迭 �ȿ� �迭�� ���� �� �ִ�.
		//	(�迭�� �̷���� �迭�� ���� �� �ִ�.)
		
		int[] numbers = {1,2,3,4,5};
		int[][] numbers2 = {
				numbers,
				{1,2,3,4,5},
				numbers, 
				numbers};
		
		System.out.println(numbers[3]);	
		System.out.println(numbers2[0]);	// 0 ��° ��ġ�� int[]�� ����Ŵ
		System.out.println(numbers2[0][0]);	// 0 ��° ��ġ�� int[]�� 0��° ��Ҹ� ����Ŵ
		
		numbers2[0][2] = 33;
		System.out.println(numbers2[0][2]);	// [0][2]�� 33���� �ٲ�µ�
		System.out.println(numbers2[3][2]);	// [3][2]�� 33���� ������ ����
		
		System.out.println(numbers2[0]);
		System.out.println(numbers2[1]);
		System.out.println(numbers2[2]);
		System.out.println(numbers2[3]);
		
		/*
		 * 
		 * 	n���� �迭�� n�� �ݺ������� ��� Ž���� �� �ִ�.
		 * 
		 */
		
		char[][] chs = {
				{'a','b','c','d'},
				"Hello, world!".toCharArray(),
				"I have a dream".toCharArray(),
				{'x','y'}
		};
		
		for(int i = 0; i < chs.length; ++i) {
			for(int j = 0; j < chs[i].length; ++j) {
				System.out.printf("chs[%d][%d] : %c ", i , j, chs[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
