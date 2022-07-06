import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class D06_Comparator {
	
	/*
	 * 	# Comparable
	 * 
	 * 	 - 이 인터페이스를 구현한 클래스는 서로 크기 비교가 가능한 클래스가 된다
	 * 
	 * 	# Comparator
	 * 
	 * 	 - 이 인터페이스를 구현한 클래스는 크기 비교의 기준이 된다
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
		
		name.add("칠레");
		name.add("프랑스");
		name.add("스페인");
		name.add("우루과이");
		name.add("칠레가");
		
		System.out.println(name);
		Collections.sort(name);
		System.out.println(name);
		
		ArrayList<Grape> grapes = new ArrayList<>();
		
		grapes.add(new Grape(3000, 33, 1, "칠레"));
		grapes.add(new Grape(2800, 55, 2, "프랑스2"));
		grapes.add(new Grape(3200, 28, 3, "프랑스1"));
		grapes.add(new Grape(3200, 31, 1, "칠가"));
		grapes.add(new Grape(3200, 31, 1, "칠레가"));
		grapes.add(new Grape(3300, 50, 1, "스페인"));
		grapes.add(new Grape(3330, 51, 0, "우루과이"));
		grapes.add(new Grape(3300, 50, 1, "스기페인"));
		grapes.add(new Grape(3300, 50, 1, "우가루과이"));
		grapes.add(new Grape(3300, 50, 1, "우가루과가이"));
		grapes.add(new Grape(3300, 50, 1, "스페인"));
		grapes.add(new Grape(3300, 50, 1, "스페인"));
		
		// Integer에는 sort의 기준이 있지만, Grape에는 기준을 직접 작성해야 한다
		System.out.println(grapes);
		Collections.sort(grapes);		
		System.out.println(grapes);
		
		//Integer.valueOf(null)
		//Integer.parseUnsignedInt(grapes.get(0).origin);
		
		// 다른 Comparator 사용하기
		Collections.sort(grapes, new 포도분류기());
		System.out.println(grapes);
	}

}

class 포도분류기 implements Comparator<Grape>{

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
	
	// Integer, String 등의 기본 클래스들은 Comparable이 구현되어 있기 때문에 직접 구현할 필요가 없다 
	@Override
	public int compareTo(Grape o) {
		return this.origin.compareTo(o.origin);
	}
	
	//@Override
	public int compareTooo(Grape o) {
		
		/*
		 * 	# compareTo의 규칙
		 * 
		 * 	 - 현재 인스턴스와 매개변수로 전달되는 다음 인스턴스를 비교한다
		 * 	 - 두 인스턴스의 비교 결과에 따라 알맞은 정수를 리턴해야 한다
		 * 	 - 현재 인스턴스가 매개변수로 전달된 인스턴스보다 
		 * 	   왼쪽에 있어야 한다면 -1을 리턴해야 한다(또는 음수)
		 * 	 - 현재 인스턴스가 매개변수로 전달된 인스턴스보다 
		 * 	   오른쪽에 있어야 한다면 1을 리턴해야 한다(또는 양수)
		 * 	 - 두 인스턴스가 크기가 같다면 0을 리턴해야 한다
		 * 
		 */
		
		// 연습문제 : 포도를 정렬했을 때 가격 기준으로 오름차순 정렬될 수 있도록 바꿔보세요
		// 연습문제 : 가격이 같을 경우 개수 기준으로 오름차순 정렬될 수 있도록 바꿔보세요
		
		// 심화문제 : 원산지 이름 기준으로 오름차순 정렬 해 보세요
		Grape g = o;
		
		/*
		 * 	사과
		 * 	사과청
		 * 	사과파이
		 * 	사과쥬스
		 * 	사과주스
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