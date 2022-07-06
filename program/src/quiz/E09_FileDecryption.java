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
	 	# ��ȣȭ �� frankenstein_encrypted.txt�� ����� ������ �����Ͻÿ�
	 	
	 	 1. ��ȣ�� ������ ó�� 10���� 1 ~ 25������ Ű�� ��ȭ�� ����� ��� �ֿܼ� ���
	 	 
	 	 2. ����ڴ� �ش� ����� ���� �˸��� Ű�� �����Ͽ� ��ȣȭ�� ������ �� ����
	 	 
	 	 3. ��ȣȭ ����� frankenstein_decrypted.txt�� ����
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
		
		// AutoClose �������̽��� ������ Ŭ�������� try()���� ����� �� �ִ�
		// try���� ()�� ������ ��ü���� try���� �����鼭 �ڵ����� close()�� �����Ѵ� 
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
		// 10�پ� �����ֱ�
		sample();
		
		// ��� ���� �����ϱ�(BufferedReader�� �̿��� �ַܼκ��� �Է¹ޱ�)
		// InputStreamReader : byte������ InputStream�� char ������ Reader�� �������ϴ� Ŭ����
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
