package myobj.school;

public class MoshinStudent extends Student {

	protected int koreanScore;
	protected int englishScore;
	protected int mathScore;
	protected int programmingScore;
	protected int statisticsScore;
	
	//static int groupNum = 2;
	
	public MoshinStudent(String studentId) {
		groupNum = 2;
		this.name = FIRST_NAME[(int)(Math.random() * (FIRST_NAME.length))] 
				+ LAST_NAME[(int)(Math.random() * (LAST_NAME.length))] ;
		this.studentId = studentId;
		
		setScore();
	}
	
	@Override
	void setScore() {
		koreanScore = (int)(Math.random() * 101);
		englishScore = (int)(Math.random() * 101);
		mathScore = (int)(Math.random() * 101);
		programmingScore = (int)(Math.random() * 101);
		statisticsScore = (int)(Math.random() * 101);
	}
	@Override
	public void viewInfo() {
		viewTopInfo();
		System.out.println("========점수=========");
		System.out.println("국어\t: " + koreanScore);
		System.out.println("영어\t: " + englishScore);
		System.out.println("수학\t: " + mathScore);
		System.out.println("프로그래밍\t: " + programmingScore);
		System.out.println("자료구조\t: " + statisticsScore);
		int sum = koreanScore + englishScore + mathScore + programmingScore + statisticsScore;
		System.out.println("====================");
		System.out.println("총점\t: " + sum);
		System.out.printf("평균\t: %.2f\n", (double)sum / 5);
		System.out.println("====================");
	}
		
		
}
