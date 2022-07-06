
public class E03_CustinExcption {
	
	/*
	 * 	# 원하는 예외 직접 만들어서 사용하기
	 * 
	 * 	 - Excption을 상속 받으면 반드시 처리해야하는 예외
	 * 	 - RuntimeException을 상속 받으면 반드시 처리할 필요는 없는 예외
	 * 
	 */
	
	public static void playCat(Cat cat) {
		
		// A instanceof B : A가 B의 인스턴스인지 검사하는 비교 연산자
		if(cat instanceof RussianBlueCat) {
			throw new NotPlayableCatException();
		}else {
			System.out.println("고양이와 놀아줬습니다.");
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
		super("놀 줄 모르는 고양이 익셉션");
	}
}





