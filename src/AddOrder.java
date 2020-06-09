import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class AddOrder extends JFrame{
	private final JList<String> orderJList;
	private final JList<String> saveJList;
	private static final String[] orderNames = {"Fruit", "Vegetable", "Cake"};
	private JButton saveJButton;
	private JButton exitJButton;
	
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
						String price = JOptionPane.showInputDialog("Enter the price($/1kg)");
				        String kilo = JOptionPane.showInputDialog("Enter how much you want to buy(kg)");
				        
				        int data1 = Integer.parseInt(price);
				        int data2 = Integer.parseInt(kilo);
				        int sum = data1*data2;
				        
				        JOptionPane.showMessageDialog(null,"The price($/1kg) is "+ data1 +
				        		"\r\nYou want to buy "+ data2 + "\r\nThe total price is " + sum 
				        		,"Summarize",JOptionPane.PLAIN_MESSAGE );
					}
				});
		add(saveJButton);
		
		exitJButton = new JButton("Exit");
		exitJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		add(exitJButton);
		
		saveJList = new JList<String>();
		saveJList.setVisibleRowCount(1);
		saveJList.setFixedCellWidth(100);
		saveJList.setFixedCellHeight(150);
		saveJList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(saveJList));
	}
}