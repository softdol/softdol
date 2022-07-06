package quiz;

import java.util.ArrayList;
import java.util.Collections;

public class D01_ArrayListSort {

	public static void main(String[] args) {
		
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("monkey");
		animals.add("zibra");
		animals.add("lion");
		animals.add("giraffe");
		
		// Collections.sort(list) : 리스트의 내용을 오름차순으로 정렬해주는 메서드
		Collections.sort(animals);
		
		// ArrayList에 100개의 랜덤 정수값을 채운 후 리스트의 내용을 내림차순으로 정렬하여 출력해보세요.
		ArrayList<Integer> listNum = new ArrayList<>();
		
		for(int i = 0 ; i < 100; i++) {			
			listNum.add((int)(Math.random() * 9000));			
		}
		
		System.out.println(listNum);
		
		for(int i = 0 ; i < listNum.size() - 1 ; i++) {
			//int temp = listNum.get(i);
			
			for(int j = 0 ; j < listNum.size() - 1 ; j++) {
				
			}
			
//			if(listNum.get(i) < listNum.get(i + 1)) {
//				listNum.set(i, listNum.get(i+1));
//				listNum.set(i+1, temp);
//				i--;
//			}
			
		}
		System.out.println(listNum);
		
	}
	
}
