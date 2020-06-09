import javax.swing.*;

public class AddOrderSelect{
	public static void main(String[] args) {
		//選擇完畢後 彈出新視窗
		AddOrder addorder = new AddOrder();
		addorder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addorder.setSize(300,300);
		addorder.setVisible(true);
		//輸入完畢後儲存
	}
}