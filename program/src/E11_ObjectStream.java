import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class E11_ObjectStream {
	
	/*
	 * 	# ObjectInputStream, ObjectOutputStream
	 * 
	 * 	 - 참조형 데이터(인스턴스)들을 전송할 수 있는 스트림
	 * 	 - Java에서만 해석 될 수 있다는 단점이 있다
	 * 	 - Serializable 인터페이스가 구현되어 있는 클래스만 전송할 수 있다
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		File objectFile = new File("files/object.txt");
		
		try(
				FileOutputStream fout = new FileOutputStream(objectFile);
				ObjectOutputStream out = new ObjectOutputStream(fout);
		) {
			out.writeObject(new Cup("Red", 600));
			out.writeObject(new Cup("Blue", 600));
			out.writeObject(new Cup("Green", 650));
			out.writeObject(new Cup("Yellow", 700));
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		try(
				FileInputStream fin = new FileInputStream(objectFile);
				ObjectInputStream in = new ObjectInputStream(fin);
		){
			Object o1 = in.readObject();
			Object o2 = in.readObject();
			Object o3 = in.readObject();
			Object o4 = in.readObject();
			
			System.out.println(o1);
			System.out.println(o2);
			System.out.println(o3);			
			System.out.println(o4);
			
			// Object 타입으로 꺼내지기 때문에 사용하려면 다운캐스팅이 필요함
			Cup c1 = (Cup)o1;
			
			System.out.println(c1.capacity);
			System.out.println(c1.color);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}

class Cup implements Serializable{
	// 데이터 인코딩 또는 디코딩에 체크되는 ID
	private static final long serialVersionUID = 899843548949848L;
	
	String color;
	int capacity;
	
	public Cup(String color, int capacity) {
		this.color = color;
		this.capacity = capacity;
	}
	
	@Override
	public String toString() {
		return String.format("%s[%d]", color, capacity);
	}
	
}