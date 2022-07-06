package quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

import myobj.RpsRockPaper.Computer;
import myobj.RpsRockPaper.Player;
import myobj.RpsRockPaper.RockCom;
import myobj.RpsRockPaper.RockPaperScissors;

public class E07_SvaeGame {
	/*
	 * 	��ǻ�Ϳ� ������ ���������� ������ �ϳ� �����, ���� ����� ������ ���Ͽ� �����غ�����.
	 *  ������ �ٽ� �����ϸ� ���� ������ �״�� �ݿ��ǵ��� ����� ������.
	 * 
	 */
	public static void main(String[] args) {
		
		RockPaperScissors rpsGame = new RockPaperScissors();
		Player p1 = new Player();
		
		Computer com = new Computer();
		
		switch ((int)(Math.random()*2)) {
		case 0:	
			com = new RockCom();
			break;
		case 1:
			com = new RockCom();
			break;
		default :
			com = new RockCom();
			break;
		}		
		
		Scanner sc = new Scanner(System.in);
		boolean start = false;
		int userIn = 9;
		int result = 0;
		
		File f = new File("files/rpsinfo.abc");
		
		while(true) {
			if(!start) {
				System.out.println("1. ���� ����");
				System.out.println("5. �̾ �ϱ�");
				System.out.println("6. ����");
			}else {
				System.out.println("������������������������������������������������������������������������");
				System.out.println("�� ����[0] ����[1] ��[2] �� �Է��� �ּ��� ��");
				System.out.println("��                  ����[4] ����[6]   ��");
				System.out.println("������������������������������������������������������������������������");
			}			
			System.out.print(">> ");
			
			userIn = sc.nextInt();
			
			switch (userIn) {
			case 0:case 2:	
				result = rpsGame.rpsResult(userIn, com.ranShot());
				com.setInfo(result);
				p1.setInfo(result);
				break;
			case 1:
				if(start) {
					result = rpsGame.rpsResult(userIn, com.ranShot());
					com.setInfo(result);
					p1.setInfo(result);
				}else {
					start = true;
				}
				break;
			case 4:
				p1.viewInfo();
				com.viewInfo();				
				break;
			case 5:	
				if(start) {
					System.out.println("�̹� �ҷ��Խ��ϴ�.");
				}else {
					try {
						FileReader in = new FileReader(f, Charset.forName("UTF-8"));
						
						char[] buffer = new char[1024];
						int len;
						String playInfo = "";
						if((len = in.read(buffer)) != -1) {
							playInfo = new String(buffer,0,len);
							p1.setPlayInfo(playInfo);
							com.setPlayInfo(playInfo);
							System.out.println("������ �ҷ��Խ��ϴ�.");
							
							p1.viewInfo();
							com.viewInfo();
							
						}else {
							System.out.println("���� �÷��� ������ �����ϴ�.");
							System.out.println("���� �����մϴ�.");
						}
						
						start = true;
						
						in.close();
					}catch (FileNotFoundException e) {
						System.out.println("���� �÷��� ������ �����ϴ�.");
						System.out.println("���� �����մϴ�.");
						start = true;
					}catch (IOException e) {
						//e.printStackTrace();
					}
				}
				break;
			case 6:
				
				try {
					FileWriter out = new FileWriter(f, Charset.forName("UTF-8"));
					out.write(p1.getPlayInfo());
					out.close();					
					System.out.println("������ ����ǰ� ������ ���� �Ǿ����ϴ�.");
				} catch (IOException e) {
					e.printStackTrace();
				}

				sc.close();
				return;
			default:				
				break;
			}
		}
		
	}
}
