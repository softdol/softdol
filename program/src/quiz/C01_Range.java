package quiz;

import java.util.Arrays;

public class C01_Range {
	
	/*
	 *	# �޼��� �����ε�(method overloading)
	 *
	 *	 - �ڹٿ����� ���� �̸��� �޼��带 ������ ������ �� �ִ�
	 *	 - �̸��� ���� �޼��忩�� �Ű������� Ÿ�� �Ǵ� ������ �ٸ��ٸ� �ٸ� �޼���� �νĵȴ�
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
	
		// diff�� ����� ������ ���� end�� �� ũ�Ƿ� incre�� ������� �Ѵٴ� ���̴�
		// diff�� ����� ������� ���� end�� �� �����Ƿ� incre�� �������� �Ѵٴ� ���̴�
		
		// end�� �̸��� ������ ã�°��̹Ƿ� incre�� ����϶��� -1�� �ؾ��ϰ�
		// incre�� �����϶��� +1�� �ؾ��Ѵ� (������ 1�پ���� �Ѵ�)
		int diff = (end - start) + (incre > 0 ? -1 : 1);
		
		// ���̸� ������
		int length = (diff - 1) / incre;
	
		if(length < 0) {
			return 0;
		}else {
			// ù ���ڸ� �����ϱ� ������ ������ 1���� �Ѵ�
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
