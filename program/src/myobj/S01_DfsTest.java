package myobj;

public class S01_DfsTest {
	
	// #########################################
	public static void dfs(boolean[] nodeChk, int n, int maxLen, int[][] node) {
		nodeChk[n] = true;
		System.out.print(n + " -> ");
		
		for(int i = 0; i <= maxLen; i++) {			
			if(node[n][i] == 1 && nodeChk[i] == false) {
				dfs(nodeChk, i, maxLen, node);
			}
		}
	}
	
	public static int[][] setNode(int[][] node, int x, int y){
		node[x][y] = node[y][x] = 1;
		return node;
	}
	
	public static void main(String[] args) {
		
		int maxLen = 9;
		int[][] node = new int[maxLen + 1][maxLen + 1];
		boolean[] nodeChk = new boolean[maxLen + 1];
		
//		dfs.put(1, 1);
//		dfs.put(1, 7);
//		dfs.put(7, 1);
		
		node = setNode(node, 1,0);
		node = setNode(node, 1,0);
		node = setNode(node, 1,1);
		
		for(int i = 0; i < node.length; i++) {
			for(int j = 0; j < node[i].length; j++) {
				System.out.print(node[i][j]);
			}
			System.out.println();
		}
		
		dfs(nodeChk, 1, maxLen, node);
		nodeChk = new boolean[maxLen + 1];
		System.out.println();
		
		dfs(nodeChk, 0, maxLen, node);
		nodeChk = new boolean[maxLen + 1];
		System.out.println();
		
		dfs(nodeChk, 0, maxLen, node);
		nodeChk = new boolean[maxLen + 1];
		System.out.println();
	}
	
}

