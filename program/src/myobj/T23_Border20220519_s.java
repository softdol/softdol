package myobj;

import java.util.Arrays;

public class T23_Border20220519_s {
	
	/*
	 * 	rows x columns ũ���� ����� �ֽ��ϴ�. 
	 * 	��Ŀ��� 1���� rows x columns������ ���ڰ� �� �پ� ������� �����ֽ��ϴ�. 
	 * 	�� ��Ŀ��� ���簢�� ����� ������ ���� �� ������, 
	 * 	�׵θ� �κп� �ִ� ���ڵ��� �ð�������� ȸ����Ű�� �մϴ�. 
	 * 	�� ȸ���� (x1, y1, x2, y2)�� ���� 4���� ǥ���ϸ�, �� �ǹ̴� ������ �����ϴ�.

		x1 �� y1 ������ x2 �� y2 �������� ������ �ش��ϴ� 
		���簢������ �׵θ��� �ִ� ���ڵ��� �� ĭ�� �ð�������� ȸ���մϴ�.
		
		������ 6 x 6 ũ�� ����� �����Դϴ�.

		grid_example.png

		�� ��Ŀ� (2, 2, 5, 4) ȸ���� �����ϸ�, 
		�Ʒ� �׸��� ���� 2�� 2������ 5�� 4������ ������ �׵θ��� �ð�������� ȸ���մϴ�. 
		�̶�, �߾��� 15�� 21�� �ִ� ������ ȸ������ �ʴ� ���� �����ϼ���.

		rotation_example.png

		����� ���� ����(�� ����) rows, ���� ����(�� ����) columns, �׸��� ȸ������ ��� queries�� �־��� ��, �� ȸ������ �迭�� ������ ��, �� ȸ���� ���� ��ġ�� �ٲ� ���ڵ� �� ���� ���� ���ڵ��� ������� �迭�� ��� return �ϵ��� solution �Լ��� �ϼ����ּ���.

		���ѻ���
		rows�� 2 �̻� 100 ������ �ڿ����Դϴ�.
		columns�� 2 �̻� 100 ������ �ڿ����Դϴ�.
		ó���� ��Ŀ��� ���� �������� ���ڰ� 1���� �ϳ��� �����ϸ鼭 �����ֽ��ϴ�.		
		��, �ƹ� ȸ���� ���� �ʾ��� ��, i �� j ���� �ִ� ���ڴ� ((i-1) x columns + j)�Դϴ�.
		
		queries�� ���� ����(ȸ���� ����)�� 1 �̻� 10,000 �����Դϴ�.
		queries�� �� ���� 4���� ���� [x1, y1, x2, y2]�Դϴ�.
		x1 �� y1 ������ x2 �� y2 ������ ������ �׵θ��� �ð�������� ȸ���Ѵٴ� ���Դϴ�.
		1 �� x1 < x2 �� rows, 1 �� y1 < y2 �� columns�Դϴ�.
		
		��� ȸ���� ������� �̷�����ϴ�.
		���� ���, �� ��° ȸ���� ���� ���� ù ��° ȸ���� ������ 
		����, �� ���¿��� �� ��° ȸ���� �������� �� �̵��� ���� �� �ּڰ��� ���ϸ� �˴ϴ�.
		
		����� ����
		rows	columns	queries										result
		6		6		[[2,2,5,4],[3,3,6,6],[5,1,6,3]]				[8, 10, 25]
		3		3		[[1,1,2,2],[1,2,2,3],[2,1,3,2],[2,2,3,3]]	[1, 1, 5, 3]
		100		97		[[1,1,100,97]]
	 * 
	 */
	public static void main(String[] args) {
		
		int rows = 6;
		int columns = 6;
		int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
		
		System.out.println(Arrays.toString(solution(rows, columns, queries)));
		
	}

	public static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        
        int[][][] board = new int[queries.length + 1][rows][columns];
        
        int set = 1;
        
        for(int i = 0; i < rows; i++) {
        	for(int j = 0; j < columns; j++) {
        		board[0][i][j] = set++; 
        	}
        }
        
        view(board[0]);
        
        for(int mi = 0; mi < queries.length; mi++) {
        	
        	for(int i = 0; i < board[mi].length; i++) {
            	System.arraycopy(board[mi][i], 0, board[mi+1][i], 0, board[mi][i].length);
            }
        	
        	int x1 = queries[mi][0];
            int y1 = queries[mi][1];
            int x2 = queries[mi][2];
            int y2 = queries[mi][3];
            
            int minNum = rows * columns;
            
            for(int i = x1 - 1 ; i < x2; i++) {
            	if(i != x2 - 1) {
            		board[mi+1][i][y1 - 1] = board[mi][i + 1][y1 - 1];
            		minNum = Math.min(minNum, board[mi+1][i][y1 - 1]);
            	}
            	if(i != x1 - 1) {
            		board[mi+1][i][y2 - 1] = board[mi][i - 1][y2 - 1];
            		minNum = Math.min(minNum, board[mi+1][i][y2 - 1]);
            	}
            }
            
            for(int i = y1 - 1 ; i < y2; i++) {
            	if(i != y1 - 1) {
            		board[mi+1][x1 - 1][i] = board[mi][x1 - 1][i - 1];
            		minNum = Math.min(minNum, board[mi+1][x1 - 1][i]);
            	}
            	if(i != y2 - 1) {
            		board[mi+1][x2 - 1][i] = board[mi][x2 - 1][i + 1];
            		minNum = Math.min(minNum, board[mi+1][x2 - 1][i]);
            	}
            }
            
            answer[mi] = minNum;
            
            view(board[mi+1]);
        }
        
        return answer;
    }	
	
	public static void view(int[][] board) {
		for(int i = 0; i < board.length; i++) {
        	for(int j = 0; j < board[i].length; j++) {
        		System.out.printf("[%3d]",board[i][j]); 
        	}
        	System.out.println();
        }
        System.out.println();		
	}
}























