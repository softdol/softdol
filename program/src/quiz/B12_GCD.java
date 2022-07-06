package quiz;

public class B12_GCD {

	/*
	 * 	랜덤으로 생성된 두 숫자의 최대 공약수를 구해보세요
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		//int[] maxNum = new int[2];
		
//		int num = (int)(Math.random() * 1000 + 1);
//		int num2 = (int)(Math.random() * 1000 + 1);
		int num = (int)(Math.random() * Integer.MAX_VALUE);
		int num2 = (int)(Math.random() * Integer.MAX_VALUE);
		int maxNum = 0;
		int minNum = 0;
		int commonFactor = 0;
		
		int a = num;
		int b = num2;
		
		int min = Math.min(a, b);
		
		if(a > b) {
			min = b;
		}else {
			min = a;
		}
		
		/*
		 * 	# 삼항 연산자
		 * 
		 * 		- 비교 ? 예 : 아니오; 
		 */		
		//int apple = 11;
		//int basket = apple % 10 == 0 ? apple / 10 : apple / 10 + 1; 
		
		min = a < b ? a: b;
		
		//int gcd = 1;
		
		for(int i = min; i > 0; --i) {
			if(a % i == 0 && b % i ==0) {
				System.out.println("최대공약수 : " + i);
				//gcd = i;
				break;
			}
		}
		
		maxNum = num;
		minNum = num2;
		
		if(num < num2) {
			maxNum = num2;
			minNum = num;
		}
			
		
		for(int i = 1; i <= minNum ; ++i) {			
			if(minNum % i == 0) {
				if(maxNum % i == 0) {
					commonFactor = i;
				}
			}
						
		}
		System.out.println("------------------");
		System.out.println("두 수 : " + num + ", " + num2);
		
		System.out.println("최대공약수 : " + commonFactor);
		
	}
}
