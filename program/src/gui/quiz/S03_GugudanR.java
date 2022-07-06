package gui.quiz;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.quiz.action.GugudanAction;

public class S03_GugudanR {
	
	public static void main(String[] args) {
		
		JFrame  f = new JFrame("±¸±¸´Ü");
		
		JButton[] gb = new JButton[9]; 
		JButton pb = new JButton("+");
		JButton mb = new JButton("-");
		
		for(int i = 0; i < gb.length; i++) {
			gb[i] = new JButton(String.format("%d x %d = %d", 2, i + 1, 2 * (i + 1))); 
			
			gb[i].setBounds(0, 0 + 40 * i, 300 , 40);
			
			f.add(gb[i]);
		}
		
		pb.setBounds(300, 0, 84, 180);
		mb.setBounds(300, 180, 84, 180);
		
		ActionListener ga = new GugudanAction(gb);
		
		pb.addActionListener(ga);
		mb.addActionListener(ga);
		
		f.add(pb);
		f.add(mb);
		
		f.setResizable(false);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(500, 200, 400, 400);
		f.setVisible(true);
		
	}

}
