package quiz;

import myobj.student.*;

public class C14_School {
	
	/*
	 * 	1. ���α׷��� �� �л����� ������ ����, ����, ����, ���α׷��� ���, �ڷᱸ��, �ü�� ������ �ִ�
	 * 
	 * 	2. ��Ʈ��ũ �� �л����� ������ ����, ����, ������, ��ũ��ũ, CCNA ������ �ִ�
	 * 
	 * 	3. �ӽŷ��� �� �л����� ������ ����, ����, ����, ����� ���α׷��� ��� ������ �ִ�
	 * 
	 * 	4. 100���� �л��� �������� �����Ѵ�
	 * 	   ��� �л��� �Ҽ� ��, ���� ����, �̸��� �������� �����Ǿ�� �ϰ�,
	 * 	   �й��� �ߺ����� ���������� �����Ǿ�� �Ѵ�.
	 * 
	 * 	5. ����ǥ ��� �޼��带 ���� �� �л��� [�̸�/�� ���� ����/����/���]�� �� �� �־�� �Ѵ� 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		for(int i = 0; i < 100; i++) {			
			switch((int)(Math.random()*3)) {
			case 1:
				Student stu = new ProgramStudent();
				stu.printGramdecard();
				break;
			case 2:
				Student stu2 = new NetworkStudent();
				stu2.printGramdecard();
				break;				
			default:
				Student stu3 = new ProgramStudent();
				stu3.printGramdecard();
				break;
			}
			
			
		}
		
//		
//		for(int i = 0 ; i < 100 ; i++) {
//			System.out.println(new Student());
//		}
		
//		Student[] students = new Student[100];
//		
//		for(int i = 0 ; i < 100 ; i++) {
//			int classNum = (int)(Math.random() * 3);
//			String studentId = "000000" + i;
//			studentId = "A" + studentId.substring(studentId.length() - 6);
//			
//			if(classNum == 0) {
//				students[i] = new ProgramStudent(studentId);
//			}else if(classNum == 1){
//				students[i] = new NetworkStudent(studentId);
//			}else if(classNum == 2){
//				students[i] = new MoshinStudent(studentId);
//			}
//		}
//		
//		for(Student s : students) {
//			s.viewInfo();
//		}
		
		//p1.setDatastructureScore(100);
		
		//System.out.println(p1.getDatastructureScore());
		//System.out.println(p1);
		
		//p1.viewInfo();
	}

}
