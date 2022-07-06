package myobj.student;

public class ProgramStudent extends Student {

	private int kor;
	private int eng;
	private int math;
	private int pl;
	private int ds;
	private int os;
	
	private final static String GROUP_NAME = "ÇÁ·Î±×·¡¹Ö";
	private final static int SUBJECT_COUNT = 6;
	
	public ProgramStudent() {
		kor = (int)(Math.random() * 101);
		eng = (int)(Math.random() * 101);
		math = (int)(Math.random() * 101);
		pl = (int)(Math.random() * 101);
		ds = (int)(Math.random() * 101);
		os = (int)(Math.random() * 101);
	}
	
	@Override
	public int sum() {
		return kor + eng+ math + pl + ds + os;
	}

	@Override
	public double avg() {
		return sum() / (double) SUBJECT_COUNT;
	}

	@Override
	public void printGramdecard() {
		System.out.printf("[%s]\n"
				+ "%s(%d)\n"
				+ "KOR\t: %d\n"
				+ "ENG\t: %d\n"
				+ "MATH\t: %d\n"
				+ "P.L\t: %d\n"
				+ "D.S\t: %d\n"
				+ "O.S\t: %d\n"
				+ "ÃÑÁ¡\t: %d\n"
				+ "Æò±Õ\t: %.2f\n",GROUP_NAME, name, stuNum, kor, eng, math, pl, ds, os, sum(), avg());
		
	}

}
