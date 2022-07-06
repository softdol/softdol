package myobj.school;

public class ProgramStudent extends Student {
	
	private int koreanScore;
	private int englishScore;
	private int mathScore;
	private int programmingScore;
	private int datastructureScore;
	private int osSocre;
	
	//static int groupNum = 0;
	
	public ProgramStudent(String studentId) {
		groupNum = 0;				
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
		datastructureScore = (int)(Math.random() * 101);
		osSocre = (int)(Math.random() * 101);
	}
	
	@Override
	public void viewInfo() {		
		
		viewTopInfo();
		System.out.println("========점수=========");
		System.out.println("국어\t: " + koreanScore);
		System.out.println("영어\t: " + englishScore);
		System.out.println("수학\t: " + mathScore);
		System.out.println("프로그래밍\t: " + programmingScore);
		System.out.println("자료구조\t: " + datastructureScore);		
		System.out.println("운영체제\t: " + osSocre);
		int sum = koreanScore + englishScore + mathScore + programmingScore + datastructureScore + osSocre;
		System.out.println("====================");
		System.out.println("총점\t: " + sum);
		System.out.printf("평균\t: %.2f\n", (double)sum / 6);
		System.out.println("====================");
		
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("소속반\t: %s\n학번\t: %s\n이름\t: %s\n", GROUP_NAME[groupNum], studentId, name);
	}

	public int getKoreanScore() {
		return koreanScore;
	}	
	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;		
	}
	
	public int getEnglishScore() {
		return englishScore;
	}	
	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;		
	}
	
	public int getMathScore() {
		return mathScore;
	}	
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;		
	}
	
	public int getProgrammingScore() {
		return programmingScore;
	}	
	public void setProgrammingScore(int programmingScore) {
		this.programmingScore = programmingScore;		
	}
	
	public int getDatastructureScore() {
		return datastructureScore;
	}	
	public void setDatastructureScore(int datastructureScore) {
		this.datastructureScore = datastructureScore;		
	}
	
	public int getOsSocre() {
		return osSocre;
	}	
	public void setOsSocre(int osSocre) {
		this.osSocre = osSocre;		
	}
		

}
