package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class D1_ArrayListPractice {

	/*
	 * 	# ArrayList에 1000부터 9999의 랜덤 정수를 100개 추가한 후 다음을 구해보세요
	 * 
	 * 	 1. 모든 숫자의 평균
	 * 
	 * 	 2. 모든 숫자 중 가장 큰수
	 * 
	 *   3. 모든 숫자 중 가장 작은 수
	 *   
	 *   4. 77번째로 나온수
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		ArrayList<Integer> listNum = new ArrayList<>();
		
		for(int i = 0 ; i < 100; i++) {			
			listNum.add((int)(Math.random() * 8999 + 1000));			
		}
		
		int maxNum = 0;
		int minNum = 10000;
		int sum = 0;
		
		for(int i = 0 ; i < listNum.size(); i++) {
			
			maxNum = Math.max(maxNum, listNum.get(i));
			minNum = Math.min(minNum, listNum.get(i));
			sum += listNum.get(i);
//			System.out.println((i+1) + " : " + listNum.get(i));
						
		}
		
		System.out.printf("평균\t\t: %.2f\n", (double)sum / 100);
		System.out.printf("가장 큰수\t\t: %d\n" , maxNum);
		System.out.printf("가장 작은수\t: %d\n" , minNum);
		System.out.printf("77번째\t\t: %d\n" , listNum.get(76));
		
		//-----------------------------------------------------------------//
		
		System.out.println(Collections.max(listNum));
		System.out.println(Collections.min(listNum));
		
		// 리스트를 배열로 변환하기
		//int[] arr = null;
		// 값을 담을 배열을 미리 생성해둔다
		Integer[] arr = new Integer[listNum.size()];
		// toArray()메서드에 미리 만들어둔 배열을 전달한다
		listNum.toArray(arr);
		
		// 배열을 리스트로 변환하기
		List<Integer> list = Arrays.asList(arr);
		
		// 리스트로 변환된 배열은 컬렉션이기 때문에 다시 ArrayList로 변환할 수 있다
		list = new ArrayList<>(list);
		//Collection<Integer> c = new ArrayList<>(list);
		//List<Integer> l = new ArrayList<>(list);
		ArrayList<Integer> l2 = new ArrayList<>(list);
		
		// 리스트로 변환한 결과를 수정해도 원본 배열에는 영향을 미치지 않는다
		for(int i = 0; i < l2.size(); i++) {
			if(l2.get(i) > 1400){
				l2.remove(i--);
			}
		}
		
		System.out.println(l2);
		System.out.println(Arrays.toString(arr));
	}
}


