package quiz;

import java.util.HashMap;

public class D07_CountFruits {

	/*
	 * 	�迭�� ������ �������� 1000�� �߰��� �Ŀ� �� ������ �� ���� �����ߴµ� ���� ������.
	 * 
	 */
	
	private static String[] fruitNames = {"apple", "banana","orange",
			"kiwi","grape", "peach", "strawberry"};
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> fruitCountMap = new HashMap<>();
		String[] fruits = new String[1000];
		
		for(int i = 0; i < fruits.length; i++) {
			fruits[i] = fruitNames[(int)(Math.random() * fruitNames.length)];
		}
		
		// �Ʒ� ���� ���� ����
//		List<String> fruitList = Arrays.asList(fruits);
//		
//		for(int i = 0; i < fruitNames.length; i++) {
//			fruitCountMap.put(
//					fruitNames[i],
//					Collections.frequency(fruitList, fruitNames[i])
//					);
//		}
		
		
		for(String fruit: fruits) {
			// Map���� �����̸��� �ش��ϴ� ���� ������ ������
			//Integer cnt = fruitCountMap.get(fruit);	
			Integer cnt = fruitCountMap.putIfAbsent(fruit, 1);
			if(cnt != null) {
				fruitCountMap.put(fruit, cnt+1);
			}
			
			// cnt�� null�̶�� ó�� ���� �����̹Ƿ� ���� 1�� ����Ѵ�
//			if(cnt == null) {
//				fruitCountMap.put(fruit, 1);
//			}else {
//				fruitCountMap.put(fruit, cnt + 1);
//			}
		}
		
		//Collections.
		
//		int[] fruitsNum = new int[1000];
//		
//		for(int i = 0; i < fruitsNum.length; i++) {
//			fruitsNum[i] = (int)(Math.random()*fruitNames.length);
//		}
//		
//		HashMap<Integer,Integer> fruits = new HashMap<>();
//		
//		for(int i : fruitsNum) {			
//			Integer value = fruits.putIfAbsent(i, 1);
//			if(value != null) {				
//				fruits.put(i, value+1);
//			}
//		}
//		
//		System.out.println("-----------����----------");		
//		Set<Integer> fruitsName = new HashSet<>(fruits.keySet());
//		int sum = 0;
//		for(Integer i : fruitsName) {
//			System.out.printf("%s    \t: %4d��\n",fruitNames[i], fruits.get(i));
//			sum += fruits.get(i);
//		}		
//		System.out.println("------------------------");
//		System.out.println("�� ���� ��\t: " + sum + "��");
	}
}
