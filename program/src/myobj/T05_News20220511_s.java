package myobj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T05_News20220511_s {
	// ��ī�� ���絵�� ���� ���� ���絵�� �˻��ϴ� ���� ��� ���� �ϳ��� �˷��� �ִ�. 
	// �� ���� A, B ������ ��ī�� ���絵 J(A, B)�� �� ������ ������ ũ�⸦ �� ������ 
	// ������ ũ��� ���� ������ ���ǵȴ�.

	// ���� ��� ���� A = {1, 2, 3}, ���� B = {2, 3, 4}��� �� ��, 
	// ������ A �� B = {2, 3}, ������ A �� B = {1, 2, 3, 4}�� �ǹǷ�, 
	// ���� A, B ������ ��ī�� ���絵 J(A, B) = 2/4 = 0.5�� �ȴ�. 
	// ���� A�� ���� B�� ��� �������� ��쿡�� �������� ���ǵ��� ������ 
	// ���� J(A, B) = 1�� �����Ѵ�.	

	// �̸� �̿��Ͽ� ���ڿ� ������ ���絵�� ����ϴµ� �̿��� �� �ִ�. 
	// ���ڿ� "FRANCE"�� "FRENCH"�� �־����� ��, �̸� �� ���ھ� ��� ���������� ���� �� �ִ�. 
	// ���� {FR, RA, AN, NC, CE}, {FR, RE, EN, NC, CH}�� �Ǹ�, �������� {FR, NC}, 
	// �������� {FR, RA, AN, NC, CE, RE, EN, CH}�� �ǹǷ�, �� ���ڿ� ������ ��ī�� ���絵
	// J("FRANCE", "FRENCH") = 2/8 = 0.25�� �ȴ�.
	
	// �Է����� ���� ���ڿ��� �� ���ھ� ��� ���������� ���ҷ� �����. 
	// �̶� �����ڷ� �� ���� �ָ� ��ȿ�ϰ�, ��Ÿ �����̳� ����, 
	// Ư�� ���ڰ� ����ִ� ���� �� ���� ���� ������. 
	// ���� ��� "ab+"�� �Է����� ������, "ab"�� ���������� ���ҷ� ���, "b+"�� ������.
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
        
        
        // ��ī�� ���絵�� ������ �ߺ��� ����ϴ� �������տ� ���ؼ� Ȯ���� �� �ִ�. 
    	// �������� A�� ���� "1"�� 3�� ������ �ְ�, �������� B�� ���� "1"�� 5�� ������ �ִٰ� ����. 
    	// �� ���������� ������ A �� B�� ���� "1"�� min(3, 5)�� 3��, 
    	// ������ A �� B�� ���� "1"�� max(3, 5)�� 5�� ������ �ȴ�. 
    	// �������� A = {1, 1, 2, 2, 3}, �������� B = {1, 2, 2, 4, 5}��� �ϸ�, 
    	// ������ A �� B = {1, 2, 2}, ������ A �� B = {1, 1, 2, 2, 3, 4, 5}�� �ǹǷ�, 
    	// ��ī�� ���絵 J(A, B) = 3/7, �� 0.42�� �ȴ�.
           
       
        return answer;
    }
	
	public static void main(String[] args) {
		
		String str1 = "ababa";
		String str2 = "abbbb";
		//�� ��� ��� ���� 16384�� ���;� �մϴ�.

		//���� 21845���� ���´ٸ� ������ ������ ���� �Դϴ�.
		//������ = ['ab', 'bc', 'bb', 'bb'] (o)
		//������ = ['ab', 'bc', 'bb'] (x)
		
		System.out.println(solution(str1, str2));
		
	}
}
