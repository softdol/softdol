
public class C09_AccessModifier extends myobj.C09_PublicClass {
	
	public C09_AccessModifier() {
		// �ٸ� ��Ű���� �ڿ��̴��� ��ӹ��� Ŭ���������� protected���� ����� �� �ִ�
		super.m1();
		super.m2();
	}
	/*
	 * 	# ���� ������ (Access Modifier)
	 * 
	 * 	 - �ٸ� Ŭ�������� �ش� �ڿ��� ����Ϸ��� �� �� ��� ������ �����Ѵ�
	 * 	 
	 * 	# ����
	 * 
	 * 	 - public		: �ٸ� ��Ű�������� �����Ӱ� ������ �� �ִ� �ڿ�
	 * 	 - protected	: �ٸ� ��Ű�������� ��� ���� Ŭ���������� ������ �� �ִ� �ڿ�  
	 * 	 - default		: ���� ��Ű�������� �����Ӱ� ������ �� �ִ� �ڿ�(�տ� ���� �����ڸ� ������ �ʴ°�)
	 * 	 - private		: ���� Ŭ���� ���ο����� ������ �� �ִ� �ڿ�
	 * 
	 * 
	 */	
	public static void main(String[] args) {
		
		// ���� ��Ű���� �ִ� Ŭ������ �ڿ��� public, protected, default���� ����� �� �ִ�
		C09_PublicClass instance1 = new C09_PublicClass();
		DefaultClass instance2 = new DefaultClass();
				
		// private���� ���� ������ �ȵ�����, �ٸ� �޼��带 ���� �������� ����� �����ϴ�
		instance1.m1();
		instance1.m2();
		instance1.m3();
		
		instance2.m1();
		instance2.m2();
		instance2.m3();
		
		// �ٸ� ��Ű���� �ִ� Ŭ������ �ڿ��� �⺻������ public�� ���� �͸� ����� �� �ִ�
		myobj.C09_PublicClass instance3 = new myobj.C09_PublicClass();
		
		// �ٸ� ��Ű���� �ִ� DefaultŬ������ ��� �� �� ���� 
		//myobj.DefaultClass
		
		instance3.m1();
		
	}
	
}
