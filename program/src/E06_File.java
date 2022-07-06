import java.io.File;

public class E06_File {

	/*
	 * 	# java.io.File
	 * 
	 * 	 - ���� �ý��ۿ� ����� ���� �Ǵ� ���丮�� ������ ���� �� �ִ� Ŭ����
	 * 	 - �ν��Ͻ��� ����ִ� ������ ������ ���� �ý����� ���� ������ �� �ִ�
	 * 
	 */
	public static void main(String[] args) {
		
		File f1 = new File("files");
		File f2 = new File("files/abc.txt");
		File f3 = new File("notExistFile.abcd");	// �������� �ʴ� ���ϵ� ���� ��ü�� ���� �� ����
		
		System.out.println("f1�� ������: " + f1.getAbsolutePath());
		System.out.println("f2�� ������: " + f2.getAbsolutePath());
		System.out.println("f3�� ������: " + f3.getAbsolutePath());
		
		// canRead(), canWrite(), canExecude() : �ش� ������ ���� Ȯ�� �޼���
		System.out.println(f1.canRead());
		System.out.println(f2.canRead());
		System.out.println(f3.canRead());		
		
		// �ش� ��ΰ� ���� ��� ���� Ȯ���ϴ� �޼���		
		File f4 = new File("D:\\JavaAWS\\java-workspace\\javaBasic\\files");
		System.out.println("�����δ�?" + f1.isAbsolute());
		System.out.println("�����δ�?" + f4.isAbsolute());
		
		// ���丮, ����, ���� ���� Ȯ�� �޼���
		System.out.println("���丮(����)��?" + f1.isDirectory());
		System.out.println("f1�� �����ΰ���?" + f1.isFile());
		System.out.println("f2�� �����ΰ���?" + f2.isFile());
		System.out.println("f3�� �����ΰ���?" + f3.isFile());
		System.out.println("f4�� �����ΰ���?" + f4.isFile());		
		System.out.println("�����ϴ�?" + f1.exists());
		System.out.println("�����ϴ�?" + f3.exists());
		
		// mkdir() : �ش� ��θ� ���� ���丮�� ���� ����(���� ���丮�� �������� ������ ���� �Ұ���)
		File dir1 = new File("files2");
		
//		System.out.println(dir1.mkdir() ? 
//				"files2 ���丮 ���� ����" : "files2 ���丮 ���� ����");
		
		// mkdis() : ���� ���丮���� �������� �ʾƵ� ��λ� ��� ���丮�� ����
		File dir2 = new File("test/test/dir2");
//		System.out.println(dir2.mkdirs() ? 
//				"dir2 ���丮 ���� ����" : "dir2 ���丮 ���� ����");
	}
}





















