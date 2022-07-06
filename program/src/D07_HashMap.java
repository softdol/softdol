import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class D07_HashMap {
	
	/*
	 * 	# Map
	 * 
	 * 	 - �����͸� Key-Value �� ������ �����ϴ� ����� �ڷᱸ��
	 * 	 - �ε��� ��ȣ ��� key�� ���� �����Ϳ� �����Ѵ�
	 * 	 - key�� �ߺ��� ������� �ʴ´�
	 */
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map1 = new HashMap<>();
		HashMap<Integer, String> map2 = new HashMap<>();
		
		// put(K, V) : �ش� Ű�� ���� �ִ´�
		map1.put("age",10);
		map1.put("score",1234);
		map1.put("qty",5);
		map1.put("cash",5000);
		
		map2.put(330, "������");
		map2.put(450, "��������");
		
		System.out.println(map1);
		System.out.println(map2);
		
		// get(K) : �ش� Ű���� �ش��ϴ� ���� ������. �ش� Ű �Ǵ� ���� ������ null.
		System.out.println(map1.get("score"));
		System.out.println(map1.get("Dcore"));
		System.out.println(map2.get(330));
		
		HashMap<String, String> nav = new HashMap<>();
		
		nav.put("�츮��", "����� ������ ������ 123-123");
		nav.put("ȸ��", "����� ������ ��������д�����");
		nav.put("�ŷ�ó1", "����� ������ ������ 321-321");
		
		// �̹� �����ϴ� Ű�� put�� �ϸ� ���� �����
		nav.put("ȸ��", "���ε����д���");
		
		System.out.println(nav);
		
		// putIfAbsent(K,V) : �ش� Ű ���� ��������� ���� �ְ� null�� ����.
		String value = nav.putIfAbsent("����1", "��⵵ ������ ������ 111-111");
		System.out.println(nav);
		System.out.println(value);
		
		// �ش� Ű���� �̹� ���� �����Ѵٸ� ���� ���� �ʰ� ����ִ� ���� ����
		value = nav.putIfAbsent("����1", "�ߵ�����");
		System.out.println(nav);
		System.out.println(value);
		
		// Map�� �÷����� �ƴ�����, key Ehsms value�� set�Ǵ� list�� ������ �� �ִ�
		
		// map.keySet() : �ش� ���� key��θ� �̷���� set�� ��ȯ�Ѵ�
		Set<String> keys = nav.keySet();
		System.out.println(keys);
		
		// ���� key ���� �ݺ������� Ȱ���� �� �ִ�
		for(String key : keys) {
			System.out.println(nav.get(key));
		}
		
		// map.values() : �ش� ���� Value��θ� �̷���� �÷����� ��ȯ�Ѵ�.
		Collection<String> values = nav.values();
		
		List<String> valList = new ArrayList<>(values);
		
		Collections.sort(valList);
		System.out.println(valList);
		
		for(String val : valList) {
			System.out.println(val);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

