/*
 * 	# Import
 * 		- 다른 패키지에 저장되어 있는 클래스를 패키지명을 생략하고 사용하기 위한 문법
 */
import java.util.Scanner;
//import quiz.A00_Rabbit;
//import quiz.A01_MermberInfo;
//import quiz.A04_VarTypes;

public class B00_Scanner {
	
	/*
	 * 	# java.util.Scanner
	 * 
	 * 		- 프로그램으로 입력을 받을 수 있는 기능들이 모여있는 클래스
	 * 		- 어느 곳으로 부터 입력 받을지 결정한 뒤 스캐너를 생성하여 사용 한다
	 * 
	 */
	
	public static void main(String[] args) {
		
		// 사실 우리는 다른 패키지에 만들었던 것들을 가져다 사용할 수 있다.
//		A00_Rabbit.main(null);
//		A01_MermberInfo.main(null);
//		A04_VarTypes.main(null);
		
		// 같은 패키지에 속해있는 다른 클래스는 패키지명을 생략하고 사용할 수 있다.
//		A00_Hello.main(null);		
	
		// import를 통해 패키지명을 생략하고 사용할 수 있다.
		// System.in 으로 입력받는 새로운 스캐너를 생성
		Scanner abbc = new Scanner(System.in);	//Ctrl + Shift + o
		
		/*
		 * 	(1) next타입()
		 * 
		 * 		- 입력된 값들 중 다음 값을 하나만 꺼낸 뒤 해당 타입으로 변환하여 가져온다
		 * 		- 통로에서 꺼낸 값이 해당 타입이 될 수 없다면 에러가 발생한다
		 * 		- 공백, 탭, \n 을 기준으로 값을 구분한다
		 * 		- 통로에 아무 값도 없다면 프로그램을 멈추고 새로운 입력을 기다린다   
		 * 
		 * 	(2) next()
		 * 		
		 * 		- 입력된 값들 중 다음 값을 하나 문자열 타입으로 꺼낸다
		 * 		- 공백, 탭, \n 을 기준으로 값을 구분한다
		 * 		- 통로에 아무 값도 없다면 프로그램을 멈추고 새로운 입력을 기다린다
		 * 
		 * 	(3) nextLine()
		 * 
		 * 		- \n 만 기준으로 삼아 값을 구분한다
		 * 		- 입력된 값을 모두 문자열 타입으로 꺼낸다
		 * 		- 통로에 아무 값도 없다면 프로그램을 멈추고 새로운 입력을 기다린다
		 */
		System.out.print("정수를 입력하세요 >> ");
		
		//int input = abbc.nextInt();
//		String input = abbc.next();
//		String input2 = abbc.next();
		
		String input = abbc.nextLine();
		String input2 = abbc.nextLine();
		
		System.out.printf("입력하신 값은 %s입니다.\n", input);
		System.out.printf("입력하신 값은 %s입니다.\n", input2);
		
		abbc.close();
	}

}
