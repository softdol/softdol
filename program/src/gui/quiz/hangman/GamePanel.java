package gui.quiz.hangman;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
	private static ArrayList<JButton> keyList;
		
	private static EndPanel pEnd;
	private static HangmanPanel hView;
	private GameTopPanel topPanel;
	
	public GamePanel() {
		
		hView = new HangmanPanel();		
		hView.setBounds(500,0,500,600);		
		add(hView);
		
		pEnd = new EndPanel();
		JButton reStartButton = new JButton("Re Start");
		reStartButton.setBounds(180, 300, 150, 50);
		reStartButton.setFont(new Font("Broadway", Font.PLAIN, 18));
		
		reStartButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				reStart();
			}
			
		});		
		pEnd.add(reStartButton);
		add(pEnd);
		
		topPanel = new GameTopPanel();
		topPanel.setBounds(0,0,500,230);
		add(topPanel);

		keyList = new ArrayList<JButton>();
		
		ActionListener wordCilck = new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton thisButton = (JButton)e.getSource();
				boolean wordChk = false;
				char orgC = thisButton.getText().charAt(0);				
				for(int i = 0; i < topPanel.getOrgWordSize(); i++) {
					if(topPanel.getOrgWord().get(i) == orgC) {
						topPanel.getWordList().get(i).setText(thisButton.getText());
						wordChk = true;
						topPanel.plusSuccess();
						hView.plusScore(100);
					}
				}
				if(!wordChk) {
					int life =topPanel.minusLife();
					if(life <= 0) {
						endGame("Game Over...");
					}					
					hView.setHidden(133 + (5 - life) * 62);					
				}
				
				if(topPanel.getSuccess() == topPanel.getOrgWordSize()) {
					hView.plusScore(1000);
					endGame("SUCCESS!!");					
				}
				
				thisButton.setEnabled(false);
			}
		};
		
		int bCnt = 0;
		int lineCount = -2;
		
		for(char c = 'A'; c <= 'Z'; c++) {
			JButton button = new JButton(String.valueOf(c));
			
			if(bCnt % 7 == 0) {
				bCnt = 0;
				lineCount++;
			}
			
			button.setBounds(50 + bCnt * 60, 300 + lineCount * 55, 50, 50);
			button.addActionListener(wordCilck);
			add(button);
			keyList.add(button);
			bCnt++;
		}
	}
	
	public void endGame(String s) {
		for(JButton btn : keyList) {
			btn.setVisible(false);
		}
		topPanel.endGame();
		pEnd.setResult(s,String.format("ANSWER : %s", topPanel.getAnswer()) );
		pEnd.setVisible(true);		
	}
	
	public void reStart() {
		for(JButton btn : keyList) {
			btn.setEnabled(true);
			btn.setVisible(true);
		}
		topPanel.reStartGame();
		
		hView.setHidden(133);
		pEnd.setVisible(false);

	}
}
