import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E10_PrimitiveStream {
	
	/*
	 * 	# DataOutputStream, DataInputStream
	 * 
	 * 	 - �⺻�� Ÿ�� �����͸� �ս��� ��Ʈ������ �����ϱ� ���� Ŭ����
	 * 	 - Java�� �⺻�� Ÿ���̱� ������ Java �̿��� �ξ���� �ش� �����͸� Ȱ���� �� ����
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		File dataFile = new File("files/primitive.txt");
		try(
				FileOutputStream fout = new FileOutputStream(dataFile);
				DataOutputStream out = new DataOutputStream(fout);
				){
			
			out.writeBoolean(true);
			out.writeDouble(123.456789);
			out.writeFloat(123.456f);
			out.writeInt(123);
			out.writeUTF("����");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(
				FileInputStream fin = new FileInputStream(dataFile);
				DataInputStream in = new DataInputStream(fin);
				){
			
			//���� ������� ������ �Ѵ�.
			System.out.println(in.readBoolean());
			System.out.println(in.readDouble());
			System.out.println(in.readFloat());
			System.out.println(in.readInt());
			System.out.println(in.readUTF());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}















