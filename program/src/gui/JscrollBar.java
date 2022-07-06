package gui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

public class JscrollBar extends JFrame {
	
    public JscrollBar() {
    	
    	JLabel jl = new JLabel();
    	JLabel jl2 = new JLabel();
    	
    	jl.setBounds(100,100,100,100);
    	jl.setBorder(new LineBorder(Color.RED));
    	jl.setIcon(new ImageIcon("img\\img1.jpg"));
    	
    	jl2.setBounds(300,300,100,100);
    	jl2.setBorder(new LineBorder(Color.RED));
    	jl2.setIcon(new ImageIcon("img\\img1.jpg"));
    	
    	JPanel jp = new JPanel();
    	
    	jp.setLayout(null);
    	jp.setBackground(Color.BLACK);
    	jp.setBounds(0,0,500,500);
    	jp.add(jl);
    	jp.add(jl2);
    	
    	//add(jp);
    	
    	JScrollPane scPane = new JScrollPane(jp);
    	System.out.println(scPane.getAutoscrolls());
    	scPane.setBounds(100,100,300,300);
    	
    	add(scPane);
    	
    	setLayout(null);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	setBounds(500, 150, 800, 800);
		setVisible(true);
    }



    public static void main(String args[]) {
    	new JscrollBar();
    }
}
