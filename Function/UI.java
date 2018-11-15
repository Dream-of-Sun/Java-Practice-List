package fff;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.Scanner;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class UI extends JFrame {
	
	JLabel jlabel1,jlabel2,jlabel3;
	JTextField jtextfiled,jtextfiled1,jtextfiled2;
	JButton jbutton;
	JPanel  jpanel1,jpanel2,jpanel3;
	GridLayout gridlay = new GridLayout(2,1);
	JPanel jpanel =new JPanel();
	JFrame jframe=new JFrame();
	Container content=jframe.getContentPane();
	//content.setLayout(new BorderLayout());
	public UI(String title){
		super(title);
		JPanel jpanel1 = new JPanel();
		JPanel jpanel2 = new JPanel();
		JPanel jpanel3 = new JPanel();
	   
		JLabel jlabel2 = new JLabel("b的值:");
		JLabel jlabel3 = new JLabel("c的值:");
		JLabel jlabel1 = new JLabel("a的值:");
		final JTextField jtextfiled=new JTextField(10);
		final JTextField jtextfiled1=new JTextField(10);
		final JTextField jtextfiled2=new JTextField(10);
		JButton jbutton=new JButton("提交");
		jpanel.add(jlabel1);
		jpanel.add(jtextfiled);
		jpanel.add(jlabel2);
		jpanel.add(jtextfiled1);
		jpanel.add(jlabel3);
		jpanel.add(jtextfiled2);
		jpanel.add(jbutton);
		jpanel.setBackground(Color.CYAN);
		add(jpanel);
		setBackground(Color.BLUE);
		setSize(500,200);
		setVisible(true);
		setLocationRelativeTo(null);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();  
		jframe.setLocation((dim.width - jframe.getWidth()) / 2, (dim.height - jframe.getHeight()) / 2);
	
		jbutton.addActionListener(new ActionListener(){
		
	
	//1@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String a = jtextfiled.getText();
			String b = jtextfiled1.getText();
			String c = jtextfiled2.getText();
			if(a==null || a.trim().length()==0 || b==null || b.trim().length()==0|| c==null || c.trim().length()==0){
				JOptionPane.showMessageDialog(null, "a,b或c不能为空");
				reset();
				}
			else{
				
				int a1=Integer.parseInt(a);
				int b1=Integer.parseInt(b);
				int c1=Integer.parseInt(c);
				double x1,x2,t;
				t=b1*b1-4*a1*c1;
				System.out.println("方程"+a1+"x*x+"+b1+"x+"+c1+"=0的解");
				if(t<0){
					JOptionPane.showMessageDialog(null,"此方程无解");
				}else{
					x1=((-b1)+Math.sqrt(t))/(2*a1);
					x2=((-b1)-Math.sqrt(t))/(2*a1);
					//System.out.println("x1="+x1+","+"x2="+x2);
					JOptionPane.showMessageDialog(null,"第一个解="+x1+","+"第二个解="+x2);
			}	
				
			}
			
		}
	});
}
	protected void reset() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String args[]){
		UI u=new UI("一元二次方程求解");
//		 f.addWindowListener(new WindowAdapter(){
//				public void windowClosing(WindowEvent e){
//				System.exit(0);
//				
//				}
//				});
	}
	
}