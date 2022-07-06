package myobj.school;

abstract public class Student {
	
	final static String[] GROUP_NAME = {"���α׷���", "��Ʈ��ũ", "�ӽŷ���"};
	final static String[] FIRST_NAME = {"��","��","��","��","ȫ","��","��","Ȳ","��","��"};
	final static String[] LAST_NAME = {"ö��","�浿","����","��ȣ","��ȣ","�μ�","����","����","����","�߼�"};
	

	protected String name;
	protected String studentId;
	protected int groupNum;
	
	abstract void setScore();
	abstract public void viewInfo();
	
	protected void viewTopInfo() {
		System.out.println("=======�⺻����=======");
		System.out.println("�Ҽӹ�\t: " + GROUP_NAME[groupNum]);
		System.out.println("�й�\t: " + studentId);
		System.out.println("�̸�\t: " + name);
	}
	
	public int getGroupNum() {
		return groupNum;
	}
}
