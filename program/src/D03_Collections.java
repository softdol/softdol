import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D03_Collections {

	/*
	  	# java.util.Arrays
	  	
	  	 - 배열을 편하게 다룰 수 있는 기능(메서드)들이 모여있는 클래스
	  	 
	  	# java.util.Collections
	  	
	  	 - 컬렉션을 편하게 다룰 수 있는 기능(메서드)들이 모여있는 클래스
	*/	
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		Set<String> set = new HashSet<>();
				
		// Collections.addAll() : 해당 컬렉션에 여러가지 데이터를 한번에 더한다
		Collections.addAll(list, "pineapple", "pineapple", "red orange", "pear");
		
		list.add("apple");
		list.add("apple");
		list.add("apple");
		list.add("banana");		
		list.add("orange");
		
		Collections.addAll(set, "melon", "apple", "banana");
		
		set.add("melon");
		set.add("watermelon");
		set.add("strawberry");
		set.add("dragon fruits");
		
		System.out.println(list);
		System.out.println(set);
		
		// Collection.addAll(anotherCollection) : 해당 컬렉션에 다른 컬렉션의 모든 데이터를 더한다
		list.addAll(set);		
		System.out.println(list);
		
		set.addAll(list);
		System.out.println(set);
		
		// Collection.removeAll(anotherCollection) : 해당 컬렉션에서 다른 컬렉션의 모든 데이터를 지운다
		Set<String> dislike = new HashSet<>();
		
		dislike.add("orange");
		dislike.add("apple");
		
		list.removeAll(dislike);
		System.out.println("removeAll: " + list);
		
		// Collection.retainAll(anotherCollection) : 해당 컬렉션에서 다른 컬렉션에도 있는 값만 남긴다
		Set<String> friendsLike = new HashSet<>();
		
		friendsLike.add("pineapple");
		friendsLike.add("apple");
		friendsLike.add("banana");
		friendsLike.add("watermelon");
		friendsLike.add("pear");
		
		list.retainAll(friendsLike);
		System.out.println("retainAll: " + list);
		
		// Collections.fill(list, obj) : 전달한 리스트를 원하는 값으로 가득 채운다
		// Collections.fill(list, "default fruit");		
		System.out.println(list);
		
		// Collections.frequency(list, obj) : 해당 컬렉션에 어떤 값이 몇개 들어있는지 알아내서 반환한다 
		list.set(3, "apple");
		list.set(4, "apple");
		list.set(5, "apple");
		
		int appleFreq = Collections.frequency(list, "apple");		
		System.out.println("apple의 등장 횟수: " + appleFreq);
		
		// 우리가 직접 만든 클래스도 컬렉션의 제네릭에 사용할 수 있다
		List<myobj.Police> polices = new ArrayList<>();
		
		polices.add(new myobj.Police());
		polices.add(new myobj.Police());
		polices.add(new myobj.Police());
		polices.add(new myobj.Police());
		
		System.out.println(polices);
		
		// Collections.rotate(list, distance) : 리스트를 원하는 만큼 순환시킨다
		Collections.sort(list);
		
		for (int i = 0; i < 15; ++i) {
			Collections.rotate(list, 1);
			System.out.printf("rotate%d : %s\n", i, list);
		}
		
		// Collections.shuffle() : 리스트를 랜덤으로 뒤섞는다
		Collections.shuffle(list);		
		System.out.println(list);	
		
		// Collections.swap(list, i, j) : 해당 리스트의 두 값을 서로 교체한다 
		System.out.println("교체 전: " + list);
		Collections.swap(list, 0, 3);
		System.out.println("교체 후: " + list);		
		
		// Collections.replaceAll() : 해당 리스트의 모든 값을 수정한다
		Collections.replaceAll(list, "pineapple", "kiwi");
		System.out.println(list);		
	}
	
}









