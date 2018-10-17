
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


public class addprice extends JFrame{
	JLabel jlabel1,jlabel2,jlabel3;
	JTextField jtextfiled;
	JButton jbutton;
	JPanel  jpanel1,jpanel2,jpanel3;
	GridLayout gridlay = new GridLayout(2,1);
	JPanel jpanel =new JPanel();
	JFrame jframe=new JFrame();
	Container content=jframe.getContentPane();
	//content.setLayout(new BorderLayout());
	array a = new array();
	List<goods> arrayDemo = a.aaa();
	public addprice(String a){
		super();
		JPanel jpanel1 = new JPanel();
		JPanel jpanel2 = new JPanel();
		JPanel jpanel3 = new JPanel();
		int b=Integer.parseInt(a)-1;
		String c = arrayDemo.get(b).getlowprice();
		final int j = Integer.parseInt(c);
		
		JLabel jlabel1 = new JLabel("请出价:");
		
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
		    	String q=  jtextfiled.getText();
		    	int q1=Integer.parseInt(q);
		    	 jframe.setVisible(true);
						System.out.println(q+"ggggg");
			System.out.println(q1+"hhhhh");
			System.out.println(q);
			
				if(q==null || q.trim().length()==0 || q1<j ){
					//new liupai();
					  new conprice(q);
				JOptionPane.showMessageDialog(null, "不能小于"+j);
				
					reset();
				  }
		   
		    else{
		    	 jframe.setVisible(false);
		    	 System.out.println(q+"hhhhh");
			   new conprice(q);
			JOptionPane.showMessageDialog(null, "提交成功");
			 }
		
			}

			private void reset() {
				// TODO Auto-generated method stub
				
			}});
		
}
	public static void main(String args[]){
		addprice u=new addprice("");	
	}}