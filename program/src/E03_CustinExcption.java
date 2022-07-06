
public class E03_CustinExcption {
	
	/*
	 * 	# ���ϴ� ���� ���� ���� ����ϱ�
	 * 
	 * 	 - Excption�� ��� ������ �ݵ�� ó���ؾ��ϴ� ����
	 * 	 - RuntimeException�� ��� ������ �ݵ�� ó���� �ʿ�� ���� ����
	 * 
	 */
	
	public static void playCat(Cat cat) {
		
		// A instanceof B : A�� B�� �ν��Ͻ����� �˻��ϴ� �� ������
		if(cat instanceof RussianBlueCat) {
			throw new NotPlayableCatException();
		}else {
			System.out.println("����̿� �������ϴ�.");
		}
		
	}

	public static void main(String[] args) {		
		playCat(new Cat());
		playCat(new PersianCat());
		playCat(new RussianBlueCat());		
	}
}

class Cat{};
class PersianCat extends Cat{}
class RussianBlueCat extends Cat{}

class NotPlayableCatException extends RuntimeException{
	public NotPlayableCatException() {
		super("�� �� �𸣴� ����� �ͼ���");
	}
}





