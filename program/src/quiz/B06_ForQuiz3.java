package quiz;

public class B06_ForQuiz3 {
	
	public static void main(String[] args) {
		
		/*
		 * 	For문을 사용해 다음과 같이 숫자를 출력해 보세요
		 * 
		 * 	1. 0 3 6 9 ... 99
		 * 	2. -35 -28 -21 ... 0 7 ... 35
		 * 	3. 100 ... 1000
		 * 	4. 100 99 ... 1 0
		 * 	5. 0 1 2 3 ... 6 7 8 9 0 1 2 ... 7 8 9 0 1 ... (30번)
		 * 	6. 10 9 ... 3 2 1 10 9 8 ... 3 2 1 10 9 (30번)
		 * 	7. 7 77 777 7777 .... 7777777777
		 * 
		 */		
		boolean self = false;
		
		if(!self) {
			
//			//#######################################
//			for(int i = 0; i < 30 ; i++) {
//				System.out.print(i % 10 + " ");
//			}
//			System.out.println();
//			
//			
//			//#######################################
//			for(int i = 0; i < 30 ; i++) {
//				System.out.print(i % 7 + " ");
//			}
//			System.out.println();
			
//			System.out.println(Math.pow(10, 2) + Math.pow(10, 1) + 1);
//			System.out.println(Math.pow(10, 1) + 1);
						
			
			long k = 0;			
			for(int j = 0; j < 10 ; ++j) {
				
				k = k + (long)Math.pow(10, j);
				System.out.print((k * 7) + " ");
				
			}
			
			System.out.println();
			
			for(int i = 7 ; i <= 777777777 ; i = i * 10 + 7 ) {
				System.out.print(i);
			}
				

			
//			System.out.println();
			
		}else {
			
			for(int i = 0 ; i < 100; i += 3) {
				
				System.out.print( i + " ");
			}
			
			System.out.println();
			
			for(int i = -35 ; i <= 35; i += 7) {
				
				System.out.print( i + " ");
			}
			
			System.out.println();
			
			for(int i = 100 ; i <= 1000; i += 100) {
				
				System.out.print( i + " ");
			}
			
			System.out.println();
			
			for(int i = 100 ; i >= 0; --i) {
				
				System.out.print( i + " ");
			}
			
			System.out.println();	
			
			for(int i = 0 ; i < 30; ++i) {
				for(int j = 0 ; j < 10; ++j) {
						System.out.print( j + " ");
				}
				//System.out.println("--------"+(i+1)+"-------");
			}
			
			System.out.println();
			
			for(int i = 0 ; i < 30; ++i) {
				for(int j = 10 ; j > 0; --j) {
						System.out.print( j + " ");
				}
				//System.out.println("--------"+(i+1)+"-------");
			}
			
			System.out.println();
			
			for(int i = 1 ; i <= 3 ; ++i) {
				for(int j = 1; j <= 3 ; j++) {
					for(int k = 1; k <= 3 ; k++) {
						System.out.println(i + " + " + j + " + " + k + " = " + (i + j + k));
					}
				}
			}
			
		}
		
	}

}



