
public class C12_InstanceLifeCycle {
	
	/*
	 * 	# �ν��Ͻ� ������ ����Ǵ� �ڵ���� ����
	 * 
	 * 		1. (ù �����) ����ƽ ����� ����
	 * 		2. �ν��Ͻ� ����
	 * 		3. �ν��Ͻ� ��� ����
	 * 		4. ������ ȣ�� 
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
	 	
	 	/*
	 	 * 	����ƽ ������ ������ �޸𸮿� �Ǿ���� ���� �ƴ϶�
	 	 * 	�ش� Ŭ������ ���ʷ� ���Ǵ� ������ �޸𸮿� �Ǹ��� �ȴ�
	 	 * 
	 	 */
		System.out.println(InstanceLife.a);
		
		new InstanceLife(); 		
	 	new InstanceLife();
	 	new InstanceLife();
	 	
	 	System.out.println("���α׷� ����");
	}
	

}

class InstanceLife{
	static int a;
	
	{
		System.out.println("2. �ν��Ͻ� ���");
	}
	
	static {
		System.out.println("1. ����ƽ ���");
	}
	
	public InstanceLife() {
		System.out.println("3. ������ ���");
	}
	
}
















