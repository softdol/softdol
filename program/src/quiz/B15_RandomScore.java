package quiz;

public class B15_RandomScore {
	
	public static void main(String[] args) {
		
		boolean self = false;
		
		if(!self) {
			
			int[] score = new int[100];
			
			for(int i = 0; i < 100; ++i) {
				score[i] = (int)(Math.random() * 101);					
			}
			
			for(int i = 0; i < score.length; ++i) {
				System.out.println("┌────┐");
				System.out.printf("│%3d │\n",score[i]);
				System.out.println("└────┘");
			}
			
			int sum = 0;
			for(int i = 0; i < score.length; ++i) {
				sum += score[i];
			}
			System.out.printf("총점 : %d, 평균: %.2f\n", sum, sum / 100.);
			
			int best = 0, worst = 100;
			for(int i = 0; i < score.length; ++i) {
				best = best < score[i] ? score[i] : best;
				worst = worst > score[i] ? score[i] : worst;
			}
			
			System.out.printf("best score : %d, worst score : %d\n", best, worst);
			
		}else {
			
			int scoreCount = 100;
			
			int[] score = new int[scoreCount];		
			
			double sum = 0;
			int minScore = 100;
			int maxScore = 0;
			
			for(int i = 0 ; i < score.length; ++i) {
				// 1. 학생 100명의 점수(0~100)를 랜덤으로 생성하여 배열에 저장
				int pScore = (int)(Math.random() * 101 + 0);
				sum += pScore;
			
				// 2. 배열에 저장된 값을 보기 좋은 형대로 출력
				System.out.printf("[%2d] : %3d ", i, pScore);
				System.out.print((i % 4) == 3 ? "\n" : "");
				
				// 4. 배열에 저장된 값들 중 가장 낮은 점수와 가장 높은 점수를 출력
				minScore = minScore > pScore ? minScore = pScore : minScore;  
				maxScore = pScore > maxScore ? maxScore = pScore : maxScore;
				
			}
			System.out.println();
			
			// 3. 모든 학생들의 평균 점수를 출력
			System.out.printf("모든 학생들의 평균 점수는 %.2f점 입니다.\n", sum / score.length);
			System.out.println();
			
			// 4. 배열에 저장된 값들 중 가장 낮은 점수와 가장 높은 점수를 출력
			System.out.printf("가장 낮은 점수는 %d점, 가장 높은 점수는 %d점 입니다.\n", minScore, maxScore);
			System.out.println();
			
			System.out.printf("[총점 %.0f점] \n", sum);
			
		}				
		
	}
	
}
