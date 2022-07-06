package gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import gui.component.ImageLabel;

public class S08_CardLayout extends JFrame {
	
	public S08_CardLayout() {
		
		setTitle("Card Layout!");
		
		JButton btn = new JButton("South Button");
		JPanel pane1 = new JPanel();
		
		// 카드 레이아웃 : 카드처럼 다음 컴포넌트로 넘기는 기능이 있는 레이아웃
		CardLayout clManager = new CardLayout();		
		pane1.setLayout(clManager);
		
		pane1.add("Apple", new ImageLabel("img/apple.jpg"));
		pane1.add("Banana", new ImageLabel("img/banana.jpg"));
		pane1.add("Mango", new ImageLabel("img/mango.jpg"));
		pane1.add("Peach", new ImageLabel("img/peach.jpg"));
						
		add(btn, "South");
		add(pane1, "Center");
		
		// Event Listeners
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// next(parent) : 카드 레이아웃을 다음으로 넘기기
				// 카드 레이아웃을 조작할 때는 어느 컨테이너를 조작해야 하는지 매개변수로 알려줘야 한다
				//clManager.next(pane1);
				// previous(parent) : 카드 레이아웃을 이전으로 넘기기				
				//clManager.previous(pane1);
				// first(parent) : 카드 레이아웃을 처음으로
				//clManager.first(pane1);
				// last(parent) : 카드 레이아웃을 마지막으로
				//clManager.last(pane1);
				
				// show(parent, cardName) : 원하는 카드로 이동하기. 컨테이너에 추자할 때 붙였던 이름이 필요하다
				clManager.show(pane1, "Mango");
				
			}
		});
		
		setResizable(false);
		setBounds(500, 200, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}	
	
	public static void main(String[] args) {
		
		new S08_CardLayout();
		
	}
	
}
