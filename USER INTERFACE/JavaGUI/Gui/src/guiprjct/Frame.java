package guiprjct;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Frame extends JFrame implements ActionListener {
	JTextField textbox, textbox1,textbox2;
	JButton button ;
Frame(){
		
		JFrame frame = new JFrame();
		ImageIcon icon = new ImageIcon("CCS_Logo.png");
		ImageIcon icon2 = new ImageIcon(new ImageIcon("CCS_Logo.png").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		JLabel label = new JLabel();
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JLabel labelWelcome = new JLabel();
		textbox = new JTextField(); 
		textbox1 = new JTextField(); 
		textbox2 = new JTextField(); 
	
		button = new JButton();
		
		setSize(350, 350);
		setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
		setTitle("BSIT 1A GUI DEMO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(icon.getImage());
		getContentPane().setBackground(Color.DARK_GRAY);
		setResizable(false);
		
		label2.setText("Enter Num 1");
		label2.setBounds(130, 10, 100, 30);
		label2.setForeground(Color.WHITE);
		
		setBounds(20, 75,150, 30);
		setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		setForeground(Color.blue);
		
		
		
		label.setText("Enter Num 1");
		label.setBounds(20, 50, 100, 30);
		label.setForeground(Color.WHITE);
		
		textbox.setBounds(20, 75,150, 30);
		textbox.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		textbox.setForeground(Color.blue);
		textbox.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 3));
		
		label1.setText("Enter Num 2");
		label1.setBounds(20, 115, 100, 30);
		label1.setForeground(Color.WHITE);
		
		textbox1.setBounds(20, 140,150, 30);
		textbox1.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		textbox1.setForeground(Color.blue);
		textbox1.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 3));
		
		textbox2.setBounds(20, 180,150, 30);
		textbox2.setFont(new Font("Comic Sans MS", Font.PLAIN, 15));
		textbox2.setForeground(Color.blue);
		textbox2.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 3));
		textbox2.setEnabled(false);

		button.setBounds(20, 180, 120, 50);
		button.setText("ADD");
		button.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		button.setFocusable(false);
		button.addActionListener(this);
		
		
		add(label);
		add(label1);
		add(label2);
		add(textbox);
		add(textbox1);
		add(textbox2);
	

		add(button);
		setLayout(null);
		setVisible(true);
	
	

}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}