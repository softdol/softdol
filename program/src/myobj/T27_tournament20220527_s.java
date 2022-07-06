package myobj;

public class T27_tournament20220527_s {
	
	public static void main(String[] args) {
		System.out.println(solution(""));
	}
	
	public static int solution(String numbers) {
		
	    //return Integer.toBinaryString((a-1)^(b-1)).length();
	    
		int n = 16;
		int a = 14;
		int b = 16;
		// 3
						
        int answer = 0;
        
        if(a > b) {
        	int temp = a;
        	a = b;
        	b = temp;
        }
 
        String s = Integer.toBinaryString(n);
      
        for(int i = 1; i < s.length(); i++) {
        	
        	answer++;
        	
        	if(a % 2 == 1 && b % 2 == 0 && (int)Math.abs(a - b) == 1) {        		
        		break;
        	}        	
        	
        	a = a / 2 + a % 2;
        	b = b / 2 + b % 2;
        }

        return answer;
    }

}
