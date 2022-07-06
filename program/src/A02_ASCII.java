
public class A02_ASCII {
	/*
	 * 	# ASCII �ڵ�
	 * 
	 * 	 - ���� 0 ~ 127 ���� �����ϴ� ���ڸ� ASCII �ڵ��� �Ѵ�
	 * 	 - 65 : 'A'
	 * 	 - 97 : 'a'
	 * 	 - 48 : '0'
	 */
	public static void main(String[] args) {
		/*
		 * 	��� �����ʹ� ������ 0�� 1�� ��ȯ�Ǿ� ����ȴ�
		 * 	���ڴ� �ٷ� 0�� 1�� ��ȯ�� �� ���� ������ ���ڿ� �ش��ϴ� ���ڰ��� �����Ѵ�.
		 * 
		 * 	�� ���� �� 0 ~ 127�� ������ ASCII �ڵ��� �Ѵ�.
		 * 
		 * 	10	----encoding---->	1010	
		 * 	A	->	65	----encoding---->	0100 0001
		 *	A	->	65	<----decoding----	0100 0001
		 * 	Z	->	90
		 * 	a	->	97
		 * 	z	->	122
		 * 	0	->	48
		 */
		
		System.out.println("ABCDEFG!!");
		System.out.println('0');	//	���� 0 - �����δ� 48�̶�� ���� ������ ����
		System.out.println(0);		//	���� 0 - ������ 0
		
		//	���� Ÿ�� ���ͷ��� ���� ���� ���� �ʹٸ� �տ� (int)�� ���δ�
		System.out.println((int)'0');
		System.out.println((int)'A');
		
		//	���� Ÿ�� ���ͷ��� ���� ���¸� ���� �ʹٸ� �տ� (char)�� ���δ�
		System.out.println((char)97);
		System.out.println((char)122);
		
		//	���� Ÿ�� ���ͷ��� �����δ� ���ڰ�(�ڵ尪)�� ���� �ֱ� ������ ����� �����ϴ�		
		System.out.println('A' + 100);	//����� �⺻������ ���ڴ�
		System.out.println((char)('A' + 20));	// A�κ��� 20�� �ڿ� �ִ� ���ڸ� ã�� ���
		System.out.println((char)('Z' - 13));	// Z�κ��� 13�� �տ� �ִ� ���ڸ� ã�� ���
		System.out.println('A' - 'a');	//	�빮�ڿ� �ҹ����� �Ÿ�
		System.out.println((char)('k' + ('A' - 'a')));
		System.out.println((char)('k' - 32));
		System.out.println('L' - 'A');	//	�� ���� ���ĺ����� �˾Ƴ� �� ����
		
		//���ڿ��� ���ڰ� ������ ����� �� �ִ� Ÿ���̱� ������ �����ڵ�� ��ȯ�� �� ����
		System.out.println("A" + 10);	//����� �⺻������ ���ڴ�
		System.out.println("ABCD1234" + 10);	//����� �⺻������ ���ڴ�
		
		String sVal = "ABCD";
		System.out.println(sVal.length());
		
		
		
	}
}
