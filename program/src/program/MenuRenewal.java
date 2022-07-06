package program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class MenuRenewal {
	/*	
	 * 	��������� ��ϴ� ��ī�Ǵ� �ڷγ�19�� ���� �Ұ�⸦ �غ��ϰ��� 
	 * 	�޴��� ���� �����Ϸ��� ����ϰ� �ֽ��ϴ�.
	 * 
		�������� ��ǰ���θ� �����ϴ� �޴��� �����ؼ� �ڽ��丮 ���·� �籸���ؼ� 
		���ο� �޴��� �����ϱ�� �����߽��ϴ�. 
		
		� ��ǰ�޴����� �����ؼ� �ڽ��丮 �޴��� �����ϸ� ���� �� ����ϴ� 
		"��ī��"�� ������ �� �մԵ��� �ֹ��� �� 
		���� ���� �Բ� �ֹ��� ��ǰ�޴����� �ڽ��丮 �޴��� �����ϱ�� �߽��ϴ�.
		
		��, �ڽ��丮 �޴��� �ּ� 2���� �̻��� ��ǰ�޴��� �����Ϸ��� �մϴ�. 
		����, �ּ� 2�� �̻��� �մ����κ��� �ֹ��� ��ǰ�޴� ���տ� ���ؼ��� �ڽ��丮 
		�޴� �ĺ��� �����ϱ�� �߽��ϴ�.

		���� ���, �մ� 6���� �ֹ��� ��ǰ�޴����� ������ ������ ���ٸ�,
		(�� �մ��� ��ǰ�޴��� 2�� �̻� �ֹ��ؾ� �ϸ�, �� ��ǰ�޴��� A ~ Z�� ���ĺ� �빮�ڷ� ǥ���մϴ�.)

		�մ� ��ȣ	�ֹ��� ��ǰ�޴� ����
		1�� �մ�	A, B, C, F, G
		2�� �մ�	A, C
		3�� �մ�	C, D, E
		4�� �մ�	A, C, D, E
		5�� �մ�	B, C, F, G
		6�� �մ�	A, C, D, E, H
		
		���� ���� �Բ� �ֹ��� ��ǰ�޴� ���տ� ���� "��ī��"�� ����� �� �ڽ��丮 �޴� ���� �ĺ��� ������ �����ϴ�.

		�ڽ� ����	�޴� ����	����
		�丮 2�� �ڽ�	A, C	1��, 2��, 4��, 6�� �մ����κ��� �� 4�� �ֹ��ƽ��ϴ�.
		�丮 3�� �ڽ�	C, D, E	3��, 4��, 6�� �մ����κ��� �� 3�� �ֹ��ƽ��ϴ�.
		�丮 4�� �ڽ�	B, C, F, G	1��, 5�� �մ����κ��� �� 2�� �ֹ��ƽ��ϴ�.
		�丮 4�� �ڽ�	A, C, D, E	4��, 6�� �մ����κ��� �� 2�� �ֹ��ƽ��ϴ�.

		[����]
		�� �մԵ��� �ֹ��� ��ǰ�޴����� ���ڿ� �������� ��� �迭 orders, 
		"��ī��"�� �߰��ϰ� �;��ϴ� �ڽ��丮�� �����ϴ� 
		��ǰ�޴����� ������ ��� �迭 course�� �Ű������� �־��� ��, 
		"��ī��"�� ���� �߰��ϰ� �� �ڽ��丮�� �޴� ������ ���ڿ� ���·�
		 �迭�� ��� return �ϵ��� solution �Լ��� �ϼ��� �ּ���.

		[���ѻ���]
		orders �迭�� ũ��� 2 �̻� 20 �����Դϴ�.
		orders �迭�� �� ���Ҵ� ũ�Ⱑ 2 �̻� 10 ������ ���ڿ��Դϴ�.
		�� ���ڿ��� ���ĺ� �빮�ڷθ� �̷���� �ֽ��ϴ�.
		�� ���ڿ����� ���� ���ĺ��� �ߺ��ؼ� ������� �ʽ��ϴ�.
		course �迭�� ũ��� 1 �̻� 10 �����Դϴ�.
		course �迭�� �� ���Ҵ� 2 �̻� 10 ������ �ڿ����� ������������ ���ĵǾ� �ֽ��ϴ�.
		course �迭���� ���� ���� �ߺ��ؼ� ������� �ʽ��ϴ�.
		������ �� �ڽ��丮 �޴��� ������ ���ڿ� �������� �迭�� ��� ���� ������ �������� �����ؼ� return ���ּ���.
		�迭�� �� ���ҿ� ����� ���ڿ� ���� ���ĺ� ������������ ���ĵǾ�� �մϴ�.
		���� ���� ���� �Բ� �ֹ��� �޴� ������ ���� �����, ��� �迭�� ��� return �ϸ� �˴ϴ�.
		orders�� course �Ű������� return �ϴ� �迭�� ���̰� 1 �̻��� �ǵ��� �־����ϴ�.
		
		[����� ��]
		orders	course	result
		["ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"]	[2,3,4]	["AC", "ACDE", "BCFG", "CDE"]
		["ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"]	[2,3,5]	["ACD", "AD", "ADE", "CD", "XYZ"]
		["XYZ", "XWY", "WXA"]	[2,3,4]	["WX", "XY"]
		����� ���� ���� ����
		����� �� #1
		������ ���ÿ� �����ϴ�.

		����� �� #2
		AD�� �� ��, CD�� �� ��, ACD�� �� ��, ADE�� �� ��, XYZ �� �� �� �ֹ��ƽ��ϴ�.
		�丮 5���� �ֹ��� �մ��� 1�� ������, 
		�ּ� 2�� �̻��� �մԿ��Լ� �ֹ��� ������ �ڽ��丮 �ĺ��� ���Ƿ�, 
		�丮 5���� ������ �ڽ��丮�� ���� �߰����� �ʽ��ϴ�.

		����� �� #3
		WX�� �� ��, XY�� �� �� �ֹ��ƽ��ϴ�.
		3���� �մ� ��� ��ǰ�޴��� 3���� �ֹ�������, 
		�ּ� 2�� �̻��� �մԿ��Լ� �ֹ��� ������ �ڽ��丮 �ĺ��� ���Ƿ�, 
		�丮 3���� ������ �ڽ��丮�� ���� �߰����� �ʽ��ϴ�.
		��, ��ǰ�޴��� 4�� �̻� �ֹ��� �մ��� �����Ƿ�, 
		�丮 4���� ������ �ڽ��丮 ���� ���� �߰����� �ʽ��ϴ�.
	 * 
	 */
	public static void main(String[] args) {
		
//		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
//		int[] course = {2,3,4};
		//["AC", "ACDE", "BCFG", "CDE"]
		
		String[] orders = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
		int[] course = {2,3,5};
		//["ACD", "AD", "ADE", "CD", "XYZ"]
		
//		String[] orders = {"XYZ", "XWY", "WXA"};
//		int[] course = {2,3,4};
		//["WX", "XY"]
		
		System.out.println(Arrays.toString(solution(orders, course)));
		
	}
	
	public static String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        TreeMap<String, Integer> menuList = new TreeMap<>(); 
        ArrayList<Integer> cList = new ArrayList<>();
        for(int i: course) {
        	cList.add(i);
        }
                
        for(Integer chkI : cList) {
	        for(int i = 0; i < orders.length; i++) {
	        	boolean samChk = false;
	        	ArrayList<Character> tempOrg = new ArrayList<>();
	        	for(char c : orders[i].toCharArray()) {
	        		tempOrg.add(c);
	        	}
	        	Collections.sort(tempOrg);        	
	        	for(int j = i + 1; j < orders.length; j++) {	        		
	        		ArrayList<Character> tempSe = new ArrayList<>();
	            	for(char c : orders[j].toCharArray()) {
	            		tempSe.add(c);
	            	}
	            	Collections.sort(tempSe);
	
	    			String s = "";
	    			//String[] orders = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
	    			
	    			System.out.println(orders[i] + " : " + orders[j]);
	    			for(int ii = 0; ii < tempOrg.size(); ii++) {        				
	    				for(int jj = 0; jj < tempSe.size(); jj++) {
	    					//System.out.println(tempOrg.get(ii) + " : " + tempSe.get(jj));
	    					if(tempOrg.get(ii) == tempSe.get(jj)) {
	    						//System.out.println("???");
	    						s += tempSe.get(jj);
	    						tempSe.remove(jj--);
	    						break;
	    					}
	    				}
	    				//System.out.println(s);	    				
	    				if(s.length() == chkI) {
	    					System.out.println(s + "???????????");
	    					if(menuList.get(s) == null && samChk == false) {
	    						samChk = true;
	    					}
	    					samChk = true;
	    					if(s.equals("CD")) {
	    						//System.out.println(orders[i] + " : " + orders[j] + " => " + s);
	    						//System.out.println(samChk);
	    					}
	    					if(samChk) {
	    						menuList.put(s, menuList.getOrDefault(s, 1) + 1);
	    					}
	    					//s = "";
	    					break;
	    				}
	    			}
	    			
	    			
	        	}
	        }
        }
        
        System.out.println(menuList);
        
        HashMap<Integer, Integer> chkList = new HashMap<>();
        
        for(java.util.Map.Entry<String, Integer> e : menuList.entrySet()) {
        	Integer getValue = chkList.get(e.getKey().length()); 
        	if(getValue == null) {
        		chkList.put(e.getKey().length(), e.getValue());
        	}else {
        		chkList.put(e.getKey().length(), (int)Math.max(getValue, e.getValue()));
        	}
        }
        
        TreeSet<String> anwList = new TreeSet<>();
        
        for(java.util.Map.Entry<Integer, Integer> c : chkList.entrySet()) {
        	int strLen = c.getKey();
        	int strCnt = c.getValue();
        	for(java.util.Map.Entry<String, Integer> e : menuList.entrySet()) {
        		if(strLen == e.getKey().length() && strCnt == e.getValue()) {
        			anwList.add(e.getKey());
        		}
            }
        }
        
        int i = 0;
        answer = new String[anwList.size()];
        for(String s : anwList) {
        	answer[i++] = s;
        }
        
        return answer;
    }
}










