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
		
		// ī�� ���̾ƿ� : ī��ó�� ���� ������Ʈ�� �ѱ�� ����� �ִ� ���̾ƿ�
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
				// next(parent) : ī�� ���̾ƿ��� �������� �ѱ��
				// ī�� ���̾ƿ��� ������ ���� ��� �����̳ʸ� �����ؾ� �ϴ��� �Ű������� �˷���� �Ѵ�
				//clManager.next(pane1);
				// previous(parent) : ī�� ���̾ƿ��� �������� �ѱ��				
				//clManager.previous(pane1);
				// first(parent) : ī�� ���̾ƿ��� ó������
				//clManager.first(pane1);
				// last(parent) : ī�� ���̾ƿ��� ����������
				//clManager.last(pane1);
				
				// show(parent, cardName) : ���ϴ� ī��� �̵��ϱ�. �����̳ʿ� ������ �� �ٿ��� �̸��� �ʿ��ϴ�
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
