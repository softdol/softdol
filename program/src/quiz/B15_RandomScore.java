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
				System.out.println("������������");
				System.out.printf("��%3d ��\n",score[i]);
				System.out.println("������������");
			}
			
			int sum = 0;
			for(int i = 0; i < score.length; ++i) {
				sum += score[i];
			}
			System.out.printf("���� : %d, ���: %.2f\n", sum, sum / 100.);
			
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
				// 1. �л� 100���� ����(0~100)�� �������� �����Ͽ� �迭�� ����
				int pScore = (int)(Math.random() * 101 + 0);
				sum += pScore;
			
				// 2. �迭�� ����� ���� ���� ���� ����� ���
				System.out.printf("[%2d] : %3d ", i, pScore);
				System.out.print((i % 4) == 3 ? "\n" : "");
				
				// 4. �迭�� ����� ���� �� ���� ���� ������ ���� ���� ������ ���
				minScore = minScore > pScore ? minScore = pScore : minScore;  
				maxScore = pScore > maxScore ? maxScore = pScore : maxScore;
				
			}
			System.out.println();
			
			// 3. ��� �л����� ��� ������ ���
			System.out.printf("��� �л����� ��� ������ %.2f�� �Դϴ�.\n", sum / score.length);
			System.out.println();
			
			// 4. �迭�� ����� ���� �� ���� ���� ������ ���� ���� ������ ���
			System.out.printf("���� ���� ������ %d��, ���� ���� ������ %d�� �Դϴ�.\n", minScore, maxScore);
			System.out.println();
			
			System.out.printf("[���� %.0f��] \n", sum);
			
		}				
		
	}
	
}
