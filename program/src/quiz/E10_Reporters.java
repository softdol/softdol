package quiz;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class E10_Reporters {
	
	/*
	 * 	reporters.txt에 저장된 기자들의 정보를 읽은 후
	 * 	각 기자들의 정보를 담고 있는 
	 * 	files/reporters/이름_신문사(분야).rep 파일로 재구성해 보세요 
	 */
	
	public static void main(String[] args) {
		
		File reportFile = new File("files/reporters.txt");
		File reportFileDir = new File("files/reporters");
		if(!reportFileDir.exists()) {
			reportFileDir.mkdir();
		}		
		
		try(
				FileReader fin = new FileReader(reportFile);
				BufferedReader in = new BufferedReader(fin); 
				){
			
			String info;
			while((info = in.readLine()) != null) {
				String[] infos = info.split("\t");				
				String fileName =  infos[2] + "_" + infos[0] 
									+ "(" + infos[1].replace('/', '／') + ").rep";
				String fileFullPath = reportFileDir + "\\" + fileName;
				
				try(
						FileOutputStream fout = new FileOutputStream(fileFullPath);
						DataOutputStream out = new DataOutputStream(fout);						
						FileInputStream finP = new FileInputStream(fileFullPath);
						DataInputStream inP = new DataInputStream(finP);						
						){					
						out.writeUTF(infos[2]);
						out.writeUTF(infos[0]);
						out.writeUTF(infos[1]);						
						out.writeUTF(infos[3]);
						
						viewFileInfo(fileFullPath, inP);
						
				}catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void viewFileInfo(String fileName, DataInputStream inP) {
		System.out.println(fileName);		
		try {
			String s;			
			//while((s = inP.readLine()) != null) {				
			while((s = inP.readUTF()) != null) {
				System.out.println(s);				
			}
		} catch (IOException e) {
			//e.printStackTrace();
		}
		System.out.println("-------------------------------------");
	}

}
