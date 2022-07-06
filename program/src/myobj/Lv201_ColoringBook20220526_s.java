package myobj;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Map.Entry;

public class Lv201_ColoringBook20220526_s {
	/*
	 * ���� ���� īī�� ������ �÷�����
	 * 
	 * ���ǻ��� �������� ����ġ�� �׿����� �÷����Ͽ� �� ��ȭ�� �׷��޶�� ��Ź�Ͽ� ���� ���� �׸��� �޾Ҵ�. ���� ���� �׸��� ���̵� ������
	 * �÷����Ͽ� �ְ� �;��� ����ġ�� ������ ������ ��ĥ�ϱⰡ ��ٷο� ��������ٴ� ����� �߰��ϰ� �׸��� ���̵��� ������ ���� �����Ͽ���.
	 * 
	 * ######(�����̶� �����¿�� ����� ���� ������ ������ �ǹ��Ѵ�.)#######
	 * 
	 * �׸��� �� ���� ������ �ִ����� ���� ū ������ ���̴� ������ ����ϴ� ���α׷��� �ۼ��غ���.
	 * 
	 * alt text
	 * 
	 * ���� �׸��� �� 12�� �������� �̷���� ������, ���� ���� ������ ����ġ�� �󱼸����� ���̴� 120�̴�.
	 * 
	 * �Է� ���� �Է��� �׸��� ũ�⸦ ��Ÿ���� m�� n, �׸��� �׸��� ��Ÿ���� m �� n ũ���� 2���� �迭 picture�� �־�����.
	 * 
	 * ���������� �Ʒ��� ����.
	 * 
	 * 1 <= m, n <= 100 picture�� ���Ҵ� 0 �̻� 2^31 - 1 ������ ������ ���̴�. picture�� ���� �� ���� 0��
	 * ���� ��ĥ���� �ʴ� ������ ���Ѵ�.
	 * 
	 * ��� ���� ���� Ÿ���� ���Ұ� �� ���� ���� �迭�̴�. �׸��� �� ���� ������ �ִ����� ���� ū ������ �� ĭ���� �̷���� �ִ�����
	 * �����Ѵ�.
	 * 
	 * ���� ����� m n picture answer 6 4 [[1, 1, 1, 0], [1, 2, 2, 0], [1, 0, 0, 1], [0,
	 * 0, 0, 1], [0, 0, 0, 3], [0, 0, 0, 3]] [4, 5] ������ ���� ���� ������ �־��� �׸��� �� 4���� ��������
	 * �����Ǿ� ������, ���� ���� ������ �������� ������ ��� 1�� �����Ǿ� ������ �����¿�� �̾������� �����Ƿ� �ٸ� �����̴�. ���� ����
	 * ������ ���� �� 1�� �����ϴ� �������� �� 5ĭ�̴�.
	 * 
	 */

	public static void main(String[] args) {
//		int m = 2;
//		int n = 2;
//		int[][] picture = {{1, 1}, {0,1}};

		int m = 6;
		int n = 4;
		// int[][] picture = { { 1, 1, 1, 0 }, { 1, 2, 2, 0 }, { 1, 0, 0, 1 }, { 0, 0,
		// 0, 1 }, { 0, 0, 0, 3 }, { 0, 0, 0, 3 } };
		// 4,5
		int[][] picture = { { 1, 0, 0, 1 }, { 1, 0, 0, 1 }, { 1, 0, 0, 1 }, { 1, 0, 0, 1 }, { 1, 0, 0, 1 },
				{ 1, 1, 1, 1 } };

//				(6, 4, ) => 1, 14
//
//				(1, 1, { { 0 } }) => 0, 0
//
//				(4, 4, { { 1, 1, 1, 1 }, { 1, 4, 1, 1 }, { 1, 3, 2, 1 }, { 1, 1, 1, 1 } }) => 12, 120

		System.out.println(Arrays.toString(solution(m, n, picture)));

	}

	static int[][] map;
	static boolean[] visited;
	static boolean[] started;
	static HashMap<Integer, Integer> realList;

	public static int bfs(int num) {
		int count = 0;

		Queue<Integer> q = new LinkedList<>();
		q.offer(num);
		visited[num] = true;

		while (!q.isEmpty()) {
			int x = q.poll();
			count++;
			// System.out.print(x + " ");
			for (int i = 1; i < map.length; i++) {
				if (map[x][i] == 1 && visited[i] == false) {
					q.offer(i);
					visited[i] = true;
					realList.remove(i);
				}
			}
		}

		return count;
	}

	public static void setMap(int x, int y) {
		map[x][y] = 1;
		started[y] = true;
		// System.out.println(x + " : " + y);
	}

	public static int[] solution(int m, int n, int[][] picture) {
		int mapLen = m * n + 1;
		map = new int[mapLen][mapLen];
		visited = new boolean[mapLen];
		started = new boolean[mapLen];
		realList = new HashMap<>();

		int numberOfArea = 0;
		int maxSizeOfOneArea = 0;
		int[] answer = new int[2];

		HashMap<Integer, Integer> chkList = new HashMap<>();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (picture[i][j] > 0) {
					int orgNum = picture[i][j];
					int x = i * n + j + 1;
					int y = 0;
					if (i > 0) {
						if (picture[i - 1][j] == orgNum) {
							y = (i - 1) * n + j + 1;
							setMap(x, y);
						}
					}
					if (i < m - 1) {
						if (picture[i + 1][j] == orgNum) {
							y = (i + 1) * n + j + 1;
							setMap(x, y);
						}
					}
					if (j > 0) {
						if (picture[i][j - 1] == orgNum) {
							y = i * n + j;
							setMap(x, y);
						}
					}
					if (j < n - 1) {
						if (picture[i][j + 1] == orgNum) {
							y = i * n + j + 2;
							setMap(x, y);
						}
					}
					if (y == 0) {
						y = x;
						map[x][y] = 1;
					}

					if (started[x] == false) {
						started[x] = true;
						chkList.put(Math.min(x, y), orgNum);
					}
				}
			}
		}
		// System.out.println(chkList);

		realList = new HashMap<>(chkList);

		for (Entry<Integer, Integer> e : chkList.entrySet()) {
			int count = bfs(e.getKey());
			maxSizeOfOneArea = maxSizeOfOneArea > count ? maxSizeOfOneArea : count;
			// visited = new boolean[mapLen];
			// System.out.println();
		}
		// System.out.println(realList);
		numberOfArea = realList.size();

		answer[0] = numberOfArea;
		answer[1] = maxSizeOfOneArea;

		return answer;
	}
}
