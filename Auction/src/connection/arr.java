package connection;

import java.util.ArrayList;
import java.util.List;
import connection.goods;

public class arr {
	
	 public  List<goods> aaa(){
		 System.out.println("1"); 
		 List<goods> arrayDemo = new ArrayList<goods>();
		    goods g1 = new goods();
		     g1.setgoodsname("�޾�֮��");
		     g1.setgoodsowner("����");
		     g1.setlowprice("3000");
		     arrayDemo.add(g1);
		     
		     goods g2 = new goods();
		     g2.setgoodsname("����֮��");
		     g2.setgoodsowner("����");
		     g2.setlowprice("2000");
		     arrayDemo.add(g2);
		     System.out.println(arrayDemo.get(0).getlowprice());
		     System.out.println(arrayDemo); 
		    return arrayDemo; 
		 
	 }
		
	public static void main(String args[]){
		arr a = new arr();
		a.aaa();
	}
	
}

