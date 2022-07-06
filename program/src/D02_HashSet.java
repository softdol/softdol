import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class D02_HashSet {

	/*
	 	# Set
	 	
	 	 - 집합을 구현해 놓은 클래스
	 	 - 요소로 같은 값이 들어오는 것을 허용하지 않는다
	 	 
	 	# Hash
	 	
	 	 - 같은 값을 넣으면 항상 일정한 값이 나오는 단방향성 알고리즘
	 	 - 결과 값으로 원래의 값을 유추하는 것이 불가능해야 한다
	 	 - 중복 체크 및 데이터 위/변조 체크에 아주 뛰어난 성능을 보인다
	 	 - Hash의 결과 값은 일정한 순서가 존재하지 않기 때문에 인덱스가 존재하지 않는다
	 	 - 주로 특정 데이터의 고유번호로 활용된다
	 	 
	 	 	"abc" 	=> 	ba7816b...
	 	 	"abcd"  =>  88d4266...
	 	 	"cat"   =>  77af778...	
	*/
	public static void main(String[] args) {
		
		// add(item) : List와 Set모두 Collection의 자식이기 때문에 거의 같은 메서드를 사용한다 
		HashSet<String> fruits = new HashSet<>();
		
		// Set에는 중복되는 데이터를 추가해도 알아서 제거된다 
		fruits.add("mango");
		fruits.add(new String("mango"));
		fruits.add("kiwi");
		fruits.add("apple");
		fruits.add("green apple");
		fruits.add("red apple");
		fruits.add("apple");
		fruits.add("apple");
		
		System.out.println(fruits);
		
		// HashSet은 인덱스가 없어서 get()을 사용할 수 없다
		// fruits.get();
		
		// 순서가 매번 바뀌어서 인덱스가 의미 없을 뿐, 값을 순서대로 꺼내는 것은 가능하다 
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		System.out.println("Set의 크기: " + fruits.size());
		
		// 컬렉션은 다른 컬렉션으로의 변환이 자유롭다
		ArrayList<String> fruitList = new ArrayList<>(fruits);
		
		Collections.sort(fruitList);
		
		System.out.println(fruitList);
	}
	
}






