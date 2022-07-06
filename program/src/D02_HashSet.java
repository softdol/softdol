import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class D02_HashSet {

	/*
	 	# Set
	 	
	 	 - ������ ������ ���� Ŭ����
	 	 - ��ҷ� ���� ���� ������ ���� ������� �ʴ´�
	 	 
	 	# Hash
	 	
	 	 - ���� ���� ������ �׻� ������ ���� ������ �ܹ��⼺ �˰���
	 	 - ��� ������ ������ ���� �����ϴ� ���� �Ұ����ؾ� �Ѵ�
	 	 - �ߺ� üũ �� ������ ��/���� üũ�� ���� �پ ������ ���δ�
	 	 - Hash�� ��� ���� ������ ������ �������� �ʱ� ������ �ε����� �������� �ʴ´�
	 	 - �ַ� Ư�� �������� ������ȣ�� Ȱ��ȴ�
	 	 
	 	 	"abc" 	=> 	ba7816b...
	 	 	"abcd"  =>  88d4266...
	 	 	"cat"   =>  77af778...	
	*/
	public static void main(String[] args) {
		
		// add(item) : List�� Set��� Collection�� �ڽ��̱� ������ ���� ���� �޼��带 ����Ѵ� 
		HashSet<String> fruits = new HashSet<>();
		
		// Set���� �ߺ��Ǵ� �����͸� �߰��ص� �˾Ƽ� ���ŵȴ� 
		fruits.add("mango");
		fruits.add(new String("mango"));
		fruits.add("kiwi");
		fruits.add("apple");
		fruits.add("green apple");
		fruits.add("red apple");
		fruits.add("apple");
		fruits.add("apple");
		
		System.out.println(fruits);
		
		// HashSet�� �ε����� ��� get()�� ����� �� ����
		// fruits.get();
		
		// ������ �Ź� �ٲ� �ε����� �ǹ� ���� ��, ���� ������� ������ ���� �����ϴ� 
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		System.out.println("Set�� ũ��: " + fruits.size());
		
		// �÷����� �ٸ� �÷��������� ��ȯ�� �����Ӵ�
		ArrayList<String> fruitList = new ArrayList<>(fruits);
		
		Collections.sort(fruitList);
		
		System.out.println(fruitList);
	}
	
}






