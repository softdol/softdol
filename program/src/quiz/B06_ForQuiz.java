package quiz;

public class B06_ForQuiz {

	/*
	 * 
	 * 사용자가 숫자를 입력하면
	 * 
	 * 1. 100부터 300까지의 총합을 구해보세요
	 * 
	 * 2. 1부터 2000사이의 사이의 7의 배수만 출력해 보세요
	 * 
	 * 3. 1000부터 1500까지 10의 배수가 한줄에 10개씩 출력 되도록 만들어 보세요
	 * 
	 */
	public static void main(String[] args) {

		// int num = 110;
		int total = 0;

		// 1. 100부터 300까지의 총합을 구해보세요

		for (int i = 100; i <= 300; ++i) {

			total += i;

		}

		System.out.printf("총합은 : %d입니다.\n", total);

		// 2. 1부터 2000사이의 사이의 7의 배수만 출력해 보세요
		for (int i = 1, cnt = 1; i <= 2000; ++i) {

			if (i % 7 == 0) {
				System.out.printf("%d번째 7의 배수 [%d]입니다.\n", cnt++, i);
			}

		}
		// 3. 1000부터 1500까지 10의 배수가 한줄에 10개씩 출력 되도록 만들어 보세요

		for (int i = 1000, lineCount = 0; i <= 1500; ++i) {

			if (i % 10 == 0) {

				System.out.printf("%-6d ", i);
				lineCount += 1;

				if (lineCount % 10 == 0) {

					System.out.println();

				}

			}

		}

	}

}
