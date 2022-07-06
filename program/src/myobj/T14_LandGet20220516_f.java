package myobj;

public class T14_LandGet20220516_f {
	/*
	 * 
	 * 	땅따먹기 게임을 하려고 합니다. 
	 * 	땅따먹기 게임의 땅(land)은 총 N행 4열로 이루어져 있고, 
	 * 	모든 칸에는 점수가 쓰여 있습니다. 1행부터 땅을 밟으며 한 행씩 내려올 때, 
	 * 	각 행의 4칸 중 한 칸만 밟으면서 내려와야 합니다. 
	 * 
	 * 	단, 땅따먹기 게임에는 한 행씩 내려올 때, 
	 * 	같은 열을 연속해서 밟을 수 없는 특수 규칙이 있습니다.

		예를 들면,

		| 1 | 2 | 3 | 5 |

		| 5 | 6 | 7 | 8 |

		| 4 | 3 | 2 | 1 |

		로 땅이 주어졌다면, 1행에서 네번째 칸 (5)를 밟았으면, 2행의 네번째 칸 (8)은 밟을 수 없습니다.

		마지막 행까지 모두 내려왔을 때, 얻을 수 있는 점수의 최대값을 return하는 solution 함수를 완성해 주세요. 위 예의 경우, 1행의 네번째 칸 (5), 2행의 세번째 칸 (7), 3행의 첫번째 칸 (4) 땅을 밟아 16점이 최고점이 되므로 16을 return 하면 됩니다.
		
		행의 개수 N : 100,000 이하의 자연수
		열의 개수는 4개이고, 땅(land)은 2차원 배열로 주어집니다.
		점수 : 100 이하의 자연수
	 * 
	 * 
	 * 	land														answer
		[[1,2,3,5],[5,6,7,8],[4,3,2,1]]								16
		[[4, 3, 2, 1], [2, 2, 2, 1], [6, 6, 6, 4], [8, 7, 6, 5]]	20
	 * 
	 */
	
	public static void main(String[] args) {
		//int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		int[][] land = {{4, 3, 2, 1}, {2, 2, 2, 1}, {6, 6, 6, 4}, {8, 7, 6, 5}};
		System.out.println(solution( land));
		
		
	}
	
	public static int solution(int[][] land) {
		int answer = 0;
		
		for(int i = 1 ; i < land.length; i++) {
			land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
			land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
			land[i][2] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][3]);
			land[i][3] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][2]);
		}
		
		for(int[] arrNum : land) {
			for(int n : arrNum) {				
				answer = Math.max(answer, n);
			}
        }

        return answer;
	}
	
	

	
	
	
	
	
	
	
}
