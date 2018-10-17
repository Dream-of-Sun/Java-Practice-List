package connection; 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class TestFrame extends JFrame{
    JMenuBar jmb;
    JMenu jm;
    JMenuItem jmi;
    JPanel jp1;
    JPanel jp2;
    public TestFrame(){
         
        jmb = new JMenuBar();
        jm = new JMenu("系统管理");
        jmi = new JMenuItem("增加用户");
        jmb.add(jm);
        jm.add(jmi);
        //初始化 默认的JPanel
        jp1 = new JPanel();
        jp1.setBackground(Color.YELLOW);
        jp1.add(new JLabel("这里是默认的界面"));
        add(jp1);
        setJMenuBar(jmb);
         
        //初始化 要改变的JPanel
        jp2 = new JPanel(new GridLayout(2, 2));
        jp2.setBackground(Color.LIGHT_GRAY);
        jp2.add(new JLabel("用户名"));
        jp2.add(new JTextField(10));
        jp2.add(new JLabel("密码"));
        jp2.add(new JTextField(10));
        //对这个菜单按钮进行设置  this 代表的是TestFrame 这个对象
        jmi.addActionListener(new MyChangeListener(this));
         
        this.setBounds(280,200,380,380);
        this.setTitle("测试");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new TestFrame();
    }
    class MyChangeListener implements ActionListener{
        JFrame jframe;
        public MyChangeListener(JFrame jframe) {
            this.jframe = jframe;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            jframe.remove(jp1);//去掉默认JPanel
            jframe.add(jp2);//加入新的JPanel
            jframe.validate();//重构整个界面
        }  
    }  
}