package quiz;

public class B06_ForQuiz {

	/*
	 * 
	 * ����ڰ� ���ڸ� �Է��ϸ�
	 * 
	 * 1. 100���� 300������ ������ ���غ�����
	 * 
	 * 2. 1���� 2000������ ������ 7�� ����� ����� ������
	 * 
	 * 3. 1000���� 1500���� 10�� ����� ���ٿ� 10���� ��� �ǵ��� ����� ������
	 * 
	 */
	public static void main(String[] args) {

		// int num = 110;
		int total = 0;

		// 1. 100���� 300������ ������ ���غ�����

		for (int i = 100; i <= 300; ++i) {

			total += i;

		}

		System.out.printf("������ : %d�Դϴ�.\n", total);

		// 2. 1���� 2000������ ������ 7�� ����� ����� ������
		for (int i = 1, cnt = 1; i <= 2000; ++i) {

			if (i % 7 == 0) {
				System.out.printf("%d��° 7�� ��� [%d]�Դϴ�.\n", cnt++, i);
			}

		}
		// 3. 1000���� 1500���� 10�� ����� ���ٿ� 10���� ��� �ǵ��� ����� ������

		for (int i = 1000, lineCount = 0; i <= 1500; ++i) {

			if (i % 10 == 0) {

				System.out.printf("%-6d ", i);
				lineCount += 1;

				if (lineCount % 10 == 0) {

					System.out.println();

				}

			}

		}

	}

}
