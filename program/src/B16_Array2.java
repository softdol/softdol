
public class B16_Array2 {
	
	public static void main(String[] args) {
		
		//	배열 안에 배열을 넣을 수 있다.
		//	(배열로 이루어진 배열을 만들 수 있다.)
		
		int[] numbers = {1,2,3,4,5};
		int[][] numbers2 = {
				numbers,
				{1,2,3,4,5},
				numbers, 
				numbers};
		
		System.out.println(numbers[3]);	
		System.out.println(numbers2[0]);	// 0 번째 위치의 int[]을 가리킴
		System.out.println(numbers2[0][0]);	// 0 번째 위치의 int[]의 0번째 요소를 가리킴
		
		numbers2[0][2] = 33;
		System.out.println(numbers2[0][2]);	// [0][2]를 33으로 바꿨는데
		System.out.println(numbers2[3][2]);	// [3][2]도 33으로 나오는 현상
		
		System.out.println(numbers2[0]);
		System.out.println(numbers2[1]);
		System.out.println(numbers2[2]);
		System.out.println(numbers2[3]);
		
		/*
		 * 
		 * 	n차원 배열은 n중 반복문으로 모두 탐색할 수 있다.
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
