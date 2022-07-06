package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S01_JavaSwing {

	/*
	 * 	# Java Swing
	 * 
	 * 	 - javax.swing 패키지의 클래스들
	 * 	 - GUI 프로그램을 만들 수 있다
	 * 
	 * 	# Container
	 * 
	 *   - 여러 컴포넌트들을 배치할 수 있는 판
	 *   - JFrame, JPanel, JDialog ... 등 다양한 클래스가 컨테이너 역할을 할 수 있다
	 *   - 컨테이너에는 레이아웃을 설정할 수 있다
	 *   
	 *  # Component
	 *  
	 *   - 컨테이너 위에 배치할 수 있는 다양한 것들
	 *   - 버튼, 표, 슬라이더, 메뉴 ... 등 다양한 클래스가 컴포넌트 역할을 할 수 있다
	 */
	
	public static void main(String[] args) {
		
		// 프레임 인스턴스 생성
		JFrame frame = new JFrame("GUI 프로그래밍");
		frame.setLayout(null);
		
		// 프레임 위에 다른 컴포넌트를 붙일수 있다
		JButton btn = new JButton("This is Button");
		JButton btn2 = new JButton("2");
		
		// 컴포넌트의 크기를 직접 설정하기 위해서는 붙이는 곳에 레이아웃이 없어야 한다.
		btn.setLocation(50,50);
		btn.setSize(200, 80);
		
		btn2.setLocation(270,50);
		btn2.setSize(80, 200);
		
		frame.add(btn);
		frame.add(btn2);
		
		/* 
		 * 	프레임의 x버튼을 눌렀을 때 동작을 설정
		 * 	설정할 수 있는 int값은 JFrame에 상수로 설정되어 있다
		 * 
		 * 	EXIT_ON_CLOSE : X버튼을 누르면 프로그램을 종료한다
		 *  DISPOSE_ON_CLOSE : 문서참조 
		 *  DONOTHING_ON_CLOSE : 문서참조
		 *  HIDE_ON_CLOSE : 문서참조
		 */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 프레임 크기 설정
		frame.setSize(500,500);
		
		// 프레임 위치 설정(더블 모니터인 경우 x에 + 모니터 크기 해야함
		frame.setLocation(100, 100);
		
		// 프레임을 보이게 설정(맨 마지막에 해주는 것이 좋음)
		frame.setVisible(true);
		
	}
}
