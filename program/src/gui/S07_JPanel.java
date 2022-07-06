package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class S07_JPanel extends JFrame {
	
	/*
	 * 	# JPanel
	 * 
	 * 	 - 컨테이너 역할을 하는 컴포넌트
	 * 	 - 각 패널마다 다른 레이아웃을 설정해 사용할 수 있다
	 * 	 - 
	 * 
	 */
	public S07_JPanel() {
		JPanel panel =  new JPanel(new BorderLayout());
		
		panel.add(new JButton("Inner South Button"), "South");
		panel.add(new JButton("E"), "East");
		panel.add(new JButton("W"), "West");
		panel.add(new JButton("Inner North Button"), "North");
		panel.add(new JLabel("Center Message..", 0), "Center");
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(panel);
		add(new JButton("Button4"));
		
		//add(temporaryLostComponent, new GridLayout(2,2));
		
		setLayout(new GridLayout(2,2));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(500, 200, 800, 500);		
		setVisible(true);		
	}
	
	
	public static void main(String[] args) {
		
		new S07_JPanel();
		
	}

}
