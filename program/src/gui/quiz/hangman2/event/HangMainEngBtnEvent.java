package gui.quiz.hangman2.event;

import java.awt.event.ActionListener;

import gui.quiz.hangman2.HangMainFrame;


// 이 클래스를 상속받는 클래스들은 ActionListener이면서 main의 제어권을 가지고 있게 된다
abstract public class HangMainEngBtnEvent implements ActionListener {
	
	HangMainFrame main;
	
	public HangMainEngBtnEvent(HangMainFrame main) {
		this.main = main;
	}

}
