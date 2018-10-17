import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class select {
	JButton jbutton1,jbutton2,jbutton3,jbutton4;
	GridLayout gridlay = new GridLayout(2,1);
	JPanel jpanel =new JPanel();
	JFrame jframe=new JFrame();
	Container content=jframe.getContentPane();
	//content.setLayout(new BorderLayout());
	public select(final String title){
		super();
		JButton jbutton1=new JButton("¾º ÅÄ");
		JButton jbutton2=new JButton("Î¯ ÍÐ");
		JButton jbutton3=new JButton("ÎïÆ·");
		JButton jbutton4=new JButton("°ïÖú");
		jpanel.setLayout(new GridLayout(2,2));
		jpanel.add(jbutton1);
		jpanel.add(jbutton2);
		jpanel.add(jbutton3);
		jpanel.add(jbutton4);
		jpanel.setBackground(Color.white);
		jframe.add(jpanel);
		jframe.setBackground(Color.BLUE);
		jframe.setSize(500,200);
		jframe.setVisible(true);
		jframe.setLocationRelativeTo(null);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     jbutton1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
	//JOptionPane.showMessageDialog("");
	 jframe.setVisible(true);	
	 new chooseid();
		}});
	
	jbutton2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
	//JOptionPane.showMessageDialog("");
	 jframe.setVisible(false);	
	 new client(title);
		}});		
	
	jbutton3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
	//JOptionPane.showMessageDialog("");
	 jframe.setVisible(false);	
	 new showarray();
		}});		
	}
	public static void main(String args[]){
		select u=new select("ÅÄÂô");	
	}

}
