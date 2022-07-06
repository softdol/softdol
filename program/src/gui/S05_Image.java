package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class S05_Image extends JFrame {
	
	public S05_Image() {
		super("Image test frame");
		
		JLabel label = new JLabel("wait for click");
		JButton button = new JButton("My Button");
		
		label.setHorizontalAlignment(0);
		
		ImageIcon[] imgList = new ImageIcon[4];
		for(int i = 0; i < 4; i++) {
			imgList[i] = new ImageIcon(String.format("img/img%d.jpg", i));			
		}
		
//		String[] imgList = new String[4];
//		for(int i = 0; i < 4; i++) {
//			imgList[i] = String.format("img/img%d.jpg", i);			
//		}
		
		// 연습문제: 버튼을 누르면 여러 그림들이 순차적으로 순환되도록 만들어 보세요
		button.addActionListener(new ActionListener() {			
			int idx = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(imgList[idx++ % imgList.length]);
				//label.setIcon(new ImageIcon(imgList[idx++ % imgList.length]));
				label.setText("");
			}
		});
		
		add(label, "Center");
		add(button, "South");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(500, 250, 500, 500);		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new S05_Image();
	}
}
