
public class B15_Array {
	
	/*
	 * 	# �迭 (Array)
	 * 
	 * 		- ���� Ÿ�� ������ �ѹ��� ������ �����ϴ� ����
	 * 		- ���� �̸����� ������ ������ ������ �Ŀ� �ε����� �����Ѵ�
	 * 		- �迭�� ����� ���ÿ� ũ�⸦ ���ؾ� �Ѵ�
	 * 		- ũ�Ⱑ �������� ���� ũ�⸦ ������ �� ����
	 * 		- �迭�� �� ��ȣ(�ε���)�� 0���� ��ü ����-1 ������ �ִ�
	 * 		- JAVA�� �迭�� ������ ���ÿ� ��� ���� �ʱ�ȭ �Ǿ� �ִ�.
	 * 		  (���� : 0, �Ǽ� : 0.0, boolean : false, ������ : null)
	 * 
	 * 	# �迭 ���� ���
	 * 
	 * 		1. Ÿ��[] ������ = new Ÿ��[ũ��];
	 * 		2. Ÿ��[] ������ = {��1, ��2, ��3, ��4, ��5, ��6, ...}
	 * 		3. Ÿ��[] ������ = new Ÿ��[] {��1, ��2, ��3, ��4, ��5, ��6, ...};
	 */
	
	public static void main(String[] main) {
		
		//	�迭�� ���̰� 3�ϋ� �� ��ȣ�� 2������ �ִ�
		int[] score = new int[5];
		
		score[0] = 99;
		score[1] = 80;
		score[2] = 70;
		//score[3] = 99;

		System.out.println("score�� ���� : " + score.length);
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		boolean[] complete = new boolean[5];
		
		for(int i = 0 ; i < complete.length; ++i) {
			System.out.printf("complete[%d] : %b\n", i, complete[i]);
		}
		
		
		char[] text = new char[100];		
		
		text[0] = 'h';
		text[1] = 'e';
		text[2] = 'l';
		text[3] = 'l';
		text[4] = 'o';
		
		//	char[]�� ���ڿ��̳� �ٸ�����
		System.out.println(text);
		
		int[] num = new int[1000];
		
		num[0] = 5;
		num[1] = 3;
		num[2] = 4;
		
		//System.out.println(num[10]);
		
		// �迭 �����ϱ�
		//short[] eye_power = new short[10];
		//long[] money = { 123L, 234L, 5, 6, 789L };
		String[] name = new String[] {"��ö��","��ö��","��ö��","��ö��","��ö��"};
		
		// �迭�� ���� �ֱ�(�� �����ϱ�)
		name[3] = "������"; 
		
		// �迭�� �� ����ϱ�
		for(int i = 0; i < name.length; ++i) {
			System.out.println(name[i]);
		}
		
		// StringŸ���� char[]�� ��ȯ�Ͽ� ����� �� �ִ�.
		String welcomeMessage = "Hello, world!!";
		
		char[] msg = welcomeMessage.toCharArray();
		
		System.out.println(msg[0]);
		System.out.println(msg[1]);
		System.out.println(msg[msg.length - 1]);
		System.out.println(msg[msg.length - 2]);
		System.out.println(msg[msg.length - 3]);
		System.out.println(msg[msg.length - 4]);
		System.out.println(msg[msg.length - 5]);
		
		
		
	}

}
