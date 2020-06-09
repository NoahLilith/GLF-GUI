import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class ShowOrder extends JFrame{
	//以滾動選單決定我要展開的Order
	private final JList<String> saveJList;
	private JButton ConfirmButton;

	
	public ShowOrder() {
		super("Show Order");
		setLayout(new FlowLayout());
		
		saveJList = new JList<String>();
		saveJList.setVisibleRowCount(1);
		saveJList.setFixedCellWidth(100);
		saveJList.setFixedCellHeight(150);
		saveJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(saveJList));
		
		ConfirmButton = new JButton("Check");
		ConfirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				 JOptionPane.showMessageDialog(null, new JScrollPane(saveJList));
			}
		});
		add(ConfirmButton);
	}
	
}