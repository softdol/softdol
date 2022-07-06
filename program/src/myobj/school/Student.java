package myobj.school;

abstract public class Student {
	
	final static String[] GROUP_NAME = {"프로그래밍", "네트워크", "머신러닝"};
	final static String[] FIRST_NAME = {"김","이","박","허","홍","왕","곽","황","윤","장"};
	final static String[] LAST_NAME = {"철수","길동","영수","성호","정호","민수","지훈","예준","광수","중수"};
	

	protected String name;
	protected String studentId;
	protected int groupNum;
	
	abstract void setScore();
	abstract public void viewInfo();
	
	protected void viewTopInfo() {
		System.out.println("=======기본정보=======");
		System.out.println("소속반\t: " + GROUP_NAME[groupNum]);
		System.out.println("학번\t: " + studentId);
		System.out.println("이름\t: " + name);
	}
	
	public int getGroupNum() {
		return groupNum;
	}
}
