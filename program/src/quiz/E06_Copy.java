package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class E06_Copy {
	/*
	 * files 폴더 내부의 모든 내용을 files_copy 폴더로 복사해 보세요
	 * 
	 */

	public static void createDir(String orgDirName, String copyDirName) {

		File file = new File(orgDirName);

		for (String s : file.list()) {
			File chkDir = new File(file.getPath() + "\\" + s);
			if (chkDir.isDirectory()) {
				File copy = new File(copyDirName + "\\" + s);
				copy.mkdir();
				createDir(chkDir.getPath(), copy.getPath());
			}
		}
	}

	public static void copyFile(String orgDirName, String copyDirName) {

		File file = new File(orgDirName);

		for (String s : file.list()) {
			File chkFile = new File(file.getPath() + "\\" + s);
			if (chkFile.isFile()) {
				try {
					FileInputStream in = new FileInputStream(file.getPath() + "\\" + s);
					FileOutputStream out = new FileOutputStream(copyDirName + "\\" + s);

					int len;
					byte[] buffer = new byte[1024];
					while ((len = in.read(buffer)) != -1) {
						out.write(buffer, 0, len);
					}

					out.close();
					in.close();

					System.out.println(copyDirName + "\\" + s + "복사 완료");
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else if (chkFile.isDirectory()) {
				copyFile(chkFile.getPath(), copyDirName + "\\" + s);
			}
		}
	}

	public static void main(String[] args) {
		File orgFile = new File("files");
		File copyFile = new File("files_copy");
		copyFile.mkdir();
		createDir(orgFile.getPath(), copyFile.getPath());
		copyFile(orgFile.getPath(), copyFile.getPath());
	}
}
