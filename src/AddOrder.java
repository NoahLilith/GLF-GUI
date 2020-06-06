import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AddOrder extends JFrame{
	private final JList<String> orderJList;
	private final JList<String> saveJList;
	private static final String[] orderNames = {"Fruit", "Vegetable", "Cake"};
	private JButton saveJButton;
	
	public AddOrder() {
		super("Add Order");
		setLayout(new FlowLayout());
		
		orderJList = new JList<String>(orderNames);
		orderJList.setVisibleRowCount(3);
		
		orderJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(orderJList));
		
		saveJButton = new JButton("Save");
		saveJButton.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent event) {
						saveJList.setListData(orderJList.getSelectedValuesList().toArray(
								new String[0]));
					}
				}
				);
		
		add(saveJButton);
		
		saveJList = new JList<String>();
		saveJList.setVisibleRowCount(1);
		saveJList.setFixedCellWidth(100);
		saveJList.setFixedCellHeight(150);
		saveJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(saveJList));
	}
}