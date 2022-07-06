package gui.quiz.hangman2;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.quiz.hangman2.event.EngBtnEvent;

public class HangMainFrame extends JFrame {
	
	HangPicturePanel picPanel = new HangPicturePanel();
	HangEnglishPanel engPanel = new HangEnglishPanel();
	
	String[] words = {"Programming", "C Language", "Python Programmer", "Web Designer"};
	
	// �������� ��� ������Ʈ�� ��Ʈ�� �� �� �ִ� �޼���� ����
	
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

		// �׸��� �ٲ�� ���(ī�� ���� �ƿ� ����
		add(picPanel, "Center");
		add(engPanel, "South");
		
		// �������� ��� �̺�Ʈ �߰�(�ϸ鼭 �ش� �������� �ν��Ͻ��� �ѱ�)		
		EngBtnEvent btnEvent = new EngBtnEvent(this);
		
		for(JButton btn : engPanel.getAllKey()) {
			btn.addActionListener(btnEvent);			
		}

		// ������ ���� �ʱ�ȭ ����
		newGame();
		
		setResizable(false);
		setBounds(500, 100, 800, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
