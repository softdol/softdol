package quiz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class E01_InputRightThing {
	
	/*
	 * 	����ڷκ��� ���ڸ� �Է¹޵� ���ڸ� ����� �Է¹��������� ��� �Է¹޴� ���α׷��� ����� ������
	 * 
	 */
	public static int inputInt() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("���ڸ� �Է����ּ��� >> ");		
				return sc.nextInt();				
			}catch (InputMismatchException e) {
				sc.nextLine();	// ��ĳ�ʿ� �����ִ� �߸� �Էµ� �ܾ ������� �Ѵ�
			}
			sc.close();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		int a = inputInt();
		int b = inputInt();
		
		System.out.println(a + " : " + b );
		
		//int c = inputInt();
		
	}
}
