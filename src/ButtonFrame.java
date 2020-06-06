import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonFrame extends JFrame {
	private final JButton plainJButton1;
	private final JButton plainJButton2;
	
	public ButtonFrame() {
	  super("Options");
	  setLayout(new FlowLayout());
	  
	  plainJButton1 = new JButton("Add Order");
	  add(plainJButton1);
	  plainJButton2 = new JButton("Show Order");
	  add(plainJButton2);
	  
	  ButtonHandler handler = new ButtonHandler();
	  plainJButton1.addActionListener(handler);
	  plainJButton2.addActionListener(handler);
  }
  
	private class ButtonHandler implements ActionListener{
	  @Override
	  public void actionPerformed(ActionEvent event) {
		 JOptionPane.showMessageDialog(ButtonFrame.this, 
				 String.format("you chosed: %s", event.getActionCommand()));
	  }
  }
}