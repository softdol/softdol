package myobj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class T25_NameJoistic20220520 {
	/*
	 * 	조이스틱으로 알파벳 이름을 완성하세요. 맨 처음엔 A로만 이루어져 있습니다.
		ex) 완성해야 하는 이름이 세 글자면 AAA, 네 글자면 AAAA

		조이스틱을 각 방향으로 움직이면 아래와 같습니다.

		▲ - 다음 알파벳
		▼ - 이전 알파벳 (A에서 아래쪽으로 이동하면 Z로)
		◀ - 커서를 왼쪽으로 이동 (첫 번째 위치에서 왼쪽으로 이동하면 마지막 문자에 커서)
		▶ - 커서를 오른쪽으로 이동 (마지막 위치에서 오른쪽으로 이동하면 첫 번째 문자에 커서)
		예를 들어 아래의 방법으로 "JAZ"를 만들 수 있습니다.

		- 첫 번째 위치에서 조이스틱을 위로 9번 조작하여 J를 완성합니다.
		- 조이스틱을 왼쪽으로 1번 조작하여 커서를 마지막 문자 위치로 이동시킵니다.
		- 마지막 위치에서 조이스틱을 아래로 1번 조작하여 Z를 완성합니다.
		따라서 11번 이동시켜 "JAZ"를 만들 수 있고, 이때가 최소 이동입니다.
		만들고자 하는 이름 name이 매개변수로 주어질 때, 이름에 대해 조이스틱 조작 횟수의 최솟값을 return 하도록 solution 함수를 만드세요.
	
		
         *  1. 순차적으로 이름 입력(큐)
         *  2. 가다가 A를 만나면 남은 거리를 계한 후 앞으로 갈지 뒤로 갈지 결정
         *  	2.1 큐의 길이와 남아있는 A의 수를 구함
         *  		2.1.1 남은게 전부 A이면 멈춤
         *  	2.2 큐 길이 와 큐 길이 - A수 중 어떤게 짧은지 계산
         *  	2.3 그냥 가는게 빠르면 계속 큐로 계산  
         *  	2.4 아니면 스택에 넣고 거꾸로 빼기
         *  3. 이름 입력
         *  4. 한바퀴 돌면 끝
         
	
		제한 사항
		name은 알파벳 대문자로만 이루어져 있습니다.
		name의 길이는 1 이상 20 이하입니다.
		입출력 예
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
        		// A가 끝까지 있으면 여기서 끝
        		if(chkA) {
        			break;
        		}else {
        			int qSize = qList.size();
        			
//        			System.out.println(count + ":::");
//        			System.out.println(nameC + ":::");
        			
        			if(countA > 0) {
	        			System.out.println(nameC + " ] 앞으로  : " + qSize);
	        			System.out.println(nameC + " ] 뒤로 : " 
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
//		        	/*	현재 온거리 i - 1
//		        	 * 	A수 conA
//		        	 * 	앞으로 가야되는 수 전체길이(13) - 온거리(1) - 1
//		        	 * 	돌아서 가는 수 온거리 + (전체길이(13)  + 현재온거리(1) - A수(9) - 도착 자리1))
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
//		        	//갈길이 마지막 A 다음보다 돌아가는 길이 빠르면 돌아가기 
//		        	//if(countA)
//		        		//nameLe(13) 온길이(2) A(9)
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

















