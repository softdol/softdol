package myobj;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Map.Entry;

public class Lv201_ColoringBook20220526_s {
	/*
	 * 문제 설명 카카오 프렌즈 컬러링북
	 * 
	 * 출판사의 편집자인 어피치는 네오에게 컬러링북에 들어갈 원화를 그려달라고 부탁하여 여러 장의 그림을 받았다. 여러 장의 그림을 난이도 순으로
	 * 컬러링북에 넣고 싶었던 어피치는 영역이 많으면 색칠하기가 까다로워 어려워진다는 사실을 발견하고 그림의 난이도를 영역의 수로 정의하였다.
	 * 
	 * ######(영역이란 상하좌우로 연결된 같은 색상의 공간을 의미한다.)#######
	 * 
	 * 그림에 몇 개의 영역이 있는지와 가장 큰 영역의 넓이는 얼마인지 계산하는 프로그램을 작성해보자.
	 * 
	 * alt text
	 * 
	 * 위의 그림은 총 12개 영역으로 이루어져 있으며, 가장 넓은 영역은 어피치의 얼굴면으로 넓이는 120이다.
	 * 
	 * 입력 형식 입력은 그림의 크기를 나타내는 m과 n, 그리고 그림을 나타내는 m × n 크기의 2차원 배열 picture로 주어진다.
	 * 
	 * 제한조건은 아래와 같다.
	 * 
	 * 1 <= m, n <= 100 picture의 원소는 0 이상 2^31 - 1 이하의 임의의 값이다. picture의 원소 중 값이 0인
	 * 경우는 색칠하지 않는 영역을 뜻한다.
	 * 
	 * 출력 형식 리턴 타입은 원소가 두 개인 정수 배열이다. 그림에 몇 개의 영역이 있는지와 가장 큰 영역은 몇 칸으로 이루어져 있는지를
	 * 리턴한다.
	 * 
	 * 예제 입출력 m n picture answer 6 4 [[1, 1, 1, 0], [1, 2, 2, 0], [1, 0, 0, 1], [0,
	 * 0, 0, 1], [0, 0, 0, 3], [0, 0, 0, 3]] [4, 5] 예제에 대한 설명 예제로 주어진 그림은 총 4개의 영역으로
	 * 구성되어 있으며, 왼쪽 위의 영역과 오른쪽의 영역은 모두 1로 구성되어 있지만 상하좌우로 이어져있지 않으므로 다른 영역이다. 가장 넓은
	 * 영역은 왼쪽 위 1이 차지하는 영역으로 총 5칸이다.
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
