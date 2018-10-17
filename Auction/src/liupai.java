import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class liupai {
	JLabel jlabel1,jlabel2,jlabel3;
	JButton jbutton,jbutton1;
	JPanel  jpanel1,jpanel2,jpanel3;
	GridLayout gridlay = new GridLayout(2,1);
	JPanel jpanel =new JPanel();
	JFrame jframe=new JFrame();
	Container content=jframe.getContentPane();
	public liupai(){
		super();
	JButton jbutton=new JButton("确定");
	JLabel jlabel1 = new JLabel("亲，商品流拍了");
	jpanel.add(jlabel1);
	jpanel.add(jbutton);
	jpanel.setBackground(Color.white);
	jframe.add(jpanel);
	jframe.setBackground(Color.BLUE);
	jframe.setSize(500,200);
	jframe.setVisible(true);
	jframe.setLocationRelativeTo(null);
	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
	}
