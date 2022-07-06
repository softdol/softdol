import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class E07_CharacterStream {
	/*
	 * 	# InputStream/OutputStream
	 * 
	 * 	 - byte ������ �����͸� ��/����ϴ� Ŭ����
	 * 	 - �����ϴ�
	 * 
	 * 	# Reader/Writer
	 * 
	 * 	 - char ������ �����͸� ��/����ϴ� Ŭ����
	 * 	 - 2byte�� �̷���� ���ڵ� ������ �ʰ� ��/��� �� �� �ִ�
	 * 
	 * 	# CharSet
	 * 
	 * 	 - ASCII�ڵ� ������ ��� ���ڼ��� ���������� �� ������ ���� �ڵ�� �� ȸ�縶�� �ٸ���
	 * 	 - MS994 	: ��������� ����ϴ� ���ڼ�
	 * 	 - EUC-KR	: ��Ŭ������ �⺻������ ����ϴ� �ѱ��� ���ڼ�. ��ȿ�� �ѱ�� ����ִ�.(��� x)
	 * 	 - UTF-8	: ���� ǥ���� �Ǵ� ���ڼ�. ���� ���ڸ� �����ϰ� �־ �뷮�� ũ��
	 * 
	 */
	public static void main(String[] args) {
		//�� �ٸ� ���ڼ����� ���ڿ��� byte�� ���� ���
		System.out.println(Arrays.toString("�ȳ��ϼ���".getBytes(Charset.forName("MS949"))));
		System.out.println(Arrays.toString("�ȳ��ϼ���".getBytes(Charset.forName("EUC-KR"))));
		System.out.println(Arrays.toString("�ȳ��ϼ���".getBytes(Charset.forName("UTF-8"))));
		
		File f = new File("files/filewrite.abc");
		
		try {
			// append = true�� ������ �߰�			
			// append = false (�⺻��)�� ������ �����
			FileWriter out = new FileWriter(f, Charset.forName("UTF-8"), false);
			
			out.write('��');
			out.write('��');
			out.write('��');
			out.write('��');
			out.write('\n');
			
			out.write("�ѹ��� ���� ���ھ� �ų��� �� �� �ִ�.\n"
					+ "byte[]�� �ٲ���ϴ� �͵� �𸣰� �� �� �ִ�.");
			
			char[] arr = "\nABCDEFGH".toCharArray();
			
			out.write(arr);
			
			// off: ������ġ, len: �� ���ڸ� �������
			out.write(arr, 5, 3);
			
			for(int i = 0; i < 3 ; i++) {
				out.append("\n /)/)\n");
				out.append("(  ..)\n");
				out.append("(   >#\n");
			}
			
			out.write(arr);
			out.write(arr);
			out.write(arr);
			
			out.close();
			
			System.out.println("���� ���� �Ϸ�.");
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		// ----------------------------------------------- //
		
		System.out.println("// ----------------------------------------------- //");
		System.out.println("�б� ����");
		
		try {
			FileReader in = new FileReader(f, Charset.forName("UTF-8"));
			
			char[] buffer = new char[100];
			
			//in.read(buffer);
			int len = in.read(buffer);
			
			//while((len = in.read(buffer)) != -1) {
				//System.out.println("[[[[[" + len);
				System.out.println(new String(buffer,0,len));
				//System.out.print(new String(buffer,0,len));
				//System.out.println(new String(buffer));
			//}
			
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}





















