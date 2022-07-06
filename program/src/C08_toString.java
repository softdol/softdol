import java.util.Arrays;

class Pig {
	final static String type = "돼지";
	int gram_price;
	int gram;
	public Pig(int gram, int gram_price) {
		this.gram = gram;
		this.gram_price = gram_price;
	}
	
	/*
	 * 	# Object.toString() 
	 * 
	 *  	- 해당 클래스가 믄자열로서 출력되어야 할 때 저절로 호출되는 메서드
	 * 		- Object는 모든 타입의 부모이기 때문에 모든 클래스에 toString()이 포함되어 있다
	 * 		- 오버라이드해서 사용하지 않으면 기본적으로 메모리상의 주소값을 문자열로 반환한다
	 * 
	 */	
	@Override
	public String toString() {
		// # String.format() : printf()처럼 문자열을 생성할 때 사용하는 함수
		return String.format("종류\t: %s\n" + "g당 가격\t: %d\n" + "총 무게\t: %dg\n" + "가격\t: %d",
								type, gram_price, gram, gram_price * gram);
	}
}

public class C08_toString {
	
	
	
	public static void main(String[] args) {
		Pig meat = new Pig(150, 40);
		// 인스턴스를 출력하려고 하면 기본적으로는 주소값이 나온다		
		// 해당 클래스의 toString() 메서드를 오버라이드 하면 원하는 형태의 출력할 수 있다.
		
		// 해당 인스턴스의 toString()으로 문자열을 가져와서 출력하기
		
		System.out.println(meat.toString());
		
		// 해당 인스턴스를 그냥 출력하기
		System.out.println(meat);
		
		
		// println() 메서드는 사실 해당 인스턴스의 toString()결과를 콘솔에 출력하는 메서드이다
		
	}

}
