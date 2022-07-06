package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;

import myobj.rps.Shape;

public class E07_SvaeGame2 {
	/*
	 * 	��ǻ�Ϳ� ������ ���������� ������ �ϳ� �����, ���� ����� ������ ���Ͽ� �����غ�����.
	 *  ������ �ٽ� �����ϸ� ���� ������ �״�� �ݿ��ǵ��� ����� ������.
	 * 
	 */
	
	public static void main(String[] args) {
		File saveFile = new File("files/save.rps");
		File logFile = new File("files/rps.log");
		
		// ���Ϸ� �����Ѵٴ� �� == ��ǻ�� �ϵ��ũ�� �����͸� ����� ��
		int win = 0, draw = 0, lose = 0;
		
		try {
			FileReader in = new FileReader(saveFile);
			
			char[] buffer = new char[50];
			
			int len = in.read(buffer);
			
			String data = new String(buffer, 0, len);
			
			String[] record = data.split("/");
			
			win = Integer.parseInt(record[0]);
			draw = Integer.parseInt(record[1]);
			lose = Integer.parseInt(record[2]);
			
			in.close();
			
		} catch (FileNotFoundException e1) {
			System.out.println("���̺� ������ ã�� �� ��� ó������ �����մϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter log = new FileWriter(logFile, true);
		
			for(int i = 0; i <10 ; i++) {
				Shape com = Shape.random();
				Shape user = Shape.random();
				
				log.write(String.format("��ǻ�� [%s] vs ���� [%s]�� ", com, user));
				
				switch (Shape.versus(com, user)){
					case 1:
						System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
						log.write("��ǻ�� �¸�!");
						lose++;
						break;
					case -1:
						System.out.println("������ �̰���ϴ�.");
						log.write("���� �¸�!");
						win++;
						break;
					case 0:
						System.out.println("�����ϴ�.");
						log.write("���º�!\t");
						draw++;
						break;
				}
				log.write("\t - " + LocalTime.now() + "\n");
			}
			
			log.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		} 
		
		try {
			FileWriter out = new FileWriter(saveFile);			
			out.append(String.format("%d/%d/%d", win,draw,lose));			
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.printf("%d�� %d�� %d�з� 10���� �������ϴ�.\n", win,draw,lose);
		System.out.println("������ �����մϴ�.");
		
	}
}
