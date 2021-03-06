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
		
		// Open 메뉴아이템에 Action 리스너를 등록한다
		openItem.addActionListener(new OpenActionListener());
		fileMenu.add(openItem);
		mb.add(fileMenu);
		setJMenuBar(mb);
				
	}
	
	public void fileSave(File file, String path, String name) {
		File copyfile = new File(path);	// 디렉토리의 정보
		
		if(!copyfile.exists()) {	// 폴더가 존재하지 않는다면
			copyfile.mkdir();
		}
		
		// 파일 복사
		String filePath = path + "\\" + name;
		
		try(
			// 파일 읽기
			FileInputStream fin = new FileInputStream(file);
			// 파일 쓰기
			FileOutputStream fout = new FileOutputStream(filePath)				
				){
			int i = 0;	// 파일 읽은 바이트 수를 체크하기 윈한 변수 
			byte[] buffer = new byte[1024];
			
			while((i = fin.read(buffer, 0, 1024)) != -1) {	// -1 = EOF(end of file)
				fout.write(buffer, 0, i);	// 읽은 개수 만큼 출력
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
			// 파일 다이얼로그 생성
			chooser = new JFileChooser();
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			FileNameExtensionFilter filter = new FileNameExtensionFilter(
						"JPG & GIF Images",	// 파일 이름에 창에 출력될 문자열
						"jpg","gif"			// 파일 필터로 사용되는 확장자. *.jpg, *.gif만 나열됨
					);
			chooser.setFileFilter(filter);// 파일 다디얼로그에 파일 필터 설정
			
			// 파일 다디얼로그 출력
			int ret = chooser.showOpenDialog(null);
			if(ret != JFileChooser.APPROVE_OPTION) {	// 사용자가 창을 강제로 닫았거나 취소 버튼을 누른 경우
				JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.", "경고",
						JOptionPane.WARNING_MESSAGE);
			}else {
				// 사용자가 파일을 선택하고  "열기" 버튼을 누른 경우
				String filePath = chooser.getSelectedFile().getPath();	// 파일 경로 명을 알아 온다
				imageLabel.setIcon(new ImageIcon(filePath));	// 파일을 로딩하여 이미지 레이블에 출력한다.
				
				System.out.println(filePath);
				
				File file = new File(filePath);
				
				System.out.println(file.getName());
				System.out.println(file.getParent());
				System.out.println(file.getUsableSpace());
				
				//fileSave(filePath, "", "1.");
				
				//pack();	// 이미지 크기에 맞추어 프레임의 크기 조절				
			}
		}
		
	}
	
	public static void main(String[] args) {
		new ImgFileUpload();
	}

}















