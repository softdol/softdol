package myobj;

import java.util.HashSet;

public class T13_FullSearch20220513_f {
	
	/*
	 * 	한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 
	 * 	흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.

		각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 
		종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.

		제한사항
		numbers는 길이 1 이상 7 이하인 문자열입니다.
		numbers는 0~9까지 숫자만으로 이루어져 있습니다.
		"013"은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
		
		입출력 예
		numbers	return
		"17"	3
		"011"	2
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		String numbers = "011";
		
		System.out.println(solution(numbers));
		
	}
	
	
	
	public static int solution(String numbers) {
		int answer = 0;
		
		char[] ch = numbers.toCharArray();
		boolean[]chk = new boolean[ch.length];
		int cntA = 0;
		
		for(int i = 0; i < ch.length; i++) {			
			System.out.println(ch[i]);
			cntA++;
			for(int j = 0; j < ch.length; j++) {				
				if(i != j) {					
					System.out.println("" + ch[i] + ch[j]);
					cntA++;
					for(int k = 0; k < ch.length; k++) {
						if(k != j && i !=k) {							
							System.out.println("" + ch[i] + ch[j] + ch[k]);
							cntA++;
						}
					}
				}
			}
		}
		System.out.println("---------"+cntA+"---------------");
		
		//loop(ch, 0, chk, "");
		
		System.out.println("------------------------");
		list = new HashSet<>();
		
		recursive("", numbers);
		System.out.println(list);
		System.out.println("------------------------");
		for(int num : list) {
			int temp = (int)Math.sqrt(num);
			if(num > 1) {
				boolean numChk = false;
				for(int i = 2; i <= temp; i++) {
					if(num % i == 0) {
						numChk = true;
						System.out.println(num + " : " + i);
						break;
					}				
				}
				
				if(!numChk) {
					System.out.println(num + "]]]]");
					answer++;
				}
			}
			
		}
		return answer;
	}
	
	
	public static void loop(char[] ch, int dept, boolean[] chk, String s) {
		
		for(int i = 0; i < ch.length; i++) {
			if(!chk[i]) {
				chk[i] = true;
				s += ch[i];
				System.out.println(s);
				if(dept < ch.length) {
					loop(ch, dept + 1, chk, s);					
				}
				s = "";				
				chk[i] = false;
			}
		}

	}
	
	static HashSet<Integer> list;
	
	public static void recursive(String comb, String others) {
        // 1. 현재 조합을 set에 추가한다.
        if (!comb.equals("")) {        	
            //numbersSet.add(Integer.valueOf(comb));
        	list.add(Integer.valueOf(comb));
        	//System.out.println(comb);
        }

        // 2. 남은 숫자 중 한 개를 더해 새로운 조합을 만든다.
        for (int i = 0; i < others.length(); i++) {
        	recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
        }
            

    }

	
	
//	final static int MAX = 10000000;        
//    static int len = 0;
//    static HashSet<Integer> set = new HashSet<>();
//    static String[]  strNums = null;
//    static boolean[] visited = null;
//    static boolean[] primeList = new boolean[MAX];
//    
//    
//    // 종이 조각으로 만들 수 있는 모든 경의우의 소수를 구한다.
//    public static void getResult(int x, String strNum) {
//        
//        // 소수판별
//        if ( strNum != "") {
//        	System.out.println(strNum);
//            int num = Integer.parseInt( strNum );
//            if ( !primeList[num] ) set.add( num );
//        } 
//        
//        // 기저조건
//        //if ( x >= len ) return; 
//        
//        // 다음 차례 진행
//        for ( int i = 0; i < len; ++i ) { 
//            //if ( visited[i] ) continue; // 한번 사용된 요소는 다시 사용하면 안되므로 필터링해준다.
//            if(visited[i] == false) {
//            	visited[i] = true;
//            	getResult( x+1, strNum + strNums[i] );
//            	visited[i] = false;
//            }
//        }
//        
//    }
//    
//    
//    // main
//    public static int solution(String numbers) {
// 
//        // 에라토스테네스의 체 : 한번에 소수를 미리 구해둔다.
//        // false : 소수, true : 소수아님
//    	
//        primeList[0] = true;
//        primeList[1] = true;
//        for ( int i = 2; i < MAX; ++i ) {
//            for ( int j = i + i; j < MAX; j += i) {
//                primeList[j] = true;
//            }
//        }
//        
////        for(int i = 0; i < primeList.length; i++) {
////        	if(!primeList[i]) {
////        		System.out.println(i);
////        		if(i > 1000) break;
////        	}
////        }
////        
////        System.out.println(primeList.length);
//        
//        
//         
//        // 초기화 
//        strNums = numbers.split("");
//        len = strNums.length;
//        visited = new boolean[len];
//        
//        // 연산을 시행한다.
//        getResult( 0, "" ); 
//        
//        // 정답
//        return set.size();
//    }
	

}

