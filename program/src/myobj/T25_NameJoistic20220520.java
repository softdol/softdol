package myobj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class T25_NameJoistic20220520 {
	/*
	 * 	���̽�ƽ���� ���ĺ� �̸��� �ϼ��ϼ���. �� ó���� A�θ� �̷���� �ֽ��ϴ�.
		ex) �ϼ��ؾ� �ϴ� �̸��� �� ���ڸ� AAA, �� ���ڸ� AAAA

		���̽�ƽ�� �� �������� �����̸� �Ʒ��� �����ϴ�.

		�� - ���� ���ĺ�
		�� - ���� ���ĺ� (A���� �Ʒ������� �̵��ϸ� Z��)
		�� - Ŀ���� �������� �̵� (ù ��° ��ġ���� �������� �̵��ϸ� ������ ���ڿ� Ŀ��)
		�� - Ŀ���� ���������� �̵� (������ ��ġ���� ���������� �̵��ϸ� ù ��° ���ڿ� Ŀ��)
		���� ��� �Ʒ��� ������� "JAZ"�� ���� �� �ֽ��ϴ�.

		- ù ��° ��ġ���� ���̽�ƽ�� ���� 9�� �����Ͽ� J�� �ϼ��մϴ�.
		- ���̽�ƽ�� �������� 1�� �����Ͽ� Ŀ���� ������ ���� ��ġ�� �̵���ŵ�ϴ�.
		- ������ ��ġ���� ���̽�ƽ�� �Ʒ��� 1�� �����Ͽ� Z�� �ϼ��մϴ�.
		���� 11�� �̵����� "JAZ"�� ���� �� �ְ�, �̶��� �ּ� �̵��Դϴ�.
		������� �ϴ� �̸� name�� �Ű������� �־��� ��, �̸��� ���� ���̽�ƽ ���� Ƚ���� �ּڰ��� return �ϵ��� solution �Լ��� ���弼��.
	
		
         *  1. ���������� �̸� �Է�(ť)
         *  2. ���ٰ� A�� ������ ���� �Ÿ��� ���� �� ������ ���� �ڷ� ���� ����
         *  	2.1 ť�� ���̿� �����ִ� A�� ���� ����
         *  		2.1.1 ������ ���� A�̸� ����
         *  	2.2 ť ���� �� ť ���� - A�� �� ��� ª���� ���
         *  	2.3 �׳� ���°� ������ ��� ť�� ���  
         *  	2.4 �ƴϸ� ���ÿ� �ְ� �Ųٷ� ����
         *  3. �̸� �Է�
         *  4. �ѹ��� ���� ��
         
	
		���� ����
		name�� ���ĺ� �빮�ڷθ� �̷���� �ֽ��ϴ�.
		name�� ���̴� 1 �̻� 20 �����Դϴ�.
		����� ��
		name		return
		"JEROEN"	56
		"JAN"		23
	 * 
	 */
	public static void main(String[] args) {
		String name = "ABAAAAAAAABB";
		//String name = "JEROEN";		
		//String name = "JAN";
		System.out.println(solution(name));
	}
	//	"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
	//	"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
	//	"U", "V", "W", "X", "Y", "Z" 
	public static int solution(String name) {
        int answer = 0;
        
        Queue<Character> qList = new LinkedList<>();
        for(char c : name.toCharArray()) {
        	qList.offer(c);
        }
        
        int orgNum = (int)'A';
        int count = 0;
        boolean isStack = false;
        
        System.out.println(qList);
        while(!qList.isEmpty()) {
        	char nameC = qList.poll();
        	
        	if(nameC == 'A') {
        		//System.out.println(qList);
        		//System.out.print(nameC);
        		int countA = 0;
        		boolean chkA = true;
        		for(char c : qList) {
        			if(c == 'A') {
        				countA++;
        			}else {
        				chkA = false;
        				break;
        			}
        			//System.out.print(" " + c);
        		}
        		// A�� ������ ������ ���⼭ ��
        		if(chkA) {
        			break;
        		}else {
        			int qSize = qList.size();
        			
//        			System.out.println(count + ":::");
//        			System.out.println(nameC + ":::");
        			
        			if(countA > 0) {
	        			System.out.println(nameC + " ] ������  : " + qSize);
	        			System.out.println(nameC + " ] �ڷ� : " 
	        								+ (qSize - countA + count));
	        			
	        			System.out.println(count);
	        			
	        			if(qSize >= qSize - countA + count - 1) {
	        				System.out.println("in1");
	        				isStack = true;
	        				Stack<Character> st = new Stack<>();
	        				while(!qList.isEmpty()) {
	        					char chSt = qList.poll(); 
	        					if(chkA) {
		        					if(chSt != 'A') {
		        						st.push(chSt);
		        					}        					
	        					}else {
	        						st.push(chSt);
	        					}
	        				}
	        				
	        				//System.out.println(count);
	        				//"ABAAAAAAAAABB";
	        				count--;
	        				answer = answer + count * 2 + 1 ;
	        				
	        				System.out.println(st);
	        				
	        				while(!st.isEmpty()) {
	        					nameC = st.pop();
	        					
	        					int front = (int)nameC - orgNum;
	        		        	int back = orgNum - (int)nameC + 26;
	        		        	
	        		        	answer++;     	
	        		        	answer = front < back ? answer + front : answer + back;
	        				}
	        				
	        				System.out.println("st : " + st);
	        			}
        			}
        		}
        		System.out.println();
        	}
        	
        	if(!isStack) {
	        	int front = (int)nameC - orgNum;
	        	int back = orgNum - (int)nameC + 26;
	//        	System.out.println(nameC);
	//        	System.out.printf("%c(%d) - A(%d) = %d\n", nameC, (int)nameC, orgNum, front);
	//        	System.out.printf("A(%d) - %c(%d) + 26 = %d\n", orgNum, nameC, (int)nameC, back);
	        	
	        	answer = answer == 0 ? answer : answer + 1;      	
	        	answer = front < back ? answer + front : answer + back;	        	
	//        	System.out.printf("answer = %d\n", answer);
	        	
	        	count++;
        	}
        	System.out.println();
        }
        
        
        
        
        
//        int nameLen = name.length();
//        
//        char[] nameO = name.toCharArray();        
//        char[] nameC = new char[nameLen];
//        Arrays.fill(nameC, 'A');
//        
//        int i = 0;
//        int cnt = 0;
//        int loop = 1;
//        int chkLastCnt = nameLen;
//        boolean chk = true;
//        
//        while(cnt < nameLen) {
//        	        	
//        	if(nameO[i] == 'A' && !chk) {
//        		if(loop == -1 && i >= 0) {
//        			cnt++;
//        			if(i == 0) {
//        				i = nameLen;
//        			}
//        			i += loop;
//        			if(i == chkLastCnt) {
//        				cnt--;
//        			}
//        			continue;
//        		}
//        		boolean chkA = true;
//        		int countA = 0;
//	        	if(loop != -1) {
//		        	for(int j = i; j < chkLastCnt; j+=loop) {
//		    			if(nameO[j] != 'A') {
//		    				chkA = false;
//		    				countA++;
//		    				break;
//		    			}
//		    		}
//		        	/*	���� �°Ÿ� i - 1
//		        	 * 	A�� conA
//		        	 * 	������ ���ߵǴ� �� ��ü����(13) - �°Ÿ�(1) - 1
//		        	 * 	���Ƽ� ���� �� �°Ÿ� + (��ü����(13)  + ����°Ÿ�(1) - A��(9) - ���� �ڸ�1))
//		        	 * 
//		        	 */
//		        	if(nameLen - i < nameLen + i - countA) {		        		
//		        		loop = -1;
//		        		i--;
//		        		cnt++;
//		        		chkLastCnt = i - 1;
//		        		continue;
//		        	}
//		        	
//		        	//������ ������ A �������� ���ư��� ���� ������ ���ư��� 
//		        	//if(countA)
//		        		//nameLe(13) �±���(2) A(9)
//	        	}else {
//	        		for(int j = i; j > chkLastCnt; j+=loop) {
//		    			if(nameO[j] != 'A') {
//		    				chkA = false;
//		    				countA++;
//		    				break;
//		    			}
//		    		}
//	        	}
//	        	if(chkA) {
//	        		System.out.println(i + " out ");
//	    			break;
//	    		}
//        	}
//        	System.out.println(i + " : " + nameLen);
//        	
//        	int fornt = (int)nameO[i] - (int)nameC[i];
//        	int back = (int)nameC[i] - (int)nameO[i] + 26;
//        	answer = fornt < back ? answer + fornt : answer + back;
//        	answer = i == 0 ? answer : answer + 1;
//    		
//    		if(nameLen > 1 && chk) {    			
//    			if(nameO[1] == 'A') {
//	            	loop = -1;
//	            	i = nameLen;
//	            	chkLastCnt = 0;
//    			}
//    			chk = false;
//        	}
//    		if(!chk) {        		
//        		i += loop;
//        	}
//        	cnt++;
//        }
//        
//        System.out.println();
        
        return answer;
    }
}

















