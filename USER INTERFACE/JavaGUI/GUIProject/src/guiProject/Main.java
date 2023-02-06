package guiProject;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

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
        // code to place components on the panel
    }
}