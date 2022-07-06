/*
 	# Windows ����Ű

 	 - [Win] + E : Ž����
     - [Win] + Shift + S : ��ũ����(��ũ���� �� īī���� �ٿ��ֱ� ����)

 	# Eclipse ����Ű

 	 - Ctrl + [+,-] : ����ũ�� 
 	 - Ctrl + M : ���� â �ִ�/�ּ�ȭ

 	# ������ ����Ű

 	 - Home : ���� ���� �� ������ �̵�
 	 - End : ���� ���� �� �ڷ� �̵�
 	 - Shift + Home : ���� Ŀ�� ��ġ���� �� �ձ��� ��������Ѵ� 
 	 - Shift + End :  ���� Ŀ�� ��ġ���� �� �ڱ��� ��������Ѵ�
 	 - Shift + ����Ű : Ŀ���� �����̸� ��������Ѵ�
 	 - Ctrl + A : ��ü ������ ��������Ѵ�
 	 - Ctrl + Home : ������ �� ���� �̵��Ѵ�
 	 - Ctrl + End : ������ �� �Ʒ��� �̵��Ѵ�
 	 - Ctrl + Shift + Home : ���� ��ġ���� ������ �� ������ �������
 	 - Ctrl + Shift + End : ���� ��ġ���� ������ �� �Ʒ����� �������
 */
// �� public class�� �̸��� �ݵ�� ���ϸ�� ���ƿ� �Ѵ�
public class A00_Hello {
	// Eclipse���� ���� ���� ������ ��(������ �߰����� ��) �װ��� Ŀ���� �ΰ� F2�� ������ 
	// �ش� ������ ���� ������ �ذ�å�� �� �� �ִ�

	/*
	 * # main() �Լ�
	 * 
	 *  - Java���� � �ܾ� �ڿ� ()�� ������ �Լ���� �Ѵ�
	 *  - ���α׷��� ���� ����
	 *  - ����ڰ� ���α׷��� �����ϸ� ���� ���� main() �Լ��� ã�Ƽ� �����Ѵ�
	 */
	public static void main(String[] args) {
		// ���α׷� �����ϸ� ���� ���� �����ϴ� ��

		/*
		 * # System.out.println() �Լ�
		 * 
		 *  - ()�ȿ� ������ �����͸� �ܼ� ȭ�鿡 ����ϴ� �Լ�
		 *  
		 * # �ܼ� 
		 *  
		 *  - ���ڸ� ������ CLI(Command Line Interface) ȯ���� ȭ��
		 *  - Eclipse������ �׽�Ʈ������ �ܼ��� �������ش�
		 *  - �츮�� ���� ���α׷��� ���� �ֿܼ����� �����ϰ� �����Ѵ�
		 *  - ������ �ҽ��ڵ�(.java)�� ������ ���(.class)�� ������Ʈ ������ bin ������ ����ȴ�.
		 *  
		 *  �� �����ݷ�(;)
		 *  
		 *  - �� ��ɾ �������� �����Ϸ����� �˸��� ����
		 */
		System.out.println(123456789 + 1000); //	Ctrl + F11
		for(int i = 0; i < 4; i++) {
			pPrint("Hello, world!");
		}						
		pBox(1);
		/*
		 * # �ڹ��� ������ ����(���ͷ��� ����)
		 * 
		 *  1. "" ���̿� ���� �� : ���ڿ�(String), ���ڸ� ������ ���� �� �ִ� Ÿ��
		 *  2. '' ���̿� ���� �� : ����(Character),�ϳ��� ���ڸ� �ǹ��ϴ� ������ Ÿ��
		 *  3. �׳� ���ڸ� ���� �� : ����(Integer), ����� ����
		 *  4. �Ҽ��� ���� �� : �Ǽ�(Float,Double), ����� ����
		 *  5. true/false : ��/����(Boolean)
		 */
		System.out.println("Hello");
		System.out.println('H');
		System.out.println(100 * 13);
		System.out.println(123.45678 / 100);
		System.out.println(true);
		System.out.println(false);

		//���ڿ��� �ٸ� Ÿ���� +�ϸ� �̾���δ�
		System.out.println("Hello " + 1234);
		System.out.println("Hello " + ":ABC");
		System.out.println("Hello " + true);
		System.out.println("Hello " + 123.1234);

		/*
		 *  #�鿩���� (Tab)
		 *  
		 *   - �ڵ� ����� {} ���ο� �ִٸ� �� �ܰ� �� �鿩��� �Ѵ�
		 *   - ��ü���� �ڵ��� ���븦 �˾ƺ��� ��������
		 *   - Tab : �鿩����
		 *   - Shift + Tab : �Ųٷ� �鿩����
		 *   - ������ �� Ctrl + I : �ڵ� �鿩����
		 */

		//���α׷��� ������ �κ�
	}

	static void pPrint(String sVal) {
		System.out.println(sVal);
	}


	static void pBox(int iVal)  {
		
		for(int i=0;i<iVal;i++) {
			System.out.println();
			System.out.println("��������������������������������������������");

			if(i > 9) {
				System.out.println("��"+i+". Hello, world!   ��");
			}else {
				System.out.println("��"+i+". Hello, world!    ��");
			}

			System.out.println("��������������������������������������������");
			System.out.println("��������������������������������������������");
			System.out.println("��������������������������������������������");
			System.out.println("��������������������������������������������");
			System.out.println();
		}
		
	}


}

