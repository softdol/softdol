package quiz;

import java.util.Scanner;

public class B00_Gugudan {
	/*
	 * 	����ڷκ��� ���ڸ� �Է¹����� 
	 *  �������� �ش� ���� ���� ��� ����ϴ� ���α׷��� ����� ������.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	//Ctrl + Shift + o
	
		System.out.print("���ϴ� �������� �Է��� �ּ���(������) >> ");		
		int iGugudan = sc.nextInt();
		
		//InputStream ����ֱ�
		sc.nextLine();
		
		System.out.print("Your name ? ");
		//String name = sc.nextLine();

//		for(int i = 0; i <= iGugudan; i++) {
//			for(int j = 0; j <= iGugudan; j++) {
//				if(i > j) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
//		
//		System.out.println("----------------------");
//		
//		for(int i = 0; i <= iGugudan; i++) {
//			for(int j = 0; j <= iGugudan; j++) {
//				if(i < j) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		
//		
		System.out.printf("====== %d �� =======\n", iGugudan);
//		System.out.printf("  %d  *  1  = %4d\n", iGugudan,iGugudan*1);
//		System.out.printf("  %d  *  2  = %4d\n", iGugudan,iGugudan*2);
//		System.out.printf("  %d  *  3  = %4d\n", iGugudan,iGugudan*3);
//		System.out.printf("  %d  *  4  = %4d\n", iGugudan,iGugudan*4);
//		System.out.printf("  %d  *  5  = %4d\n", iGugudan,iGugudan*5);
//		System.out.printf("  %d  *  6  = %4d\n", iGugudan,iGugudan*6);
//		System.out.printf("  %d  *  7  = %4d\n", iGugudan,iGugudan*7);
//		System.out.printf("  %d  *  8  = %4d\n", iGugudan,iGugudan*8);
//		System.out.printf("  %d  *  9  = %4d\n", iGugudan,iGugudan*9);
//		
		for(int i = 1; i < 10; i++) {
			System.out.printf("  %d  *  %d  = %4d\n", iGugudan, i, iGugudan*i);
		}
		
		System.out.printf("===================");
		
		sc.close();
	}
	
}
