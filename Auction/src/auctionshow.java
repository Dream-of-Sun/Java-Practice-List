import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import connection.goods;


public class auctionshow  {
	
	JLabel jlabel1,jlabel2,jlabel3,jlabel4,jlabel5,jlabel6;
	JTextField jtextfiled,jtextfiled1,jtextfiled2;
	JButton jbutton,jbutton1,jbutton2,jbutton3,jbutton4,jbutton5;
	JPanel  jpanel1,jpanel2,jpanel3;
	GridLayout gridlay = new GridLayout(3,4);
	JPanel jpanel =new JPanel();
	JFrame jframe=new JFrame();
	Container content=jframe.getContentPane() ;
	array a = new array();
	List<goods> arrayDemo = a.aaa();
	public auctionshow(final String a){
	super();
	int b=Integer.parseInt(a)-1;
	JPanel jpanel1 = new JPanel();
	JPanel jpanel2 = new JPanel();
	JPanel jpanel3 = new JPanel();
	JPanel jpanel4 = new JPanel();
	JPanel jpanel5 = new JPanel();
	JPanel jpanel6 = new JPanel();
	//JLabel jlabel01 = new JLabel("商品号:"+arrayDemo.get(b).getgoodsid());
	JLabel jlabel1 = new JLabel("商    品:"+arrayDemo.get(b).getgoodsname());
	JLabel jlabel2 = new JLabel("委托人:"+arrayDemo.get(b).getgoodsowner());
	JLabel jlabel3 = new JLabel("保留价:"+arrayDemo.get(b).getlowprice());
	JButton jbutton=new JButton("开始拍卖");
	JButton jbutton1=new JButton("返回");
	jpanel.setLayout(new GridLayout(5,1));
	//jpanel.add(jlabel01);
	jpanel.add(jlabel1);
	jpanel.add(jlabel2);
	jpanel.add(jlabel3);
	jpanel.add(jbutton);
	jpanel.add(jbutton1);
	
	jpanel.setBackground(Color.white);
	jframe.add(jpanel);
	jframe.setBackground(Color.BLUE);
	jframe.setSize(500,200);
	jframe.setVisible(true);
	jframe.setLocationRelativeTo(null);
	jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jbutton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
	//JOptionPane.showMessageDialog("");
	 jframe.setVisible(true);
	 System.out.println(a+"wwww");
	 new addprice(a);
		}});
	jbutton1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
	//JOptionPane.showMessageDialog("");
	 jframe.setVisible(true);	
	 new select("");
		}});
	}
	public static void main(String args[]){
		auctionshow u=new auctionshow("");	
	}

}
