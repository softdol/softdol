package gui.quiz.hangman2.event;

import java.awt.event.ActionListener;

import gui.quiz.hangman2.HangMainFrame;


// �� Ŭ������ ��ӹ޴� Ŭ�������� ActionListener�̸鼭 main�� ������� ������ �ְ� �ȴ�
abstract public class HangMainEngBtnEvent implements ActionListener {
	
	HangMainFrame main;
	
	public HangMainEngBtnEvent(HangMainFrame main) {
		this.main = main;
	}

}
