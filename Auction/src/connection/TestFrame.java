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
        jm = new JMenu("ϵͳ����");
        jmi = new JMenuItem("�����û�");
        jmb.add(jm);
        jm.add(jmi);
        //��ʼ�� Ĭ�ϵ�JPanel
        jp1 = new JPanel();
        jp1.setBackground(Color.YELLOW);
        jp1.add(new JLabel("������Ĭ�ϵĽ���"));
        add(jp1);
        setJMenuBar(jmb);
         
        //��ʼ�� Ҫ�ı��JPanel
        jp2 = new JPanel(new GridLayout(2, 2));
        jp2.setBackground(Color.LIGHT_GRAY);
        jp2.add(new JLabel("�û���"));
        jp2.add(new JTextField(10));
        jp2.add(new JLabel("����"));
        jp2.add(new JTextField(10));
        //������˵���ť��������  this �������TestFrame �������
        jmi.addActionListener(new MyChangeListener(this));
         
        this.setBounds(280,200,380,380);
        this.setTitle("����");
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
            jframe.remove(jp1);//ȥ��Ĭ��JPanel
            jframe.add(jp2);//�����µ�JPanel
            jframe.validate();//�ع���������
        }  
    }  
}