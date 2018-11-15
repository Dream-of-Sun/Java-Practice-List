package fff;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MainUI {
	static Frame fra=new Frame("hello");
	
	public static void main(String args[]){
		//´´½¨
		fra.add(new Button("fhsaasjf"));
		fra.setBounds(0, 0, 200, 200);
		fra.setVisible(true);
		fra.setState(fra.NORMAL);
		fra.show();
		
		//¹Ø±Õ 
	fra.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
		System.exit(0);
		
		}
		});
	
	
	
	}
}
	
