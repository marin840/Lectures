package hr.fer.oop.swing.example1;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class WindowWithLabel extends JFrame {

  public WindowWithLabel() {
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setTitle("Picture");
    
    ImageIcon image = new ImageIcon("fer.jpg");
    JLabel label = new JLabel(image);
    add(label, BorderLayout.CENTER);
  }

  public static void main(String[] args) throws Exception {
    SwingUtilities.invokeAndWait(() -> {
      WindowWithLabel window = new WindowWithLabel();
      window.setLocation(20, 20);
      window.pack();
      window.setVisible(true);
    });
  }
}
