import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E09_FileEncryption {

	/*
	 	# 시저 암호
	 	
	 	 - 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 치환하는 암호
	 	 - 키 값 만큼 원문의 모든 알파벳을 오른쪽으로 밀어주면 암호화가 되고 
	 	   암호문에서 키값만큼 알파벳을 왼쪽으로 밀어주면 복호화가 된다 
	 	 
	 	 	ABCDEFGHIJKLMNOPQRSTUVWXYZ
	 	 
	 	 			key가 3일때
	 	 	hello 	--------->	 khoor
	 	 	
	 	
	 	# files/frankenstein.txt를 
	 	  원하는 키값으로 암호화한 파일 frankenstein_encrypted.txt을 생성해보세요 
	 	  (알파벳만 암호화되고 그 외의 문자들은 모두 무시)
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













