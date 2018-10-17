import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class finalprice extends JFrame  {
	JLabel jlabel1,jlabel2,jlabel3;
	JTextField jtextfiled;
	JButton jbutton1,jbutton2;
	JPanel  jpanel1,jpanel2,jpanel3;
	GridLayout gridlay = new GridLayout(2,1);
	JPanel jpanel =new JPanel();
	JFrame jframe=new JFrame();
	Container content=jframe.getContentPane() ;
	addprice add = new addprice("");
	public finalprice (String a){
		super();
		
		System.out.println("0000"+a+"0000");
		final JTextField jtextfiled=new JTextField(10);
		JButton jbutton1=new JButton("继续出价");
		JButton jbutton2=new JButton("不加价");
		jpanel.add(jbutton1);
		jpanel.add(jbutton2);
		jpanel.setBackground(Color.white);
		jframe.add(jpanel);
		jframe.setBackground(Color.BLUE);
		jframe.setSize(500,200);
		jframe.setVisible(true);
		jframe.setLocationRelativeTo(null);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}}