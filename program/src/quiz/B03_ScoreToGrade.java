package quiz;

import java.util.Scanner;

public class B03_ScoreToGrade {

	/*
	 *	������ �� �� �Է¹ް� �� ������ �� ��
	 *	�� ������ �ش��ϴ� ����� ������ִ� ���α׷��� ��������.
	 *
	 *	1. ������ ��/��/���� �ִ�
	 *
	 *	2. 90�� �̻��� A,
	 *	   90�� �̻��� B,
	 *     90�� �̻��� C,
	 *     90�� �̻��� D,
	 *     �� �ܴ� F����̴�.
	 *     
	 *  3. ��ȿ�� ������ 0 ~ 100���̴�. (��ȿ���� �ʴ� ������ F��� ó��)
	 *  4. ��� ������ �Ҽ� ��° �ڸ����� �ݿø��Ͽ� ����Ѵ�. 
	 *    
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, math;
		// int total;
		double avg;
		char grade;
		
		System.out.print("������ ������ �Է��� �ּ��� >>");
		kor	 = sc.nextInt();
		//System.out.print("���� ������ �Է��� �ּ��� >>");
		eng	 = sc.nextInt();
		//System.out.print("���� ������ �Է��� �ּ��� >>");
		math = sc.nextInt();
		
		sc.close();
		//avg = (double)(kor + eng + math) / 3;
		avg = (kor + eng + math) / 3.0;
		avg = Math.round(avg*100) / 100.0;
		grade = 'F';
		
		if(kor >= 0 && kor < 101 && eng >= 0 && eng < 101 && math >= 0 && math < 101) {
			if(avg >= 90) {
				grade = 'A';
				//System.out.printf("�Է� ����(��:%d ��:%d ��:%d)�� ���(���:%.2f)�� A �Դϴ�.", kor, eng, math, avg);
				//return;	//main()�� ������ ���� �� �ִ�.
			}else if(avg >= 80){
				grade = 'B';
				//System.out.printf("�Է� ����(��:%d ��:%d ��:%d)�� ���(���:%.2f)�� B �Դϴ�.", kor, eng, math, avg);
			}else if(avg >= 70){
				grade = 'C';
				//System.out.printf("�Է� ����(��:%d ��:%d ��:%d)�� ���(���:%.2f)�� C �Դϴ�.", kor, eng, math, avg);
			}else if(avg >= 60){
				grade = 'D';
				//System.out.printf("�Է� ����(��:%d ��:%d ��:%d)�� ���(���:%.2f)�� D �Դϴ�.", kor, eng, math, avg);
			}else {
				grade = 'F';
				//System.out.printf("�Է� ����(��:%d ��:%d ��:%d)�� ���(���:%.2f)�� F �Դϴ�.", kor, eng, math, avg);
			}
			System.out.printf("�Է� ����(��:%d ��:%d ��:%d)�� ���(���:%.2f)�� %c �Դϴ�.", kor, eng, math, avg, grade);
		}else {
			System.out.printf("�߸��� ����(��:%d ��:%d ��:%d)�� �ԷµǾ� ���(���:%.2f)�� %c �Դϴ�.", kor, eng, math, avg, grade);
		}

				
	}
}
