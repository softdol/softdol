import java.util.Arrays;

class Pig {
	final static String type = "����";
	int gram_price;
	int gram;
	public Pig(int gram, int gram_price) {
		this.gram = gram;
		this.gram_price = gram_price;
	}
	
	/*
	 * 	# Object.toString() 
	 * 
	 *  	- �ش� Ŭ������ ���ڿ��μ� ��µǾ�� �� �� ������ ȣ��Ǵ� �޼���
	 * 		- Object�� ��� Ÿ���� �θ��̱� ������ ��� Ŭ������ toString()�� ���ԵǾ� �ִ�
	 * 		- �������̵��ؼ� ������� ������ �⺻������ �޸𸮻��� �ּҰ��� ���ڿ��� ��ȯ�Ѵ�
	 * 
	 */	
	@Override
	public String toString() {
		// # String.format() : printf()ó�� ���ڿ��� ������ �� ����ϴ� �Լ�
		return String.format("����\t: %s\n" + "g�� ����\t: %d\n" + "�� ����\t: %dg\n" + "����\t: %d",
								type, gram_price, gram, gram_price * gram);
	}
}

public class C08_toString {
	
	
	
	public static void main(String[] args) {
		Pig meat = new Pig(150, 40);
		// �ν��Ͻ��� ����Ϸ��� �ϸ� �⺻�����δ� �ּҰ��� ���´�		
		// �ش� Ŭ������ toString() �޼��带 �������̵� �ϸ� ���ϴ� ������ ����� �� �ִ�.
		
		// �ش� �ν��Ͻ��� toString()���� ���ڿ��� �����ͼ� ����ϱ�
		
		System.out.println(meat.toString());
		
		// �ش� �ν��Ͻ��� �׳� ����ϱ�
		System.out.println(meat);
		
		
		// println() �޼���� ��� �ش� �ν��Ͻ��� toString()����� �ֿܼ� ����ϴ� �޼����̴�
		
	}

}
