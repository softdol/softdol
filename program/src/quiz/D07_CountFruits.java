package quiz;

import java.util.HashMap;

public class D07_CountFruits {

	/*
	 * 	배열에 과일을 랜덤으로 1000개 추가한 후에 각 과일이 몇 번씩 등장했는디 세어 보세요.
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
		
		// 아래 보다 조금 느림
//		List<String> fruitList = Arrays.asList(fruits);
//		
//		for(int i = 0; i < fruitNames.length; i++) {
//			fruitCountMap.put(
//					fruitNames[i],
//					Collections.frequency(fruitList, fruitNames[i])
//					);
//		}
		
		
		for(String fruit: fruits) {
			// Map에서 과일이름이 해당하는 과일 개수를 꺼낸다
			//Integer cnt = fruitCountMap.get(fruit);	
			Integer cnt = fruitCountMap.putIfAbsent(fruit, 1);
			if(cnt != null) {
				fruitCountMap.put(fruit, cnt+1);
			}
			
			// cnt가 null이라면 처음 나온 과일이므로 값을 1로 등록한다
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
//		System.out.println("-----------과일----------");		
//		Set<Integer> fruitsName = new HashSet<>(fruits.keySet());
//		int sum = 0;
//		for(Integer i : fruitsName) {
//			System.out.printf("%s    \t: %4d개\n",fruitNames[i], fruits.get(i));
//			sum += fruits.get(i);
//		}		
//		System.out.println("------------------------");
//		System.out.println("총 과일 수\t: " + sum + "개");
	}
}
