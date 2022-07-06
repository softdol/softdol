package myobj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T05_News20220511_s {
	// 자카드 유사도는 집합 간의 유사도를 검사하는 여러 방법 중의 하나로 알려져 있다. 
	// 두 집합 A, B 사이의 자카드 유사도 J(A, B)는 두 집합의 교집합 크기를 두 집합의 
	// 합집합 크기로 나눈 값으로 정의된다.

	// 예를 들어 집합 A = {1, 2, 3}, 집합 B = {2, 3, 4}라고 할 때, 
	// 교집합 A ∩ B = {2, 3}, 합집합 A ∪ B = {1, 2, 3, 4}이 되므로, 
	// 집합 A, B 사이의 자카드 유사도 J(A, B) = 2/4 = 0.5가 된다. 
	// 집합 A와 집합 B가 모두 공집합일 경우에는 나눗셈이 정의되지 않으니 
	// 따로 J(A, B) = 1로 정의한다.	

	// 이를 이용하여 문자열 사이의 유사도를 계산하는데 이용할 수 있다. 
	// 문자열 "FRANCE"와 "FRENCH"가 주어졌을 때, 이를 두 글자씩 끊어서 다중집합을 만들 수 있다. 
	// 각각 {FR, RA, AN, NC, CE}, {FR, RE, EN, NC, CH}가 되며, 교집합은 {FR, NC}, 
	// 합집합은 {FR, RA, AN, NC, CE, RE, EN, CH}가 되므로, 두 문자열 사이의 자카드 유사도
	// J("FRANCE", "FRENCH") = 2/8 = 0.25가 된다.
	
	// 입력으로 들어온 문자열은 두 글자씩 끊어서 다중집합의 원소로 만든다. 
	// 이때 영문자로 된 글자 쌍만 유효하고, 기타 공백이나 숫자, 
	// 특수 문자가 들어있는 경우는 그 글자 쌍을 버린다. 
	// 예를 들어 "ab+"가 입력으로 들어오면, "ab"만 다중집합의 원소로 삼고, "b+"는 버린다.
	public static int solution(String str1, String str2) {
        int answer = 65536;
        
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        if(str1.equals(str2)) {
        	return answer;
        }
        	
        char[] ch1 = str1.toCharArray();
        
        for(int i = 0; i < ch1.length - 1; i++) {
        	if(Character.isAlphabetic(ch1[i]) && Character.isAlphabetic(ch1[i + 1])) {
        		list1.add("" + ch1[i] + ch1[i+1]);
        	}        	
        }
        
        ch1 = str2.toCharArray();
        
        for(int i = 0; i < ch1.length - 1; i++) {
        	if(Character.isAlphabetic(ch1[i]) && Character.isAlphabetic(ch1[i + 1])) {
        		list2.add("" + ch1[i] + ch1[i+1]);
        	}
        }
        
        List<String> tempList = new ArrayList<>();
        
        if(list1.size() > list2.size()) {
        	tempList.addAll(list1);
        	list1 = new ArrayList<>(list2);
        	list2 = new ArrayList<>(tempList);        	
        }
        
        Collections.sort(list1);
        Collections.sort(list2);
                
        List<String> listKyo = new ArrayList<>();
        List<String> listTemp1 = new ArrayList<>(list1);
        List<String> listTemp2 = new ArrayList<>(list2);
        
        for(int i = 0 ; i < listTemp1.size(); i++) {
        	for(int j = 0; j < listTemp2.size(); j++) {
        		if(listTemp2.get(j).length() > 0) {
        			if(listTemp1.get(i).equals(listTemp2.get(j))) {        				
        				listTemp2.remove(j);
        				listKyo.add(listTemp1.get(i));
        				System.out.println("del : " + listTemp1.get(i));
        				listTemp1.remove(i);
        				i--;
        				break;
        			}
        		}
        	}
        }
        
        List<String> listHab = new ArrayList<>();
        listHab.addAll(listKyo);
        listHab.addAll(listTemp1);
        listHab.addAll(listTemp2);
        
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(listTemp1);
        System.out.println(listTemp2);
        System.out.println(listKyo);
        System.out.println(listHab);
        
        double jakad = (double)listKyo.size() / (double)listHab.size();
        
        jakad *= 65536;
        answer = (int)jakad;
        
        
        // 자카드 유사도는 원소의 중복을 허용하는 다중집합에 대해서 확장할 수 있다. 
    	// 다중집합 A는 원소 "1"을 3개 가지고 있고, 다중집합 B는 원소 "1"을 5개 가지고 있다고 하자. 
    	// 이 다중집합의 교집합 A ∩ B는 원소 "1"을 min(3, 5)인 3개, 
    	// 합집합 A ∪ B는 원소 "1"을 max(3, 5)인 5개 가지게 된다. 
    	// 다중집합 A = {1, 1, 2, 2, 3}, 다중집합 B = {1, 2, 2, 4, 5}라고 하면, 
    	// 교집합 A ∩ B = {1, 2, 2}, 합집합 A ∪ B = {1, 1, 2, 2, 3, 4, 5}가 되므로, 
    	// 자카드 유사도 J(A, B) = 3/7, 약 0.42가 된다.
           
       
        return answer;
    }
	
	public static void main(String[] args) {
		
		String str1 = "ababa";
		String str2 = "abbbb";
		//인 경우 출력 값이 16384가 나와야 합니다.

		//만약 21845값이 나온다면 합집합 로직의 문제 입니다.
		//합집합 = ['ab', 'bc', 'bb', 'bb'] (o)
		//합집합 = ['ab', 'bc', 'bb'] (x)
		
		System.out.println(solution(str1, str2));
		
	}
}
