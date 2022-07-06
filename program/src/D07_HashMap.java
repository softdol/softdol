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
	 * 	 - 데이터를 Key-Value 한 쌍으로 저장하는 방식의 자료구조
	 * 	 - 인덱스 번호 대신 key를 통해 데이터에 접근한다
	 * 	 - key는 중복을 허용하지 않는다
	 */
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map1 = new HashMap<>();
		HashMap<Integer, String> map2 = new HashMap<>();
		
		// put(K, V) : 해당 키에 값을 넣는다
		map1.put("age",10);
		map1.put("score",1234);
		map1.put("qty",5);
		map1.put("cash",5000);
		
		map2.put(330, "도라지");
		map2.put(450, "마을버스");
		
		System.out.println(map1);
		System.out.println(map2);
		
		// get(K) : 해당 키값에 해당하는 값을 꺼낸다. 해당 키 또는 값이 없으면 null.
		System.out.println(map1.get("score"));
		System.out.println(map1.get("Dcore"));
		System.out.println(map2.get(330));
		
		HashMap<String, String> nav = new HashMap<>();
		
		nav.put("우리집", "서울시 무슨구 무슨동 123-123");
		nav.put("회사", "서울시 무슨구 가산디지털단지역");
		nav.put("거래처1", "서울시 무슨구 무슨동 321-321");
		
		// 이미 존재하는 키에 put을 하면 값을 덮어쓴다
		nav.put("회사", "구로디지털단지");
		
		System.out.println(nav);
		
		// putIfAbsent(K,V) : 해당 키 값이 비어있으면 값을 넣고 null을 리턴.
		String value = nav.putIfAbsent("맛집1", "경기도 무슨구 무슨동 111-111");
		System.out.println(nav);
		System.out.println(value);
		
		// 해당 키값에 이미 값이 존재한다면 값을 넣지 않고 들어있던 값을 리턴
		value = nav.putIfAbsent("맛집1", "멕도날드");
		System.out.println(nav);
		System.out.println(value);
		
		// Map은 컬렉션이 아니지만, key Ehsms value를 set또는 list로 꺼내올 수 있다
		
		// map.keySet() : 해당 맵의 key들로만 이루어진 set을 반환한다
		Set<String> keys = nav.keySet();
		System.out.println(keys);
		
		// 꺼낸 key 들을 반복문으로 활용할 수 있다
		for(String key : keys) {
			System.out.println(nav.get(key));
		}
		
		// map.values() : 해당 맵의 Value들로만 이루어진 컬렉션을 반환한다.
		Collection<String> values = nav.values();
		
		List<String> valList = new ArrayList<>(values);
		
		Collections.sort(valList);
		System.out.println(valList);
		
		for(String val : valList) {
			System.out.println(val);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

