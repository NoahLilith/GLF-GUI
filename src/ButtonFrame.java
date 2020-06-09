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
	  
	  plainJButton1.addActionListener(new ButtonHandlerAdd());
	  plainJButton2.addActionListener(new ButtonHandlerShow());
  }
  
	private class ButtonHandlerAdd implements ActionListener{
	  @Override
	  public void actionPerformed(ActionEvent event) {
		 JOptionPane.showMessageDialog(ButtonFrame.this, 
				 String.format("you chosed: %s", event.getActionCommand()));
		 AddOrderSelect.main(null);
	  }
	}
	private class ButtonHandlerShow implements ActionListener{
		  @Override
		  public void actionPerformed(ActionEvent event) {
			 JOptionPane.showMessageDialog(ButtonFrame.this, 
					 String.format("you chosed: %s", event.getActionCommand()));
			 ShowOrderSelect.main(null);
		  }
		}
}