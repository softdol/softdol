package gui.quiz.hangman2.event;

import java.awt.event.ActionEvent;

import gui.quiz.hangman2.HangMainFrame;

public class EngBtnEvent extends HangMainEngBtnEvent {

	public EngBtnEvent(HangMainFrame main) {
		super(main);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		
		if(!main.chechAnswer(cmd)) {
			main.nextPic();
		}
	}

}
