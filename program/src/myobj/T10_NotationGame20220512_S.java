package myobj;

public class T10_NotationGame20220512_S {
	
	/*
	 * 튜브가 활동하는 코딩 동아리에서는 전통적으로 해오는 게임이 있다. 
	 * 이 게임은 여러 사람이 둥글게 앉아서 숫자를 하나씩 차례대로 말하는 게임인데, 규칙은 다음과 같다.

		숫자를 0부터 시작해서 차례대로 말한다. 
		첫 번째 사람은 0, 두 번째 사람은 1, … 열 번째 사람은 9를 말한다.
		
		10 이상의 숫자부터는 한 자리씩 끊어서 말한다. 
		즉 열한 번째 사람은 10의 첫 자리인 1, 열두 번째 사람은 둘째 자리인 0을 말한다.
		이렇게 게임을 진행할 경우,
		
		0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 0, 1, 1, 1, 2, 1, 3, 1, 4, …
		순으로 숫자를 말하면 된다.
		
		한편 코딩 동아리 일원들은 컴퓨터를 다루는 사람답게 이진수로 이 게임을 진행하기도 하는데, 이 경우에는
		0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, …
		순으로 숫자를 말하면 된다.
		
		이진수로 진행하는 게임에 익숙해져 질려가던 사람들은 
		좀 더 난이도를 높이기 위해 이진법에서 십육진법까지 
		모든 진법으로 게임을 진행해보기로 했다. 
		숫자 게임이 익숙하지 않은 튜브는 게임에 져서 벌칙을 받는 굴욕을 피하기 위해, 
		자신이 말해야 하는 숫자를 스마트폰에 미리 출력해주는 프로그램을 만들려고 한다. 
		튜브의 프로그램을 구현하라.
		
		입력 형식
		
		진법 n, 미리 구할 숫자의 갯수 t, 게임에 참가하는 인원 m, 튜브의 순서 p 가 주어진다.

		2 <= n <= 16
		0 < t <= 1000
		2 <= m <= 100
		1 <= p <= m
		출력 형식
		튜브가 말해야 하는 숫자 t개를 공백 없이 차례대로 나타낸 문자열. 단, 10~15는 각각 대문자 A~F로 출력한다.
		
		n	t	m	p	result
		2	4	2	1	"0111"
		16	16	2	1	"02468ACE11111111"
		16	16	2	2	"13579BDF01234567"		
		
	 * 
	 */
	
	//static char[] numeralSystem = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};    
	
	public static void main(String[] args) {
		int n = 16;
		int t = 16;
		int m = 2;
		int p = 2;
				
		System.out.println(solution(n, t, m, p));
		
	}
	
	public static String val(int mod) {
		
		String s = String.valueOf(mod);
		
		switch(mod) {
		case 10:
			s = "A";
			break;
		case 11:
			s = "B";
			break;
		case 12:
			s = "C";
			break;
		case 13:
			s = "D";
			break;
		case 14:
			s = "E";
			break;
		case 15:
			s = "F";
			break;
			
		}
		
		return s;
	}

	public static String solution(int n, int t, int m, int p) {
		System.out.println("["+n+"] 진법 ");
        String answer = "";
        
        int maxCnt = 0;
        int num = 0;
        int orderNum = 1;
        String lotationNum ="";
        int tempNum = 0;
        int mod = 0;
        
        p = m == p ? 0 : p;
        
        // 미리 구할 수 
        while(maxCnt < t) {
        	
        	lotationNum = "";        	
        	tempNum = num;
        	
        	//진법 변환
        	while(tempNum / n > 0) {
        		
        		mod = tempNum % n;
        		
        		lotationNum = val(mod) + lotationNum ;
        		
        		tempNum /= n;
        	}
        	
        	lotationNum = val(tempNum % n) + lotationNum;
        	
        	System.out.println("-------" + lotationNum + "["+num+"]------");
        	
        	char[] ch = lotationNum.toCharArray();
        	
        	for(int i = 0; i < ch.length ; i++) {
        		//System.out.print(orderNum + " : " + ch[i]);
        		// 튜브 차례면 
        		//System.out.println(orderNum % m);
            	if(orderNum % m == p) {
            		//System.out.print(" >> 짝");
            		answer += ch[i];
            		maxCnt++;
            		if(maxCnt >= t) {
            			break;
            		}
            	}
            	
            	//System.out.println();
        		orderNum++;   		
        	}
        	
        	
        	
        	num++;
        	
        }
        	
        
        return answer;
    }
		
}
