package gui.quiz.hangman;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HangmanPanel extends JPanel{
	
	private static JPanel pHidden;
	private int score;
	private JLabel lScore;
		
	public HangmanPanel() {
		score = 0;		
		setLayout(null);
		
		lScore = new JLabel(String.format("Score : %d",score) , 0);
		
		lScore.setFont(new Font("Broadway", Font.PLAIN, 25));
		lScore.setBounds(70 ,30, 300, 80);
		
		ImageIcon icon = new ImageIcon("img/hangman_softdol.png");
		
		Image img = icon.getImage();
		Image cimg = img.getScaledInstance(350,350,img.SCALE_SMOOTH);		
		
		JLabel lImg = new JLabel(new ImageIcon(cimg), 0);
		
		lImg.setBounds(80, 110, 350, 350);
		
		pHidden = new JPanel();         
		pHidden.setBounds(100, 133, 120, 310);
		
		add(pHidden);
		add(lScore);
		add(lImg);
		
	}
	
	public void setHidden(int y) {
		pHidden.setLocation(100, y);
	}
	
	public void plusScore(int score) {
		this.score += score ;
		lScore.setText(String.format("Score : %d",this.score));
	}

}
