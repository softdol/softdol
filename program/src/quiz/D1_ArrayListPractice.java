package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class D1_ArrayListPractice {

	/*
	 * 	# ArrayList�� 1000���� 9999�� ���� ������ 100�� �߰��� �� ������ ���غ�����
	 * 
	 * 	 1. ��� ������ ���
	 * 
	 * 	 2. ��� ���� �� ���� ū��
	 * 
	 *   3. ��� ���� �� ���� ���� ��
	 *   
	 *   4. 77��°�� ���¼�
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
		
		System.out.printf("���\t\t: %.2f\n", (double)sum / 100);
		System.out.printf("���� ū��\t\t: %d\n" , maxNum);
		System.out.printf("���� ������\t: %d\n" , minNum);
		System.out.printf("77��°\t\t: %d\n" , listNum.get(76));
		
		//-----------------------------------------------------------------//
		
		System.out.println(Collections.max(listNum));
		System.out.println(Collections.min(listNum));
		
		// ����Ʈ�� �迭�� ��ȯ�ϱ�
		//int[] arr = null;
		// ���� ���� �迭�� �̸� �����صд�
		Integer[] arr = new Integer[listNum.size()];
		// toArray()�޼��忡 �̸� ������ �迭�� �����Ѵ�
		listNum.toArray(arr);
		
		// �迭�� ����Ʈ�� ��ȯ�ϱ�
		List<Integer> list = Arrays.asList(arr);
		
		// ����Ʈ�� ��ȯ�� �迭�� �÷����̱� ������ �ٽ� ArrayList�� ��ȯ�� �� �ִ�
		list = new ArrayList<>(list);
		//Collection<Integer> c = new ArrayList<>(list);
		//List<Integer> l = new ArrayList<>(list);
		ArrayList<Integer> l2 = new ArrayList<>(list);
		
		// ����Ʈ�� ��ȯ�� ����� �����ص� ���� �迭���� ������ ��ġ�� �ʴ´�
		for(int i = 0; i < l2.size(); i++) {
			if(l2.get(i) > 1400){
				l2.remove(i--);
			}
		}
		
		System.out.println(l2);
		System.out.println(Arrays.toString(arr));
	}
}


