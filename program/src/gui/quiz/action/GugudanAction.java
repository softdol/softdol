package gui.quiz.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class GugudanAction implements ActionListener {
	
	int dan = 2;
	JButton[] gb;
	
	public GugudanAction(JButton[] gb) {
		this.gb = gb;
	}	

	@Override
	public void actionPerformed(ActionEvent e) {
		// ActionEvent : 버튼을 클릭할때마다 (이벤트가 발생할때마다) 함께 넘어오는 이벤트 정보
		// System.out.println(e);
		/*
		java.awt.event.ActionEvent[
			ACTION_PERFORMED,
			cmd=+,
			when=1654669295205,
			modifiers=Button1
			] on javax.swing.JButton[,300,0,84x180,alignmentX=0.0,alignmentY=0.5,border=javax.swing.plaf.BorderUIResource$CompoundBorderUIResource@3c45ed17,flags=296,maximumSize=,minimumSize=,preferredSize=,defaultIcon=,disabledIcon=,disabledSelectedIcon=,margin=javax.swing.plaf.InsetsUIResource[top=2,left=14,bottom=2,right=14],paintBorder=true,paintFocus=true,pressedIcon=,rolloverEnabled=true,rolloverIcon=,rolloverSelectedIcon=,selectedIcon=,text=+,defaultCapable=true]
		*/
		switch (e.getActionCommand()) {
			case "+":
				if(dan < 19) {
					dan++;
					break;
				}else {
					return;
				}				
			case "-":
				if(dan > 2) {
					dan--;
					break;
				}else {
					return;
				}
		}
		
		
		// 이벤트 발생시마다 구구단 버튼들의 텍스트를 바꿔주는 액션
		for(int i = 0; i < gb.length; i++) {
			gb[i].setText(String.format("%d x %d = %d", dan, i + 1, dan * (i + 1)));
		}
	}

}
