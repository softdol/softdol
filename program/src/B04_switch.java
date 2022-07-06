
public class B04_switch {
	/*
	 * 	# switch-case��
	 * 
	 * 		- ()���� ���� ����� ���� ������ �ڵ带 �����ϴ� ����
	 * 		- ()�ȿ� boolean Ÿ�� ��� �ٸ� Ÿ���� ����Ѵ�
	 * 		- if������ �Ϻ��ϰ� ��ü�� �� �ֱ� ������ ���� ��������� �ʴ´�
	 * 		- break�� ������ break�� ���������� �������鼭 ��� case�� �����Ѵ�
	 * 		- default�� if���� else���� ������ �Ѵ�
	 */
	
	public static void main(String[] args) {
		
		int num = 22;
		
		switch (num % 5) {
			case 0:
				System.out.println("num % 5 �� 0 �Դϴ�.");
				//break;
			case 1:
				System.out.println("num % 5 �� 1 �Դϴ�.");
				break;
			case 2:	case 3: case 4:
				System.out.println("num % 5 �� 2,3,4 �Դϴ�.");
				break;
			default :
				System.out.println("���� case�� ��� �ش����� �ʾ� ����˴ϴ�.");
				break;
		}
		
	}

}
