import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E04_JavaIO {

	/*
	 * 	# Java I/O (Input/Output)
	 * 
	 * 	 - �ڹٴ� ��Ʈ���̶�� ������ �̿��� ���α׷��� ��/����� �ٷ��
	 * 	 - ���α׷����� ������ ��� �����͵��� �Է�(Input)�̶�� �θ���
	 * 	 - ���α׷����� ���Ǿ� ������ ��� �����͵��� ���(Output)�̶�� �θ���
	 * 
	 * 	# Stream
	 * 
	 * 	 - �����͵��� ���� ���� ���
	 * 	 - �����͵��� ���α׷����� ������ ��θ� InputStream�̶�� �θ���
	 * 	 - �����͵��� ���α׷����� �������� ������ ��θ� OutputStream�̶�� �θ���
	 * 	 - �����Ͱ� Stream�� �������� ���ؼ��� �ش� �����͸� byteŸ������ ��ȯ���Ѿ� �Ѵ�
	 * 		(�ڵ����� byteŸ������ �������ִ� Ŭ�����鵵 �ִ�)
	 */
	
	public static void main(String[] args) {
		
		try {
			FileOutputStream out = new FileOutputStream("files/abc.txt");			
			
			out.write(65);
			out.write(66);
			out.write(67);
			out.write('\n');
			
			// str.getBytes() : �ش� ���ڿ��� ���ۿ� ����Ʈ �迭�� ��ȯ�ϴ� �޼���
			// out.write("�ȳ��ϼ��� �ݰ����ϴ�~~~~~~".getBytes());
			
			// �� �� ��δ� �ݵ�� �ݾ���� �Ѵ�(���α׷� ������ ���� �ݾƾ����� �������� ���Ѵ�)
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("����Ϸ�");
		
	}
}
