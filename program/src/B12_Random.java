import java.util.Random;

public class B12_Random {
	
	/*
	 * 	# 무작위 숫자 생성하기
	 * 	
	 * 		1. Math.random() 함수 사용하기
	 * 
	 * 		 - 0 <= x <= 1 의 double타입 랜덤 실수를 생성하는 함수
	 * 		 - 이 랜덤 함수를 활용하여 원하는 범위의 숫자를 만들어 사용할 수 있다
	 * 
	 * 			※ 원하는 범위의 정수를 만드는 절차(ex: 30~39)
	 * 			
	 * 			 (1) 생성된 랜덤 실수에 원하는 숫자의 개수를 곱한다
	 * 				(ex: 30~39 는 숫자가 10개이므로 10을 곱한다)
	 * 				0 <= x < 10
	 * 			 (2) 원하는 숫자 범위 중 가장 작은 숫자를 더한다
	 * 				(ex: 30 <= x < 40 (+30))
	 * 			 (3) 소수점 아래를 삭제한다
	 * 				(ex: 39.999999도 소수점 아래를 삭제하면 39가 된다)
	 * 
	 * 		2. java.util.Random 클래스 사용하기
	 */
	
	public static void main(String[] args) {
		
		//새로운 랜덤 시드 생성
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
		
		//연습문제: 1~45의 랜점 정수를 10개 출력해보세요
		for(int i = 0 ; i < 10 ; ++i) {
			System.out.println((int)(Math.random() * 45 + 1));
		}
		
		
	}

}
