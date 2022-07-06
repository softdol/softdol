
public class A06_Print {

	/*
	 * 	# �ֿܼ� ����ϴ� �Լ���
	 * 
	 * 	 1. println()
	 * 
	 *		- ()�ȿ� ������ �����͸� �ֿܼ� ����ϸ鼭 ���� �ڵ����� �ٲ��ش�.
	 *
	 *	 2. print()
	 *		
	 *		- ()�ȿ� ������ �����並 �ֿܼ� ����Ѵ�
	 * 
	 * 	 3. printf()
	 * 
	 * 		- print format
	 * 		- ������ �̿��� ���ϴ� ��� ���¸��̸� ����� �� �� �ִ� �Ա� 
	 * 		- ���� ���� �ڸ��� ���� ������� ä���� ����Ѵ�
	 * 		- \n�� �ڵ����� �߰����� �����Ƿ� �����ؾ� �Ѵ�
	 * 
	 * 		�� ���� ������ ����https://www.msn.com/ko-kr/feed
	 * 
	 * 			%d : �ش� �ڸ��� ������ �������� 10������ ��� (decimal)
	 * 			%x : �ش� �ڸ��� ������ �������� 16������ ��� (hexa devimal �ҹ���)
	 * 			%X : �ش� �ڸ��� ������ �������� 16������ ��� (hexa devimal �빮��)
	 * 			%o : �ش� �ڸ��� ������ �������� 8������ ���
	 * 			%s : ���ڿ�
	 * 			%c : ����
	 * 			%f : �Ǽ�(float, double)
	 * 			%% : %�� ����ϰ� ������
	 * 
	 * 		�� ���� ������ �ɼ�
	 * 
	 * 		 - ���� ������ %�� ���� ���̿� �־ ����Ѵ�
	 * 
	 *  		1. %����d
	 *  		 - �ڸ����� ���ڸ�ŭ Ȯ���ϸ鼭 ����Ѵ�
	 *  
	 *  		2. %-����d
	 *  		 - �ڸ����� ���ڸ�ŭ Ȯ���ϸ鼭 ���� �����Ͽ� ����Ѵ�
	 *  
	 *  		3. %0����d
	 *  		 - �ڸ����� ���ڸ�ŭ Ȯ���ϸ鼭 ���ڸ��� 0 ����Ѵ�
	 *  
	 *  		4. %.����f
	 *  		 - �Ǽ��� �Ҽ��� �Ʒ� �ڸ����� �����Ѵ�
	 */
	public static void main(String[] args) {		
		 
		System.out.printf("%5d\n",1234);
		System.out.printf("%10d\n",1234);
		System.out.printf("%15d\n",1234);
		
		System.out.printf("%-5s : 10\n","score");
		System.out.printf("%-10s : 10\n","score");
		System.out.printf("%-15s : 10\n","score");
		System.out.printf("%-20s : 10\n","score");
		System.out.printf("%-25s : 10\n","score");
		
		System.out.printf("%04d\n",15);
		System.out.printf("%04d\n",3);
		
		System.out.printf("%010.3f\n",123.5555555555);
			
		System.out.println("Hello, world!");
		System.out.print("Hello, world!");
		System.out.println("Hello, world!");
		System.out.printf("������ %d�� %d�� �Դϴ�. \n", 4, 30);
		
//		System.out.printf("30(10) : %d\n", 30);
//		System.out.printf("30(16) : %x\n", 30);
//		System.out.printf("30(16) : %X\n", 30);
//		System.out.printf("30(8) : %o\n", 30);
//		System.out.printf("������ %s �Դϴ�. \n", "�����");
//		System.out.printf("������ %c���� �Դϴ�. \n", '��');		
//		System.out.printf("������ �µ�: %.3f�� \n", 27.8f);
//		System.out.printf("������ �µ�: %.2f�� \n", 27.8f);
//		System.out.printf("������ �µ�: %.1f�� \n", 27.8f);
//		System.out.printf("������ �µ�: %.0f�� \n", 27.8f);
		
		int year = 2022, month = 4, date = 13;
		int hour = 14, minute = 24, second = 55;
		
		System.out.println("������ " + year + "�� " + month + "�� " + date + "���̰�, ���� �ð��� "
		+ hour + "�� " + minute + "�� " + second + "�� �Դϴ�.");
		System.out.printf("������ %d�� %d�� %d���̰�, ���� �ð��� %d�� %d�� %d�� �Դϴ�."
				, year, month, date, hour, minute, second);
	}
}



