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
	 * 	 - �����͵��� ���ϰ� ����� �� �ִ� �޼������ �߰��� ��Ʈ�� Ŭ����
	 * 	 - PrintStream���� OutputStream�� ����� ����� �� �ֲ�
	 * 	   PrintWriter���� Writer�� ������ ����� �� �ֵ�
	 * 	 - printf(), println() ���� ���� �޼������ �����Ǿ� �ִ�
	 * 
	 * 	# å���� �߰��� �����ϸ� ���� �͵�(�̰��� �ڹٴ�)
	 * 
	 * 	 - 678p ����
	 * 	 - 782p ��Ʈ���� ���� ó��
	 * 	 - 576p ��Ƽ ������
	 * 	 - 1028p ���� ��Ʈ��, ��Ʈ��ũ ����, TCP ��Ʈ��ŷ, UDP ��Ʈ��ŷ 
	 * 
	 */
	
	public static void main(String[] args) {
		
		//PrintStream out = System.out;
		
		//out.println(" /)/)");
		
		// ����: reporters ���� ������ ���ڵ� �� �������� 10���� �����Ͽ� A01 ������ ���Ϸ� ��������.
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
			out1.println("\t\t\t\t\t\t\t#### ���� ���� ####");
			out1.println("============================================================================");		
			out1.println("�̸�\t\t�Ź���\t\t\t�о�\t\t\t\t\t\t�̸���");
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
			
			System.out.println("���� ���� ������ ������Ʈ ����ϴ�.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
