package myobj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class T20_BigNum20220518_s {
	/*
	 * 	� ���ڿ��� k���� ���� �������� �� ���� �� �ִ� ���� ū ���ڸ� ���Ϸ� �մϴ�.

		���� ���, ���� 1924���� �� �� ���� �����ϸ� [19, 12, 14, 92, 94, 24] 
		�� ���� �� �ֽ��ϴ�. �� �� ���� ū ���ڴ� 94 �Դϴ�.

		���ڿ� �������� ���� number�� ������ ���� ���� k�� solution �Լ��� �Ű������� �־����ϴ�. 
		number���� k ���� ���� �������� �� ���� �� �ִ� �� �� ���� ū ���ڸ� ���ڿ� ���·� return
		 �ϵ��� solution �Լ��� �ϼ��ϼ���.

		���� ����
		number�� 2�ڸ� �̻�, 1,000,000�ڸ� ������ �����Դϴ�.
		k�� 1 �̻� number�� �ڸ��� �̸��� �ڿ����Դϴ�.
		
		number			k		return
		"1924"			2		"94"
		"1231234"		3		"3234"
		"4177252841"	4		"775841"
	 * 
	 */
	
	public String sample(String number, int k) {
        char[] result = new char[number.length() - k];
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<number.length(); i++) {
            char c = number.charAt(i);
            while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
                stack.pop();
            }
            stack.push(c);
        }
        for (int i=0; i<result.length; i++) {
            result[i] = stack.get(i);
        }
        return new String(result);
    }
	
	public static void main(String[] args) {
		String number = "89789";
		int k = 4;
		
		System.out.println(solution(number, k));
	}
	
	public static String solution(String number, int k) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();        
        Queue<Character> q = new LinkedList<>();
        for(char c : number.toCharArray()) {
        	q.offer(c);
        }
        while(!q.isEmpty()) {
        	char fC = q.poll();
        	int count = 0;
        	boolean failNum = false;
        	if(fC != '9'){
	        	for(char c: q) {
	        		if(count >= k) {
	        			break;
	        		}
	        		if(fC < c) {
	        			failNum = true;
	        			k--;
	        			break;
	        		}
	        		count++;
	        	}
        	}
        	
        	if(!failNum) {
        		sb.append(fC);
        	}
        	
        	if(k == 0) {
        		while(!q.isEmpty()) {
        			sb.append(q.poll());
        		}
        	}
        	
        	if(k == q.size()) {
        		break;
        	}
        }        
        answer = sb.toString();
        
        //System.out.println(Collections.max(list));
        
        return answer;
    }
}



















