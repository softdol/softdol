import java.util.Scanner;

public class B03_If {

	/*
	 * 	# if ��
	 * 
	 * 		- ()���� ���� true�� {}���� ������ �����ϴ� ����
	 * 		- ()���� ���� false�� {}���� ������ �����Ѵ�
	 * 
	 * 	# else if��
	 * 
	 * 		- ���� if���� ������� �ʾҴٸ� if��ó�� �����Ѵ�
	 * 		- else if�� ������ ����� �� �ִ�
	 * 		- else if�� �ܵ����� ����� �� ����
	 * 
	 * 	# else��
	 * 
	 * 		- ���� ����(if, else if)�� ��� �ƴ϶�� {}���� ������ ������ �����Ѵ�
	 * 		- if�� �ٷ� ������ ����� ���� �ִ�
	 * 		- �ܵ����� ����� �� ����
	 * 		- else�� �پ��ִ� if���� �ּ��� �ѹ��� ����ȴ�
	 * 
	 */
	
	public static void main(String[] args) {
		
		if (true) {
			System.out.println("if���� true�� �� ����Ǵ� ��ɾ�1");
			System.out.println("if���� true�� �� ����Ǵ� ��ɾ�2");
			System.out.println("if���� true�� �� ����Ǵ� ��ɾ�3");
		}
		
		int a = 6;
		
		if (a % 2 == 0) {
			System.out.println("a�� ���� ¦���϶��� ��µǴ� ����");
		}else if (a % 3 == 0) {
			System.out.println("a�� ���� ¦���� �ƴϸ鼭 3�� �����");
		}else if (a % 5 == 0) {
			System.out.println("2�� ����� �ƴϰ� 3�� ����� �ƴ� 5�� ���");
		}else {
			System.out.println("���� ������ ��� �ƴմϴ�");
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Ͻ� ����� ���� >> ");
		
		int apple;
		String size;
		apple = sc.nextInt();
		
		sc.close();
		
		if(apple > 10) {
			size = "��뷮 ���̹�";
		}else if (apple > 5) {
			size = "���� ���̹�";
		}else {
			size = "���� ���̹�";
		}
		
		System.out.println(size);
		
		//String answer;
		
		//answer.replace(/[`~!@#$%^&*()|+\=?;:'"<>\{\}\[\]\\\/ ]/g,'');
	}
	
}
