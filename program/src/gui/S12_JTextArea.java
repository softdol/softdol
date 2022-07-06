package gui;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class S12_JTextArea extends JFrame {
	public S12_JTextArea() {
		setTitle("JTextArea Sample");
		
		JTextArea area = new JTextArea(5,5);
		JLabel areaState = new JLabel();
		
		// �ڵ� �� �ٲ� ����
		area.setLineWrap(true);
		area.setAutoscrolls(true);
		area.setFont(new Font("Consolas", Font.PLAIN, 15));
		
		// �� ũ�� ����
		area.setTabSize(4);
		
		// setCursor : �ش� ������Ʈ ���� ���콺�� �ö� ������ ���콺 Ŀ���� ����
		area.setCursor(new Cursor(0));
		
		// Ű���� Ŀ���� ������ ������ �߻��ϴ� �̺�Ʈ
		area.addCaretListener(new CaretListener() {
			
			@Override
			public void caretUpdate(CaretEvent e) {
				String text = area.getText();
				areaState.setText("" + area.getCaretPosition());
			}
		});
		
		area.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				//System.out.println(area.getText());
//				String text = area.getText();
//				areaState.setText(
//						String.format("characters : %d", text.length()));
				//super.keyTyped(e);
			}
		});
		
		add(area, "Center");
		add(areaState, "North");
		
		
		//setLayout(null);
		setBounds(500,250,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new S12_JTextArea();
		
	}
}
