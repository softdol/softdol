package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class E09_FileDecryption {
	
	/*
	 	# 암호화 된 frankenstein_encrypted.txt를 사용해 다음을 구현하시오
	 	
	 	 1. 암호문 파일의 처음 10줄을 1 ~ 25까지의 키로 복화한 결과를 모두 콘솔에 출력
	 	 
	 	 2. 사용자는 해당 결과를 보고 알맞은 키를 선택하여 복호화를 진행할 수 있음
	 	 
	 	 3. 복호화 결과는 frankenstein_decrypted.txt에 저장
	*/
	
	final static String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	final static char[] UPPERCASE = ALPHABET.toCharArray();
	final static char[] LOWERCASE = ALPHABET.toLowerCase().toCharArray();
	
	File crypto;
	int sampleLength = 10;
	
	public E09_FileDecryption(File crypto) {
		this.crypto = crypto;
	}
	
	public E09_FileDecryption(File crypto, int sampleLength) {
		this.crypto = crypto;
		this.sampleLength = sampleLength;
	}
	
	public String decrypt(String str, int key) {
		
		StringBuilder builder = new StringBuilder();
		
		char[] chs = str.toCharArray();
		
		for(char ch : chs) {
			if(Character.isUpperCase(ch)) {
				int index = ch - 'A';
				builder.append(UPPERCASE[index - key < 0 ? 26 + (index - key) : index - key]);				
			}else if (Character.isLowerCase(ch)) {
				int index = ch - 'a';
				builder.append(LOWERCASE[index - key < 0 ? 26 + (index - key) : index - key]);
			}else {				
				builder.append(ch);
			}			
		}
		
		//System.out.println(builder);
		
		return builder.toString();
	}
	
	public void sample() {
		
		StringBuilder sampleBuilder = new StringBuilder();
		
		// AutoClose 인터페이스가 구현된 클래스들은 try()문을 사용할 수 있다
		// try옆의 ()에 선언한 객체들은 try문이 끝나면서 자동으로 close()를 실행한다 
		try(
				FileReader fin = new FileReader(crypto) ;
				BufferedReader in = new BufferedReader(fin);
		) {
			for(int i = 0; i < 10; i++) {
				sampleBuilder.append(in.readLine() + "\n");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(sampleBuilder);
		
		for(int key = 1; key < 26; ++key) {
			System.out.printf("[key %d]\n\n", key);
			System.out.println(decrypt(sampleBuilder.toString(), key));
		}
	}	
	
	public void bruteForce() {
		// 10줄씩 보여주기
		sample();
		
		// 골라서 파일 생성하기(BufferedReader를 이용해 콘솔로부터 입력받기)
		// InputStreamReader : byte단위인 InputStream을 char 단위인 Reader로 재포장하는 클래스
		try (	
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader in = new BufferedReader(isr);
		){
			while(true) {
				try {
					System.out.print("choose key > ");
					String userInput = in.readLine();					
					int key = Integer.parseInt(userInput);
					execute(key);
					break;
				}catch(NumberFormatException e) {
					System.out.println("Please input integer number.");
				}
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void execute(int key) {
		String[] path = crypto.getPath().split("\\.");		
		path[0] = path[0] + "_decrypted";		
		File decryptedFile = new File(String.join(".", path));		
		try(
				FileReader fin 		= new FileReader(crypto);
				BufferedReader in 	= new BufferedReader(fin);
				FileWriter fout 	= new FileWriter(decryptedFile);
				BufferedWriter bout = new BufferedWriter(fout);
				PrintWriter out 	= new PrintWriter(bout);
				
				){
			String line;
			while((line = in.readLine()) != null) {
				out.println(decrypt(line, key));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public static void main(String[] args) {		
		E09_FileDecryption dercyption = 
				new E09_FileDecryption(new File("files/frankenstein_encrypted.txt"));		
		dercyption.bruteForce();
	}

}
