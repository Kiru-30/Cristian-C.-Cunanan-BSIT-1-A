import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Frame extends JFrame {

    public Frame() {
        super("My Frame");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - 450) / 2;
        int y = (screenSize.height - 450) / 2;
        setBounds(x, y, 450, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
	    
	 
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
