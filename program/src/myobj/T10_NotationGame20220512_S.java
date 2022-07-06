package myobj;

public class T10_NotationGame20220512_S {
	
	/*
	 * Ʃ�갡 Ȱ���ϴ� �ڵ� ���Ƹ������� ���������� �ؿ��� ������ �ִ�. 
	 * �� ������ ���� ����� �ձ۰� �ɾƼ� ���ڸ� �ϳ��� ���ʴ�� ���ϴ� �����ε�, ��Ģ�� ������ ����.

		���ڸ� 0���� �����ؼ� ���ʴ�� ���Ѵ�. 
		ù ��° ����� 0, �� ��° ����� 1, �� �� ��° ����� 9�� ���Ѵ�.
		
		10 �̻��� ���ں��ʹ� �� �ڸ��� ��� ���Ѵ�. 
		�� ���� ��° ����� 10�� ù �ڸ��� 1, ���� ��° ����� ��° �ڸ��� 0�� ���Ѵ�.
		�̷��� ������ ������ ���,
		
		0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 0, 1, 1, 1, 2, 1, 3, 1, 4, ��
		������ ���ڸ� ���ϸ� �ȴ�.
		
		���� �ڵ� ���Ƹ� �Ͽ����� ��ǻ�͸� �ٷ�� ������ �������� �� ������ �����ϱ⵵ �ϴµ�, �� ��쿡��
		0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, ��
		������ ���ڸ� ���ϸ� �ȴ�.
		
		�������� �����ϴ� ���ӿ� �ͼ����� �������� ������� 
		�� �� ���̵��� ���̱� ���� ���������� ������������ 
		��� �������� ������ �����غ���� �ߴ�. 
		���� ������ �ͼ����� ���� Ʃ��� ���ӿ� ���� ��Ģ�� �޴� ������ ���ϱ� ����, 
		�ڽ��� ���ؾ� �ϴ� ���ڸ� ����Ʈ���� �̸� ������ִ� ���α׷��� ������� �Ѵ�. 
		Ʃ���� ���α׷��� �����϶�.
		
		�Է� ����
		
		���� n, �̸� ���� ������ ���� t, ���ӿ� �����ϴ� �ο� m, Ʃ���� ���� p �� �־�����.

		2 <= n <= 16
		0 < t <= 1000
		2 <= m <= 100
		1 <= p <= m
		��� ����
		Ʃ�갡 ���ؾ� �ϴ� ���� t���� ���� ���� ���ʴ�� ��Ÿ�� ���ڿ�. ��, 10~15�� ���� �빮�� A~F�� ����Ѵ�.
		
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
		System.out.println("["+n+"] ���� ");
        String answer = "";
        
        int maxCnt = 0;
        int num = 0;
        int orderNum = 1;
        String lotationNum ="";
        int tempNum = 0;
        int mod = 0;
        
        p = m == p ? 0 : p;
        
        // �̸� ���� �� 
        while(maxCnt < t) {
        	
        	lotationNum = "";        	
        	tempNum = num;
        	
        	//���� ��ȯ
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
        		// Ʃ�� ���ʸ� 
        		//System.out.println(orderNum % m);
            	if(orderNum % m == p) {
            		//System.out.print(" >> ¦");
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
