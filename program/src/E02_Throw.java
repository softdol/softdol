import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;

public class E02_Throw {

	/*
	 *	# throw
	 *
	 * 	 - ���ϴ� ���ܸ� �߻���Ų��
	 * 	 - ���� ���� ����� ������ ����ϴ� ������� ���� ó���� �ñ� �� �յ�
	 * 
	 * 	# throws
	 * 
	 * 	 - �ش� �޼��忡�� ���ܰ� �߻����� �˸��� ����
	 * 	 - �ش� �޼��� ���ο��� ���ܰ� �߻��� �� �߰��� �� �ִ�
	 * 	 - �ش� �޼��� ������ ���ܸ� ���� ó������ �ʰ� �޼��带 ȣ���ϴ� ���α׷��ӿ��� �����Ѵ�
	 * 
	 * 	# �� ó������ �ʾƵ� �Ǵ� ����(RuntimeException)
	 * 
	 * 	 - RuntimeException Ŭ������ ��ӹ��� ���ܵ��� �ݵ�� ó������ �ʾƵ� �Ǵ� �����̴�.
	 * 	 - ���� ó���� ���� �ʾƵ� ������ ����(������)�� �߻����� �ʴ´�.
	 * 
	 * 	# �ݵ�� ó���ؾ��ϴ� ���� (Exception)
	 * 
	 * 	 - Exception ũ������ ��ӹ��� ���ܵ��� �ݵ�� ó���ؾ� �ϴ� ���ܰ� �ȴ�
	 * 	 - ���� ó���� ���� ������ ������ �Ұ����ϴ�
	 * 	 - �߻��� ��ļ� �ٷ� ó���ϰ� ���� ���� ��� throw�� ����Ͽ� 
	 * 	   �ش� �޼��带 ȣ���ϴ� ������ ���� ó���� ���ѱ� �� �ִ�
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
			System.out.println("�߻��� ������ �޼����� \"" + e.getMessage() + "\" �Դϴ�.");
			System.out.println("���� �߻� ������ ���� ����:");
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
