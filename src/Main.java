import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        ButtonOption.main(args); 
        String name = JOptionPane.showInputDialog("Enter your name");
        String address = JOptionPane.showInputDialog("Enter your address");
        
        int data1 = Integer.parseInt(name);
        int data2 = Integer.parseInt(address);
        
        JOptionPane.showMessageDialog(null,"The Customer's name is "+ data1 +
        		"\r\nThe Customer's address is "+ data2,"CustomerProfile",JOptionPane.PLAIN_MESSAGE );

        //結束後可以轉至ButtonFrame
    }
}