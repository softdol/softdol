
public class B06_For {
	
	/*
	 * 
	 * 	# �ݺ���(loop)
	 * 
	 * 		- for, while, for-each, do-while(x)
	 * 		- �Ȱ��� �ڵ带 ������ �ݺ��ϰ� ���� �� ����Ѵ�
	 * 
	 * 	# for��
	 * 		
	 * 		for(�ʱⰪ; �ݺ�����; ������)	{
	 * 			����� �ݺ� ������ ���� ���� �ݺ��� �ڵ��
	 * 		}
	 */
	
	public static void main(String[] args) {
		
		//System.out.println("Hello, world!");
		
		for(int i = 0; i < 3; i+=2)
		{
			System.out.println("Hello, world!" + i);
		}
		
		System.out.println("�ݺ��� ����");
		
		
		/*
		 * 	1. ���� �⺻���� ������ for��
		 * 
		 * 		- �ʱⰪ�� 0�� �ְ� , ���ǿ��� �ݺ��ϰ� ���� Ƚ���� ���´�
		 * 		- ������ 1�� �Ѵ�
		 * 		- ���ϴ� Ƚ����ŭ �ݺ��ϱ� ���� ���� for��
		 * 
		 */		
		for(int i = 0; i < 50 ; ++i) {
			System.out.println("���ϴ� Ƚ����ŭ �ݺ��ϴ� �ݺ���! " + (i + 1));
		}
		/*
		 * 	2. �ʱⰪ�� �������� ������ �����Ӱ� ������ for��
		 * 
		 * 		- �ʱⰪ, ������, ������ �����Ӱ� �����ϸ� �뵵�� �°� ����� �� �ִ�.
		 * 		- �ʱⰪ, ������, ������ �� ���� �ʾƵ� �ȴ�.
		 */
		
		for(byte b = 0;; b++) {
			System.out.println("Hi! " + b);
		}
		
	}

}
