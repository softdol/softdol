package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S02_BorderLayout {
	
	/*
	 * 	������Ʈ�� ��ġ�� �� �ִ� �����̳ʿ��� ���̾ƿ��� ������ �� �ִ�
	 * 
	 * 	# BorderLayout
	 * 
	 *   - �������ϰ� ����� �̷���� ���̾ƿ�
	 * 	 - JFrame�� �⺻��
	 * 
	 */
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame("BorderLayout Test");
		
		BorderLayout manager = new BorderLayout();
		
		manager.setHgap(20);	// ����(Horizonta) ����		
		manager.setVgap(20);	// ����(Vertical) ����
		f.setLayout(manager);
		
		f.add(new JButton("btn1"), BorderLayout.CENTER);
		f.add(new JButton("btn2"), BorderLayout.EAST);
		f.add(new JButton("btn3"), BorderLayout.WEST);
		f.add(new JButton("btn4"), BorderLayout.SOUTH);
		f.add(new JButton("btn5"), BorderLayout.NORTH);
		
		
		f.setLocation(200, 200);
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
	}
	

}
