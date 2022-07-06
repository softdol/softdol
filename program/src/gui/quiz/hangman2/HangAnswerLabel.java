package gui.quiz.hangman2;

import java.awt.Font;

import javax.swing.JLabel;

public class HangAnswerLabel extends JLabel {
	
	String answer;
	boolean[] check;
	
	public HangAnswerLabel() {
		setFont(new Font("Consolas", Font.BOLD, 25));
		setHorizontalAlignment(CENTER);
	}
	
	public boolean checkAnswer(String cmd) {
		
		boolean found = false;		
		int index = -1;
		
		String upperAnswer = answer.toUpperCase();
		
		while((index = upperAnswer.indexOf(cmd, index + 1)) != -1) {
			check[index] = true;
			found = true;
		}
		
		setText(getBlank());
		
		return found;		
	}
	
	private String getBlank() {
		StringBuilder blank = new StringBuilder();
		
		for(int i = 0, len = answer.length(); i <len; i++) {
			char ch = answer.charAt(i);
			if(check[i]) {
				blank.append(ch + " ");
			}else if(answer.charAt(i) == ' ') {
				blank.append("  ");
			}else {
				blank.append("_ ");
			}
		}
	
		return blank.toString();
	}
	
	public void update(String answer) {
		this.answer = answer;
		check = new boolean[answer.length()];
		
		setText(getBlank());		
	}
	
}
