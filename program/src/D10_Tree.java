import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class D10_Tree {
	
	/*
	 * 
	 * 	# TreeSet, TreeMap
	 * 
	 * 	 - Tree: �����͸� �߰��ϸ鼭 �ڱ� �ڸ��� ã�ư��� �ڷᱸ�� ���
	 * 	 - �����͸� �߰��ϴ� ���ÿ� �̸� ������ �Ǿ� �ֱ� ������ �߰��� ������ �ʿ䰡 ����
	 *	 - �߰� �� ������ �ؾ��ϱ� ������ Hash���ٴ� ������
	 *	 - ������ �Ǿ��ֱ� ������ Hash�ʹ� �ٸ��� �ε����� ����� �� �ִ�  
	 */
	
	public static void main(String[] args) {
		
		TreeSet<Integer> numbers = new TreeSet<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return i2.compareTo(i1);
			}
			
		});
		
//		TreeSet<Integer> numbers = new TreeSet<>();
		
		numbers.add(41);
		numbers.add(111);
		numbers.add(55);
		numbers.add(100);
		numbers.add(13);
		numbers.add(32);
		
		System.out.println(numbers);
		for(int i = 0; i < 100; i++) {
			numbers.add((int)(Math.random() * 1000));
		}
		
		// headSet(toElement): �� �պ��� ������������ ��� ����� �̷���� �κ� ������ ��ȯ�Ѵ�
		System.out.println(numbers.headSet(900));
		
		// tailSet(fromElement) : ���������� �� �ڱ����� �κ� ������ ��ȯ�Ѵ�
		System.out.println(numbers.tailSet(900));
		
		// subSet(from, to) : �ش� ������ �κ� ������ ��ȯ�Ѵ�
		System.out.println(numbers.subSet(200, 100));
		
		// pollFirst() : �� ���� ���� �����ϸ鼭 �̴´�
		TreeSet<Integer> subSet = new TreeSet<>(numbers.subSet(300, 200));
		System.out.println("#### pollFirst ####");
		System.out.println(subSet);
		while(subSet.pollFirst() != null){
			System.out.println(subSet);
		}
		
		TreeSet<Integer> subSet2 = new TreeSet<>(numbers.subSet(300, 200));
		System.out.println("#### pollLast ####");
		System.out.println(subSet2);
		while(subSet2.pollLast() != null){
			System.out.println(subSet2);
		}
		
		System.out.println("50�� ���� ����� ���ʰ�: " + numbers.floor(50));
		System.out.println("50�� ���� ����� �����ʰ�: " + numbers.ceiling(50));
		
		
		// TreeMap�� ���� ������� Ű���� �������� �����ؼ� �ִ´�(���� ���� �������� ���� ���� ����)
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		treeMap.put("Apple", 1);
		treeMap.put("apple", 5);
		treeMap.put("cat", 15);
		treeMap.put("dog", 1);
		treeMap.put("Mango", 13);
		
		
		System.out.println(treeMap);
		
		System.out.println(treeMap.subMap("a", "b"));
	}
	
	

}













