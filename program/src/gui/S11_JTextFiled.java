package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class S11_JTextFiled extends JFrame {
	
	public S11_JTextFiled() {
		setTitle("");
		setLayout(null);
		
		JTextField tf = new JTextField();
		tf.setBounds(50, 50, 100, 50);
		tf.setFont(new Font("�ü�ü", Font.BOLD, 20));
		
		// ����Ű ������ �׼� ������ �ߵ�		
		tf.addActionListener(new ActionListener() {			
			@Override			
			public void actionPerformed(ActionEvent e) {
				System.out.println(tf.getText());
				tf.setText("");
			}
		});
		
		add(tf);		
		
		setBounds(500,250,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}	
	
	
	public static void main(String[] args) {
		 new S11_JTextFiled();
	}

}
