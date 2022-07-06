package gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicExample extends JFrame {
	private Graphic panel = new Graphic();
	public GraphicExample() {
		setTitle("JPanel의 paintComponent() 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		setBounds(400,100,885,786);

		setContentPane(panel);
		
		setVisible(true);
	}
	
	public static void main(String args[]) {
		new GraphicExample();
		/*
 		JFrame frame = new JFrame("그래프 프로그램");
		Container contentpane = frame.getContentPane();
		DrawingPanel drawingPanel = new DrawingPanel();
		contentpane.add(drawingPanel, BorderLayout.CENTER);

		JPanel controlPanel = new JPanel();
		JTextField text1 = new JTextField(3);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(3);

		JButton button = new JButton("그래프그리기");

		controlPanel.add(new JLabel("국어"));
		controlPanel.add(text1);
		controlPanel.add(new JLabel("영어"));
		controlPanel.add(text2);
		controlPanel.add(new JLabel("수학"));
		controlPanel.add(text3);
		controlPanel.add(button);

		contentpane.add(controlPanel, BorderLayout.SOUTH);
		

		button.addActionListener(new DrawActionListener(text1, text2, text3, drawingPanel));

		frame.pack();
		frame.setLocation(300, 100);
		frame.setSize(new Dimension(700, 700));
		//frame.setPreferredSize(new Dimension(700, 700));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		*/		
	}	

}