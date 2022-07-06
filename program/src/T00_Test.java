import java.util.ArrayList;
import java.util.Arrays;

public class T00_Test {
	
	/*
	 * 	n명의 사람이 일렬로 줄을 서고 있습니다. 
	 * 	n명의 사람들에게는 각각 1번부터 n번까지 번호가 매겨져 있습니다. 
	 * 	n명이 사람을 줄을 서는 방법은 여러가지 방법이 있습니다. 
	 * 	예를 들어서 3명의 사람이 있다면 다음과 같이 6개의 방법이 있습니다.

		[1, 2, 3] 
		[1, 3, 2]
		[2, 1, 3] 
		[2, 3, 1] 
		[3, 1, 2]
		[3, 2, 1] 
		
		사람의 수 n과, 자연수 k가 주어질 때, 사람을 나열 하는 방법을 사전 순으로 나열 했을 때, 
		k번째 방법을 return하는 solution 함수를 완성해주세요.

		제한사항
		n은 20이하의 자연수 입니다.
		k는 n! 이하의 자연수 입니다.
		
		입출력 예
		n	k	result
		3	5	[3,1,2]

	 */
	
	// 두자리 숫자 잘라 올때 에러
	// 반복횟수 줄이기
	/*128	64	32	16	8	4	2   					
	 * 0	0	0	0	0	0	0 
	 *	7	6	5	4	3	2	1 
	 * 2:2,	3:6, 4:24, 5:120 
	 * 
	 * 5 : 110 -- [5, 3, 1, 4, 2]
	 */
	public static void main(String[] args) {
		int n = 4;		
		long k = 10000;
		
//		for(int i = 1; i <= 10; i++) {
//			countK = 0;
//			solution(i, k);
//			int sum = 1;
//			for(int j = 1; j <= i; j++) {
//				sum *= j;
//			}
//			System.out.println(i + " : " + countK + " | " + sum);
//		}
		
		System.out.println(Arrays.toString(solution(n, k)));
	}
	
	public static int[] solution(int n, long k) {
        
        int[] numList = new int[n];
        boolean[] chk = new boolean[n]; 
        listLen = n;
        answer = new int[n];
        temp = new int[n];
        
        for(int i = 0; i < n; i++) {
        	numList[i] = i + 1;
        }
        
        // test start
        long tempK = k;
        long sum = 1;
        long[] maxList = new long[20];
        
        for(int i = 0; i < 20; i++) {
        	maxList[i] = (sum *= (i+1));
        }
        for(int i = 0; i < 20; i++) {
        	//System.out.println(maxList[i]);
        }
        //109 => 24 + 24 + 24 + 24 + 6 + 6 + 
        // 96 + 12 + 1
        // 4 + 2 + 0 + 0 + 1
        
        // test end
        countK = 0;
        loop(numList, chk, 0, k);        
        
        System.out.println();
        
        return answer;
    }
	
	static int countK;
	static int listLen;
	static int[] answer;
	static int[] temp;
	static boolean stopChk;
	
	
	public static void loop(int[] numList, boolean[] chk, int dept, long k) {		
		
		if(dept == listLen) {			
			countK++;
			System.out.println(countK + " : " + Arrays.toString(temp));			
			dept = 0;
			if(k == countK) {				
				for(int i = 0; i < temp.length; i++) {
					answer[i] = temp[i];
				}	
				stopChk = true; 
			}			
			return;
		}
		
		if(stopChk) {
			return;
		}
		
		for(int i = 0; i < listLen; i++) {
			if(chk[i] == false) {
				chk[i] = true;
				temp[dept] = numList[i];
				loop(numList, chk, dept + 1, k);
				chk[i] = false;
			}	
		}
	}
	

	//answer = Integer.parseInt(tr.toString(), 3);
	//for(Entry<Integer, Integer> ent : hsList.entrySet() ) {
	//int[] answer = list.stream().mapToInt(i->i).toArray();
	//list.put(i, list.getOrDefault(i, 0) + 1);
	//Collections.sort(list);
	//Arrays.sort(d);
	//HashSet<Integer> set = new HashSet<>();
	//return Math.max(price * (count * (count + 1) / 2) - money, 0);
	//String str = Integer.toBinaryString(arr1[0] | arr2[0]);
	//point = Character.getNumericValue(ch[i]);
	//int[] answer = ls.stream().mapToInt(i -> i).toArray();
	//Stack<Integer> stack = new Stack<>();
	//Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
	//return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
	//Arrays.asList(seoul).indexOf("Kim");
	//소수구하기 double sqrt = Math.sqrt(i); 사용법
	//영어 한자씩 뽑고 싶을떄
	//for(char ch = 'a'; ch <= 'z'; ch++) {
	//	System.out.print("\'"+ch+"\',");
	//}
	//gcd 함수

	
	/*
	 * 	String math = "[0-9]+";
	 * 		^[0-9] : 숫자가 아닌
	 * 		//[0-9] : 숫자만
	 * 		//[0-9]+ : 숫자만 있는것
	 */
}

