/*
 * 	# Import
 * 		- �ٸ� ��Ű���� ����Ǿ� �ִ� Ŭ������ ��Ű������ �����ϰ� ����ϱ� ���� ����
 */
import java.util.Scanner;
//import quiz.A00_Rabbit;
//import quiz.A01_MermberInfo;
//import quiz.A04_VarTypes;

public class B00_Scanner {
	
	/*
	 * 	# java.util.Scanner
	 * 
	 * 		- ���α׷����� �Է��� ���� �� �ִ� ��ɵ��� ���ִ� Ŭ����
	 * 		- ��� ������ ���� �Է� ������ ������ �� ��ĳ�ʸ� �����Ͽ� ��� �Ѵ�
	 * 
	 */
	
	public static void main(String[] args) {
		
		// ��� �츮�� �ٸ� ��Ű���� ������� �͵��� ������ ����� �� �ִ�.
//		A00_Rabbit.main(null);
//		A01_MermberInfo.main(null);
//		A04_VarTypes.main(null);
		
		// ���� ��Ű���� �����ִ� �ٸ� Ŭ������ ��Ű������ �����ϰ� ����� �� �ִ�.
//		A00_Hello.main(null);		
	
		// import�� ���� ��Ű������ �����ϰ� ����� �� �ִ�.
		// System.in ���� �Է¹޴� ���ο� ��ĳ�ʸ� ����
		Scanner abbc = new Scanner(System.in);	//Ctrl + Shift + o
		
		/*
		 * 	(1) nextŸ��()
		 * 
		 * 		- �Էµ� ���� �� ���� ���� �ϳ��� ���� �� �ش� Ÿ������ ��ȯ�Ͽ� �����´�
		 * 		- ��ο��� ���� ���� �ش� Ÿ���� �� �� ���ٸ� ������ �߻��Ѵ�
		 * 		- ����, ��, \n �� �������� ���� �����Ѵ�
		 * 		- ��ο� �ƹ� ���� ���ٸ� ���α׷��� ���߰� ���ο� �Է��� ��ٸ���   
		 * 
		 * 	(2) next()
		 * 		
		 * 		- �Էµ� ���� �� ���� ���� �ϳ� ���ڿ� Ÿ������ ������
		 * 		- ����, ��, \n �� �������� ���� �����Ѵ�
		 * 		- ��ο� �ƹ� ���� ���ٸ� ���α׷��� ���߰� ���ο� �Է��� ��ٸ���
		 * 
		 * 	(3) nextLine()
		 * 
		 * 		- \n �� �������� ��� ���� �����Ѵ�
		 * 		- �Էµ� ���� ��� ���ڿ� Ÿ������ ������
		 * 		- ��ο� �ƹ� ���� ���ٸ� ���α׷��� ���߰� ���ο� �Է��� ��ٸ���
		 */
		System.out.print("������ �Է��ϼ��� >> ");
		
		//int input = abbc.nextInt();
//		String input = abbc.next();
//		String input2 = abbc.next();
		
		String input = abbc.nextLine();
		String input2 = abbc.nextLine();
		
		System.out.printf("�Է��Ͻ� ���� %s�Դϴ�.\n", input);
		System.out.printf("�Է��Ͻ� ���� %s�Դϴ�.\n", input2);
		
		abbc.close();
	}

}
