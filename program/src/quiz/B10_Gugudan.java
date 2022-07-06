package quiz;

public class B10_Gugudan {
	
	/*
	 *	1. 구가단을 다음과 같이 가로로 출력해보시오
	 *
	 * 		2단 : 2....
	 * 		3단 : 3....
	 * 
	 * 	2. 구구단을 다움과 같이 세로로 출력해보세요
	 * 
	 * 		2단	3단	4단...
	 * 		2.. 3.. 4..
	 * 		2.. 3.. 4..
	 * 
	 */
	public static void main(String[] args) {
		
		
		boolean self = false;
		
		if(!self) {
			for(int dan = 2; dan <= 9 ; ++dan) {
				System.out.printf("%d단: ", dan);				
				for(int gop = 1 ; gop <= 9; ++gop) {
					System.out.printf("%dx%d=%-2d ", dan, gop, dan*gop);
				}				
				System.out.println();
			}
			
			System.out.println();
			
			for(int gop = 0; gop <= 9; ++gop) {
				for(int dan = 2; dan <=9 ; ++dan) {
					if(gop == 0) {
						System.out.printf("%d단\t", dan);
					}else {
						System.out.printf("%dx%d=%d\t", dan, gop, dan*gop);
					}
				}
				System.out.println();
			}
			
			
		}else {
			
			for(int i = 2 ; i <= 9; i++) {				
				System.out.printf("%d단: ", i);				
				for(int j = 1 ; j <= 9; j++) {
					System.out.printf("%dx%d=%-2d ", i, j, i*j);
				}				
				System.out.println();				
			}			
			System.out.println();
			System.out.println();
			
			for(int j = 0; j <= 9; j++) {			
				if (j == 0) {
					for (int i = 2; i <= 9; i++) {
						System.out.printf("%d단\t", i);
					}
				} else {
					for (int i = 2; i <= 9; i++) {
						System.out.printf("%dx%d=%d\t", i, j, i * j);
					}
				}				
				System.out.println();
			}
			
		}
		
		
		
		
	}

}
