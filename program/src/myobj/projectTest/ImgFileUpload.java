package myobj.projectTest;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ImgFileUpload extends JFrame {
	
	Container contentPane;
	JLabel imageLabel = new JLabel();
	
	public ImgFileUpload() {
		
		setTitle("");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.add(imageLabel);
		createMenu();
		setBounds(500, 150, 800, 800);
		setVisible(true);
		
	}
	
	public void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("Open");
		
		// Open �޴������ۿ� Action �����ʸ� ����Ѵ�
		openItem.addActionListener(new OpenActionListener());
		fileMenu.add(openItem);
		mb.add(fileMenu);
		setJMenuBar(mb);
				
	}
	
	public void fileSave(File file, String path, String name) {
		File copyfile = new File(path);	// ���丮�� ����
		
		if(!copyfile.exists()) {	// ������ �������� �ʴ´ٸ�
			copyfile.mkdir();
		}
		
		// ���� ����
		String filePath = path + "\\" + name;
		
		try(
			// ���� �б�
			FileInputStream fin = new FileInputStream(file);
			// ���� ����
			FileOutputStream fout = new FileOutputStream(filePath)				
				){
			int i = 0;	// ���� ���� ����Ʈ ���� üũ�ϱ� ���� ���� 
			byte[] buffer = new byte[1024];
			
			while((i = fin.read(buffer, 0, 1024)) != -1) {	// -1 = EOF(end of file)
				fout.write(buffer, 0, i);	// ���� ���� ��ŭ ���
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	class OpenActionListener implements ActionListener{
		
		JFileChooser chooser;
		
		public OpenActionListener() {
			// ���� ���̾�α� ����
			chooser = new JFileChooser();
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			FileNameExtensionFilter filter = new FileNameExtensionFilter(
						"JPG & GIF Images",	// ���� �̸��� â�� ��µ� ���ڿ�
						"jpg","gif"			// ���� ���ͷ� ���Ǵ� Ȯ����. *.jpg, *.gif�� ������
					);
			chooser.setFileFilter(filter);// ���� �ٵ��α׿� ���� ���� ����
			
			// ���� �ٵ��α� ���
			int ret = chooser.showOpenDialog(null);
			if(ret != JFileChooser.APPROVE_OPTION) {	// ����ڰ� â�� ������ �ݾҰų� ��� ��ư�� ���� ���
				JOptionPane.showMessageDialog(null, "������ �������� �ʾҽ��ϴ�.", "���",
						JOptionPane.WARNING_MESSAGE);
			}else {
				// ����ڰ� ������ �����ϰ�  "����" ��ư�� ���� ���
				String filePath = chooser.getSelectedFile().getPath();	// ���� ��� ���� �˾� �´�
				imageLabel.setIcon(new ImageIcon(filePath));	// ������ �ε��Ͽ� �̹��� ���̺� ����Ѵ�.
				
				System.out.println(filePath);
				
				File file = new File(filePath);
				
				System.out.println(file.getName());
				System.out.println(file.getParent());
				System.out.println(file.getUsableSpace());
				
				//fileSave(filePath, "", "1.");
				
				//pack();	// �̹��� ũ�⿡ ���߾� �������� ũ�� ����				
			}
		}
		
	}
	
	public static void main(String[] args) {
		new ImgFileUpload();
	}

}















