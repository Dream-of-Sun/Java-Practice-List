import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.mysql.jdbc.PreparedStatement;

import connection.DatabaseConnect;
import connection.goods;
import connection.goodsAction;

public class client {
	JLabel jlabel1,jlabel2,jlabel3;
	JTextField jtextfiled,jtextfiled1,jtextfiled2;
	JButton jbutton,jbutton1;
	JPanel  jpanel1,jpanel2,jpanel3;
	GridLayout gridlay = new GridLayout(2,1);
	JPanel jpanel =new JPanel();
	JFrame jframe=new JFrame();
	Container content=jframe.getContentPane() ;
	protected int lowprice;
	protected int goodsstate;
	//content.setLayout(new BorderLayout());
	public client(String title){
		super();
		JPanel jpanel1 = new JPanel();
		JPanel jpanel2 = new JPanel();
		JPanel jpanel3 = new JPanel();
	   
		JLabel jlabel1 = new JLabel("商    品:");
		JLabel jlabel2 = new JLabel("委托人:");
		JLabel jlabel3 = new JLabel("保留价:");
		final JTextField jtextfiled=new JTextField(10);
		final JTextField jtextfiled1=new JTextField(10);
		final JTextField jtextfiled2=new JTextField(10);
		JButton jbutton=new JButton("提交");
		JButton jbutton1=new JButton("返回");
		jpanel.setLayout(new GridLayout(4,2));
		jpanel.add(jlabel1);
		jpanel.add(jtextfiled);
		jpanel.add(jlabel2);
		jpanel.add(jtextfiled1);
		jpanel.add(jlabel3);
		jpanel.add(jtextfiled2);
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
				// TODO Auto-generated method stub
		    	 jframe.setVisible(true);
				String a = jtextfiled.getText();
				String b = jtextfiled1.getText();
				String c = jtextfiled2.getText();
				if(a==null || a.trim().length()==0 || b==null || b.trim().length()==0|| c==null || c.trim().length()==0){
					JOptionPane.showMessageDialog(null, "不能为空项");
					reset();
		}else{
		   
			JOptionPane.showMessageDialog(null, "提交成功");
			//JOptionPane.showInputDialog(null, "提交成功");
		}
			
			}

			private void reset() {
				// TODO Auto-generated method stub
				
			}});
		jbutton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
		//JOptionPane.showMessageDialog("");
		 jframe.setVisible(true);	
		 new select("");
			}});
}
	public static void main(String args[]){
		client u=new client("1111");	
	}
	


}
