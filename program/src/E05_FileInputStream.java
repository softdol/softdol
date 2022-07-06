import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;

public class E05_FileInputStream {

	public static void main(String[] args) {
		
		// 파일로 부터 데이터를 읽어들이는 통로
		try {
			//FileInputStream in = new FileInputStream("files/abc.txt");
			File f = new File("files/Ot.txt");			
			FileInputStream in = new FileInputStream(f);
			
			// read() : 데이터를 한 바이트씩 읽는다.
			//			한 바이트씩 읽기 떄문에 한글 등의 2바이트 문자로 직접 합치기가 어렵다
//			int ch = -1;
//			while((ch = in.read())!=-1) {
//				System.out.print((char)ch);
//			}
			
			// read(byte[]) : 전달한 byte[]에 데이터를 담아준다. 읽은 길이를 반환한다.
			// 				  파일을 끝까지 다 읽으면 -1을 반환한다.
			byte[] buffer = new byte[100];
			
			int len = -1;
			
			while((len = in.read(buffer)) != -1) {
				//System.out.print(new String(buffer,0,len, Charset.forName("UTF-8")));
				System.out.print(new String(buffer,0,len));
			}
			
			// readAllBytes() : 한번에 파일의 모든 데이터를 byte[]로 읽는다
//			byte[] allBytes = in.readAllBytes();			
			
			// byte 단위로 나누어져 있던 문자열을 합칠 때 charset마다 다른 방식으로 합친다.
			// (이 과정에서 문자가 깨질 수 있다)
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
