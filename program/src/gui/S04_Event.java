package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class S04_Event extends JFrame {
	
	public S04_Event() {
		super("Event!");
		
		JButton btn1 = new JButton("Button1");
		JButton btn2 = new JButton("Button2");
		
		// 기능이 없는 출력을 위한 컴포넌트
		JLabel label = new JLabel("Hello!");
		
		// SwingConstants : 스윙에서 사용되는 여러 상수들이 모여있음
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		String[] animals = {"사자","기린","호랑이","뱀","치타","고양이","원숭이","말"};
		
		// 마우스 휠 이벤트
		btn1.addMouseWheelListener(new MouseWheelListener() {
			
			int index = 0;
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				label.setText(animals[(index += (int)Math.abs(e.getWheelRotation())) % animals.length]);
//				System.out.println(e.getWheelRotation());
//				switch (e.getWheelRotation()) {
//					case 1:
//						label.setText("방금 마우스 휠을 내렸습니다.");
//						break;
//					case -1:
//						label.setText("방금 마우스 휠을 올렸습니다.");
//						break;
//				}
			}
		});

		// MouseListener처럼 너무 많은 메서드를 구현해야하는 인터페이스들을 위해
		// Adapter 클래스들이 존재한다
		btn2.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseDragged(MouseEvent e) {
//				System.out.println("마우스 드레그");
//			}
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				System.out.println(e);
//			}
//			
//			@Override
//			public void mouseReleased(MouseEvent e) {
//				System.out.println("마우스 놓음");
//			}
//			
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				//System.out.println("in");
//				label.setBackground(Color.black);
//				label.setForeground(Color.white);
//			}
//			
//			@Override
//			public void mouseExited(MouseEvent e) {
//				//System.out.println("out");
//				label.setBackground(Color.white);
//				label.setForeground(Color.red);
//			}
		});
		//btn2.addKeyListener(null);
				
		btn2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				//System.out.println(e);
				
				System.out.println(e.getKeyChar());
			}
		});
		
		add(btn1, BorderLayout.WEST);
		add(btn2, BorderLayout.EAST);
		add(label, BorderLayout.CENTER);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(500, 250, 500, 500);		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new S04_Event();
	}

}









