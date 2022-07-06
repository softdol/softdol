package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S03_JButton extends JFrame {
	
	JButton mainBtn = new JButton();
	JButton subBtn = new JButton("click!");
	
	public S03_JButton() {
		// �ؽ�Ʈ ����
		mainBtn.setText("main");
		
		// �۲� ����
		mainBtn.setFont(new Font("Broadway", Font.PLAIN, 120));
		subBtn.setFont(new Font("Broadway", Font.PLAIN, 80));
		
		// ���� ����
		mainBtn.setForeground(new Color(0x44ffff));
		mainBtn.setBackground(new Color(0xffeeff));
		subBtn.setBackground(new Color(0xffeeee));
		
		// ��ư �̺�Ʈ ���� (�׼� ������)
		subBtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				mainBtn.setText(Integer.toString((int)(Math.random() * 100)));
			}
		});
		
		add(mainBtn, BorderLayout.CENTER);
		add(subBtn, BorderLayout.EAST);
		
		setTitle("JButton Practice!!");
		setLocation(500, 200);
		setSize(700, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new S03_JButton();
	}

}
