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
	 * 	 - 기본형 타입 데이터를 손쉽게 스트림으로 전송하기 위한 클래스
	 * 	 - Java의 기본형 타입이기 때문에 Java 이외의 인어에서는 해당 데이터를 활용할 수 없다
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
			out.writeUTF("大信");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(
				FileInputStream fin = new FileInputStream(dataFile);
				DataInputStream in = new DataInputStream(fin);
				){
			
			//썻던 순서대로 꺼내야 한다.
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















