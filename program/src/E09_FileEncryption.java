import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E09_FileEncryption {

	/*
	 	# ���� ��ȣ
	 	
	 	 - ���ĺ��� ������ �Ÿ���ŭ �о �ٸ� ���ĺ����� ġȯ�ϴ� ��ȣ
	 	 - Ű �� ��ŭ ������ ��� ���ĺ��� ���������� �о��ָ� ��ȣȭ�� �ǰ� 
	 	   ��ȣ������ Ű����ŭ ���ĺ��� �������� �о��ָ� ��ȣȭ�� �ȴ� 
	 	 
	 	 	ABCDEFGHIJKLMNOPQRSTUVWXYZ
	 	 
	 	 			key�� 3�϶�
	 	 	hello 	--------->	 khoor
	 	 	
	 	
	 	# files/frankenstein.txt�� 
	 	  ���ϴ� Ű������ ��ȣȭ�� ���� frankenstein_encrypted.txt�� �����غ����� 
	 	  (���ĺ��� ��ȣȭ�ǰ� �� ���� ���ڵ��� ��� ����)
	*/
	static class NotCaesarKeyException extends RuntimeException {
		public NotCaesarKeyException(String msg) {
			super(msg);
		}
	}
	
	final static char[] UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	final static char[] LOWERCASE = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	
	// final static String CHARSET = UPPERCASE + LOWERCASE;
	
	public static String encryption(String str, int key) {
		StringBuilder builder = new StringBuilder();
		char[] chs = str.toCharArray();
		
		for (char ch : chs) {			
			if (Character.isUpperCase(ch)) {
				int index = ch - 'A';				
				builder.append(UPPERCASE[(index + key) % 26]);
			} else if (Character.isLowerCase(ch)) {
				int index = ch - 'a';
				builder.append(LOWERCASE[(index + key) % 26]);
			} else {
				builder.append(ch);
			}						
		}		
		builder.append('\n');
		
		return builder.toString();
	}
	
	public static void encryptFile(File text, int key) {
		if (key < 0 || key > 26) {
			throw new NotCaesarKeyException("Caesar key is 1 <= K < 26");
		}
		
		String[] path = text.getPath().split("\\.");		
		path[0] = path[0] + "_encrypted";
		
		File crypto = new File(String.join(".", path));
		
		FileReader fin 		= null;
		BufferedReader in 	= null;
		FileWriter fout 	= null;
		BufferedWriter out 	= null;
		
		try {
			fin	 = new FileReader(text);
			in 	 = new BufferedReader(fin);
			fout = new FileWriter(crypto);
			out  = new BufferedWriter(fout);
			
			String line;			
			while ((line = in.readLine()) != null) {
				out.write(encryption(line, key));
			}			
		} catch (FileNotFoundException e) {		
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
				fout.close();
				in.close();
				fin.close();
			} catch (IOException e) {}
		}
	}
	
	public static void main(String[] args) {
		encryptFile(new File("files/frankenstein.txt"), 3);
	}
	
}













