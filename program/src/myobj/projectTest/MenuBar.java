package myobj.projectTest;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar {
	
	//static MainActivity14 mainActivity;
	static JLabel txt;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("[GUI (awt/swing) - JFrame 프레임 창에 JMenuBar 메뉴바 추가 및 클릭 이벤트 정의 실시]");
				
				/*[설 명]
				 * 1. 자바에서는 JFrame을 사용해서 GUI 프로그램을 만들 수 있습니다
				 * 2. JMenuBar : 메뉴바 틀을 생성합니다
				 * 3. JMenu : 대메뉴를 설정합니다
				 * 4. JMenuItem : 서브메뉴를 설정합니다 
				 * */	
				
				//TODO 클래스 객체 생성 (클릭 이벤트 위함)
				//mainActivity = new MainActivity14();
				
				//TODO 부모 프레임 생성
				JFrame frm = new JFrame("프레임 창 메뉴바 생성");
		 
				//TODO 부모 프레임 크기 설정 (가로, 세로)
				frm.setSize(500, 500);
		 
				//TODO 부모 프레임을 화면 가운데에 배치
				frm.setLocationRelativeTo(null);
		 
				//TODO 부모 프레임을 닫았을 때 메모리에서 제거되도록 설정
				frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//TODO 부모 프레임 창 크기 고정 실시
				frm.setResizable(false);
		 
				//TODO 부모 레이아웃 설정
				frm.getContentPane().setLayout(null);
						
				//TODO 자식 레이아웃 [메뉴바] 생성
				JMenuBar menu = new JMenuBar(); //메뉴바 틀 설정
				JMenu file = new JMenu("파일"); //TODO 대메뉴 설정
				JMenuItem open = new JMenuItem("열기");
				JMenuItem close = new JMenuItem("닫기");
				//open.addActionListener(mainActivity); //TODO 메뉴에 클릭이벤트 적용
				//close.addActionListener(mainActivity); //TODO 메뉴에 클릭이벤트 적용		
				file.add(open);	
				file.add(close);	
						
				JMenu help = new JMenu("도움말"); //TODO 대메뉴 설정
				JMenu sub_help = new JMenu("브라우저");
				JMenuItem google = new JMenuItem("구글");
				JMenuItem naver = new JMenuItem("네이버");
				//google.addActionListener(mainActivity); //TODO 메뉴에 클릭이벤트 적용
				//naver.addActionListener(mainActivity); //TODO 메뉴에 클릭이벤트 적용	
				sub_help.add(google);
				sub_help.add(naver);		
				help.add(sub_help);
				
				menu.add(file); //TODO 메뉴바 틀에 대메뉴 추가
				menu.add(help); //TODO 메뉴바 틀에 대메뉴 추가
				menu.setBounds(0, 0, 500, 30); //setBounds(가로위치, 세로위치, 가로길이, 세로길이);
				
				//TODO 자식 레이아웃 [라벨 텍스트] 생성
				txt = new JLabel("");
				txt.setBounds(0, 35, 500, 100); //setBounds(가로위치, 세로위치, 가로길이, 세로길이);
				txt.setFont(new Font("맑은 고딕", 0, 20)); //TODO 폰트 정의
				txt.setHorizontalAlignment(JLabel.CENTER); //TODO 텍스트 센터 표시 설정
						
				//TODO 부모 프레임에다가 자식 컴포넌트 추가
				frm.getContentPane().add(menu);
				frm.getContentPane().add(txt);
				
				//TODO 부모 프레임이 보이도록 설정
				frm.setVisible(true);
	}
}
