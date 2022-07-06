package quiz;

import myobj.student.*;

public class C14_School {
	
	/*
	 * 	1. 프로그래밍 반 학생들은 각자의 국어, 영어, 수학, 프로그래밍 언어, 자료구조, 운영체제 점수가 있다
	 * 
	 * 	2. 네트워크 반 학생들은 각자의 국어, 영어, 리눅스, 네크워크, CCNA 점수가 있다
	 * 
	 * 	3. 머신러닝 반 학생들은 각자의 국어, 영어, 수학, 통계학 프로그래밍 언어 점수가 있다
	 * 
	 * 	4. 100명의 학생을 랜덤으로 생성한다
	 * 	   모든 학생의 소속 반, 과목별 점수, 이름은 랜덤으로 생성되어야 하고,
	 * 	   학번은 중복없이 순차적으로 생성되어야 한다.
	 * 
	 * 	5. 성적표 출력 메서드를 통해 각 학생의 [이름/각 과목 점수/평점/평균]을 볼 수 있어야 한다 
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
