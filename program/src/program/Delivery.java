package program;

import java.util.ArrayList;

public class Delivery {
	/*
	 * 	���

		���� ����
		N���� ������ �̷���� ���� �ֽ��ϴ�. 
		�� ������ �� �������� 1���� N������ ��ȣ�� ���� �ϳ��� �ο��Ǿ� �ֽ��ϴ�. 
		�� ������ ��������� ������ �� �ִ� ���η� ����Ǿ� �ִµ�, 
		���� �ٸ� ���� ���� �̵��� ���� �� ���θ� ������ �մϴ�. 
		���θ� ���� �� �ɸ��� �ð��� ���κ��� �ٸ��ϴ�. 
		���� 1�� ������ �ִ� ���������� �� ������ ���� ����� �Ϸ��� �մϴ�. 
		�� �����κ��� ���� �ֹ��� �������� �ϴµ�, 
		N���� ���� �߿��� K �ð� ���Ϸ� ����� ������ ���������� �ֹ��� �������� �մϴ�. 
		������ N = 5, K = 3�� ����� �����Դϴ�.

		���_1_uxun8t.png

		�� �׸����� 1�� ������ �ִ� �������� [1, 2, 4, 5] �� ���������� 3 ������ �ð��� ����� �� �ֽ��ϴ�. 
		�׷��� 3�� ���������� 3�ð� �̳��� ����� �� �ִ� ��ΰ� �����Ƿ� 3�� ���������� �ֹ��� ���� �ʽ��ϴ�. 
		���� 1�� ������ �ִ� �������� ��� �ֹ��� ���� �� �ִ� ������ 4���� �˴ϴ�.
		������ ���� N, �� ������ �����ϴ� ������ ���� road, 
		���� ����� ������ �ð� K�� �Ű������� �־��� ��, 
		���� �ֹ��� ���� �� �ִ� ������ ������ return �ϵ��� solution �Լ��� �ϼ����ּ���.

		���ѻ���
		������ ���� N�� 1 �̻� 50 ������ �ڿ����Դϴ�.
		road�� ����(���� ������ ����)�� 1 �̻� 2,000 �����Դϴ�.
		road�� �� ���Ҵ� ������ �����ϰ� �ִ� �� ������ ������ ��Ÿ���ϴ�.
		road�� ���̰� 3�� �迭�̸�, ������� (a, b, c)�� ��Ÿ���ϴ�.
		a, b(1 <= a, b <= N, a != b)�� ���ΰ� �����ϴ� �� ������ ��ȣ�̸�, 
		c(1 �� c �� 10,000, c�� �ڿ���)�� ���θ� �����µ� �ɸ��� �ð��Դϴ�.
		
		�� ���� a, b�� �����ϴ� ���δ� ���� ���� ���� �� �ֽ��ϴ�.
		�� ������ ������ ���� �� �ߺ��ؼ� �־����� �ʽ��ϴ�.
		K�� ���� ����� ������ �ð��� ��Ÿ����, 1 �̻� 500,000 �����Դϴ�.
		������ �� �������� �׻� �̵� ������ ��ΰ� �����մϴ�.
		1�� ������ �ִ� �������� K ������ �ð��� ����� ������ ������ ������ return �ϸ� �˴ϴ�.
		����� ��
		N	road	K	result
		5	[[1,2,1],[2,3,3],[5,2,2],[1,4,2],[5,3,1],[5,4,2]]	3	4
		6	[[1,2,1],[1,3,2],[2,3,2],[3,4,3],[3,5,2],[3,5,3],[5,6,1]]	4	4

		����� �� ����
		����� �� #1
		������ ���ÿ� �����ϴ�.

		����� �� #2
		�־��� ������ ������ ����� �Ʒ� �׸��� �����ϴ�.
		���_3_njc7kq.png
		1�� �������� ��޿� 4�ð� ���ϰ� �ɸ��� ������ [1, 2, 3, 5] 4���̹Ƿ� 4�� return �մϴ�.
	 * 
	 */
	
	public static void main(String[] args) {
		
//		int N = 5;
//		int[][] road = {{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}};
//		int K = 3;
		
		int N = 6;
		int[][] road = {{1,2,1},{1,3,2},{2,3,2},{3,4,3},{3,5,2},{3,5,3},{5,6,1}};
		int K = 4;
		
		System.out.println(solution(N, road, K));
	}	
	 
	static int answer;
	static ArrayList<Integer> bList;
	
	public static void sRoad(int[][] road, int sNum, int tNum, int K, boolean[] chkRoad, int stNum) {
		if(tNum > K) {
			return;
		}
		for(int j = 0; j < road.length; j++) {
			if(chkRoad[j] == false) {
				if((road[j][0] == sNum && road[j][1] == 1 && road[j][2] + tNum <= K)
	        			||(road[j][0] == 1 && road[j][1] == sNum && road[j][2] + tNum <= K)) {
					if(!bList.contains(stNum)) {
	        			bList.add(stNum);
	        			answer++;
	        		}
	        	}else {	        		
	        		if(road[j][0] == sNum) {	        			
	        			chkRoad[j] = true;
	        			sRoad(road, road[j][1], road[j][2] + tNum, K, chkRoad, stNum);
	        			break;
	        		}
	        		
	        		if(road[j][1] == sNum) {	        			
	        			chkRoad[j] = true;
	        			sRoad(road, road[j][0], road[j][2] + tNum, K, chkRoad, stNum);
	        			break;
	        		}
	        	}				
			}
		}
	}
	
	public static int solution(int N, int[][] road, int K) {
        answer = 1;
        N++;
        bList = new ArrayList<>();
        
        for(int i = 2; i < N; i++) {
        	int sNum = i;
        	boolean[] chkRoad = new boolean[road.length];
        	sRoad(road, sNum, 0, K, chkRoad, sNum);
        }
   
        
        return answer;
    }
	
	public static void dfs(int num) {
		/*
		 * System.out.print(num + " "); chk[num] = true;
		 * 
		 * for(int i = 1; i < map.length; i++) { if(map[num][i] == 1 && chk[i] == false)
		 * { dfs(i); } }
		 */
	}
}


















