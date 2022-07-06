package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S01_JavaSwing {

	/*
	 * 	# Java Swing
	 * 
	 * 	 - javax.swing ��Ű���� Ŭ������
	 * 	 - GUI ���α׷��� ���� �� �ִ�
	 * 
	 * 	# Container
	 * 
	 *   - ���� ������Ʈ���� ��ġ�� �� �ִ� ��
	 *   - JFrame, JPanel, JDialog ... �� �پ��� Ŭ������ �����̳� ������ �� �� �ִ�
	 *   - �����̳ʿ��� ���̾ƿ��� ������ �� �ִ�
	 *   
	 *  # Component
	 *  
	 *   - �����̳� ���� ��ġ�� �� �ִ� �پ��� �͵�
	 *   - ��ư, ǥ, �����̴�, �޴� ... �� �پ��� Ŭ������ ������Ʈ ������ �� �� �ִ�
	 */
	
	public static void main(String[] args) {
		
		// ������ �ν��Ͻ� ����
		JFrame frame = new JFrame("GUI ���α׷���");
		frame.setLayout(null);
		
		// ������ ���� �ٸ� ������Ʈ�� ���ϼ� �ִ�
		JButton btn = new JButton("This is Button");
		JButton btn2 = new JButton("2");
		
		// ������Ʈ�� ũ�⸦ ���� �����ϱ� ���ؼ��� ���̴� ���� ���̾ƿ��� ����� �Ѵ�.
		btn.setLocation(50,50);
		btn.setSize(200, 80);
		
		btn2.setLocation(270,50);
		btn2.setSize(80, 200);
		
		frame.add(btn);
		frame.add(btn2);
		
		/* 
		 * 	�������� x��ư�� ������ �� ������ ����
		 * 	������ �� �ִ� int���� JFrame�� ����� �����Ǿ� �ִ�
		 * 
		 * 	EXIT_ON_CLOSE : X��ư�� ������ ���α׷��� �����Ѵ�
		 *  DISPOSE_ON_CLOSE : �������� 
		 *  DONOTHING_ON_CLOSE : ��������
		 *  HIDE_ON_CLOSE : ��������
		 */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ������ ũ�� ����
		frame.setSize(500,500);
		
		// ������ ��ġ ����(���� ������� ��� x�� + ����� ũ�� �ؾ���
		frame.setLocation(100, 100);
		
		// �������� ���̰� ����(�� �������� ���ִ� ���� ����)
		frame.setVisible(true);
		
	}
}
