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
		
		// Collections.sort(list) : ����Ʈ�� ������ ������������ �������ִ� �޼���
		Collections.sort(animals);
		
		// ArrayList�� 100���� ���� �������� ä�� �� ����Ʈ�� ������ ������������ �����Ͽ� ����غ�����.
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
