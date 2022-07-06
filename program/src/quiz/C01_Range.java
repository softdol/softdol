package quiz;

import java.util.Arrays;

public class C01_Range {
	
	/*
	 *	# 메서드 오버로딩(method overloading)
	 *
	 *	 - 자바에서는 같은 이름의 메서드를 여러개 선언할 수 있다
	 *	 - 이름이 같은 메서드여도 매개변수의 타입 또는 개수가 다르다면 다른 메서드로 인식된다
	 * 
	 */
	
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(range(10)));
		System.out.println(Arrays.toString(range(10, 15)));
		System.out.println(Arrays.toString(range(15, 10)));
		
		System.out.println(Arrays.toString(range(30, 40, 3)));
		System.out.println(Arrays.toString(range(40, 45, 5)));
		System.out.println(Arrays.toString(range(40, 30, 2)));
		System.out.println(Arrays.toString(range(18, 9, -3)));
		
		myutil.Range r = new myutil.Range(10,20);
		myutil.Range r2 = new myutil.Range(30,10,-5);
		
		System.out.println(Arrays.toString(r.range()));
		System.out.println(Arrays.toString(r2.range()));
	}
	
	public static int[] range(int maxNum) {
		
		int[] arrNum = new int[maxNum];
		
		for(int i = 0; i < maxNum ; i++) {
			arrNum[i] = i;
		}
		
		return arrNum;
		
	}

	public static int[] range(int start, int end) {
		int[] arr = new int[Math.abs(end - start)];
		
		int incre = start < end ? 1 : -1;
		
		for(int i = start, index = 0; i != end; i += incre) {
			arr[index++] = i;
		}
		
		return arr;
//		int maxNum = Math.max(start, end);
//		int minNum = Math.min(start, end);
//		int[] arrNum = new int[maxNum - minNum];
//		int arrCount = 0;
//		
//		if(start < end) {		
//			for(int i = minNum; i < maxNum ; i++) {
//				arrNum[arrCount] = i;
//				arrCount++;			
//			}
//		}else {
//			for(int i = maxNum; i > minNum ; i--) {
//				arrNum[arrCount] = i;
//				arrCount++;			
//			}
//		}
//		return arrNum;
	}
	
	public static int length(int start, int end, int incre) {
	
		// diff의 결과가 양수라는 것은 end가 더 크므로 incre가 양수여야 한다는 뜻이다
		// diff의 결과가 음수라는 것은 end가 더 작으므로 incre가 음수여야 한다는 뜻이다
		
		// end값 미만의 개수를 찾는것이므로 incre가 양수일때는 -1을 해야하고
		// incre가 음수일때는 +1을 해야한다 (범위가 1줄어들어야 한다)
		int diff = (end - start) + (incre > 0 ? -1 : 1);
		
		// 차이를 증가값
		int length = (diff - 1) / incre;
	
		if(length < 0) {
			return 0;
		}else {
			// 첫 숫자를 포함하기 때문에 개수가 1증가 한다
			length += 1;
		}
		
		return length;
	}
	
	public static int[] range(int start, int end, int increase) {
		
		if(increase == 0) {
			return new int[1];
		}
		
		int maxNum = Math.max(start, end);
		int minNum = Math.min(start, end);
		int arrNumSize = (maxNum - minNum) / Math.abs(increase);	
		arrNumSize = (maxNum - minNum) % increase == 0 ? arrNumSize : arrNumSize + 1 ;
				
		int[] arrNum = new int[arrNumSize];
		int arrCount = 0;
		
//		for(int i = 0; i < arrNumSize; i++) {
//			arrNum[i] = start + increase * i;
//		}
		
		if(start < end) {		
			for(int i = minNum; i < maxNum ; i+=increase) {
				arrNum[arrCount] = i;
				arrCount++;			
			}
		}else {
			increase = increase > 0 ? -increase : increase;
			for(int i = maxNum; i > minNum ; i+=increase ) {
				arrNum[arrCount] = i;
				arrCount++;			
			}
		}		
		
		
		return arrNum;
	}
}
