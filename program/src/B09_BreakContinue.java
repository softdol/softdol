
public class B09_BreakContinue {
	/*
	 * 	# break
	 * 
	 * 		- switch-case ������ ����ϸ� �ش� case�� Ż���Ѵ�
	 * 		- �ݺ��� ���ο��� ����ϸ� �ش� �ݺ����� Ż���Ѵ�
	 * 
	 * 	# continue
	 * 
	 * 		- �ݺ��� ���ο��� ����ϸ� �� ��� ���� �ݺ����� �Ѿ��
	 * 		- continue�� �Ʒ��� ���� �ڵ�� ��� �����Ѵ�
	 */
	public static void main(String[] args) {
	
		for(int i = 0; i < 100; ++i) {
			System.out.println(i);
			
			if(i == 66) {
				break;
			}
		}
		
		System.out.println("�ݺ��� ��");
		
		for(int i = 0; i < 1000; ++i) {
			
			if( i % 10 == 0) {
				//break;
				continue;
			}
			
			System.out.println(i);
		}
		
	}

}
