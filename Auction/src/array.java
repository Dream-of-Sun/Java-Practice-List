
import java.util.ArrayList;
import java.util.List;
import connection.goods;

public class array {
	
	 

	public static  List<goods> aaa(){
		 List<goods> arrayDemo = new ArrayList<goods>();
		 int a = 2000;
		    goods g1 = new goods();
		     g1.setgoodsid(1);
		     g1.setgoodsname("无尽之刃");
		     g1.setgoodsowner("瑞文");
	         g1.setlowprice("3000");
	         
	        goods g2 = new goods();
	        g2.setgoodsid(2);
		     g2.setgoodsname("荆棘之甲");
		     g2.setgoodsowner("德玛");
		     g2.setlowprice(String.valueOf(a));
		     
		     goods g3 = new goods();
		     g3.setgoodsid(3);
		     g3.setgoodsname("冰霜之心");
		     g3.setgoodsowner("狗头");
	         g3.setlowprice("3200");
	         
	         goods g4 = new goods();
	         g4.setgoodsid(4);
			 g4.setgoodsname("三项之力");
			 g4.setgoodsowner("武器大师");
		     g4.setlowprice("3300");
		     
		     goods g5 = new goods();
		     g5.setgoodsid(5);
		     g5.setgoodsname("狂徒铠甲");
		     g5.setgoodsowner("蒙多医生");
			 g5.setlowprice("3000");
		     arrayDemo.add(g1);
	         arrayDemo.add(g2);
	         arrayDemo.add(g3);
	         arrayDemo.add(g4);
	         arrayDemo.add(g5);
		     int length = arrayDemo.size();
				//创建数组
				goods[] goodsArray = new goods[length];
				for (int i = 0; i < goodsArray.length; i++) {
					goodsArray[i] = arrayDemo.get(i);
					System.out.println(arrayDemo.get(i).getgoodsid());
					 System.out.println(arrayDemo.get(i).getgoodsname());
					 System.out.println(arrayDemo.get(i).getgoodsowner());
					  System.out.println(arrayDemo.get(i).getlowprice());
				}
				return arrayDemo;
		   
	 }
		
	public static void main(String args[]){
		array a = new array();
	a.aaa();
	}
	
}
