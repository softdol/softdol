
public class B15_Array {
	
	/*
	 * 	# 배열 (Array)
	 * 
	 * 		- 같은 타입 변수를 한번에 여러개 선언하는 문법
	 * 		- 같은 이름으로 변수를 여러개 선언한 후에 인덱스로 구분한다
	 * 		- 배열은 선언과 동시에 크기를 정해야 한다
	 * 		- 크기가 정해지고 나면 크기를 변경할 수 없다
	 * 		- 배열의 방 번호(인덱스)는 0부터 전체 길이-1 번까지 있다
	 * 		- JAVA의 배열은 생성과 동시에 모든 값이 초기화 되어 있다.
	 * 		  (정수 : 0, 실수 : 0.0, boolean : false, 참조형 : null)
	 * 
	 * 	# 배열 선언 방법
	 * 
	 * 		1. 타입[] 변수명 = new 타입[크기];
	 * 		2. 타입[] 변수명 = {값1, 값2, 값3, 값4, 값5, 값6, ...}
	 * 		3. 타입[] 변수명 = new 타입[] {값1, 값2, 값3, 값4, 값5, 값6, ...};
	 */
	
	public static void main(String[] main) {
		
		//	배열의 길이가 3일떄 방 번호는 2번까지 있다
		int[] score = new int[5];
		
		score[0] = 99;
		score[1] = 80;
		score[2] = 70;
		//score[3] = 99;

		System.out.println("score의 길이 : " + score.length);
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		System.out.println(score[4]);
		
		boolean[] complete = new boolean[5];
		
		for(int i = 0 ; i < complete.length; ++i) {
			System.out.printf("complete[%d] : %b\n", i, complete[i]);
		}
		
		
		char[] text = new char[100];		
		
		text[0] = 'h';
		text[1] = 'e';
		text[2] = 'l';
		text[3] = 'l';
		text[4] = 'o';
		
		//	char[]은 문자열이나 다름없다
		System.out.println(text);
		
		int[] num = new int[1000];
		
		num[0] = 5;
		num[1] = 3;
		num[2] = 4;
		
		//System.out.println(num[10]);
		
		// 배열 선언하기
		//short[] eye_power = new short[10];
		//long[] money = { 123L, 234L, 5, 6, 789L };
		String[] name = new String[] {"김철수","이철수","안철수","박철수","허철수"};
		
		// 배열에 값을 넣기(값 수정하기)
		name[3] = "송진우"; 
		
		// 배열의 값 사용하기
		for(int i = 0; i < name.length; ++i) {
			System.out.println(name[i]);
		}
		
		// String타입은 char[]로 변환하여 사용할 수 있다.
		String welcomeMessage = "Hello, world!!";
		
		char[] msg = welcomeMessage.toCharArray();
		
		System.out.println(msg[0]);
		System.out.println(msg[1]);
		System.out.println(msg[msg.length - 1]);
		System.out.println(msg[msg.length - 2]);
		System.out.println(msg[msg.length - 3]);
		System.out.println(msg[msg.length - 4]);
		System.out.println(msg[msg.length - 5]);
		
		
		
	}

}
