import java.util.ArrayList;
import java.util.Arrays;

public class T00_Test {
	
	/*
	 * 	n���� ����� �Ϸķ� ���� ���� �ֽ��ϴ�. 
	 * 	n���� ����鿡�Դ� ���� 1������ n������ ��ȣ�� �Ű��� �ֽ��ϴ�. 
	 * 	n���� ����� ���� ���� ����� �������� ����� �ֽ��ϴ�. 
	 * 	���� �� 3���� ����� �ִٸ� ������ ���� 6���� ����� �ֽ��ϴ�.

		[1, 2, 3] 
		[1, 3, 2]
		[2, 1, 3] 
		[2, 3, 1] 
		[3, 1, 2]
		[3, 2, 1] 
		
		����� �� n��, �ڿ��� k�� �־��� ��, ����� ���� �ϴ� ����� ���� ������ ���� ���� ��, 
		k��° ����� return�ϴ� solution �Լ��� �ϼ����ּ���.

		���ѻ���
		n�� 20������ �ڿ��� �Դϴ�.
		k�� n! ������ �ڿ��� �Դϴ�.
		
		����� ��
		n	k	result
		3	5	[3,1,2]

	 */
	
	// ���ڸ� ���� �߶� �ö� ����
	// �ݺ�Ƚ�� ���̱�
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
	//�Ҽ����ϱ� double sqrt = Math.sqrt(i); ����
	//���� ���ھ� �̰� ������
	//for(char ch = 'a'; ch <= 'z'; ch++) {
	//	System.out.print("\'"+ch+"\',");
	//}
	//gcd �Լ�

	
	/*
	 * 	String math = "[0-9]+";
	 * 		^[0-9] : ���ڰ� �ƴ�
	 * 		//[0-9] : ���ڸ�
	 * 		//[0-9]+ : ���ڸ� �ִ°�
	 */
}

