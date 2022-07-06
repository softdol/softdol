package gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.component.ColorStateButton;

public class S06_GridLayout extends JFrame {
	
	public S06_GridLayout() {
		
		LayoutManager manager = new GridLayout(5,10);
		
		Color[] colors = { Color.GREEN, Color.YELLOW, Color.RED, Color.BLACK };
		int colorsCnt = colors.length;
		int[] colorList = new int[50];
		
		// �������� : �� ��ư�� ���� ������ ������� �ʷ�, ���, ����, �������� ���ϰ� ����� ������
		ActionListener eventListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// e.getSource() : �̺�Ʈ�� �߻��� ��ü�� ����ִ�. ����Ϸ��� �ٿ� ĳ������ �ʿ��ϴ�
				//System.out.println(e.getSource());
				//System.out.println(e);
				
				JButton performedButton = (JButton)e.getSource();				
				int idx = Integer.parseInt(performedButton.getText().replaceAll("\\D", "")) - 1;
				if( colorList[idx] > colorsCnt - 1) {
					return;
				}
				performedButton.setBackground(colors[colorList[idx]++]);
				
				//colorList[idx] = colorList[idx] < colorsCnt - 1 ? colorList[idx] + 1 : colorList[idx];
				
			}			
		};
				
		for(int i = 0; i < colorList.length; i++) {
			JButton button = new ColorStateButton(i + 1);
			button.addActionListener(eventListener);
			add(button);
		}
		
		setLayout(manager);		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(400, 200, 1000, 500);		
		setVisible(true);		
	}

	public static void main(String[] args) {
		
		new S06_GridLayout();
		
	}
}
