import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E04_JavaIO {

	/*
	 * 	# Java I/O (Input/Output)
	 * 
	 * 	 - 자바는 스트림이라는 개념을 이용해 프로그램의 입/출력을 다룬다
	 * 	 - 프로그램으로 들어오는 모든 데이터들을 입력(Input)이라고 부른다
	 * 	 - 프로그램에서 계산되어 나가는 모든 데이터들을 출력(Output)이라고 부른다
	 * 
	 * 	# Stream
	 * 
	 * 	 - 데이터들이 오고 가는 통로
	 * 	 - 데이터들이 프로그램으로 들어오는 통로를 InputStream이라고 부른다
	 * 	 - 데이터들이 프로그램에서 목적지로 나가는 통로를 OutputStream이라고 부른다
	 * 	 - 데이터가 Stream을 지나가기 위해서는 해당 데이터를 byte타입으로 변환시켜야 한다
	 * 		(자동으로 byte타입으로 분해해주는 클래스들도 있다)
	 */
	
	public static void main(String[] args) {
		
		try {
			FileOutputStream out = new FileOutputStream("files/abc.txt");			
			
			out.write(65);
			out.write(66);
			out.write(67);
			out.write('\n');
			
			// str.getBytes() : 해당 문자열을 전송용 바이트 배열로 변환하는 메서드
			// out.write("안녕하세요 반갑습니다~~~~~~".getBytes());
			
			// 다 쓴 통로는 반드시 닫아줘야 한다(프로그램 스스로 언제 닫아야할지 결정하지 못한다)
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("쓰기완료");
		
	}
}
