package myobj.student;

public class Student implements Average , GradeCard{
	
	private static String[] firstName = {"����","��ȯ","����","����","��ȣ","����","ȿ��","ȣ��"};
	private static String[] lasttName = {"��","��","��","��","��","��","��","��"
										,"��","��"};
	
	private static int currStuNum = 1000;

	protected String name;
	protected int stuNum;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "[" + stuNum + "]";
	}
	public static String getRanName() {
		return lasttName[(int)(Math.random() * lasttName.length )]
				+ firstName[(int)(Math.random() * firstName.length )];
	}
	
	public Student() {
		name = getRanName();
		stuNum = currStuNum++;
	}
	@Override
	public void printGramdecard() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int sum() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double avg() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
