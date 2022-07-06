package gui.quiz;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S03_Gugudan extends JFrame {
	
	/*
	 * 	실행하면 구구단이 출력되는 GUI 프로그램을 만들어 보세요
	 * 
	 * 	1. 실행하면 2단이 출력되어 있는 상태로 시작한다
	 * 
	 * 	2. + 버튼을 누르면 단이 증가한 구구단이 출력된다(최대 19단)
	 * 
	 * 	3. - 버튼을 누르면 단이 감소한 구구단이 출력된다(최소 2단)
	 * 
	 */
	
	JButton plusBtn = new JButton("+");
	JButton minusBtn = new JButton("-");
	
	static JButton[] btnList;
	
	static int dan = 2;
	
	public S03_Gugudan() {
		setLayout(null);
		
		plusBtn.setFont(new Font("Broadway", Font.PLAIN, 20));
		minusBtn.setFont(new Font("Broadway", Font.PLAIN, 20));
		
		btnList = new JButton[10];
		btnList[0] = new JButton();
		btnList[0].setText(String.format("%2d 단", dan));
		btnList[0].setSize(200, 50);
		btnList[0].setLocation(100, 10);	
		
		for(int i = 1; i < btnList.length; i++) {
			btnList[i] = new JButton();
			btnList[i].setSize(200, 35);
			btnList[i].setText(String.format("%2d x %2d = %3d", dan, i, dan * i));			
			btnList[i].setLocation(100, (i * 40) + 30);
			add(btnList[i]);
		}
		
		plusBtn.setSize(80,50);
		minusBtn.setSize(80,50);
		
		plusBtn.setLocation(200, 450);
		minusBtn.setLocation(120, 450);
		
		plusBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				viewDanBtn('+');
			}
		});
		
		minusBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				viewDanBtn('-');
			}
		});
		
		add(btnList[0]);
		add(plusBtn);
		add(minusBtn);
		
		setTitle("구구단");
		setLocation(500, 200);
		setSize(400, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new S03_Gugudan();
	}
	
	public static void viewDanBtn(char c) {
		
		dan = c == '+' ? dan + 1 : dan - 1;		
		dan = dan < 2 ? 2 : dan;
		dan = dan > 19 ? 19 : dan;
		
		btnList[0].setText(String.format("%d 단", dan));
		for(int i = 1; i < btnList.length; i++) {			
			btnList[i].setText(String.format("%d x %d = %d", dan, i, dan * i));		
			
		}
	}


}
