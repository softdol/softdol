package myobj;

import java.util.HashMap;

public class T02_Square20220509 {
	
	/*
	 * 	1�� 0�� ä���� ǥ(board)�� �ֽ��ϴ�. 
	 * 	ǥ 1ĭ�� 1 x 1 �� ���簢������ �̷���� �ֽ��ϴ�. 
	 * 	ǥ���� 1�� �̷���� ���� ū ���簢���� ã�� ���̸� return �ϴ� solution �Լ��� �ϼ��� �ּ���. 
	 * 	(��, ���簢���̶� �࿡ ������ ���簢���� ���մϴ�.)

		���� ���

		1	2	3	4
		
		0	1	1	1
		1	1	1	1
		1	1	1	1
		0	0	1	0
		�� �ִٸ� ���� ū ���簢����

		1	2	3	4

		0	1	1	1
		1	1	1	1
		1	1	1	1
		0	0	1	0
		�� �Ǹ� ���̴� 9�� �ǹǷ� 9�� ��ȯ�� �ָ� �˴ϴ�.

		���ѻ���
		ǥ(board)�� 2���� �迭�� �־����ϴ�.
		ǥ(board)�� ��(row)�� ũ�� : 1,000 ������ �ڿ���
		ǥ(board)�� ��(column)�� ũ�� : 1,000 ������ �ڿ���
		ǥ(board)�� ���� 1�Ǵ� 0���θ� �̷���� �ֽ��ϴ�.
	 * 
	 */
	
	public static void main(String[] args) {
	
//		int[][] board = {{1,0,1,1},
//					     {1,1,1,1},
//					     {1,1,1,1},
//					     {1,1,1,1}};
//		int[][] board = {{0,0,0,0,0,0},
//						 {1,1,0,0,0,1},
//						 {0,1,0,1,1,1},
//						 {0,1,1,0,1,1},
//						 {0,1,1,1,0,1}};
		int[][] board = {{0,1,1},
						 {1,1,1},
						 {1,1,1}};
		
		System.out.println(solution(board));
	}
	
	public static int solution(int [][]board)
    {
        int answer = 0;
        
        for(int i = 0; i < board.length; i++) {
        	for(int j = 0; j < board[i].length; j++) {
        		if(board[i][j] == 1) {
        			
        		}
        	}
        }
        

        return answer;
    }

}
