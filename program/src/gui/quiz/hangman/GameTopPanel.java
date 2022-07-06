package gui.quiz.hangman;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class GameTopPanel extends JPanel {
	
	private int life;
	private int success;
	private WordList wlist;
	private ArrayList<Character> orgWord;
	private ArrayList<JLabel> wordList;
	
	private JButton hintBtn;
	private JLabel hintLabel;
	private JLabel lLife;
	private int orgWordSize;
	
	public GameTopPanel() {
		setLayout(null);
		
		hintBtn = new JButton("Hint");
		
		hintBtn.setFont(new Font("명조", Font.BOLD, 18));
		hintBtn.setBackground(Color.GREEN);
		hintBtn.setBounds(50, 180, 100, 50);
		add(hintBtn);
		
		hintBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton thisButton = (JButton)e.getSource();
				hintLabel.setText(wlist.getAnswer().getHint());
				thisButton.setEnabled(false);
			}
		});
		
		hintLabel = new JLabel("");
		hintLabel.setForeground(Color.RED);
		hintLabel.setFont(new Font("명조", Font.PLAIN, 20));		
		hintLabel.setBounds(180, 180, 300, 50);
		add(hintLabel);
		
		life = 5;
		success = 0;
		wlist = new WordList();
		orgWord = new ArrayList<Character>();        
        for(char c : wlist.getWord()) {
        	orgWord.add(c);
        }
		
		
		wordList = new ArrayList<JLabel>();
		
		for(int i = 0; i < orgWord.size(); i++) {
			JLabel label = new JLabel("",0);			
			label.setFont(new Font("바탕", Font.BOLD, 24));
			label.setBorder(new LineBorder(Color.red));
			label.setBounds(i * 50 + 50, 100, 40, 60);			
			add(label);
			wordList.add(label);
		}
		
		lLife = new JLabel("남은 기회 :" + life);
		lLife.setFont(new Font("바탕", Font.PLAIN, 16));
		lLife.setBounds(50, 10, 200, 50);
		add(lLife);
		
		orgWordSize = orgWord.size();
	}
	
	public int getOrgWordSize() {
		return orgWordSize;
	}
	
	public ArrayList<Character> getOrgWord() {
		return orgWord;
	}
	
	public ArrayList<JLabel> getWordList() {
		return wordList;
	}
	
	public int getSuccess() {
		return success;
	}
	
	public String getAnswer() {
		return wlist.getAnswer().getWord();
	}
	
	public int minusLife() {
		life--;
		lLife.setText("남은 기회 :" + life);
		
		return life;
	}
	
	public void plusSuccess() {
		success++;
	}
	
	public void endGame() {
		hintBtn.setVisible(false);
	}
	
	public void reStartGame() {
		hintBtn.setEnabled(true);
		hintBtn.setVisible(true);
		hintLabel.setText("");
		
		for(JLabel l : wordList) {
			l.setVisible(false);
		}
		
		life = 5;
		success = 0;
		lLife.setText("남은 기회 :" + life);
		
		orgWord = new ArrayList<Character>();
		for(char c : wlist.getWord()) {
			orgWord.add(c);
		}
		
		wordList = new ArrayList<JLabel>();
		for(int i = 0; i < orgWord.size(); i++) {
			JLabel label = new JLabel("",0);			
			label.setFont(new Font("바탕", Font.PLAIN, 24));
			label.setBorder(new LineBorder(Color.red));
			label.setBounds(i * 50 + 50, 80, 40, 60);			
			add(label);
			wordList.add(label);
		}
		
		orgWordSize = orgWord.size();
	}
}
