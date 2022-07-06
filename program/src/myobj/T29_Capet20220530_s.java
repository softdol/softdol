package myobj;

import java.util.Arrays;
import java.util.HashMap;

public class T29_Capet20220530_s {
	/*
	 * 	���� ����
		Leo�� ī���� �緯 ���ٰ� �Ʒ� �׸��� ���� �߾ӿ��� ��������� ĥ���� �ְ� 
		�׵θ� 1���� �������� ĥ���� �ִ� ���� ��� ī���� �ý��ϴ�.

		carpet.png

		Leo�� ������ ���ƿͼ� �Ʊ� �� ī���� ������� �������� ��ĥ�� ������ ������ ���������, 
		��ü ī���� ũ��� ������� ���߽��ϴ�.

		Leo�� �� ī�꿡�� ���� ������ �� brown, ����� ������ �� yellow�� �Ű������� �־��� �� 
		ī���� ����, ���� ũ�⸦ ������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

		���ѻ���
		���� ������ �� brown�� 8 �̻� 5,000 ������ �ڿ����Դϴ�.
		����� ������ �� yellow�� 1 �̻� 2,000,000 ������ �ڿ����Դϴ�.
		ī���� ���� ���̴� ���� ���̿� ���ų�, ���� ���̺��� ��ϴ�.
		
		����� 	��
		brown	yellow	return
		10		2		[4, 3]
		8		1		[3, 3]
		24		24		[8, 6]
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		int brown = 8;
		int yellow = 1;
		
		System.out.println(Arrays.toString(solution(brown, yellow)));
	}
	
	public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        HashMap<Integer,Integer> inList = new HashMap<>();
        HashMap<Integer,Integer> allList = new HashMap<>();
        
        for(int i = 1; i <= yellow / 2 + 1; i++) {
        	if(yellow % i == 0) {
        		//System.out.println(i + " " + (yellow / i));
        		inList.put(i, (yellow / i));
        	}
        }
        System.out.println(inList);
        
        //System.out.println();
        
        int sum = brown + yellow;
        for(int i = 1; i <= sum / 2; i++) {
        	if(sum % i == 0) {
        		//System.out.println(i + " " + (sum / i));
        		allList.put(i, (sum / i));
        	}
        }
        //System.out.println(allList);
        //System.out.println(count);
        for(int i : inList.keySet()) {
        	for(int j : allList.keySet()) {
        		if(i + 2 == j) {
        			if(inList.get(i) + 2 == allList.get(j)) {
        				answer[0] = Math.max(j, allList.get(j));        			
        				answer[1] = Math.min(j, allList.get(j));        				
        				return answer;
        			}
        		}
        	}
        }
        
        return answer;
    }
	
	public int[] solution2(int brown, int red) {
        int a = (brown+4)/2;
        int b = red+2*a-4;
        int[] answer = {(int)(a+Math.sqrt(a*a-4*b))/2,(int)(a-Math.sqrt(a*a-4*b))/2};
        return answer;
    }
}
