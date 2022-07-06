package myobj;

public class C03_Multiply20220509 {

	public static void main(String[] args) {
		
//		int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
//		int[][] arr2 = {{3, 3}, {3, 3}};
		
//		int[][] arr1 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
//		int[][] arr2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
		
		//int[][] a = solution(arr1, arr2);
	}
	
	public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for(int i = 0; i < arr1.length; i++) {
        	for(int j = 0; j < arr1[i].length; j++) {
        		System.out.print(arr1[i][j]);
        	}
        	System.out.println();
        }
        
        System.out.println();
        
        for(int i = 0; i < arr2.length; i++) {
        	for(int j = 0; j < arr2[i].length; j++) {
        		System.out.print(arr2[i][j]);
        	}
        	System.out.println();
        }      
        
        // 곱하려는 행값
        for(int i = 0 ; i < arr1.length ; ++i){
        	// 곱하려는 열값
            for(int j = 0 ; j < arr2[0].length ; ++j){
            	// 곱하려는 행의 각 값
                for(int k = 0 ; k < arr1[0].length ; ++k) {
                	// 행과열의 곱이기 때문에 행과 열의 수로 배열 생성후 값을 더해 넣기
                	// 행의 값 * 열의 값
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        
        System.out.println();
        
        for(int i = 0; i < answer.length; i++) {
        	for(int j = 0; j < answer[i].length; j++) {        		
        		System.out.print("[" + answer[i][j] + "]");
        	}
        	System.out.println();
        }
//        00 01   00 01
//        10 11   10 11
//        20 21
//        
//        00 * 00 + 00 * 10 , 01 * 00 + 00 * 10 , 01 * 00 + 01 * 10 
        
        return answer;
    }
	
}
