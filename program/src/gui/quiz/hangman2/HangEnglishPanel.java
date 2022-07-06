package gui.quiz.hangman2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class HangEnglishPanel extends JPanel {
	
	HangAnswerLabel answerLabel = new HangAnswerLabel();
	JPanel keyPanel = new JPanel(); 
	ArrayList<JButton> keys = new ArrayList<>();
	
	public ArrayList<JButton> getAllKey(){
		return keys;
	}
	
	public HangEnglishPanel() {
		
		setLayout(new BorderLayout());
		
		keyPanel.setLayout(new GridLayout(2,13));
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			JButton btn = new HangEngButton("" + ch); 
			keyPanel.add(btn);	
			keys.add(btn);
		}
		
		add(answerLabel, "North");
		add(keyPanel, "Center");
		
	}

}
