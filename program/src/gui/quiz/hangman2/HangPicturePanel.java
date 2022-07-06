package gui.quiz.hangman2;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

import gui.component.ImageLabel;

public class HangPicturePanel extends JPanel {
	
	CardLayout cardManager =  new CardLayout(20,20);
	
	public HangPicturePanel() {
		
		System.out.println("너비" + this.getWidth());
		System.out.println("높이" + this.getHeight());
		
		add(new HangImgLabel("img/apple.jpg"));
		add(new HangImgLabel("img/banana.jpg"));
		add(new HangImgLabel("img/mango.jpg"));
		add(new HangImgLabel("img/peach.jpg"));
		
		setLayout(cardManager);		
		setBackground(Color.BLACK);
	}

}
