package gui.quiz.hangman;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EndPanel extends JPanel {
	
	private JLabel viewLabel;
	private JLabel viewAnswer;
	
	public EndPanel() {
		setLayout(null);
		setBackground(Color.BLACK);
		setBounds( 0, 0, 500, 600);

		JButton endButton = new JButton("Exit");
		
		viewLabel = new JLabel("", 0);
		viewLabel.setForeground(Color.WHITE);
		viewLabel.setFont(new Font("Broadway", Font.PLAIN, 45));		
		viewLabel.setBounds(50, 100, 400, 100);		
		
		viewAnswer = new JLabel("", 0);
		viewAnswer.setForeground(Color.WHITE);
		viewAnswer.setFont(new Font("Broadway", Font.PLAIN, 28));		
		viewAnswer.setBounds(50, 190, 400, 100);
		
		
		
		endButton.setBounds(180, 370, 150, 50);		
		endButton.setFont(new Font("Broadway", Font.PLAIN, 18));
		
		endButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
				
		add(viewAnswer);
		add(viewLabel);
		add(endButton);
		
		setVisible(false);
	}
	
	public void setResult(String result, String answer) {
		viewLabel.setText(result);
		viewAnswer.setText(answer);
	}
	
}
