
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//import connection.arr;
import connection.goods;


public class chooseid extends JFrame{
	JLabel jlabel1,jlabel2,jlabel3;
	JTextField jtextfiled;
	JButton jbutton,jbutton1;
	JPanel  jpanel1,jpanel2,jpanel3;
	GridLayout gridlay = new GridLayout(2,1);
	JPanel jpanel =new JPanel();
	JFrame jframe=new JFrame();
	Container content=jframe.getContentPane();
	//content.setLayout(new BorderLayout());
	public chooseid(){
		super();
		JPanel jpanel1 = new JPanel();
		JPanel jpanel2 = new JPanel();
		JPanel jpanel3 = new JPanel();
	   
		JLabel jlabel1 = new JLabel("请选竞拍的商品号:");
		
		final JTextField jtextfiled=new JTextField(10);
		JButton jbutton=new JButton("提交");
		jpanel.add(jlabel1);
		jpanel.add(jtextfiled);
		jpanel.add(jbutton);
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
			System.out.println(a);
				if(a==null || a.trim().length()==0 || Integer.parseInt(a)>5){
				JOptionPane.showMessageDialog(null, "商品不存在");
					reset();}
		   
		    else{
		    	 jframe.setVisible(false);
			   new auctionshow(a);
			//JOptionPane.showMessageDialog(null, "提交成功");
			 }
		
			}

			private void reset() {
				// TODO Auto-generated method stub
				
			}});
		
}
	public static void main(String args[]){
		chooseid u=new chooseid();	
	}}