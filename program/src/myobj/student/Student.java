package myobj.student;

public class Student implements Average , GradeCard{
	
	private static String[] firstName = {"태현","규환","도현","은희","민호","성훈","효정","호민"};
	private static String[] lasttName = {"고","강","김","권","박","배","송","안"
										,"이","최"};
	
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
