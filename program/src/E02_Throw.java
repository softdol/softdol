import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;

public class E02_Throw {

	/*
	 *	# throw
	 *
	 * 	 - 원하는 예외를 발생시킨다
	 * 	 - 내가 만든 기능을 가져다 사용하는 사람에게 예외 처리를 맡길 수 잇따
	 * 
	 * 	# throws
	 * 
	 * 	 - 해당 메서드에서 예외가 발생함을 알리는 문법
	 * 	 - 해당 메서드 내부에서 예외가 발생할 때 추가할 수 있다
	 * 	 - 해당 메서드 내부의 예외를 직접 처리하지 않고 메서드를 호출하는 프로그래머에게 전가한다
	 * 
	 * 	# 꼭 처리하지 않아도 되는 예외(RuntimeException)
	 * 
	 * 	 - RuntimeException 클래스를 상속받은 예외들은 반드시 처리하지 않아도 되는 예외이다.
	 * 	 - 예외 처리를 하지 않아도 컴파일 에러(빨간줄)가 발생하지 않는다.
	 * 
	 * 	# 반드시 처리해야하는 예외 (Exception)
	 * 
	 * 	 - Exception 크랠스를 상속받은 예외들은 반드시 처리해야 하는 예외가 된다
	 * 	 - 예외 처리를 하지 않으면 컴파일 불가능하다
	 * 	 - 발생한 고셍서 바로 처리하고 싶지 않은 경우 throw로 경고하여 
	 * 	   해당 메서드를 호출하는 곳으로 예외 처리를 떠넘길 수 있다
	 */
	public static void method4() throws IOException, ClassNotFoundException
	, UnsupportedAudioFileException, ArrayIndexOutOfBoundsException, ArithmeticException {
		switch((int)Math.random() * 5) {
		case 0 :
			throw new ArrayIndexOutOfBoundsException();			
		case 1 :
			throw new ArithmeticException();			
		case 2 :
			throw new IOException();			
		case 3 :			
			throw new ClassNotFoundException();
		case 4 :			
			throw new UnsupportedAudioFileException();
		}
	}
	
	public static void method3() {
		throw new NullPointerException();
	}
	
	public static void method2() {
		method3();
	}

	public static void method1() {
		method2();
	}
	
	public static void main(String[] args) {
		
		try {
			method1();
		}catch(Exception e) {
			System.out.println("발생한 예외의 메세지는 \"" + e.getMessage() + "\" 입니다.");
			System.out.println("예외 발생 시점의 스택 정보:");
			e.printStackTrace();
		}
		
		try {
			method4();
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Welcome!!");
		
		
	}
}
