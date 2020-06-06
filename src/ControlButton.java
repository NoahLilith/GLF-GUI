import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ControlButton extends Main {
  private JButton a = new JButton("Add Order");
  private JButton b = new JButton("Show Order");

  public ControlButton() {
    JPanel panel = new JPanel(); // Use the panel to group buttons
    panel.add(a);
    panel.add(b);

    this.add(panel, FlowLayout.RIGHT); // Add buttons to the frame 
    
    a.addActionListener(new ActionListener() { 
      @Override 
      public void actionPerformed(ActionEvent e) {
        
      }
    });
    
    b.addActionListener(new ActionListener() { 
      @Override 
      public void actionPerformed(ActionEvent e) {

      }
    });
    
  }
  
  private void add(JPanel panel, int right) {
	// TODO 自動產生的方法 Stub
	
}

/** Main method */
  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setTitle("GoodLifeFood");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(200, 200);
    frame.setVisible(true);
  }
} 
