import java.util.Random;

public class B12_Random {
	
	/*
	 * 	# ������ ���� �����ϱ�
	 * 	
	 * 		1. Math.random() �Լ� ����ϱ�
	 * 
	 * 		 - 0 <= x <= 1 �� doubleŸ�� ���� �Ǽ��� �����ϴ� �Լ�
	 * 		 - �� ���� �Լ��� Ȱ���Ͽ� ���ϴ� ������ ���ڸ� ����� ����� �� �ִ�
	 * 
	 * 			�� ���ϴ� ������ ������ ����� ����(ex: 30~39)
	 * 			
	 * 			 (1) ������ ���� �Ǽ��� ���ϴ� ������ ������ ���Ѵ�
	 * 				(ex: 30~39 �� ���ڰ� 10���̹Ƿ� 10�� ���Ѵ�)
	 * 				0 <= x < 10
	 * 			 (2) ���ϴ� ���� ���� �� ���� ���� ���ڸ� ���Ѵ�
	 * 				(ex: 30 <= x < 40 (+30))
	 * 			 (3) �Ҽ��� �Ʒ��� �����Ѵ�
	 * 				(ex: 39.999999�� �Ҽ��� �Ʒ��� �����ϸ� 39�� �ȴ�)
	 * 
	 * 		2. java.util.Random Ŭ���� ����ϱ�
	 */
	
	public static void main(String[] args) {
		
		//���ο� ���� �õ� ����
		Random ren = new Random();
		System.out.println(ren.nextInt());
		System.out.println(ren.nextBoolean());
		System.out.println(ren.nextDouble());
		System.out.println(ren.nextFloat());
		System.out.println(ren.nextLong());
		
		
		System.out.println("-------------");
		
		
		for(int i = 0 ; i < 10 ; ++i) {
			System.out.println((int)(Math.random() * 10 + 30));
		}
		System.out.println("------------------------");
		
		//��������: 1~45�� ���� ������ 10�� ����غ�����
		for(int i = 0 ; i < 10 ; ++i) {
			System.out.println((int)(Math.random() * 45 + 1));
		}
		
		
	}

}
