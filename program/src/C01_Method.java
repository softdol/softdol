
public class C01_Method {
	
	/*
	 * 	# �Լ� (Function)
	 * 
	 * 		 - ����� �̸� �����صΰ� ���߿� ������ ���� ��
	 * 		 - �Լ��� ������ �������� ������� �ʰ� ���߿� ȣ��Ǿ��� �� ����ȴ�
	 * 		 - �̸� ���ǵ� �Լ� �̸� �ڿ� ()�� �ٿ� �ش� �Լ��� ȣ���� �� �ִ�	 
	 * 		 - ���߿� ���� �� ���ɼ��� �ִ� ���ɵ��� �Լ��� ����� �θ� �۾��� �ݺ��� ���� �� �ִ�
	 * 		 - �ڹٿ��� �Լ��� �ݵ�� Ŭ���� ���ο� �����ؾ� �Ѵ�(�ٸ� �Լ� ���ο� ������ �� ����) 
	 * 		 - Ŭ���� ���ο� ����� �Լ��� �޼����� �θ���
	 * 	
	 * 	# �Լ��� ����(return)
	 * 
	 * 		 - �Լ��� ������ �� �Լ��� �տ� �ش� �Լ��� �ݵ�� ��ȯ�ϴ� ���� Ÿ���� ������ �� �ִ�
	 * 		 - ���� Ÿ�Կ� void �� ������ �ش� �Լ��� ���� ��ȯ���� �ʴ´ٴ� ���� �ǹ��Ѵ�
	 * 		 - �ش� �Լ��� ȣ���ϸ� ȣ���� �ڸ��� �Լ��� ���� ����� ��ȯ(return)�ȴ�
	 * 		 - �Լ� ���ο��� return�� ������ �ش� �Լ��� ��� �����Ѵ�
	 * 
	 * 	# �Լ��� �Ű�����(argument)
	 * 
	 * 		 - �Լ��� ȣ���� �� ()�� �����ϴ� ���� ���ڶ�� �Ѵ�
	 * 		 - �Լ��� ������ �� ()�� �����ϴ� ���ڰ��� ���� �� �ִ� ������ �Ű�������� �Ѵ�
	 * 
	 */
	
	public static int plus(int a, int b) {		
		int num = a + b;
		return num;
	}
	
	public static void printRabbit(int num) {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		if(num % 2 == 0 ) {
			return;
		}
		System.out.println("(  >$");
	}
	
	public static void main(String[] args) {
		
		System.out.println("���α׷� ����");
		
		for(int i = 0 ; i < 10 ; ++i) {
			printRabbit(i);
		}
		
		int result = plus(10, 20);
		
		System.out.println(result);
		
	}

}
