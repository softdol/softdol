package gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import gui.component.ImageLabel;

public class testTimer extends JFrame {
	
	public testTimer() {
		
		JButton btn = new JButton("South Button");
		
		JPanel pane1 = new JPanel();
		CardLayout clManager = new CardLayout();		
		pane1.setLayout(clManager);
		
		Timer t = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clManager.next(pane1);
			}
		});
		
		t.start();
		
		pane1.add("Apple", new ImageLabel("img/apple.jpg"));
		pane1.add("Banana", new ImageLabel("img/banana.jpg"));
		pane1.add("Mango", new ImageLabel("img/mango.jpg"));
		pane1.add("Peach", new ImageLabel("img/peach.jpg"));
		
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
		
		add(pane1);
		add(btn, "South");
		
		setResizable(false);
		setBounds(500, 200, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new testTimer();
	}

}
