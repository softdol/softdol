import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class D06_Comparator {
	
	/*
	 * 	# Comparable
	 * 
	 * 	 - �� �������̽��� ������ Ŭ������ ���� ũ�� �񱳰� ������ Ŭ������ �ȴ�
	 * 
	 * 	# Comparator
	 * 
	 * 	 - �� �������̽��� ������ Ŭ������ ũ�� ���� ������ �ȴ�
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(3);
		numbers.add(5);
		numbers.add(1);
		numbers.add(1);
		
		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println(numbers);
		
		ArrayList<String> name = new ArrayList<>();
		
		name.add("ĥ��");
		name.add("������");
		name.add("������");
		name.add("������");
		name.add("ĥ����");
		
		System.out.println(name);
		Collections.sort(name);
		System.out.println(name);
		
		ArrayList<Grape> grapes = new ArrayList<>();
		
		grapes.add(new Grape(3000, 33, 1, "ĥ��"));
		grapes.add(new Grape(2800, 55, 2, "������2"));
		grapes.add(new Grape(3200, 28, 3, "������1"));
		grapes.add(new Grape(3200, 31, 1, "ĥ��"));
		grapes.add(new Grape(3200, 31, 1, "ĥ����"));
		grapes.add(new Grape(3300, 50, 1, "������"));
		grapes.add(new Grape(3330, 51, 0, "������"));
		grapes.add(new Grape(3300, 50, 1, "��������"));
		grapes.add(new Grape(3300, 50, 1, "�찡�����"));
		grapes.add(new Grape(3300, 50, 1, "�찡�������"));
		grapes.add(new Grape(3300, 50, 1, "������"));
		grapes.add(new Grape(3300, 50, 1, "������"));
		
		// Integer���� sort�� ������ ������, Grape���� ������ ���� �ۼ��ؾ� �Ѵ�
		System.out.println(grapes);
		Collections.sort(grapes);		
		System.out.println(grapes);
		
		//Integer.valueOf(null)
		//Integer.parseUnsignedInt(grapes.get(0).origin);
		
		// �ٸ� Comparator ����ϱ�
		Collections.sort(grapes, new �����з���());
		System.out.println(grapes);
	}

}

class �����з��� implements Comparator<Grape>{

	@Override
	public int compare(Grape g1, Grape g2) {
		// TODO Auto-generated method stub
		return g1.price != g2.price ? g1.price - g2.price : (g2.qty - g1.qty);
	}
	
}

class Grape implements Comparable<Grape> {	
	
	static String[] colors = {"0x48548A","0x00CDEA","0x00EEDD","0x11DDSS","0x334455"};
	
	int price;
	int qty;
	int color;
	String origin;
	
	public Grape(int price, int qty, int color, String origin) {
		this.price = price;
		this.qty = qty;
		this.color = color;
		this.origin = origin;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%d/%d/%s/%s", price, qty, colors[color], origin);
	}
	
	// Integer, String ���� �⺻ Ŭ�������� Comparable�� �����Ǿ� �ֱ� ������ ���� ������ �ʿ䰡 ���� 
	@Override
	public int compareTo(Grape o) {
		return this.origin.compareTo(o.origin);
	}
	
	//@Override
	public int compareTooo(Grape o) {
		
		/*
		 * 	# compareTo�� ��Ģ
		 * 
		 * 	 - ���� �ν��Ͻ��� �Ű������� ���޵Ǵ� ���� �ν��Ͻ��� ���Ѵ�
		 * 	 - �� �ν��Ͻ��� �� ����� ���� �˸��� ������ �����ؾ� �Ѵ�
		 * 	 - ���� �ν��Ͻ��� �Ű������� ���޵� �ν��Ͻ����� 
		 * 	   ���ʿ� �־�� �Ѵٸ� -1�� �����ؾ� �Ѵ�(�Ǵ� ����)
		 * 	 - ���� �ν��Ͻ��� �Ű������� ���޵� �ν��Ͻ����� 
		 * 	   �����ʿ� �־�� �Ѵٸ� 1�� �����ؾ� �Ѵ�(�Ǵ� ���)
		 * 	 - �� �ν��Ͻ��� ũ�Ⱑ ���ٸ� 0�� �����ؾ� �Ѵ�
		 * 
		 */
		
		// �������� : ������ �������� �� ���� �������� �������� ���ĵ� �� �ֵ��� �ٲ㺸����
		// �������� : ������ ���� ��� ���� �������� �������� ���ĵ� �� �ֵ��� �ٲ㺸����
		
		// ��ȭ���� : ������ �̸� �������� �������� ���� �� ������
		Grape g = o;
		
		/*
		 * 	���
		 * 	���û
		 * 	�������
		 * 	����꽺
		 * 	����ֽ�
		 * 
		 */
		int len1 = origin.length();
		int len2 = g.origin.length();
		
		int len = len1 < len2 ? len1 : len2;
		
		for(int i = 0; i < len; i++) {
			char ch1 = origin.charAt(i);
			char ch2 = g.origin.charAt(i);
			
			if(ch1 > ch2) {
				return 1;
			}else if(ch1 < ch2){
				return -1;
			}
		}
		
		if(len1 < len2) {
			return -1;
		}else if(len1 > len2) {
			return 1;
		}
		
		return 0;

//		int minLen = this.origin.length() > g.origin.length() ? g.origin.length() : this.origin.length();
//		
//		for(int i = 0 ; i < minLen; i++) {			
//			if(this.origin.charAt(i) > g.origin.charAt(i)) {
//				return 1;	
//			}else if(this.origin.charAt(i) < g.origin.charAt(i)) {
//				return -1;
//			}
//		}
//		
//		if(this.origin.length() > g.origin.length()) {
//			return 1;
//		}else if(this.origin.length() < g.origin.length()) {
//			return -1;
//		}else {
//			return 0;
//		}
		
		
//		
//		if(this.price > g.price) {
//			return 1;
//		}else if(this.price < g.price) {
//			return -1;
//		}else {
//			if(this.qty > g.qty) {
//				return -1;
//			}else if(this.qty < g.qty) {
//				return 1;
//			}else {			
//				return 0;
//			}
//		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}