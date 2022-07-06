/*
 	# Windows 단축키

 	 - [Win] + E : 탐색기
     - [Win] + Shift + S : 스크린샷(스크린샷 후 카카오톡 붙여넣기 가능)

 	# Eclipse 단축키

 	 - Ctrl + [+,-] : 글자크기 
 	 - Ctrl + M : 현재 창 최대/최소화

 	# 블럭지정 단축키

 	 - Home : 현재 줄의 맨 앞으로 이동
 	 - End : 현재 줄의 맨 뒤로 이동
 	 - Shift + Home : 현재 커서 위치부터 맨 앞까지 블록지정한다 
 	 - Shift + End :  현재 커서 위치부터 맨 뒤까지 블록지정한다
 	 - Shift + 방향키 : 커서를 움직이며 블록지정한다
 	 - Ctrl + A : 전체 문서를 블록지정한다
 	 - Ctrl + Home : 문서의 맨 위로 이동한다
 	 - Ctrl + End : 문서의 맨 아래로 이동한다
 	 - Ctrl + Shift + Home : 현재 위치부터 문서의 맨 위까지 블록지정
 	 - Ctrl + Shift + End : 현재 위치부터 문서의 맨 아래까지 블록지정
 */
// ※ public class의 이름은 반드시 파일명과 같아여 한다
public class A00_Hello {
	// Eclipse에서 빨간 줄이 생겼을 때(에러를 발견했을 때) 그곳에 커서를 두고 F2를 누르면 
	// 해당 에러에 대한 정보와 해결책을 볼 수 있다

	/*
	 * # main() 함수
	 * 
	 *  - Java에서 어떤 단어 뒤에 ()가 있으면 함수라고 한다
	 *  - 프로그램의 시작 지점
	 *  - 사용자가 프로그램을 실행하면 가장 먼저 main() 함수를 찾아서 실행한다
	 */
	public static void main(String[] args) {
		// 프로그램 시작하면 가장 먼저 도착하는 곳

		/*
		 * # System.out.println() 함수
		 * 
		 *  - ()안에 전달한 데이터를 콘솔 화면에 출력하는 함수
		 *  
		 * # 콘솔 
		 *  
		 *  - 글자만 나오는 CLI(Command Line Interface) 환경의 화면
		 *  - Eclipse에서는 테스트용으로 콘솔을 제공해준다
		 *  - 우리가 만든 프로그램은 실제 콘솔에서도 동일하게 동작한다
		 *  - 제작한 소스코드(.java)의 컴파일 결과(.class)는 프로젝트 내부의 bin 폴더에 저장된다.
		 *  
		 *  ※ 세미콜론(;)
		 *  
		 *  - 한 명령어가 끝났음을 컴파일러에게 알리는 문자
		 */
		System.out.println(123456789 + 1000); //	Ctrl + F11
		for(int i = 0; i < 4; i++) {
			pPrint("Hello, world!");
		}						
		pBox(1);
		/*
		 * # 자바의 데이터 종류(리터럴의 종류)
		 * 
		 *  1. "" 사이에 적는 것 : 문자열(String), 문자를 여러개 적을 수 있는 타입
		 *  2. '' 사이에 적는 것 : 문자(Character),하나의 문자를 의미하는 데이터 타입
		 *  3. 그냥 숫자를 적는 것 : 정수(Integer), 계산이 가능
		 *  4. 소수를 적는 것 : 실수(Float,Double), 계산이 가능
		 *  5. true/false : 참/거짓(Boolean)
		 */
		System.out.println("Hello");
		System.out.println('H');
		System.out.println(100 * 13);
		System.out.println(123.45678 / 100);
		System.out.println(true);
		System.out.println(false);

		//문자열과 다른 타입을 +하면 이어붙인다
		System.out.println("Hello " + 1234);
		System.out.println("Hello " + ":ABC");
		System.out.println("Hello " + true);
		System.out.println("Hello " + 123.1234);

		/*
		 *  #들여쓰기 (Tab)
		 *  
		 *   - 코드 블록이 {} 내부에 있다면 한 단계 더 들여써야 한다
		 *   - 전체적인 코드의 형대를 알아보기 쉬워진다
		 *   - Tab : 들여쓰기
		 *   - Shift + Tab : 거꾸로 들여쓰기
		 *   - 블럭지정 후 Ctrl + I : 자동 들여쓰기
		 */

		//프로그램의 마지막 부분
	}

	static void pPrint(String sVal) {
		System.out.println(sVal);
	}


	static void pBox(int iVal)  {
		
		for(int i=0;i<iVal;i++) {
			System.out.println();
			System.out.println("┌────────────────────┐");

			if(i > 9) {
				System.out.println("│"+i+". Hello, world!   │");
			}else {
				System.out.println("│"+i+". Hello, world!    │");
			}

			System.out.println("├────────────────────┤");
			System.out.println("├────────────────────┤");
			System.out.println("├────────────────────┤");
			System.out.println("└────────────────────┘");
			System.out.println();
		}
		
	}


}

