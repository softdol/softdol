package myobj.school;

public class NetworkStudent extends Student {
	
	protected int koreanScore;
	protected int englishScore;
	protected int linuxSocre;
	protected int networkSocre;
	protected int ccnaSocre;
	
	//static int groupNum = 1;
	
	public NetworkStudent(String studentId) {
		groupNum = 1;
		this.name = FIRST_NAME[(int)(Math.random() * (FIRST_NAME.length))] 
				+ LAST_NAME[(int)(Math.random() * (LAST_NAME.length))] ;
		this.studentId = studentId;
		
		setScore();
	}

	@Override
	void setScore() {
		koreanScore = (int)(Math.random() * 101);
		englishScore = (int)(Math.random() * 101);
		linuxSocre = (int)(Math.random() * 101);
		networkSocre = (int)(Math.random() * 101);
		ccnaSocre = (int)(Math.random() * 101);		
	}

	@Override
	public void viewInfo() {
		viewTopInfo();
		System.out.println("========점수=========");
		System.out.println("국어\t: " + koreanScore);
		System.out.println("영어\t: " + englishScore);
		System.out.println("리눅스\t: " + linuxSocre);
		System.out.println("네트워크\t: " + networkSocre);
		System.out.println("CCNA\t: " + ccnaSocre);
		int sum = koreanScore + englishScore + linuxSocre + networkSocre + ccnaSocre;
		System.out.println("====================");
		System.out.println("총점\t: " + sum);
		System.out.printf("평균\t: %.2f\n", (double)sum / 5);
		System.out.println("====================");
	}

}
