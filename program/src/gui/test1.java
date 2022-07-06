package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class test1 extends JFrame {
	
	public test1() {
		
		JButton btn = new JButton("test1");
		
		JLabel label = new JLabel("Å×½ºÆ®",0);
		label.setBounds(10, 70, 100, 50);
		add(label);
		
		btn.setBounds(10, 10, 100, 50);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.invalidate();
				  System.out.println(label.isDisplayable());
			}
			
		});
		add(btn);
		
		setLayout(null);	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(500, 200, 1000, 600);		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new test1();
		
	}
}
