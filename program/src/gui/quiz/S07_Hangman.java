package gui.quiz;

import javax.swing.JFrame;

import gui.quiz.hangman.GamePanel;

public class S07_Hangman extends JFrame {
	
	/*
	 * 	����� ����� ������
	 * 
	 */
	public S07_Hangman() {
		
		GamePanel game1 = new GamePanel();
		game1.setLayout(null);
		
		add(game1);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(500, 200, 1000, 600);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new S07_Hangman();
	}

}
