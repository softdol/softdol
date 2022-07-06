package gui.quiz.hangman2;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.quiz.hangman2.event.EngBtnEvent;

public class HangMainFrame extends JFrame {
	
	HangPicturePanel picPanel = new HangPicturePanel();
	HangEnglishPanel engPanel = new HangEnglishPanel();
	
	String[] words = {"Programming", "C Language", "Python Programmer", "Web Designer"};
	
	// 프레임의 모든 컴포넌트를 컨트롤 할 수 있는 메서드들 모음
	
	public void nextPic() {
		picPanel.cardManager.next(picPanel);
	}
	
	public void newGame() {
		engPanel.answerLabel.update(words[(int)(Math.random() * words.length)]);
	}
	
	public boolean chechAnswer(String cmd) {
		return engPanel.answerLabel.checkAnswer(cmd);		
	}
	
	//////////////////////////////////////////////////////////////////////////////////////
		 
	public HangMainFrame() {
		
		setTitle("Hang Man");

		// 그림이 바뀌는 페널(카드 레이 아웃 예정
		add(picPanel, "Center");
		add(engPanel, "South");
		
		// 프레임의 모든 이벤트 추가(하면서 해당 프레임의 인스턴스를 넘김)		
		EngBtnEvent btnEvent = new EngBtnEvent(this);
		
		for(JButton btn : engPanel.getAllKey()) {
			btn.addActionListener(btnEvent);			
		}

		// 프레임 관련 초기화 설정
		newGame();
		
		setResizable(false);
		setBounds(500, 100, 800, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
