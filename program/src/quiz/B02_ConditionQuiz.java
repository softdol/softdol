package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz {
	/*
	 * 	# �˸��� �� ������ ����� ������
	 * 
	 * 	1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true
	 * 	2. int�� ���� b�� ¦���� �� true
	 *  3. int�� ���� c�� 7�� ����϶� true
	 * 	4. int�� ���� hour�� 0�̸� 24�̻��� �ƴϰ�,  12�̻��� �� true
	 * 	5. int�� ���� d�� edml ���̰� 30�϶� true
	 * 	6. int�� ���� year�� 400���� ������ �������ų� �Ǵ� 4��
	 * 		������ �������� 100���� ������ �������� ������ true
	 * 	7. �μ��� ö������ ������ 3�� ������ true
	 * 	8. boolean�� ���� powerOn�� false�϶� true
	 * 	9. ���ڿ� �������� str��  "yes"�ϋ� true
	 */
	
	public static void main(String[] args) {
		
//		1. int�� ���� a�� 10���� ũ�� 20���� ���� �� true		
		int a = 10;
		System.out.println("1�� : " + (a > 10 && a < 20));
		
//	  	2. int�� ���� b�� ¦���� �� true		
		int b = 30;
		System.out.println("2�� : " + (b % 2 == 0));
		
//		3. int�� ���� c�� 7�� ����϶� true		
		int c = 17;
		System.out.println("3�� : " + (c % 7 == 0));
		
//		4. int�� ���� hour�� 0�̸� 24�̻��� �ƴϰ�,  12�̻��� �� true		?????
		int hour = 12;
		//System.out.println("4�� : " + ( (hour >= 0 && hour < 24) || (hour >= 0 && hour >= 12)));

		System.out.println("4�� : " + (!(hour < 0 && hour >=24) && hour >= 12));
		
		// �ð��� 0 �̻� 24 �̸��̰� 12�̻��� ��
		//System.out.println("4�� : " + (hour >= 0 && hour < 24 && hour >= 12));
		
		//System.out.println("4�� : " + (!(hour < 0)));
		//System.out.println("4�� : " + (hour <= 24));
		//System.out.println("4�� : " + (hour >= 12));
		
//		5. int�� ���� d�� e�� ���̰� 30�϶� true
		int d = -5, e = 25;
		System.out.println("5�� : " + (d - e == 30 || d - e == -30));		
		
//		6. int�� ���� year�� 400���� ������ �������ų� �Ǵ� 4��
//			������ �������� 100���� ������ �������� ������ true
		int year = 404;
		System.out.println("6�� : " + (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)));
		
//		7. �μ��� ö������ ������ 3�� ������ true
		int minBmon = 10;
		int chulBmon = 1;
		System.out.println("7�� : " + (minBmon - chulBmon == 9 || minBmon - chulBmon == -3 ));
		System.out.println("**7�� : " + ((minBmon + 3) % 12 == chulBmon));
		
//		8. boolean�� ���� powerOn�� false�϶� true
		boolean powerOn = true; 
		System.out.println("8�� : " + (powerOn == false));
		
//		9. ���ڿ� �������� str��  "yes"�ϋ� true
		Scanner sc = new Scanner(System.in);
		
		String str = "yes";
		String str2;
		
		System.out.print("yes�� �Է��ϼ��� > ");
		str2 = sc.next();
		sc.close();
		System.out.println("9�� : " + (str == "yes"));
		System.out.println("9�� : " + (str2 == "yes"));
		
		// # ������ ������ == ���� ���ϸ� �ȵȴ�
		// ���� ���� ���� ��(������ �ִ� ���� ���� ������ ��)
		// ���� ���� �������� ���Ҷ��� �ش� ������ ������ �����ִ� equals()�� ����Ѵ�
		System.out.println("9�� : " + str2.equals("yes"));
	}

}

