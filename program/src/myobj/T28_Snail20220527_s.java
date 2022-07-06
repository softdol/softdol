package myobj;

public class T28_Snail20220527_s {
	/*
	 * 	���� n�� �Ű������� �־����ϴ�. 
	 * 	���� �׸��� ���� �غ��� ���̿� ���̰� n�� �ﰢ������ 
	 * 	�� �� ���������� �ݽð� �������� ������ ä��⸦ ������ ��, 
	 * 	ù ����� ������ ����� ��� ������� ��ģ ���ο� �迭�� return �ϵ��� solution �Լ��� �ϼ����ּ���.
	 * 
	 * 	����� 	��
		n		result
		4		[1,2,9,3,10,8,4,5,6,7]
		5		[1,2,12,3,13,11,4,14,15,10,5,6,7,8,9]
		6		[1,2,15,3,16,14,4,17,21,13,5,18,19,20,12,6,7,8,9,10,11]
	 * 
	 */
	
	public static void main(String[] args) {
		int n = 4;
		
		System.out.println(solution(n));
	}
	
	public static int[] solution(int n) {
        int[][] tower = new int[n][n];
        int maxCount = n*n - ((n)*(n) - n)/2;
        int count = 1;
        
        int startX = 0;
        int startY = 0;
        int endX = tower.length;
        int endY = tower[0].length;
        int loop = 1;
        
        while(count <= maxCount) {
        	switch(loop++ % 3) {
        		case 1:
        			for(int i = startX;  i < endX; i++) {
        	        	if(tower[i][startY] == 0) {
        	        		tower[i][startY] = count++;        		
        	        	}else {
        	        		break;
        	        	}        	        	
        	        	startX = i;
        	        }
        	        startY++;    
        	        endX--;
        	        break;
        		case 2:
        			for(int i = startY;  i < endY; i++) {        	        	
        	        	if(tower[startX][i] == 0) {
        	        		tower[startX][i] = count++;        		
        	        	}else {
        	        		break;
        	        	}        	        	
        	        	startY = i;
        	        }
        			startX--;
        			startY--;
        			endY--;
        			break;
        		case 0:
        			for(int i = startX;  i > 0 ; i--) {
        	        	if(tower[i][startY] == 0) {
        	        		tower[i][startY--] = count++;
        	        	}else {
        	        		break;
        	        	}
        	        	startX = i;
        	        }
        			startX++;
        			startY++;
        			break;
        		default :
        			break;
        	}
        }
        int[] answer = new int[maxCount];
        count = 0;        
        for(int i = 0; i < tower.length; i++) {
        	for(int j = 0; j < tower[i].length ; j++) {
        		if(tower[i][j] > 0) {        			
        			answer[count++] = tower[i][j];
        		}
        	}
        }
        return answer;
    }
	
	public int[] solution2(int n) {
        int[] answer = new int[(n*(n+1))/2];
        int[][] matrix = new int[n][n];

        int x = -1, y = 0;
        int num = 1;

        for (int i = 0; i < n; ++i) {
            for (int j = i; j < n; ++j) {
                if (i % 3 == 0) {
                    ++x;
                } else if (i % 3 == 1) {
                    ++y;
                } else if (i % 3 == 2) {
                    --x;
                    --y;
                }
                matrix[x][y] = num++;
            }
        }

        int k = 0;
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < n; ++j) {
                if(matrix[i][j] == 0) break;
                answer[k++] = matrix[i][j];
            }
        }

        return answer;
    }
}
