import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;




public class AuctionSystem {

	public static void main(String[] args) {
				AuctionMainFrame af = new AuctionMainFrame();

		
	}

}

class Goods
{
	private String goodsname;
	private String goodsmaster;
	private int lowprice;
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public int getLowprice() {
		return lowprice;
	}
	public void setLowprice(int lowprice) {
		this.lowprice = lowprice;
	}
	public String getGoodsmaster() {
		return goodsmaster;
	}
	public void setGoodsmaster(String goodsmaster) {
		this.goodsmaster = goodsmaster;
	}
	
}

class AuctionPeople 
{
	 String name;
	 int money;
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}

class AuctionFrame extends JFrame implements ActionListener
{
	Vector<Goods> good;
	Vector <AuctionPeople> people;
	Goods g;
	int nowMostHigh=0;
	int nowPrice=0;
	
	JLabel jtitle = null;
	JLabel jgoods = null;
	JPanel jp = null;
	JPanel jpGoods =null;
	JButton jbover = null;
	JLabel jauctionPrice = null;
	
	public AuctionFrame(Vector<Goods> goods,Vector<AuctionPeople> auctionpeople) {
	
		this.good = goods;
		this.people = auctionpeople;
		g = good.firstElement();
		good.remove(0);
		nowPrice = g.getLowprice();
		
		jauctionPrice = new JLabel("当前最高价"+nowPrice,JLabel.CENTER);
		
		jtitle = new JLabel("正在拍卖",JLabel.CENTER);
		jtitle.setFont(new Font("Dialog",1,45));
		jtitle.setForeground(Color.RED);
		JButton jb[] = new JButton[auctionpeople.size()];
		jbover = new JButton("结束");
		jbover.addActionListener(this);
		jbover.setActionCommand("over");
		JLabel jl[] = new JLabel[auctionpeople.size()];

		jgoods = new JLabel(g.getGoodsmaster()+" "+g.getGoodsname()+" "+String.valueOf(g.getLowprice()),JLabel.CENTER);
		
		jp = new JPanel();
		jp.setLayout(new GridLayout(2,auctionpeople.size()));
	
		for(int i=0;i<auctionpeople.size();i++)
		{
			AuctionPeople ap = new AuctionPeople();
			ap = auctionpeople.get(i);
			jl[i] = new JLabel(ap.getName(),JLabel.CENTER);
			jp.add(jl[i]);
		}
		for(int i=0;i<people.size();i++)
		{
			jb[i] = new JButton("竞拍");
			jp.add(jb[i]);
			jb[i].addActionListener(this);
			jb[i].setActionCommand(String.valueOf(i));
		
		}
		
		
		jpGoods = new JPanel();
		jpGoods.setLayout(new GridLayout(5, 1));
		jpGoods.add(jtitle);
		jpGoods.add(jgoods);
		jpGoods.add(jauctionPrice);
		
		jpGoods.add(jp);
		jpGoods.add(jbover);
		
	this.add(jpGoods);
	this.setSize(500, 400);
	this.setVisible(true);
	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("over"))
		{
			AuctionPeople aptemp = people.get(nowMostHigh);
			
			aptemp.setMoney(aptemp.getMoney()-nowMostHigh);
			if(g.getLowprice()==nowPrice)
			{
				jgoods.setText("无人竞拍");
				jauctionPrice.setText("无人竞拍");
				good.addElement(g);
			}
			else if(good.size()==0)
			{
				jgoods.setText("已经拍卖结束");
				jtitle.setText("拍卖结束");
			}else
			{
				jauctionPrice.setText(aptemp.getName()+"获得这件商品"+"价格是"+nowPrice);
				g=good.firstElement();
				good.remove(0);
				nowPrice=g.getLowprice();
		
			}
			jgoods.setText(g.getGoodsmaster()+" "+g.getGoodsname()+" "+String.valueOf(g.getLowprice()));
		}
		
		for(int j=0;j<people.size();j++)
		{
			if(e.getActionCommand().equals(String.valueOf(j)))
			{
				nowMostHigh=j;
				nowPrice+=1;
				jauctionPrice.setText("当前最高价"+nowPrice);
			
			}
		}
	}
	
	
}

class AuctionMainFrame extends JFrame implements ActionListener
{
	AuctionInsertInformation aif = new AuctionInsertInformation();
	JPanel jp1 = null;
	JPanel jp2 = null;
	
	JLabel jl = null;
	JButton jb1 = null;
	JButton jb2 = null;
	JButton jb3 = null;
	AuctionMainFrame()
	{
		 jl = new JLabel("拍卖系统",JLabel.CENTER);
		 jl.setFont(new Font("Dialog",1,25));
		 jl.setForeground(Color.RED);
		 
		 jb1 = new JButton("开始拍卖");
		 jb1.setActionCommand("start");
		 jb1.setSize(13, 11);
		 jb2 = new JButton("退出系统");
		 jb3 = new JButton("输入商品与竞拍者信息");
		 jb2.setActionCommand("quit");
		 jb3.setActionCommand("input");
		
		 jb1.addActionListener(this);
		 jb2.addActionListener(this);
		 jb3.addActionListener(this);
		 
		 
		 
		 this.setLayout(new GridLayout(4, 1));
		 this.add(jl);
		 this.add(jb3);
		 this.add(jb1);
		 this.add(jb2);
		
		this.setSize(500, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("input"))
		{
			aif.setVisible(true);
			
		}else if(e.getActionCommand().equals("start"))
		{
			if(aif.goods.size()==0||aif.auctionpelple.size()==0)
			{
				JFrame jf = new JFrame();
				JLabel jl = new JLabel("请正确输入商品与竞拍者信息",JLabel.CENTER);
				jf.add(jl);
				jf.setVisible(true);
				jf.setSize(400, 300);
				jf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			}else 
			{
				AuctionFrame af = new AuctionFrame(aif.goods,aif.auctionpelple);
			}
			
			
		}else if(e.getActionCommand().equals("quit"))
		{
			
			System.exit(0);
		}
		
	}
}
class AuctionInsertInformation extends JFrame implements ActionListener
{
	Vector<Goods> goods = new Vector<Goods>();
	Vector<AuctionPeople> auctionpelple = new Vector<AuctionPeople>();
	
	JPanel jp[] = new JPanel[4];
	JTextField jtf[] = new JTextField[5];
	JLabel jl[] = new JLabel[7];
	JButton jb[] = new JButton[4];
	
	public AuctionInsertInformation() {	
		jp[0] = new JPanel();
		jp[1] = new JPanel();
		jp[2] = new JPanel();
		jp[3] = new JPanel();
		
		jl[0] = new JLabel("请输入商品信息：");
		jl[1] = new JLabel("名字");
		jl[2] = new JLabel("起拍价");
		jl[3] = new JLabel("委托人");
		jl[4] = new JLabel("请输入拍卖者信息");
		jl[5] = new JLabel("名字");
		jl[6] = new JLabel("所有资产");
		jtf[0] = new JTextField();
		jtf[1] = new JTextField();
		jtf[2] = new JTextField();
		jtf[3] = new JTextField();
		jtf[4] = new JTextField();
		jb[0] = new JButton("继续输入");
		jb[0].addActionListener(this);
		jb[0].setActionCommand("imputgoods");
		
		jb[1] = new JButton("继续输入");
		jb[1].addActionListener(this);
		jb[1].setActionCommand("imputpeople");
		jb[2] = new JButton("确认");
		jb[2].addActionListener(this);
		jb[2].setActionCommand("confirmgoods");
		jb[3] = new JButton("确认");
		jb[3].addActionListener(this);
		jb[3].setActionCommand("confirmpeople");
		
		
		
		
		jp[0].setLayout(new GridLayout(4, 2));
		jp[0].add(jl[1]);
		jp[0].add(jtf[0]);//名字
		jp[0].add(jl[2]);
		jp[0].add(jtf[1]);//起拍价
		jp[0].add(jl[3]);
		jp[0].add(jtf[2]);//所有者
		jp[0].add(jb[0]);
		jp[0].add(jb[2]);
		
		jp[1].setLayout(new GridLayout(3, 2));
		jp[1].add(jl[5]);
		jp[1].add(jtf[3]);//名字
		jp[1].add(jl[6]);
		jp[1].add(jtf[4]);//所有资产
		jp[1].add(jb[1]);
		jp[1].add(jb[3]);
		
		jp[2].add(jl[0],BorderLayout.NORTH);
		jp[2].add(jp[0],BorderLayout.CENTER);
		jp[3].add(jl[4],BorderLayout.NORTH);
		jp[3].add(jp[1],BorderLayout.CENTER);
		
		
		this.setLayout(new GridLayout(2, 1));
		this.add(jp[2]);
		this.add(jp[3]);
		this.setVisible(false);
		this.setSize(500,300);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("imputgoods"))
		{
			
			Goods g = new Goods();
			g.setGoodsmaster(jtf[2].getText()) ;
			g.setGoodsname(jtf[0].getText());;
			g.setLowprice(Integer.parseInt(jtf[1].getText()));;
			goods.add(g);
			jtf[0].setText("");
			jtf[1].setText("");
			jtf[2].setText("");
		}else if(e.getActionCommand().equals("imputpeople"))
		{
			AuctionPeople ap = new AuctionPeople();
			ap.setMoney(Integer.parseInt(jtf[4].getText()));
			ap.setName(jtf[3].getText());
			auctionpelple.add(ap);	
			jtf[3].setText("");
			jtf[4].setText("");
		}
		else if(e.getActionCommand().equals("confirmgoods"))
		{
			String summery="";
			JFrame jf = new JFrame();
			jf.setLayout(new FlowLayout());
			
			
			for(int i=0;i<goods.size();i++)
			{
				Goods g = new Goods();
				g=goods.get(i);
				summery = "委托人:"+g.getGoodsmaster()+"  拍卖品:"+g.getGoodsname()+"  最低价:"+g.getLowprice();
				jf.add(new JLabel(summery)); 
			}
			
			jf.setVisible(true);
			jf.setSize(400, 300);
			jf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			
		
			
			System.out.println(summery);
		}
		else if(e.getActionCommand().equals("confirmpeople"))
		{
			String summery="";
			JFrame jf = new JFrame();
			jf.setLayout(new FlowLayout());
			
			
			for(int i=0;i<auctionpelple.size();i++)
			{
				AuctionPeople p = new AuctionPeople();
				p=auctionpelple.get(i);
				summery = "竞拍人:"+p.getName()+"  所带资产： "+p.getMoney();
				jf.add(new JLabel(summery)); 
			}
			
			jf.setVisible(true);
			jf.setSize(400, 300);
			jf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			
			
			
			//System.out.println(summery);
		}
	}
	
}
