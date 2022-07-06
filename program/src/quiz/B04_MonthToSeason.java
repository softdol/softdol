package quiz;

import java.util.Scanner;

public class B04_MonthToSeason {

	/*
	 * 	����ڷκ��� �� ������ �Է¹����� �ش��ϴ� ������ ����غ�����
	 * 	(�ݵ�� switch-case ���� ����Ұ�
	 * 
	 * �Ϲ������� 3��4��5���� ��, 
	 * 	6��7��8���� ����,
	 *  9��10��11���� ����,
	 *  12��1��2���� �ܿ��̶�� �Ѵ�.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��� �ּ��� >>");
		
		int month = sc.nextInt();		

		String season = "";
		
		sc.close();
		switch (month) {
		//switch (month) {
			case 3: case 4: case 5:
				season = "��";
				break;			
			case 6: case 7: case 8:
				season = "����";
				break;
			case 9: case 10: case 11:
				season = "����";
				break;
			case 12: case 1: case 2:
				season = "�ܿ�";
				break;
			default:
				System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
				return;
		}		
		
		System.out.printf("�Է��Ͻ� ���� ������ [%s] �Դϴ�.", season);
		
	}
}
