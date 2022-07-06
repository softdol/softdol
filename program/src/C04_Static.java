
public class C04_Static {
	
	/*
	 * 	# static (정적 영역, 클래스 영역 <=> 인스턴스 영역
	 * 
	 * 	 - 같은 클래스의 모든 인스턴스가 공동으로 사용하는 영역을 정적 영역이라고 한다
	 * 	 - 앞에 static이 붙은 자원(필드,메서드)은 모든 인스턴스가 공동으로 사용하는 자원이 된다
	 * 	 - static 영역의 자원은 아무리 인스턴스가 많아도 클래스당 하나이기 때문에
	 * 	   클래스 이름에 .을 찍고 사용할 수 있다
	 * 	 - static 영역의 자원은 인스턴스가 생기기 전에도 사용할 수 있다
	 * 	 - static 메서드는 인스턴스가 생기기 전에도 사용될 수 있기 때문에
	 * 	   인스턴스 변수를 사용할 수 없다
	 * 	 - static 필드만 사용하는 메서드는 static 메서드로 만드는 것이 좋다
	 * 	 - 인스턴스 변수를 활용하는 메서드는 반드시 인스터스 메서도여야 한다
	 * 
	 */
	
	public static void main(String[] args) {
		
//		PalyingCard.chagesSize(0, 0);
		
		PalyingCard h1 = new PalyingCard(0,1);
		PalyingCard s1 = new PalyingCard(1,1);
		PalyingCard d10 = new PalyingCard(1,10);
		
		d10.width = 10;
		
		for(int i =0 ; i < 5; i++) {
//			PalyingCard.width++;
//			h1.print();
//			s1.print();
//			d10.print();
		}
		
		
//		System.out.println(h1.width);
//		System.out.println(s1.width);
//		System.out.println(d10.width);
		
		ButcherShop b1 = new ButcherShop();
		ButcherShop b2 = new ButcherShop(400,2);
		ButcherShop b3 = new ButcherShop(50000,1);
		
		b1.print();
		System.out.println();
		b2.print();
		System.out.println();
		b3.print();
		System.out.println();		
		
		b2.discountRate = 0.2;
		b2.print();
		System.out.println();
		
		b2.type = 3;
		b2.print();
		System.out.println();
		
	}

}
class SolidR4{
	
	// 클래스 영역, 정적 영역
	static int price = 8000;
	static int drift = 90;
	static int acc = 49;
	static int cornering = 556;
	static int boosttime = 440;
	static int boostCharge = 200;
	static String category = "스피드 카트 / 일반";
	static String description = "솔리드 시리즈의 본격적인 레이스용 바디입니다."
			+ "\nG3에서 안정화된 바디라인은 R4에 이으러 큰 진화를 하게 됩니다.";
	
	static String[] colorNames = {"빨간색","노란색","초록색","파란색","검은색","흰색","핑크색"};
	
	// 인스턴스 영역
	String wheel;
	String handle;
	String kit;
	String enginPatch;
	String owner;
	int paint;
	
}

//연습문제: static 자원을 포함한 클래스를 하나 정의해보세요.
class ButcherShop{
	static String[] meatType = {"돼지", "소", "닭"};
	static double[] meatPrice = {1.2, 1.5, 1.0};
	static int gramPerWon = 10;
	
	
	double weight;	
	int type;
	double discountRate;
	double price;
	
	ButcherShop(){
		this(100, 1);
	}
	
	ButcherShop(int weight, int type){
		this.weight = weight;
		this.type = type;
		discountRate = 0.0;		
	}
	
	ButcherShop(int weight, int type, int discountRate){
		this.weight = weight;
		this.type = type;
		this.discountRate = discountRate;
	}
	
	public void print() {
		if(type >= meatType.length) {
			System.out.println(">> 고기 정보가 없습니다.");
			return;
		}
		System.out.println("----------------고기 정보-----------------");
		System.out.println("고기 종류 : " + meatType[type]);
		System.out.println("고기 무게 : " + weight + "g");
		System.out.println("고기 가격 : " + weight * meatPrice[type] * gramPerWon + "원 (100g 가격 : "+ 100 * gramPerWon * meatPrice[type]  +"원)");
		if(discountRate > 0) {
			System.out.println("※할인된 가격 : " + price() + "원 (할인율 : "+ 100 * discountRate +"%)");
		}
	}
	
	public double price() {
		
		price = weight * meatPrice[type] * gramPerWon;
		price = discountRate == 0 ?  price : price - discountRate * price;
		
		return price;
	}
	
}

class PalyingCard{
	// 모든 인스턴스가 함꼐 사용할 값
	static int width = 100;
	static int height = 200;
	
	char[] suits = {'♡', '♠','◇','♣'};
	
	// 각 인스턴스가 자기만의 공간을 가지고 사용할 값 (인스턴스 영역)
	int suit;
	int num;
	
	public static void chagesSize(int width, int height) {
		// this는 인스턴스가 생겼을 때 자기 자신을 의미 하므로, static 메서드에서는 사용할 수 없다
		PalyingCard.width = width;
		PalyingCard.height = height;
		
		System.out.println("바뀐 너비: " + PalyingCard.width);
		System.out.println("바뀐 높이: " + PalyingCard.height);
		//쓸수 없음
		//System.out.println("현재 카드의 문양: " + suits[suit]);
	}
	
	public PalyingCard(int suit, int num) {
		this.suit = suit;
		this.num = num;
	}
	
	public void print() {
		System.out.print("┌───");
		for(int i= 0; i < width; i++) {
			System.out.print("─");
		}
		System.out.println("───┐");
		System.out.printf("│ %c%3d ", suits[suit], num);
		for(int i= 0; i < width; i++) {
			System.out.print(" ");
		}
		System.out.print("│\n");
		System.out.print("└───");
		for(int i= 0; i < width; i++) {
			System.out.print("─");
		}
		System.out.println("───┘");
	}
}
