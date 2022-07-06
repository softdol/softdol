package myobj;

import java.util.Arrays;

public class T31_Keepdistance_20220608_s {
	/*
	 * 	�����ڸ� ����ϴ� �Ҹ��� īī���� ������ ���� �Խ��ϴ�.

		�ڷγ� ���̷��� ���� ������ ���� �����ڵ��� �Ÿ��� �ּ� ��⸦ �ؾ��ϴµ� ���� ���� ������ ��ŭ
		�Ʒ��� ���� ��Ģ���� ���ǿ� �Ÿ��� �ΰ� �ɵ��� �ȳ��ϰ� �ֽ��ϴ�.

		������ 5���̸�, �� ������ 5x5 ũ���Դϴ�.
		�Ÿ��α⸦ ���Ͽ� �����ڵ� ������ ����ư �Ÿ� �� 2 ���Ϸ� ���� ���� �ּ���.
		�� �����ڰ� �ɾ��ִ� �ڸ� ���̰� ��Ƽ������ ���� ���� ��쿡�� ����մϴ�.
		
		���� ���,

		�� �׸�ó�� �ڸ� ���̿� ��Ƽ���� �����Ѵٸ� ����ư �Ÿ��� 2���� �Ÿ��α⸦ ��Ų ���Դϴ�.
		�� �׸�ó�� ��Ƽ���� ���̿� �ΰ� ���� ��쵵 �Ÿ��α⸦ ��Ų ���Դϴ�.	
		�� �׸�ó�� �ڸ� ���̰� ����ư �Ÿ� 2�̰� ���̿� �� ���̺��� �ִ� ���� 
		�Ÿ��α⸦ ��Ű�� ���� ���Դϴ�.

		�����ڰ� �ɾ��ִ� �ڸ�(P)�� �ǹ��մϴ�.	
		�� ���̺�(O)�� �ǹ��մϴ�.	
		��Ƽ��(X)�� �ǹ��մϴ�.
		
		5���� ������ �� �Ҹ���� �� ���ǿ��� �����ڵ��� �Ÿ��α⸦ �� ��Ű�� �ִ��� �˰� �;������ϴ�. 
		�ڸ��� �ɾ��ִ� �����ڵ��� ������ ���� ������ ���Ǻ��� ���� 
		2���� ���ڿ� �迭 places�� �Ű������� �־����ϴ�. 
		�� ���Ǻ��� �Ÿ��α⸦ ��Ű�� ������ 1��, 
		�� ���̶� ��Ű�� �ʰ� ������ 0�� �迭�� ��� return �ϵ��� solution �Լ��� �ϼ��� �ּ���.

		���ѻ���
		places�� �� ����(���� ����) = 5
		places�� �� ���� �ϳ��� ���� ������ ��Ÿ���ϴ�.
		places�� �� ����(���� ���� ����) = 5
		places�� ���Ҵ� P,O,X�� �̷���� ���ڿ��Դϴ�.
		places ������ ����(���� ���� ����) = 5
		P�� �����ڰ� �ɾ��ִ� �ڸ��� �ǹ��մϴ�.
		O�� �� ���̺��� �ǹ��մϴ�.
		X�� ��Ƽ���� �ǹ��մϴ�.
		�Է����� �־����� 5�� ������ ũ��� ��� 5x5 �Դϴ�.
		return �� ����
		1���� ���� �迭�� 5���� ���Ҹ� ��Ƽ� return �մϴ�.
		places�� ��� �ִ� 5�� ������ �������, �Ÿ��α� �ؼ� ���θ� ���ʴ�� �迭�� ����ϴ�.
		�� ���� ���� ��� �����ڰ� �Ÿ��α⸦ ��Ű�� ������ 1��, �� ���̶� ��Ű�� �ʰ� ������ 0�� ����ϴ�.
		����� ��
		places											result
		[
		["POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"], 
		["POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"], 
		["PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"], 
		["OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"], 
		["PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"]]	[1, 0, 1, 1, 1]
		
		�� ���̺� T1, T2�� ��� (r1, c1), (r2, c2)�� ���� ��ġ�ϰ� �ִٸ�, 
		T1, T2 ������ ����ư �Ÿ��� |r1 - r2| + |c1 - c2| �Դϴ�. 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		String[][] places = {
				{"PXOPX",
				 "OOPOX", 
				 "XOXPX", 
				 "XOXOX", 
				 "POXXP"}, 
				{"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, 
				{"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, 
				{"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, 
				{"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}				
		};
		
		System.out.println(Arrays.toString(solution(places)));
		
	}
	
	public static int[] solution(String[][] places) {
		int[] answer = new int[places.length];
        for(int i = 0; i < places.length; i++) {
        	boolean chk = true;
        	for(int j = 0; j < 5; j++) {   
        		char[] arrC = places[i][j].toCharArray();
        		for(int k = 0; k < 5; k++) {
        			if( arrC[k] == 'P') {
        				if(j < 4) {
        					if ( places[i][j + 1].charAt(k) == 'O' ) {
        						if(j < 3) {
            						if (places[i][j + 2].charAt(k) == 'P') {
            							chk = false;
                						break;
                					}
            					}
        						if(k < 4) {
            						if (places[i][j + 1].charAt(k + 1) == 'P') {
            							chk = false;
                						break;
                					}
            					}
                                
                                
                                
        					}else if ( places[i][j + 1].charAt(k) == 'P' ) {
        						chk = false;
        						break;
        					}
        				}
        				
        				if(k < 4) {
        					if ( arrC[k+1] == 'O' ) {
        						if(k < 3) {
            						if (arrC[k+2] == 'P') {
            							chk = false;
                						break;
                					}
            					}          						
        						
        						if(j > 0 && k < 4) {
        							if (places[i][j - 1].charAt(k + 1) == 'P') {
            							chk = false;
                						break;
                					}
        						}
                                
                                
                                
        					}else if ( arrC[k+1] == 'P' ) {
        						chk = false;
        						break;
        					}        					
        				}
        				
        				if(k > 0) {
        					if ( arrC[k-1] == 'O' ) {
        						if(k > 1) {
            						if (arrC[k-2] == 'P') {
            							chk = false;
                						break;
                					}
            					}
        						
        						if(j > 0) {
        							if (places[i][j - 1].charAt(k - 1) == 'P') {
            							chk = false;
                						break;
                					}
        						}
        						
        						if(j < 4) {
        							if (places[i][j + 1].charAt(k - 1) == 'P') {
            							chk = false;
                						break;
                					}
        						}
        					}else if(arrC[k-1] == 'P'){
        						chk = false;
        						break;
        					}
        				}
        			}
        		}
        		if(!chk) {
        			break;
        		}
        	}
        	answer[i] = chk ? 1 : 0;    	
        }
        
        return answer;
    }
}
