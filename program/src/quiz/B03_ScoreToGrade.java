package quiz;

import java.util.Scanner;

public class B03_ScoreToGrade {

	/*
	 *	점수를 세 개 입력받고 평군 점수를 낸 후
	 *	평군 점수에 해당하는 등급을 출력해주는 프로그램을 만들어보세요.
	 *
	 *	1. 과목은 국/영/수가 있다
	 *
	 *	2. 90점 이상은 A,
	 *	   90점 이상은 B,
	 *     90점 이상은 C,
	 *     90점 이상은 D,
	 *     그 외는 F등급이다.
	 *     
	 *  3. 유효한 점수는 0 ~ 100점이다. (유효하지 않는 점수는 F등급 처리)
	 *  4. 평균 점수는 소수 셋째 자리에서 반올림하여 기록한다. 
	 *    
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, math;
		// int total;
		double avg;
		char grade;
		
		System.out.print("국영수 점수를 입력해 주세요 >>");
		kor	 = sc.nextInt();
		//System.out.print("영어 점수를 입력해 주세요 >>");
		eng	 = sc.nextInt();
		//System.out.print("수학 점수를 입력해 주세요 >>");
		math = sc.nextInt();
		
		sc.close();
		//avg = (double)(kor + eng + math) / 3;
		avg = (kor + eng + math) / 3.0;
		avg = Math.round(avg*100) / 100.0;
		grade = 'F';
		
		if(kor >= 0 && kor < 101 && eng >= 0 && eng < 101 && math >= 0 && math < 101) {
			if(avg >= 90) {
				grade = 'A';
				//System.out.printf("입력 점수(국:%d 영:%d 수:%d)의 등급(평균:%.2f)은 A 입니다.", kor, eng, math, avg);
				//return;	//main()을 강제로 끝낼 수 있다.
			}else if(avg >= 80){
				grade = 'B';
				//System.out.printf("입력 점수(국:%d 영:%d 수:%d)의 등급(평균:%.2f)은 B 입니다.", kor, eng, math, avg);
			}else if(avg >= 70){
				grade = 'C';
				//System.out.printf("입력 점수(국:%d 영:%d 수:%d)의 등급(평균:%.2f)은 C 입니다.", kor, eng, math, avg);
			}else if(avg >= 60){
				grade = 'D';
				//System.out.printf("입력 점수(국:%d 영:%d 수:%d)의 등급(평균:%.2f)은 D 입니다.", kor, eng, math, avg);
			}else {
				grade = 'F';
				//System.out.printf("입력 점수(국:%d 영:%d 수:%d)의 등급(평균:%.2f)은 F 입니다.", kor, eng, math, avg);
			}
			System.out.printf("입력 점수(국:%d 영:%d 수:%d)의 등급(평균:%.2f)은 %c 입니다.", kor, eng, math, avg, grade);
		}else {
			System.out.printf("잘못된 점수(국:%d 영:%d 수:%d)가 입력되어 등급(평균:%.2f)은 %c 입니다.", kor, eng, math, avg, grade);
		}

				
	}
}
