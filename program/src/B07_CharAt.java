
public class B07_CharAt {

	/*
	 * 
	 * 	# "���ڿ�".charAt(index)
	 *
	 * 		- �ش� ���ڿ����� ���ϴ� �ε����� ���ڸ� charŸ������ ������ �Լ�
	 * 		- ù ���� ���ڴ� 0�� �ε�����
	 * 
	 * 	# "���ڿ�".length()
	 * 
	 * 		- �ش� ���ڿ��� �� ���� ���ڷ� �̷�������� �˷��ִ� �Լ�
	 * 		- ���ڿ��� ������ �ε����� '���� -1'�̴�
	 */
	
	public static void main(String[] args) {
		
		String msg = "My name is sasuage";
		
		System.out.println(msg.charAt(5));
		
		System.out.println("msg�� ���� : " + msg.length());
		
		for(int i = 0; i < msg.length() ; ++i) {
			System.out.println(msg.charAt(i));
		}
		
	}
}
