package gui.component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageLabel extends JLabel {
	
	public ImageLabel(String path) {
		
		setIcon(new ImageIcon(path));
		
	}

}
