import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E09_BufferedStream {

	/*
	 * # Buffer
	 * 
	 * - �����͸� �� ���� ������ �����ϴ� �ͺ��� ��Ƽ� �Ѳ����� �����ϴ� ����� �ξ� ó���ӵ��� ������ 
	 * - ���۰� �̸� ������ ��Ʈ��
	 * 	Ŭ�������� �տ� Buffered��� �̸��� �پ� �ִ� - BufferedInputStream, BufferedReader ...
	 */

	static File book = new File("files/frankenstein.txt");

	/** �� ���ھ� �б� */
	public static void read1() {
		FileReader in = null;
		try {
			in = new FileReader(book);

			int ch;
			while ((ch = in.read()) != -1) {
				System.out.print((char) ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
			}
		}
	}

	/** ���� ������� �б� (1024) */
	public static void read2() {

	}

	/** ���� ������� �б� (2048) */
	public static void read3() {

	}

	/** BufferedReader ����ϱ� */
	public static void read4() {
		FileReader fin = null;
		BufferedReader bin = null;
		try {
			fin = new FileReader(book);
			bin = new BufferedReader(fin);

			// BufferedReader���� readLine() �޼��尡 �־ �� �� �� �б� ���ϴ�
			String line;
			//int cnt = 0;
			//while ((line = bin.readLine()) != null && cnt < 10) {
			while ((line = bin.readLine()) != null) {
				System.out.println(line);
				//cnt++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// ���� �ֱٿ� ������ ������� �ݾ��� ��
				bin.close();
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		read4();
		System.out.println("\n�ɸ� �ð�: " + (System.currentTimeMillis() - start) + "ms");
	}
}
