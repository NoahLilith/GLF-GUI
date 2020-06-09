import javax.swing.*;

public class ShowOrderSelect{
	public static void main(String[] args) {
		//選擇完畢後 彈出新視窗
		ShowOrder showorder = new ShowOrder();
		showorder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		showorder.setSize(300,300);
		showorder.setVisible(true);
		//視窗中可修改Order
		
		//修改後可儲存成新的結果
	}
}