
import java.util.ArrayList;
import java.util.List;
import connection.goods;

public class array {
	
	 

	public static  List<goods> aaa(){
		 List<goods> arrayDemo = new ArrayList<goods>();
		 int a = 2000;
		    goods g1 = new goods();
		     g1.setgoodsid(1);
		     g1.setgoodsname("�޾�֮��");
		     g1.setgoodsowner("����");
	         g1.setlowprice("3000");
	         
	        goods g2 = new goods();
	        g2.setgoodsid(2);
		     g2.setgoodsname("����֮��");
		     g2.setgoodsowner("����");
		     g2.setlowprice(String.valueOf(a));
		     
		     goods g3 = new goods();
		     g3.setgoodsid(3);
		     g3.setgoodsname("��˪֮��");
		     g3.setgoodsowner("��ͷ");
	         g3.setlowprice("3200");
	         
	         goods g4 = new goods();
	         g4.setgoodsid(4);
			 g4.setgoodsname("����֮��");
			 g4.setgoodsowner("������ʦ");
		     g4.setlowprice("3300");
		     
		     goods g5 = new goods();
		     g5.setgoodsid(5);
		     g5.setgoodsname("��ͽ����");
		     g5.setgoodsowner("�ɶ�ҽ��");
			 g5.setlowprice("3000");
		     arrayDemo.add(g1);
	         arrayDemo.add(g2);
	         arrayDemo.add(g3);
	         arrayDemo.add(g4);
	         arrayDemo.add(g5);
		     int length = arrayDemo.size();
				//��������
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
