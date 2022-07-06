package gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Graphic extends JPanel {
	
//	GraphicExample main;
//	
//	public Graphic(GraphicExample main) {
//		this.main = main;
//	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setLayout(null);
		int endRectY = super.getHeight() - 200;
		int endRectX = super.getWidth();
		int startRectX = 80;
		
		//System.out.println("width : " + super.getWidth() + " , height : " + super.getHeight());
		g.setColor(Color.BLUE);		
		g.drawRect(0, 0, endRectX, endRectY);
		g.setColor(Color.BLACK);
		g.drawLine(startRectX, 0, startRectX, endRectY);		
		g.drawLine(startRectX, endRectY, endRectX, endRectY);
		g.setColor(Color.GRAY);
		// 월별 선
		for(int i  = 1; i < 13; i++) {
			int lineX = startRectX + ((endRectX - startRectX + 50) / 12) * i;
			g.drawLine(lineX, 0, lineX, endRectY);
			
			JLabel jlMonth = new JLabel(String.valueOf(i));
			jlMonth.setBounds(lineX - startRectX + 15, endRectY - 10, 40, 40);
			
			add(jlMonth);
		}
		
		// 금액 선
		int maxNum = 90000000;
		int cntY = 10;
		for(int i = 0; i < cntY; i++) {
			int lineY = endRectY / cntY * (cntY - i) + (endRectY - (endRectY / cntY) * cntY);
			//System.out.println(lineY);
			g.drawLine(startRectX, lineY, endRectX, lineY);
			
			JLabel jlWon = new JLabel(String.valueOf(i * 10000000),0);
			jlWon.setBorder(new LineBorder(Color.red));
			jlWon.setHorizontalAlignment(JLabel.RIGHT);
			jlWon.setBounds(startRectX - 85, lineY-20, 80, 40);
			
			add(jlWon);
		}
			
		
//		g.setColor(Color.BLUE);
//		g.drawRect(10, 10, 50, 50);
//		g.drawRect(50, 50, 50, 50);
//		g.setColor(Color.MAGENTA);
//		g.drawRect(90, 90, 50, 50);
		
//		g.drawLine(0, 0, 100, 100);		
	}
}

