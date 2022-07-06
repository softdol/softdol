package myobj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T06_Rotate20220511_s {

	/*
	 * 	(), [], {} �� ��� �ùٸ� ��ȣ ���ڿ��Դϴ�.
	 * 
		���� A�� �ùٸ� ��ȣ ���ڿ��̶��, 
		(A), [A], {A} �� �ùٸ� ��ȣ ���ڿ��Դϴ�. 
		���� ���, [] �� �ùٸ� ��ȣ ���ڿ��̹Ƿ�, ([]) �� �ùٸ� ��ȣ ���ڿ��Դϴ�.
		
		���� A, B�� �ùٸ� ��ȣ ���ڿ��̶��, AB �� �ùٸ� ��ȣ ���ڿ��Դϴ�. 
		���� ���, {} �� ([]) �� �ùٸ� ��ȣ ���ڿ��̹Ƿ�, 
		{}([]) �� �ùٸ� ��ȣ ���ڿ��Դϴ�.
		
		���ȣ, �߰�ȣ, �׸��� �Ұ�ȣ�� �̷���� ���ڿ� s�� �Ű������� �־����ϴ�. 
		�� s�� �������� x (0 �� x < (s�� ����)) ĭ��ŭ ȸ�������� �� 
		s�� �ùٸ� ��ȣ ���ڿ��� �ǰ� �ϴ� x�� ������ return �ϵ��� solution �Լ��� �ϼ����ּ���.
	 * 
	 */
	public static void main(String[] args) {
		
		String s = "[)(]";
		
		System.out.println(solution(s));
		
//		s	result
//		"[](){}"	3
//		"}]()[{"	2
//		"[)(]"	0
//		"}}}"	0
		
		//{{}}([])(){}
		//(){}{{}}([])
		
	}
	
	public static void test(String s) {
		
		String ss = s;
		
		List<Integer> listTemp = new ArrayList<>();
		
		int tempNum = 0;
		
		for(Character c: ss.toCharArray()) {			
			
			switch (c) {
			case '(':
				tempNum = 1;
				break;
			case ')':
				tempNum = 2;
				break;
			case '[':
				tempNum = 3;
				break;
			case ']':
				tempNum = 4;
				break;
			case '{':
				tempNum = 5;
				break;
			case '}':
				tempNum = 6;
				break;
			}
			listTemp.add(tempNum);
		}
		
		
		
		boolean chk = true;
		
		for(int j = 0; j < listTemp.size(); j++) {
			if(listTemp.get(j) == 1 || listTemp.get(j) == 3 || listTemp.get(j) == 5) {
				for(int k = j + 1; k < listTemp.size(); k++) {						
					if(listTemp.get(j) == listTemp.get(k)-1) {
						listTemp.set(k, 0);
						listTemp.remove(k);						
						break; 
					}else if(listTemp.get(j) % 2 != listTemp.get(k) % 2 ) {
						
						boolean subChk = false;
						
						for(int l = k; l > j; l--) {
							if(listTemp.get(k) == listTemp.get(l) + 1) {
								listTemp.set(l, 0);
								listTemp.set(k, 0);										
								subChk = true;
								break;
							}
						}
						if(!subChk) {
							chk = false;
						}
						break;
					}
				}
				if(!chk) {
					break;
				}
			}
		}
		
		for(int l = 0; l < listTemp.size(); l++) {
			System.out.print(value(listTemp.get(l)));
		}
		
		System.out.print(" : " + chk);
		System.out.println();
		
	}
	
	public static char value(int i) {
		
		char tempNum = ' ';
		
		switch (i) {
		case 1:
			tempNum = '(';
			break;
		case 2:
			tempNum = ')';
			break;
		case 3:
			tempNum = '[';
			break;
		case 4:
			tempNum = ']';
			break;
		case 5:
			tempNum = '{';
			break;
		case 6:
			tempNum = '}';
			break;
		}
		
		return tempNum;
	}
	
	public static int solution(String s) {
		int answer = 0;
		
		int len = s.length();		
		int tempNum = 0;
		
		if(len % 2 == 1) {
			return 0;
		}
		
		List<Integer> listOrg = new ArrayList<>();
		List<Integer> listTemp = new ArrayList<>();
		for(Character c: s.toCharArray()) {
			
			switch (c) {
			case '(':
				tempNum = 1;
				break;
			case ')':
				tempNum = 2;
				break;
			case '[':
				tempNum = 3;
				break;
			case ']':
				tempNum = 4;
				break;
			case '{':
				tempNum = 5;
				break;
			case '}':
				tempNum = 6;
				break;
			}
			listOrg.add(tempNum);
		}
		
		for(int i = 0; i < len; i++) {
			
			boolean chk = true;	
			
			listTemp = new ArrayList<>(listOrg);
			
			for(int l = 0; l < listTemp.size(); l++) {
				System.out.print(value(listTemp.get(l)));
			}
			System.out.println();
			
			if(listTemp.get(0) == 2 || listTemp.get(0) == 4 || listTemp.get(0) == 6
					|| listTemp.get(len - 1) == 1 || listTemp.get(len - 1) == 3 || listTemp.get(len - 1) == 5
					) {
				chk = false;
			}else{
				for(int j = 0; j < listTemp.size(); j++) {
					if(listTemp.get(j) == 1 || listTemp.get(j) == 3 || listTemp.get(j) == 5) {
						for(int k = j + 1; k < listTemp.size(); k++) {						
							if(listTemp.get(j) == listTemp.get(k)-1) {
								listTemp.set(k, 0);
								listTemp.remove(k);
								break; 
							}else if(listTemp.get(j) % 2 != listTemp.get(k) % 2 ) {
								
								boolean subChk = false;
								
								for(int l = k; l > j; l--) {
									if(listTemp.get(k) == listTemp.get(l) + 1) {
										listTemp.set(l, 0);
										listTemp.set(k, 0);										
										subChk = true;
										break;
									}
								}
								if(!subChk) {
									chk = false;
								}
								break;
							}
						}
						if(!chk) {
							break;
						}
					}
				}
			}
			if(chk) {
				answer++;
			}
			
			
			for(int l = 0; l < listTemp.size(); l++) {
				System.out.print(value(listTemp.get(l)));
			}
			
			System.out.print(" : " + chk);
			System.out.println();
			
			Collections.rotate(listOrg, -1);
			
		}
		
		
//		int len = s.length();
//		
//		List<Character> list = new ArrayList<>();
//		for(Character c: s.toCharArray()) {
//			list.add(c);
//		}
//		
//		
//		for(int i = 0; i < len; i++) {			
//			boolean chk = true;						
//			if(list.get(0) == ']' || list.get(0) == ')' || list.get(0) == '}'
//					|| list.get(len - 1) == '[' || list.get(len - 1) == '(' || list.get(len - 1) == '{'
//					) {
//				chk = false;
//			}else {			
//				for(int j = 0; j < list.size(); j++) {
//					
//				}
//			}
//			if(chk) {
//				answer++;
//			}
//			Collections.rotate(list, -1);
//		}
		
		
		return answer;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
