package quiz;

public class B10_Gugudan {
	
	/*
	 *	1. �������� ������ ���� ���η� ����غ��ÿ�
	 *
	 * 		2�� : 2....
	 * 		3�� : 3....
	 * 
	 * 	2. �������� �ٿ�� ���� ���η� ����غ�����
	 * 
	 * 		2��	3��	4��...
	 * 		2.. 3.. 4..
	 * 		2.. 3.. 4..
	 * 
	 */
	public static void main(String[] args) {
		
		
		boolean self = false;
		
		if(!self) {
			for(int dan = 2; dan <= 9 ; ++dan) {
				System.out.printf("%d��: ", dan);				
				for(int gop = 1 ; gop <= 9; ++gop) {
					System.out.printf("%dx%d=%-2d ", dan, gop, dan*gop);
				}				
				System.out.println();
			}
			
			System.out.println();
			
			for(int gop = 0; gop <= 9; ++gop) {
				for(int dan = 2; dan <=9 ; ++dan) {
					if(gop == 0) {
						System.out.printf("%d��\t", dan);
					}else {
						System.out.printf("%dx%d=%d\t", dan, gop, dan*gop);
					}
				}
				System.out.println();
			}
			
			
		}else {
			
			for(int i = 2 ; i <= 9; i++) {				
				System.out.printf("%d��: ", i);				
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
						System.out.printf("%d��\t", i);
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
