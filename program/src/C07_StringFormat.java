
public class C07_StringFormat {
	
	public static void main(String[] args) {
		
		// printf() : ������ �̿��� ���
		System.out.printf("%d\n", 0x10);
		
		// String.format() : ������ �̿��� ���ڿ��� ����
		String time = String.format("%d�� %d�� %d�� �Դϴ�.", 10, 59, 59);
		System.out.println(time);
		
		String message = getStr();		
		System.out.println(message);
		
	}
	
	public static String getStr() {
		return String.format("������ �ζ� ��ȣ�� [%d, %d, %d, %d, %d, %d, %d]�Դϴ�.",
				1,2,3,4,5,6,7);
	}

}
