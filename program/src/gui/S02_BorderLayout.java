package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S02_BorderLayout {
	
	/*
	 * 	컴포넌트를 배치할 수 있는 컨테이너에는 레이아웃을 설정할 수 있다
	 * 
	 * 	# BorderLayout
	 * 
	 *   - 동서남북과 가운데로 이루어진 레이아웃
	 * 	 - JFrame의 기본값
	 * 
	 */
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("BorderLayout Test");
		
		BorderLayout manager = new BorderLayout();
		
		manager.setHgap(20);	// 수평(Horizonta) 여백		
		manager.setVgap(20);	// 수직(Vertical) 여백
		f.setLayout(manager);
		
		f.add(new JButton("btn1"), BorderLayout.CENTER);
		f.add(new JButton("btn2"), BorderLayout.EAST);
		f.add(new JButton("btn3"), BorderLayout.WEST);
		f.add(new JButton("btn4"), BorderLayout.SOUTH);
		f.add(new JButton("btn5"), BorderLayout.NORTH);
		
		
		f.setLocation(200, 200);
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
	}
	

}
