package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class E06_Copy2 {
	/*
	 *		files ���� ������ ��� ������
	 *		files_copy ������ ������ ������ 	
	 * 
	 */
	
	public void copy(File src, File dst) {
		try {
			// ���� ���ۿ��� ���
			//FileReader in = new FileReader(src);
			//FileWriter out =  new FileWriter(dst);
			
			//char[] buffer = new char[1024];
			
			// ���ڰ� �ƴϾ ���� �� ��
			FileInputStream in =  new FileInputStream(src);
			FileOutputStream out = new FileOutputStream(dst);
			
			byte[] buffer = new byte[1024];
			
			int len;
			while((len = in.read(buffer)) != -1) {
				out.write(buffer, 0, len);
			}
			
			out.close();
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public File getCopyFile(File src) {
		String path = src.getPath();
		
		//path.indexOf(File.separator);
		int sep = path.indexOf("\\");
		
		String before = path.substring(0, sep) + "_copy";
		String after = path.substring(sep);
				
		return new File(before + after);
	}
	
	void addAllPathToMap(Map<File, File> map, File dir) {
		
		for(File f: dir.listFiles()) {
			if(f.isDirectory()) {
				addAllPathToMap(map, f);
			}else {
				map.put(f, getCopyFile(f));
			}
		}
		
	}
	
	public HashMap<File, File> findAllPath(File dir) {
		HashMap<File, File> copyMap = new HashMap<>();
		
		if(!dir.isDirectory()) {
			System.out.println("���丮�� Ž���� �� �ֽ��ϴ�.");
			return null;
		}
		
		addAllPathToMap(copyMap, dir);
		
		return copyMap;
		
	}
	
	public void copyAll(File dir) {		
		HashMap<File, File> foundMap = findAllPath(dir);		
		for(File src : foundMap.keySet()) {
			File dst = foundMap.get(src);			
			if(!dst.getParentFile().exists()) {
				dst.getParentFile().mkdirs();
			}
			copy(src, dst);			
		}		
	}
	
	public static void main(String[] args) {
		E06_Copy2 copy = new E06_Copy2();
		copy.copyAll(new File("files"));
	}

}
