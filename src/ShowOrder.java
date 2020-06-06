import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class ShowOrder extends JFrame{
	//以滾動選單決定我要展開的Order
	private final JList<String> saveJList;

	
	public ShowOrder() {
		super("Show Order");
		setLayout(new FlowLayout());
		
		saveJList = new JList<String>();
		saveJList.setVisibleRowCount(1);
		saveJList.setFixedCellWidth(100);
		saveJList.setFixedCellHeight(150);
		saveJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(saveJList));
	}
}