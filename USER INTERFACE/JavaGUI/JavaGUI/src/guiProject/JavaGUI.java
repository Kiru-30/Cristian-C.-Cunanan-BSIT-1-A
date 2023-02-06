package guiProject;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JavaGUI extends JFrame implements ActionListener   {

  public static void main(String[] args) {
    // create a new frame and set its properties
    JFrame frame = new JFrame("Computing Basic Salary with PhilHealth Benefits");
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (screenSize.width - 450) / 2;
    int y = (screenSize.height - 450) / 2;
    frame.setBounds(x, y, 450, 450);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setVisible(true);

    // create a new panel and add it to the frame
    JPanel panel = new JPanel();
    frame.add(panel);
    placeComponents(panel);

    frame.setVisible(true);
  }
  private static void placeComponents(JPanel panel) {
    panel.setLayout(null);
    
    // add a welcome label to the panel
    JLabel welcomeLabel = new JLabel("WELCOME!");
    welcomeLabel.setBounds(160, 10, 120, 25);
 
    welcomeLabel.setFont(new Font("Serif", Font.PLAIN, 20));
  
    // add an employee name label and text field to the panel
    JLabel employeeNameLabel = new JLabel("Employee Name");
    employeeNameLabel.setBounds(120, 40, 120, 25);
    panel.add(employeeNameLabel);

    JTextField employeeNameText = new JTextField(20);
    employeeNameText.setBounds(220, 40, 165, 25);
    panel.add(employeeNameText);

    // add a position label and text field to the panel
    JLabel positionLabel = new JLabel("Position");
    positionLabel.setBounds(120, 70, 120, 25);
    panel.add(positionLabel);

    JTextField positionText = new JTextField(20);
    positionText.setBounds(220, 70, 165, 25);
    panel.add(positionText);
    
    // add a working hours label and text field to the panel
    JLabel workHrsLabel = new JLabel("Working Hours");
    workHrsLabel.setBounds(120, 300, 80, 25);
    panel.add(workHrsLabel);
    
    JTextField workHrsText = new JTextField(20);
    workHrsText.setBounds(220, 300, 165, 25);
    panel.add(workHrsText);
    
    // add rate per hour label and text field to the panel
    JLabel rateLabel = new JLabel("Rate per Hour");
    rateLabel.setBounds(10, 250, 80, 25);
    panel.add(rateLabel);

    JTextField rateText = new JTextField(20);
    rateText.setBounds(200, 250, 180, 25);
    panel.add(rateText);
   
    // added Button
    JButton submitButton = new JButton("SUBMIT");
    submitButton.setBounds(165, 330, 100, 30);
    panel.add(submitButton);
    
 

  
    submitButton.addActionListener(new ActionListener() {
    	public void actionPerformed(ActionEvent e) {
    	String employeeName = employeeNameText.getText();
    	String position = positionText.getText();
    	String workHrsInput = workHrsText.getText();
    	String rateInput = rateText.getText();
    	float workHrs = Float.parseFloat(workHrsInput);
    	float rate = Float.parseFloat(rateInput);
    	float grossPay = (workHrs * rate) * 7;
    	float philHealth = (float) (grossPay * 0.275);
    	float pagIbig = (float) (grossPay * 0.01);
    	float sss = (float) (grossPay * 0.363);
    	String message = "Employee Name: " + employeeName +
    	"\nPosition: " + position +
    	"\nGross Pay: " + Float.toString(grossPay) +
    	"\nPhilHealth: " + Float.toString(philHealth) +
    	"\nPag Ibig: " + Float.toString(pagIbig) +
    	"\nSSS: " + Float.toString(sss);
    	JOptionPane.showMessageDialog(null, message);
    	}
    	});
  }

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
