package myobj;

public class T30_tower20220607_s {
	/*
	 * 	n���� ����ž�� ������ ���� �ϳ��� Ʈ�� ���·� ����Ǿ� �ֽ��ϴ�. 
	 * 	����� �� ������ �� �ϳ��� ��� ������ ���¸� ��Ʈ��ũ�� 2���� �����Ϸ��� �մϴ�. 
	 * �̶�, �� ���¸��� ���� �Ǵ� ����ž�� ������ �ִ��� ����ϰ� ���߰��� �մϴ�.

		����ž�� ���� n, �׸��� ���� ���� wires�� �Ű������� �־����ϴ�. 
		������ �� �ϳ��� ��� ����ž ������ ������ ����ϵ��� �� ���¸����� �������� ��, 
		�� ���¸��� ������ �ִ� ����ž ������ 
		����(���밪)�� return �ϵ��� solution �Լ��� �ϼ����ּ���.

		���ѻ���
		n�� 2 �̻� 100 ������ �ڿ����Դϴ�.
		wires�� ���̰� n-1�� ������ 2���� �迭�Դϴ�.
		wires�� �� ���Ҵ� [v1, v2] 2���� �ڿ����� �̷���� ������, 
		�̴� ���¸��� v1�� ����ž�� v2�� ����ž�� �������� ����Ǿ� �ִٴ� ���� �ǹ��մϴ�.
		1 �� v1 < v2 �� n �Դϴ�.
		���¸� ��Ʈ��ũ�� �ϳ��� Ʈ�� ���°� �ƴ� ���� �Է����� �־����� �ʽ��ϴ�.
		����� ��
		n	wires	result
		9	[[1,3],[2,3],[3,4],[4,5],[4,6],[4,7],[7,8],[7,9]]	3
		4	[[1,2],[2,3],[3,4]]	0
		7	[[1,2],[2,7],[3,7],[3,4],[4,5],[6,7]]	1
	 * 
	 * 
	 */
	
	static int[][] map;
	static boolean[] visit;
	static int count;
	
	public static void main(String[] args) {
		
		int n = 9;
		int[][] wires = {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}};
		//int[][] wires = {{1,2},{2,3},{3,4}};
		
		System.out.println(solution(n, wires));
		
	}
	
	public static int solution(int n, int[][] wires) {
        int answer = n;
                
        map = new int[n+1][n+1];
        
        for(int i = 0; i < wires.length; i++) {
        	map[wires[i][0]][wires[i][1]] = 1;    		
        	map[wires[i][1]][wires[i][0]] = 1;
        }
        
        for(int i = 0; i < wires.length; i++) {
        	
        	map[wires[i][0]][wires[i][1]] = 0;    		
        	map[wires[i][1]][wires[i][0]] = 0;
        	
        	visit = new boolean[n+1];
        	count = 0;
        	dfs(wires[i][0]);
        	int cntF = count;
        	System.out.print(" : " + cntF);
        	System.out.println();
        	
        	visit = new boolean[n+1];
        	count = 0;
        	dfs(wires[i][1]);
        	int cntS = count;
        	System.out.print(" : " + cntS);
        	System.out.println();            
            System.out.println();
            
            int sum = (int)Math.abs(cntF - cntS);
            System.out.println(">> " + sum);
            System.out.println();
            
            answer = sum <= n ? (int)Math.min(sum, answer) : answer;
            //answer = (int)Math.min(answer, sum);            
            
            
            map[wires[i][0]][wires[i][1]] = 1;    		
        	map[wires[i][1]][wires[i][0]] = 1;
        }
        
        System.out.println();
        System.out.println();
        return answer;
    }
	
	public static void dfs(int idx) {
		count++;
		System.out.print(idx + " ");
		visit[idx] = true;
		
		for(int i = 1; i < map.length; i++) {
			if(map[idx][i] == 1 && visit[i] == false) {
				dfs(i);
			}
		}
	}
}
