package myobj.projectTest;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar {
	
	//static MainActivity14 mainActivity;
	static JLabel txt;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.out.println("[GUI (awt/swing) - JFrame ������ â�� JMenuBar �޴��� �߰� �� Ŭ�� �̺�Ʈ ���� �ǽ�]");
				
				/*[�� ��]
				 * 1. �ڹٿ����� JFrame�� ����ؼ� GUI ���α׷��� ���� �� �ֽ��ϴ�
				 * 2. JMenuBar : �޴��� Ʋ�� �����մϴ�
				 * 3. JMenu : ��޴��� �����մϴ�
				 * 4. JMenuItem : ����޴��� �����մϴ� 
				 * */	
				
				//TODO Ŭ���� ��ü ���� (Ŭ�� �̺�Ʈ ����)
				//mainActivity = new MainActivity14();
				
				//TODO �θ� ������ ����
				JFrame frm = new JFrame("������ â �޴��� ����");
		 
				//TODO �θ� ������ ũ�� ���� (����, ����)
				frm.setSize(500, 500);
		 
				//TODO �θ� �������� ȭ�� ����� ��ġ
				frm.setLocationRelativeTo(null);
		 
				//TODO �θ� �������� �ݾ��� �� �޸𸮿��� ���ŵǵ��� ����
				frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				//TODO �θ� ������ â ũ�� ���� �ǽ�
				frm.setResizable(false);
		 
				//TODO �θ� ���̾ƿ� ����
				frm.getContentPane().setLayout(null);
						
				//TODO �ڽ� ���̾ƿ� [�޴���] ����
				JMenuBar menu = new JMenuBar(); //�޴��� Ʋ ����
				JMenu file = new JMenu("����"); //TODO ��޴� ����
				JMenuItem open = new JMenuItem("����");
				JMenuItem close = new JMenuItem("�ݱ�");
				//open.addActionListener(mainActivity); //TODO �޴��� Ŭ���̺�Ʈ ����
				//close.addActionListener(mainActivity); //TODO �޴��� Ŭ���̺�Ʈ ����		
				file.add(open);	
				file.add(close);	
						
				JMenu help = new JMenu("����"); //TODO ��޴� ����
				JMenu sub_help = new JMenu("������");
				JMenuItem google = new JMenuItem("����");
				JMenuItem naver = new JMenuItem("���̹�");
				//google.addActionListener(mainActivity); //TODO �޴��� Ŭ���̺�Ʈ ����
				//naver.addActionListener(mainActivity); //TODO �޴��� Ŭ���̺�Ʈ ����	
				sub_help.add(google);
				sub_help.add(naver);		
				help.add(sub_help);
				
				menu.add(file); //TODO �޴��� Ʋ�� ��޴� �߰�
				menu.add(help); //TODO �޴��� Ʋ�� ��޴� �߰�
				menu.setBounds(0, 0, 500, 30); //setBounds(������ġ, ������ġ, ���α���, ���α���);
				
				//TODO �ڽ� ���̾ƿ� [�� �ؽ�Ʈ] ����
				txt = new JLabel("");
				txt.setBounds(0, 35, 500, 100); //setBounds(������ġ, ������ġ, ���α���, ���α���);
				txt.setFont(new Font("���� ���", 0, 20)); //TODO ��Ʈ ����
				txt.setHorizontalAlignment(JLabel.CENTER); //TODO �ؽ�Ʈ ���� ǥ�� ����
						
				//TODO �θ� �����ӿ��ٰ� �ڽ� ������Ʈ �߰�
				frm.getContentPane().add(menu);
				frm.getContentPane().add(txt);
				
				//TODO �θ� �������� ���̵��� ����
				frm.setVisible(true);
	}
}
