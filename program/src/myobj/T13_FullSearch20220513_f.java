package myobj;

import java.util.HashSet;

public class T13_FullSearch20220513_f {
	
	/*
	 * 	���ڸ� ���ڰ� ���� ���� ������ ������ֽ��ϴ�. 
	 * 	����� ���� ������ �ٿ� �Ҽ��� �� �� ���� �� �ִ��� �˾Ƴ��� �մϴ�.

		�� ���� ������ ���� ���ڰ� ���� ���ڿ� numbers�� �־����� ��, 
		���� �������� ���� �� �ִ� �Ҽ��� �� ������ return �ϵ��� solution �Լ��� �ϼ����ּ���.

		���ѻ���
		numbers�� ���� 1 �̻� 7 ������ ���ڿ��Դϴ�.
		numbers�� 0~9���� ���ڸ����� �̷���� �ֽ��ϴ�.
		"013"�� 0, 1, 3 ���ڰ� ���� ���� ������ ������ִٴ� �ǹ��Դϴ�.
		
		����� ��
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
        // 1. ���� ������ set�� �߰��Ѵ�.
        if (!comb.equals("")) {        	
            //numbersSet.add(Integer.valueOf(comb));
        	list.add(Integer.valueOf(comb));
        	//System.out.println(comb);
        }

        // 2. ���� ���� �� �� ���� ���� ���ο� ������ �����.
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
//    // ���� �������� ���� �� �ִ� ��� ���ǿ��� �Ҽ��� ���Ѵ�.
//    public static void getResult(int x, String strNum) {
//        
//        // �Ҽ��Ǻ�
//        if ( strNum != "") {
//        	System.out.println(strNum);
//            int num = Integer.parseInt( strNum );
//            if ( !primeList[num] ) set.add( num );
//        } 
//        
//        // ��������
//        //if ( x >= len ) return; 
//        
//        // ���� ���� ����
//        for ( int i = 0; i < len; ++i ) { 
//            //if ( visited[i] ) continue; // �ѹ� ���� ��Ҵ� �ٽ� ����ϸ� �ȵǹǷ� ���͸����ش�.
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
//        // �����佺�׳׽��� ü : �ѹ��� �Ҽ��� �̸� ���صд�.
//        // false : �Ҽ�, true : �Ҽ��ƴ�
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
//        // �ʱ�ȭ 
//        strNums = numbers.split("");
//        len = strNums.length;
//        visited = new boolean[len];
//        
//        // ������ �����Ѵ�.
//        getResult( 0, "" ); 
//        
//        // ����
//        return set.size();
//    }
	

}

