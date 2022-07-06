package gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GirdBacLayout extends JFrame {
	
	GridBagLayout gbl= new GridBagLayout();
    GridBagConstraints gbc= new GridBagConstraints();
	
	public GirdBacLayout() {
		
		super("Demo Frame");
		
		JPanel wholePanel = new JPanel(gbl);
		
		add(wholePanel, BorderLayout.CENTER);
		
		JButton btn1,btn2,btn3,btn4,btn5;
		
		btn1 = new JButton("0_0");		
		gbAdd(btn1, 0, 0, 1, 1,1,1,wholePanel);
		
		btn2 = new JButton("1_0");		
		gbAdd(btn2, 1, 1, 3, 1,1,1,wholePanel);
		
		btn3 = new JButton("0_1");		
		gbAdd(btn3, 2, 2, 1, 1,1,1,wholePanel);
		
		btn4 = new JButton("1_1");		
		gbAdd(btn4, 3, 3, 1, 1,1,1,wholePanel);
		
		btn5 = new JButton("2_1");		
		gbAdd(btn5, 4, 4, 1, 1,1,1,wholePanel);
		
		setBounds(300, 200, 400, 400);
		setVisible(true);
		
	}
	
	public void gbAdd(Component c, int x, int y, int w, int h, int k, int t,JPanel jpanel) {

        gbc.gridx = x;
        gbc.gridy = y;         
        gbc.gridwidth  = w;	//넓이
        gbc.gridheight = h;	//높이
                
        gbc.weightx = k;
        gbc.weighty = t;
        
        gbl.setConstraints(c, gbc); //컴포넌트를 컴포넌트 위치+크기 정보에 따라 GridBagLayout에 배치
   
        jpanel.add(c);

     }
	
	public static void main(String[] args) {
		
		new GirdBacLayout();
		
	}

}
