package myobj;

public class T11_Fatigue20220512 {
	/*
	 * XX���ӿ��� �Ƿε� �ý���(0 �̻��� ������ ǥ���մϴ�)�� ������, 
	 * ���� �Ƿε��� ����ؼ� ������ Ž���� �� �ֽ��ϴ�. 
	 * 
	 * �̶�, �� �������� Ž���� �����ϱ� ���� �ʿ��� "�ּ� �ʿ� �Ƿε�"�� 
	 * ���� Ž���� ������ �� �Ҹ�Ǵ� "�Ҹ� �Ƿε�"�� �ֽ��ϴ�. 
	 * "�ּ� �ʿ� �Ƿε�"�� �ش� ������ Ž���ϱ� ���� ������ �־�� �ϴ� �ּ����� �Ƿε��� ��Ÿ����, 
	 * "�Ҹ� �Ƿε�"�� ������ Ž���� �� �Ҹ�Ǵ� �Ƿε��� ��Ÿ���ϴ�. 
	 * 
	 * ���� ��� "�ּ� �ʿ� �Ƿε�"�� 80, "�Ҹ� �Ƿε�"�� 20�� ������ Ž���ϱ� ���ؼ���
	 * ������ ���� ���� �Ƿε��� 80 �̻� �̾�� �ϸ�, 
	 * ������ Ž���� �Ŀ��� �Ƿε� 20�� �Ҹ�˴ϴ�.
	 * 
	 * �� ���ӿ��� �Ϸ翡 �� ���� Ž���� �� �ִ� ������ ������ �ִµ�, 
	 * �� ������ ���� �� �������� �ִ��� ���� Ž���Ϸ� �մϴ�. 
	 * ������ ���� �Ƿε� k�� �� ������ "�ּ� �ʿ� �Ƿε�", 
	 * "�Ҹ� �Ƿε�"�� ��� 2���� �迭 dungeons �� �Ű������� �־��� ��, 
	 * ������ Ž���Ҽ� �ִ� �ִ� ���� ���� return �ϵ��� solution �Լ��� �ϼ����ּ���.
	 * 
	 * ���ѻ���
		k�� 1 �̻� 5,000 ������ �ڿ����Դϴ�.
		dungeons�� ����(��) ����(��, ������ ����)�� 1 �̻� 8 �����Դϴ�.
		dungeons�� ����(��) ���̴� 2 �Դϴ�.
		dungeons�� �� ���� �� ������ ["�ּ� �ʿ� �Ƿε�", "�Ҹ� �Ƿε�"] �Դϴ�.
				"�ּ� �ʿ� �Ƿε�"�� �׻� "�Ҹ� �Ƿε�"���� ũ�ų� �����ϴ�.
				"�ּ� �ʿ� �Ƿε�"�� "�Ҹ� �Ƿε�"�� 1 �̻� 1,000 ������ �ڿ����Դϴ�.
				���� �ٸ� ������ ["�ּ� �ʿ� �Ƿε�", "�Ҹ� �Ƿε�"]�� ���� ���� �� �ֽ��ϴ�.
		
	 * 
	 * ����� �� ����
		���� �Ƿε��� 80�Դϴ�.

		����, ù ��° �� �� ��° �� �� ��° ���� ������ Ž���Ѵٸ�

		���� �Ƿε��� 80�̸�, ù ��° ������ �������� �ʿ��� "�ּ� �ʿ� �Ƿε�" ���� 80�̹Ƿ�, 
		ù ��° ������ Ž���� �� �ֽ��ϴ�. 
		ù ��° ������ "�Ҹ� �Ƿε�"�� 20�̹Ƿ�, ������ Ž���� �� ���� �Ƿε��� 60�Դϴ�.
		
		���� �Ƿε��� 60�̸�, �� ��° ������ �������� �ʿ��� "�ּ� �ʿ� �Ƿε�"�� 50�̹Ƿ�, 
		�� ��° ������ Ž���� �� �ֽ��ϴ�. �� ��° ������ "�Ҹ� �Ƿε�"�� 40�̹Ƿ�, 
		������ Ž���� �� ���� �Ƿε��� 20�Դϴ�.
		
		���� �Ƿε��� 20�̸�, �� ��° ������ �������� �ʿ��� "�ּ� �ʿ� �Ƿε�"�� 30�Դϴ�. 
		���� �� ��° ������ Ž���� �� �����ϴ�.
		
		
		����, ù ��° �� �� ��° �� �� ��° ���� ������ Ž���Ѵٸ�
		
		���� �Ƿε��� 80�̸�, ù ��° ������ �������� �ʿ��� "�ּ� �ʿ� �Ƿε�" ���� 80�̹Ƿ�, 
		ù ��° ������ Ž���� �� �ֽ��ϴ�. ù ��° ������ "�Ҹ� �Ƿε�"�� 20�̹Ƿ�, 
		������ Ž���� �� ���� �Ƿε��� 60�Դϴ�.
		
		���� �Ƿε��� 60�̸�, �� ��° ������ �������� �ʿ��� "�ּ� �ʿ� �Ƿε�"�� 30�̹Ƿ�, 
		�� ��° ������ Ž���� �� �ֽ��ϴ�. �� ��° ������ "�Ҹ� �Ƿε�"�� 10�̹Ƿ�, 
		������ Ž���� �� ���� �Ƿε��� 50�Դϴ�.
		
		���� �Ƿε��� 50�̸�, �� ��° ������ �������� �ʿ��� "�ּ� �ʿ� �Ƿε�"�� 50�̹Ƿ�, 
		�� ��° ������ Ž���� �� �ֽ��ϴ�. �� ��° ������ "�Ҹ� �Ƿε�"�� 40�̹Ƿ�, 
		������ Ž���� �� ���� �Ƿε��� 10�Դϴ�.
		
		���� �� ��� �� ������ ��� Ž���� �� ������, ������ Ž���� �� �ִ� �ִ� ���� ���� 3�Դϴ�.
		
		k	dungeons											result
		80	[[80,20],[50,40],[30,10]]							3
		
		40  [[40, 20], [10, 10], [10, 10], [10, 10], [10, 10]]	4
		
	 */
	public static void main(String[] args) {
		int k = 40;
		int[][] dungeons = {{40, 20}, {10, 10}, {10, 10}, {10, 10}, {10, 10}};
		//int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
		
		System.out.println(solution(k , dungeons));
	}
	
	static int result=0;
	
	public static void getCnt(boolean[] check,int cnt, int remain, int[] needEnergy, int[] useEnergy) {
		
		for(int i=0;i<needEnergy.length;i++){
	        if(!check[i] && needEnergy[i]<=remain){
	            check[i]=true;
	            getCnt(check, cnt+1, remain - useEnergy[i], needEnergy, useEnergy);
	            check[i]=false;
	        }
	    }
		answer = Math.max(answer, cnt);
	}
	
	static int answer = -1;
	
	public static int solution(int k, int[][] dungeons) {
		
				
	    int len = dungeons.length;
	    boolean[] check = new boolean[len];
	    int[] needEnergy = new int[len];
	    int[] useEnergy = new int[len];
	    for(int i=0; i<len; i++){
	        needEnergy[i] = dungeons[i][0];
	        useEnergy[i] = dungeons[i][1];
	    }
	    getCnt(check,0,k,needEnergy, useEnergy);
	    
		

        
        return answer;
    }
//	class Solution {
//	    int dfs(int k, int[][] dungeons) {
//	        int cnt = 0;
//	        for(int[] d : dungeons) {
//	            int a = d[0], b = d[1];
//	            if(a <= k) {
//	                d[0] = 9999;
//	                cnt = Math.max(1 + dfs(k - b, dungeons), cnt);
//	                d[0] = a;
//	            }
//	        }
//	        return cnt;
//	    }
//	    public int solution(int k, int[][] dungeons) {
//	        int answer = -1;
//	        return dfs(k, dungeons);
//	    }
//	}
	
//	public static boolean check[];
//    public static int ans = 0;
//
//    public int solution(int k, int[][] dungeons) {
//        check = new boolean[dungeons.length];
//
//        dfs(k, dungeons, 0);
//
//        return ans;
//    }
//    public static void dfs(int tired, int[][] dungeons, int cnt){
//        for(int i=0; i<dungeons.length; i++){
//            if(!check[i] && dungeons[i][0]<=tired){
//                check[i] = true;
//                dfs(tired-dungeons[i][1], dungeons, cnt+1);
//                check[i] = false;
//            }
//        }
//        ans = Math.max(ans, cnt);
//    }
}
