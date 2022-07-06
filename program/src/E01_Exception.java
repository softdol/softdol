import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class E01_Exception {
	
	/*
	 * 	# ���� (Exception)
	 * 
	 * 	 - �츮�� ������� �����ߴ� ���� �۾����� ���ܶ�� �θ���
	 * 	 - �ڹ��� ������ Ʋ���� ���� ���ܰ� �ƴ϶� ������ ����(�ڹ� ���� ����)��� �θ���
	 * 	 - ���α׷��Ӵ� �߻��� ���ܸ� �̸� ���G�ϰ� ����� �� �� �ִ�(���� ó��)
	 *	 - ���� �߻� �� �⺻ ������ ���α׷��� ���� �����̴�
	 *
	 *	# ���� ó��
	 *
	 *	 - ���ܰ� �߻��� ���ɼ��� �ִ� �ڵ带 try�� ���ο� ���Խ�Ų��
	 *	 - try�� ���ο��� ���ܰ� �߻����� ������ ��� ���� ����ȴ�
	 *	 - try�� ���ο��� ���ܰ� �߻��ϸ� ��� try�� ������ �ߴ��ϰ� �߻��� ���ܿ� �ش��ϴ�
	 *		catch������ �Ѿ�� �ȴ�
	 * 	 - catch���� ������ �� �� �ִ�
	 * 	 - ���� �߻��� 
	 */
	public static void main(String[] args) {
		int[] arr = new int[10];
		try {
			for(int i = 0; i < arr.length; i++) {
				arr[i] = i;
			}
			arr[8] = 123;
			arr[10] = 123;
			arr[9] = 123;
			System.out.println("try���� ������ �����߽��ϴ�!");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 �ε��� ������ ������ϴ�.");
			
			//System.exit(0);
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Hello!");
		
		// ���� ó���� ��ĳ�� ����ϱ�
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		try {
			System.out.print("�ݵ�� ���ڸ� �Է����ּ��� >> ");
			num = sc.nextInt();
			num = 10 / num;
			
		}catch(InputMismatchException e) {
			System.out.println("�ݵ�� ���ڸ� �Է��϶�� �����ٵ�?");
			
			// ��� ������ �߻��ߴ��� �����ϴ� �޼���
			e.printStackTrace();
			num = -1;
		}catch(ArithmeticException e) {
			System.out.println("num���� 0�� �־�� �ȵ˴ϴ�..");
			num = -2;
		}catch(Exception e) {
			System.out.println("Exception Ŭ������ ��� ������ �θ��̱� ������"
					+ "������ ��� ���ܸ� �ѹ��� ó���� �� �ֽ��ϴ�.");
			num = -3;
		}finally {
			System.out.println(" /)/)");
			System.out.println("(   ..)");
			System.out.println("(    >$");
			System.out.println("�� �䳢�� ���ܰ� �߻��ϴ� ���ϴ� ������ ���� �մϴ�.");
		}
		
		System.out.println("�Է��Ͻ� ���ڴ� : " + num);
		
		sc.close();
	}

}


















