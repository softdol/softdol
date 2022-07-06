import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;

public class E05_FileInputStream {

	public static void main(String[] args) {
		
		// ���Ϸ� ���� �����͸� �о���̴� ���
		try {
			//FileInputStream in = new FileInputStream("files/abc.txt");
			File f = new File("files/Ot.txt");			
			FileInputStream in = new FileInputStream(f);
			
			// read() : �����͸� �� ����Ʈ�� �д´�.
			//			�� ����Ʈ�� �б� ������ �ѱ� ���� 2����Ʈ ���ڷ� ���� ��ġ�Ⱑ ��ƴ�
//			int ch = -1;
//			while((ch = in.read())!=-1) {
//				System.out.print((char)ch);
//			}
			
			// read(byte[]) : ������ byte[]�� �����͸� ����ش�. ���� ���̸� ��ȯ�Ѵ�.
			// 				  ������ ������ �� ������ -1�� ��ȯ�Ѵ�.
			byte[] buffer = new byte[100];
			
			int len = -1;
			
			while((len = in.read(buffer)) != -1) {
				//System.out.print(new String(buffer,0,len, Charset.forName("UTF-8")));
				System.out.print(new String(buffer,0,len));
			}
			
			// readAllBytes() : �ѹ��� ������ ��� �����͸� byte[]�� �д´�
//			byte[] allBytes = in.readAllBytes();			
			
			// byte ������ �������� �ִ� ���ڿ��� ��ĥ �� charset���� �ٸ� ������� ��ģ��.
			// (�� �������� ���ڰ� ���� �� �ִ�)
			//String fileDateStr = new String(allBytes, Charset.forName("UTF-8"));
//			String fileDateStr = new String(allBytes);
//			
//			System.out.println(fileDateStr);
			
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
