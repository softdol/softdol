package myobj.student;

public class NetworkStudent extends Student {
	//��Ʈ��ũ �� �л����� ������ ����, ����, ������, ��ũ��ũ, CCNA ������ �ִ�
	private int kor;
	private int eng;
	private int linux;
	private int net;
	private int ccna;	
	
	private final static String GROUP_NAME = "��Ʈ��ũ";
	private final static int SUBJECT_COUNT = 5;
	
	public NetworkStudent() {
		kor = (int)(Math.random() * 101);
		eng = (int)(Math.random() * 101);
		linux = (int)(Math.random() * 101);
		net = (int)(Math.random() * 101);
		ccna = (int)(Math.random() * 101);
	}
	
	@Override
	public int sum() {
		return kor + eng+ linux + net + ccna;
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
				+ "LINUX\t: %d\n"
				+ "NET\t: %d\n"
				+ "CCNA\t: %d\n"				
				+ "����\t: %d\n"
				+ "���\t: %.2f\n",GROUP_NAME, name, stuNum, kor, eng, linux, net, ccna, sum(), avg());
		
	}
	
}
