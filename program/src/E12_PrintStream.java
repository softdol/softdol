import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.HashSet;

public class E12_PrintStream {
	
	/*
	 * 	# PrintStream, PrintWriter
	 * 
	 * 	 - 데이터들을 편리하게 출력할 수 있는 메서드들이 추가된 스트림 클래스
	 * 	 - PrintStream에는 OutputStream을 등록해 사용할 수 있꼬
	 * 	   PrintWriter에는 Writer를 동록해 사용할 수 있디
	 * 	 - printf(), println() 등의 편리한 메서드들이 구현되어 있다
	 * 
	 * 	# 책에서 추가로 공부하면 좋을 것들(이것이 자바다)
	 * 
	 * 	 - 678p 람다
	 * 	 - 782p 스트림과 병렬 처리
	 * 	 - 576p 멀티 스레드
	 * 	 - 1028p 보조 스트림, 네트워크 기초, TCP 네트워킹, UDP 네트워킹 
	 * 
	 */
	
	public static void main(String[] args) {
		
		//PrintStream out = System.out;
		
		//out.println(" /)/)");
		
		// 연습: reporters 폴더 내부의 기자들 중 랜덤으로 10명을 선택하여 A01 형식의 파일로 만들어보세요.
		HashSet<Integer> rndNum = new HashSet<>();
		
		File fileDir = new File("files/reporters");		
		File fileRndDir = new File("files/reporters/randums");
		
		if(!fileRndDir.exists()) {
			fileRndDir.mkdir();
		}
		
		File[] rndFileList = new File[fileDir.listFiles().length];
		int i = 0;
		for(File f : fileDir.listFiles()) {
			rndFileList[i++] = f;
		}		
		
		while(rndNum.size() < 10) {
			rndNum.add((int)(Math.random() * fileDir.listFiles().length));
		}
		try(
				FileOutputStream fout = new FileOutputStream(fileRndDir + "\\randomlist.txt");
				PrintStream sout = new PrintStream(fout);
				PrintWriter out1 = new PrintWriter(sout); 
		){
			out1.println("\t\t\t\t\t\t\t#### 기자 정보 ####");
			out1.println("============================================================================");		
			out1.println("이름\t\t신문사\t\t\t분야\t\t\t\t\t\t이메일");
			out1.println("============================================================================");
			
			for(int idx : rndNum) {
				File rndFile = rndFileList[idx];
				
				try(
						FileInputStream fin = new FileInputStream(rndFile);					
						DataInputStream in = new DataInputStream(fin);
				){
					out1.printf("%3s\t%-8s\t\t%-15s\t\t%s\n",in.readUTF(), in.readUTF(), in.readUTF(), in.readUTF());
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}			
			out1.println("----------------------------------------------------------------------------");
			
			System.out.println("랜덤 기자 정보가 업데이트 됬습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
