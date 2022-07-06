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
	 * 	컴퓨터와 간단한 가위바위보 게임을 하나 만들고, 게임 종료시 전적을 파일에 저장해보세요.
	 *  게임을 다시 실행하면 예전 전적이 그대로 반영되도록 만들어 보세요.
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
				System.out.println("1. 새로 시작");
				System.out.println("5. 이어서 하기");
				System.out.println("6. 종료");
			}else {
				System.out.println("┌──────────────────────────────────┐");
				System.out.println("│ 가위[0] 바위[1] 보[2] 를 입력해 주세요 │");
				System.out.println("│                  전적[4] 종료[6]   │");
				System.out.println("└──────────────────────────────────┘");
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
					System.out.println("이미 불러왔습니다.");
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
							System.out.println("전적을 불러왔습니다.");
							
							p1.viewInfo();
							com.viewInfo();
							
						}else {
							System.out.println("이전 플레이 내역이 없습니다.");
							System.out.println("새로 시작합니다.");
						}
						
						start = true;
						
						in.close();
					}catch (FileNotFoundException e) {
						System.out.println("이전 플레이 내역이 없습니다.");
						System.out.println("새로 시작합니다.");
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
					System.out.println("전적이 저장되고 게임이 종료 되었습니다.");
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
