import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class E01_Exception {
	
	/*
	 * 	# 예외 (Exception)
	 * 
	 * 	 - 우리가 에러라고 생각했던 빨간 글씨들을 예외라고 부른다
	 * 	 - 자바의 문법을 틀리는 것은 예외가 아니라 컴파일 에러(자바 문법 오류)라고 부른다
	 * 	 - 프로그래머는 발생할 예외를 미리 예픅하고 대비해 둘 수 있다(예외 처리)
	 *	 - 예외 발생 시 기본 동작은 프로그램의 강제 종료이다
	 *
	 *	# 예외 처리
	 *
	 *	 - 예외가 발생할 가능성이 있는 코드를 try문 내부에 포함시킨다
	 *	 - try문 내부에서 예외가 발생하지 않으면 모두 정상 실행된다
	 *	 - try문 내부에서 예외가 발생하면 즉시 try문 실행을 중단하고 발생한 예외에 해당하는
	 *		catch문으로 넘어가게 된다
	 * 	 - catch문은 여러번 쓸 수 있다
	 * 	 - 예외 발생시 
	 */
	public static void main(String[] args) {
		int[] arr = new int[10];
		try {
			for(int i = 0; i < arr.length; i++) {
				arr[i] = i;
			}
			arr[8] = 123;
			arr[10] = 123;
			arr[9] = 123;
			System.out.println("try문을 완전히 실행했습니다!");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 범위를 벗어났습니다.");
			
			//System.exit(0);
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Hello!");
		
		// 예외 처리로 스캐너 사용하기
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		try {
			System.out.print("반드시 숫자를 입력해주세요 >> ");
			num = sc.nextInt();
			num = 10 / num;
			
		}catch(InputMismatchException e) {
			System.out.println("반드시 숫자를 입력하라고 했을텐데?");
			
			// 어디서 에러가 발생했는지 추적하는 메서드
			e.printStackTrace();
			num = -1;
		}catch(ArithmeticException e) {
			System.out.println("num에는 0을 넣어서는 안됩니다..");
			num = -2;
		}catch(Exception e) {
			System.out.println("Exception 클래스는 모든 예외의 부모이기 때문에"
					+ "나머지 모든 예외를 한번에 처리할 수 있습니다.");
			num = -3;
		}finally {
			System.out.println(" /)/)");
			System.out.println("(   ..)");
			System.out.println("(    >$");
			System.out.println("이 토끼는 예외가 발생하던 안하던 무조건 등장 합니다.");
		}
		
		System.out.println("입력하신 숫자는 : " + num);
		
		sc.close();
	}

}


















