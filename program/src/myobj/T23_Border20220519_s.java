package myobj;

import java.util.Arrays;

public class T23_Border20220519_s {
	
	/*
	 * 	rows x columns 크기인 행렬이 있습니다. 
	 * 	행렬에는 1부터 rows x columns까지의 숫자가 한 줄씩 순서대로 적혀있습니다. 
	 * 	이 행렬에서 직사각형 모양의 범위를 여러 번 선택해, 
	 * 	테두리 부분에 있는 숫자들을 시계방향으로 회전시키려 합니다. 
	 * 	각 회전은 (x1, y1, x2, y2)인 정수 4개로 표현하며, 그 의미는 다음과 같습니다.

		x1 행 y1 열부터 x2 행 y2 열까지의 영역에 해당하는 
		직사각형에서 테두리에 있는 숫자들을 한 칸씩 시계방향으로 회전합니다.
		
		다음은 6 x 6 크기 행렬의 예시입니다.

		grid_example.png

		이 행렬에 (2, 2, 5, 4) 회전을 적용하면, 
		아래 그림과 같이 2행 2열부터 5행 4열까지 영역의 테두리가 시계방향으로 회전합니다. 
		이때, 중앙의 15와 21이 있는 영역은 회전하지 않는 것을 주의하세요.

		rotation_example.png

		행렬의 세로 길이(행 개수) rows, 가로 길이(열 개수) columns, 그리고 회전들의 목록 queries가 주어질 때, 각 회전들을 배열에 적용한 뒤, 그 회전에 의해 위치가 바뀐 숫자들 중 가장 작은 숫자들을 순서대로 배열에 담아 return 하도록 solution 함수를 완성해주세요.

		제한사항
		rows는 2 이상 100 이하인 자연수입니다.
		columns는 2 이상 100 이하인 자연수입니다.
		처음에 행렬에는 가로 방향으로 숫자가 1부터 하나씩 증가하면서 적혀있습니다.		
		즉, 아무 회전도 하지 않았을 때, i 행 j 열에 있는 숫자는 ((i-1) x columns + j)입니다.
		
		queries의 행의 개수(회전의 개수)는 1 이상 10,000 이하입니다.
		queries의 각 행은 4개의 정수 [x1, y1, x2, y2]입니다.
		x1 행 y1 열부터 x2 행 y2 열까지 영역의 테두리를 시계방향으로 회전한다는 뜻입니다.
		1 ≤ x1 < x2 ≤ rows, 1 ≤ y1 < y2 ≤ columns입니다.
		
		모든 회전은 순서대로 이루어집니다.
		예를 들어, 두 번째 회전에 대한 답은 첫 번째 회전을 실행한 
		다음, 그 상태에서 두 번째 회전을 실행했을 때 이동한 숫자 중 최솟값을 구하면 됩니다.
		
		입출력 예시
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























