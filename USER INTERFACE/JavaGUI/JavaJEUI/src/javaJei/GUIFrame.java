package javaJei;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class GUIFrame extends JFrame {
	
	GUIFrame () {
		  // TODO Auto-generated method stub
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setTitle("Computing Basic Salary");
        frame.setSize(1280, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);

        // Get the screen size and position the JFrame in the center of the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((screenSize.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((screenSize.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);

        // LOGO FOR MY JFRAME
        ImageIcon image = new ImageIcon("ccs.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setVisible(true);
      
        //BACKGROUND
        JLabel background = new JLabel(new ImageIcon("background.png"));
        background.setSize(1280, 720);
        frame.setContentPane(background);
       
        
        //WELCOME LABEL
        JLabel welcome = new JLabel();
        welcome.setIcon(new ImageIcon("welcome.png"));
        welcome.setSize(436,300 ); // adjust the size of the image as needed
        welcome.setBounds(690, -170, 500, 500);
        frame.add(welcome);
        
        
        
        
        //dct logo and ccs
        
        JLabel icon1 = new JLabel();
        icon1.setIcon(new ImageIcon("logodct.png"));
        icon1.setSize(250,250 ); // adjust the size of the image as needed
        icon1.setBounds(1090, 500, 300, 300);
        frame.add(icon1);
        
        JLabel icon2 = new JLabel();
        icon2.setIcon(new ImageIcon("logoccs.png"));
        icon2.setSize(300,300 ); // adjust the size of the image as needed
        icon2.setBounds(1010, 460, 300, 300);
        frame.add(icon2);
       
        
        //EMPLOYEE ID AND TEXTFIELD
        JLabel employeeID = new JLabel("EMPLOYEE ID :");
        employeeID.setFont(new Font("Saira Condensed", Font.BOLD, 22));
        employeeID.setBounds(600, 180, 200, 50);
        employeeID.setSize(300, 30);
        employeeID.setForeground(Color.white);
        employeeID.setOpaque(false);
        frame.add(employeeID);
     
        
        JTextField employeeIDTextField = new JTextField();
        employeeIDTextField.setBounds(865, 180, 200, 50);
        employeeIDTextField.setSize(300, 30);
        employeeIDTextField.setFont(new Font("Saira Condensed", Font.PLAIN, 22));
        frame.add(employeeIDTextField);
        employeeIDTextField.setBackground(Color.decode("#D9D9D9"));
   

        
        
        //EMPLOYEE NAME AND TEXTFIELD
        JLabel emplooyeeName = new JLabel("EMPLOYEE NAME :");
        emplooyeeName.setFont(new Font("Saira Condensed", Font.BOLD, 22));
        emplooyeeName.setBounds(600, 230, 200, 50);
        emplooyeeName.setSize(300, 30);
        emplooyeeName.setForeground(Color.white);
        emplooyeeName.setOpaque(false);
        frame.add(emplooyeeName);
        
        
        JTextField emplooyeeNameIDTextField = new JTextField();
        emplooyeeNameIDTextField.setBounds(865, 230, 200, 50);
        emplooyeeNameIDTextField.setSize(300, 30);
        emplooyeeNameIDTextField.setFont(new Font("Saira Condensed", Font.PLAIN, 22));
        frame.add(emplooyeeNameIDTextField);
        emplooyeeNameIDTextField.setBackground(Color.decode("#D9D9D9"));
      
        
        
        //EMPLOYEE POSITION AND TEXFIELD
        JLabel employeePosition = new JLabel("EMPLOYEE POSITION :");
        employeePosition.setFont(new Font("Saira Condensed", Font.BOLD, 22));
        employeePosition.setBounds(600, 280, 200, 50);
        employeePosition.setSize(300, 30);
        employeePosition.setForeground(Color.white);
        employeePosition.setOpaque(false);
        frame.add(employeePosition);
      
        
        JTextField employeePositionNameIDTextField = new JTextField();
        employeePositionNameIDTextField.setBounds(865, 280, 200, 50);
        employeePositionNameIDTextField.setSize(300, 30);
        employeePositionNameIDTextField.setFont(new Font("Saira Condensed", Font.PLAIN, 22));
        frame.add(employeePositionNameIDTextField);
        employeePositionNameIDTextField.setBackground(Color.decode("#D9D9D9"));

        
      //EMPLOYEE WORKING HOUR AND TEXFIELD
        JLabel employeeWorkinghrs = new JLabel("WORKING HOUR :");
        employeeWorkinghrs.setFont(new Font("Saira Condensed", Font.BOLD, 22));
        employeeWorkinghrs.setBounds(600, 330, 200, 50);
        employeeWorkinghrs.setSize(300, 30);
        employeeWorkinghrs.setForeground(Color.white);
        employeeWorkinghrs.setOpaque(false);
        frame.add(employeeWorkinghrs);
       
        
        JTextField employeeWorkinghrsIDTextField = new JTextField();
        employeeWorkinghrsIDTextField.setBounds(865, 330, 200, 50);
        employeeWorkinghrsIDTextField.setSize(300, 30);
        employeeWorkinghrsIDTextField.setFont(new Font("Saira Condensed", Font.PLAIN, 22));
        frame.add(employeeWorkinghrsIDTextField);
        employeeWorkinghrsIDTextField.setBackground(Color.decode("#D9D9D9"));
        
        
        
      //EMPLOYEE RATE  AND TEXFIELD
        JLabel employeeRate = new JLabel("RATE :");
        employeeRate.setFont(new Font("Saira Condensed", Font.BOLD, 22));
        employeeRate.setBounds(600, 380, 200, 50);
        employeeRate.setSize(300, 30);
        employeeRate.setForeground(Color.white);
        employeeRate.setOpaque(false);
        frame.add(employeeRate);
        
        
        
        JTextField employeeRateTextField = new JTextField();
        employeeRateTextField.setBounds(865, 380, 200, 50);
        employeeRateTextField.setSize(300, 30);
        employeeRateTextField.setFont(new Font("Saira Condensed", Font.PLAIN, 22));
        frame.add(employeeRateTextField);
        employeeRateTextField.setBackground(Color.decode("#D9D9D9"));
   
        
        
      //EMPLOYEE RATE  AND TEXFIELD
        JLabel employeeOvertime = new JLabel("OVERTIME :");
        employeeOvertime.setFont(new Font("Saira Condensed", Font.BOLD, 22));
        employeeOvertime.setBounds(600, 430, 200, 50);
        employeeOvertime.setSize(300, 30);
        employeeOvertime.setForeground(Color.white);
        employeeOvertime.setOpaque(false);
        frame.add(employeeOvertime);
     
        
        JTextField employeeOvertimeTextField = new JTextField();
        employeeOvertimeTextField.setBounds(865, 430, 200, 50);
        employeeOvertimeTextField.setSize(300, 30);
        employeeOvertimeTextField.setFont(new Font("Saira Condensed", Font.PLAIN, 22));
        frame.add(employeeOvertimeTextField);
        employeeOvertimeTextField.setBackground(Color.decode("#D9D9D9"));

        
        JButton bottomButton = new JButton("PROCEED");
        bottomButton.setBounds(780, 500, 200, 50);
        bottomButton.setSize(200, 50);
        bottomButton.setFont(new Font("Saira Condensed", Font.BOLD, 22));
        bottomButton.setFocusable(false);
        frame.add(bottomButton);
        bottomButton.setFocusable(false);
        frame.setContentPane(background);
       
        
     // Set the font for the JOptionPane message
        UIManager.put("OptionPane.messageFont", new Font("Saira Condensed", Font.PLAIN, 30));
       
        // Add action listener for the bottom button
        bottomButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the employee information from the text fields
                String employeeName = emplooyeeNameIDTextField.getText();
                String position = employeeIDTextField.getText();
                String workHrsInput = employeeWorkinghrsIDTextField.getText();
                String rateInput = employeeRateTextField.getText();
                String overtimeInput = employeeOvertimeTextField.getText();

                // Convert the input strings to float values
                float workHrs = Float.parseFloat(workHrsInput);
                float rate = Float.parseFloat(rateInput);
                float overtime = Float.parseFloat(overtimeInput);

                // Calculate total hours
                float totalhours = workHrs + overtime;

                // Calculate gross pay
                float grossPay = (totalhours * rate) * 5 * 4;

                // Calculate contributions
                float philHealth = (float) (grossPay * 0.0275);
                float pagIbig = (float) (grossPay * 0.01);
                float sss = (float) (grossPay * 0.11);

                // Calculate net pay
                float netPay = (float) grossPay - philHealth - sss - pagIbig;

                // Compose the message to display
                String message = "Employee Name: " + employeeName +
                                 "\nPosition: " + position +
                                 "\nGross Pay: " + Float.toString(grossPay) +
                                 "\nPhilHealth: " + Float.toString(philHealth) +
                                 "\nPag Ibig: " + Float.toString(pagIbig) +
                                 "\nSSS: " + Float.toString(sss) +
                                 "\nNETPAY: " + Float.toString(netPay);

                // Show confirmation dialog
                int option = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    // Show message dialog with the calculated information
                    JOptionPane.showMessageDialog(null, message);
                } else {
                    // Show message dialog indicating action was cancelled
                    JOptionPane.showMessageDialog(null, "Action cancelled!", "Confirmation", JOptionPane.PLAIN_MESSAGE);
                }
            }
        });

	}
}
	



