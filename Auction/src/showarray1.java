import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//import connection.arr;
import connection.goods;


public class showarray1 extends JFrame {
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
	public showarray1(){
	super();
	JPanel jpanel1 = new JPanel();
	JPanel jpanel2 = new JPanel();
	JPanel jpanel3 = new JPanel();
	JPanel jpanel4 = new JPanel();
	JPanel jpanel5 = new JPanel();
	JPanel jpanel6 = new JPanel();
	JLabel jlabel01 = new JLabel("商品号:"+arrayDemo.get(0).getgoodsid());
	JLabel jlabel1 = new JLabel("商    品:"+arrayDemo.get(0).getgoodsname());
	JLabel jlabel2 = new JLabel("委托人:"+arrayDemo.get(0).getgoodsowner());
	JLabel jlabel3 = new JLabel("保留价:"+arrayDemo.get(0).getlowprice());
	
	JLabel jlabel04 = new JLabel("商品号:"+arrayDemo.get(1).getgoodsid());
	JLabel jlabel4 = new JLabel("商    品:"+arrayDemo.get(1).getgoodsname());
	JLabel jlabel5 = new JLabel("委托人:"+arrayDemo.get(1).getgoodsowner());
	JLabel jlabel6 = new JLabel("保留价:"+arrayDemo.get(1).getlowprice());
	
	JLabel jlabel07 = new JLabel("商品号:"+arrayDemo.get(2).getgoodsid());
	JLabel jlabel7 = new JLabel("商    品:"+arrayDemo.get(2).getgoodsname());
	JLabel jlabel8 = new JLabel("委托人:"+arrayDemo.get(2).getgoodsowner());
	JLabel jlabel9 = new JLabel("保留价:"+arrayDemo.get(2).getlowprice());
	
	JLabel jlabel010 = new JLabel("商品号:"+arrayDemo.get(3).getgoodsid());
	JLabel jlabel10= new JLabel("商    品:"+arrayDemo.get(3).getgoodsname());
	JLabel jlabel11 = new JLabel("委托人:"+arrayDemo.get(3).getgoodsowner());
	JLabel jlabel12= new JLabel("保留价:"+arrayDemo.get(3).getlowprice());
	
	JLabel jlabel013 = new JLabel("商品号:"+arrayDemo.get(4).getgoodsid());
	JLabel jlabel13 = new JLabel("商    品:"+arrayDemo.get(4).getgoodsname());
	JLabel jlabel14 = new JLabel("委托人:"+arrayDemo.get(4).getgoodsowner());
	JLabel jlabel15 = new JLabel("保留价:"+arrayDemo.get(4).getlowprice());
	
	final JTextField jtextfiled=new JTextField(10);
	final JTextField jtextfiled1=new JTextField(10);
	final JTextField jtextfiled2=new JTextField(10);
	JButton jbutton=new JButton("开始拍卖");
	JButton jbutton1=new JButton("开始拍卖");
	JButton jbutton2=new JButton("开始拍卖");
	JButton jbutton3=new JButton("开始拍卖");
	JButton jbutton4=new JButton("开始拍卖");
	JButton jbutton5=new JButton("返回");
	jpanel.setLayout(new GridLayout(6,5));
	jpanel.add(jlabel01);
	jpanel.add(jlabel1);
	jpanel.add(jlabel2);
	jpanel.add(jlabel3);
	jpanel.add(jbutton);
	jpanel.add(jlabel04);
	jpanel.add(jlabel4);
	jpanel.add(jlabel5);
	jpanel.add(jlabel6);
	jpanel.add(jbutton1);
	jpanel.add(jlabel07);
	jpanel.add(jlabel7);
	jpanel.add(jlabel8);
	jpanel.add(jlabel9);
	jpanel.add(jbutton2);
	jpanel.add(jlabel010);
	jpanel.add(jlabel10);
	jpanel.add(jlabel11);
	jpanel.add(jlabel12);
	jpanel.add(jbutton3);
	jpanel.add(jlabel013);
	jpanel.add(jlabel13);
	jpanel.add(jlabel14);
	jpanel.add(jlabel15);
	jpanel.add(jbutton4);
	jpanel.add(jbutton5);
	
	
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
	 new addprice("");
		}});
	
	jbutton5.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
	//JOptionPane.showMessageDialog("");
	 jframe.setVisible(true);	
	 new select("");
		}});
	}	

	public static void main(String args[]){
		showarray1 u=new showarray1();	
	}
}
