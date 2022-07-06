import java.util.ArrayList;

public class D01_ArrayList {
	
	/*
	 * 	# �ڷᱸ��
	 * 
	 * 	 - ��Ƽ� ȿ�������� �����ϴ� �������� ��ĵ�
	 * 	 - ��Ȳ���� ������ ȿ���� ���� �ڷᱸ���� �ִ�
	 * 
	 * 	# Java Collection Interface
	 * 
	 * 	 - Collection�� �ڹٿ��� �����ϴ� �ڷᱸ�� �������̽��̴�
	 * 	 - Collection������ �������� �ٸ� �÷������� ��ȯ�� �����ϴ�
	 * 	 - Collection �������̽��� ������ Ŭ�����δ� List, Set ���� �ִ�
	 * 
	 * 	# java.util.ArrayList
	 * 
	 * 	 - �迭�� ���������� ũ�Ⱑ �ڵ����� �����Ǵ� �ڷᱸ���� ������ Ŭ����
	 * 	 - �迭ó�� �����͸� ���������� �����Ѵ�
	 * 	 - ��� �����͸� ������� �����ϴ� �ӵ��� ���� ���� �÷����̴�
	 * 
	 */

	public static void main(String[] args) {
		
		// Ÿ���� �������� �ʰ� ArrayList �����ϱ�
		ArrayList list1 = new ArrayList();
		
		// list1.add(item): ����Ʈ�� �� �ڿ� ���ϴ� �����͸� �߰��Ѵ�.
		list1.add(10);
		list1.add(11);
		list1.add(12);
		list1.add(13);
		list1.add("��");
		list1.add("��");
		
		// list.add(index, item): ����Ʈ�� ���ϴ� ��ġ�� �����͸� �߰��Ѵ�
		list1.add(3,"�����");
		
		System.out.println(list1);
		
		// get(index): ����Ʈ���� �ش� �ε����� �����͸� �ϳ� ������ �޼���
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		System.out.println(list1.get(list1.size()-1));
		
		// Object Ÿ������ ��ĳ���� �Ǿ� �ִ� int
		Object obj = list1.get(2);
		
		// �ٿ�ĳ���� �� Ÿ���� �ٸ��� ������ �߻��� �� �־��� �����ϴ�.
		int a = (int)obj;
		
		System.out.println(a);
		
		// Ÿ���� �����Ͽ� ArrayList �����ϱ�(���׸�)
		ArrayList<String> list2 = new ArrayList<>();
		
		list2.add("cat");
		list2.add("dog");
		list2.add("zibra");
		list2.add("lion");
		list2.add("giraffe");
		list2.add(2, "���α�");
		
		System.out.println(list2);
		
		// ���׸� ���ο� �⺻�� Ÿ���� ����� �� ����.(int, short, ...)
		ArrayList<Integer> list3 = new ArrayList<>();
		
		list3.add(8);
		list3.add(11);
		list3.add(99);
		list3.add(999);
		
		System.out.println(list3);
		
		ArrayList<Character> list4 = new ArrayList<>();
		
		list4.add('A');
		list4.add('H');
		list4.add('E');
		list4.add('O');
		list4.add('L');
		list4.add('L');
		
		// list.size(): �ش� ����Ʈ�� ũ�⸦ ��ȯ�Ѵ�
		System.out.println(list1.size());
		System.out.println(list2.size());
		System.out.println(list3.size());
		System.out.println(list4.size());
		
		// list.contanis(item): ����Ʈ�� �ش� ���� ���ԵǾ��ִ��� ���θ� ��ȯ�Ѵ�
		System.out.println("list2�� ���ڰ� �ֳ���? " + list2.contains("����"));
		System.out.println("list2�� lion�� �ֳ���? " + list2.contains("lion"));
		
		// list.indexOf(item): ����Ʈ���� �ش� ���� ��ġ�� ��ȯ�Ѵ�. ã�� ���ϸ� -1�� ��ȯ�Ѵ�
		System.out.println(list2.indexOf("apple"));
		System.out.println(list2.indexOf("lion"));
		
		// list.set(index, item): ����Ʈ�� �ش� ��ġ�� ���� �����Ѵ�
		list2.set(2, "whale");
		
		System.out.println(list2);
		// ��ٸ� ���� �ٲ㼭 ���ڰ� ���ٰ� ����
		System.out.println(list2.contains("lion"));
		
		// list.remove(index): ??
		// list.remove(object): ??
		System.out.println(list2);
		System.out.println(list2.remove("lion"));
		list2.add("lion");
		list2.add("lion");
		list2.add("lion");
		list2.add("lion");
		list2.add("lion");
		list2.add("lion");
		System.out.println(list2.remove("lion"));		
		System.out.println(list2);
		System.out.println(list2.remove(0));
		list2.remove(0);
		System.out.println(list2);
		
		// �ݺ��� Ȱ���ϱ�
		for(int i = 0; i< list3.size(); i++) {
			System.out.println(list3.get(i));			
		}
		
		for(String animal : list2) {
			System.out.println(animal);
		}
		
	}
	
}















