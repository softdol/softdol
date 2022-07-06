package myobj;

import java.util.ArrayList;
import java.util.Arrays;

public class T16_Stock20220517_s {
	/*
	 * 	�� ������ ��ϵ� �ֽİ����� ��� �迭 prices�� �Ű������� �־��� ��, 
	 * 	������ �������� ���� �Ⱓ�� �� �������� return �ϵ��� solution �Լ��� �ϼ��ϼ���.

		���ѻ���
		prices�� �� ������ 1 �̻� 10,000 ������ �ڿ����Դϴ�.
		prices�� ���̴� 2 �̻� 100,000 �����Դϴ�.
		
		prices			return
		[1, 2, 3, 2, 3]	[4, 3, 1, 1, 0]

		1�� ������ 1�� ������ ������ �������� �ʾҽ��ϴ�.
		2�� ������ 2�� ������ ������ �������� �ʾҽ��ϴ�.
		3�� ������ 3�� 1�ʵڿ� ������ �������ϴ�. ���� 1�ʰ� ������ �������� ���� ������ ���ϴ�.
		4�� ������ 2�� 1�ʰ� ������ �������� �ʾҽ��ϴ�.
		5�� ������ 3�� 0�ʰ� ������ �������� �ʾҽ��ϴ�.
	 * 
	 */
	public static void main(String[] args) {
		
		int[] prices = {1, 2, 3, 2, 3, 2, 3, 2};		

		System.out.println(Arrays.toString(solution(prices)));
	    
		
	}
	
	public static int[] solution(int[] prices) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < prices.length; i++) {
        	int cnt = 0;
        	for(int j = i+1; j < prices.length; j++) {        		
        		if(prices[i] <= prices[j]) {
        			cnt++;
        		}else {
        			cnt++;
        			break;
        		}
        		
        	}
        	list.add(cnt);
        }
        
        answer = new int[list.size()];
        
        int cnt = 0;
        for(int i : list) {
        	answer[cnt++] = i;        	
        }
        
        return answer;
    }
}
