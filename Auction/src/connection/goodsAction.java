package connection;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import com.mysql.jdbc.PreparedStatement;

public class goodsAction {
	
	static PreparedStatement ps=null;
	static ResultSet rs=null;
	
	
public void Addgoods(int goodsid,String goodsname,String goodsowner,int lowprice,int goodsstate){
	System.out.println("6665");
		Connection conn = DatabaseConnect.getConnect();
		String sql = "insert into goods(goodsid,goodsname,goodsowner,lowprice,goodsstate) values(?,?,?,?,?)";
		try {
			ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setInt(1, goodsid);
			ps.setString(2, goodsname);
			ps.setString(3, goodsowner);
			ps.setInt(4, lowprice);
			ps.setInt(5,goodsstate);
			ps.executeUpdate();
			System.out.println("6666");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DatabaseConnect.close(conn, ps, rs);
		}
			
	}


public boolean Addgoods(goods u) {
	// TODO Auto-generated method stub
	return false;
}

public static void main(String args[]){
	goodsAction u= new goodsAction();
	
	//System.out.println(Addgoods("1","w","w","1","1"));
}


}
