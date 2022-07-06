package gui.component;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ColorStateButton extends JButton {
	
	private static Color[] bg_colors = { Color.GREEN, Color.YELLOW, Color.RED, Color.BLACK };
	private int state = 0;
	private int num;
	
	private static ActionListener eventListener = new ActionListener() {		
		@Override
		public void actionPerformed(ActionEvent e) {
			ColorStateButton performedButton = (ColorStateButton)e.getSource();
			performedButton.change();
		}		
	};
	
	public ColorStateButton(int num) {
		super("button" + num);	// setText("button" + num)
		this.num = num;
		
		setBackground(bg_colors[state]);
	}
	
	private void change() {
		if(state < bg_colors.length - 1) {
			setBackground(bg_colors[++state]);
		}		
	}

}
