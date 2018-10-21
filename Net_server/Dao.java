package Net_server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class Dao 
{
	
	private static final User user = null;
	private static Connection con; 
	static PreparedStatement ps=null;
	static ResultSet rs=null;
	
	public static String retPass(User u)
	{
		String depass=null;
	//	String usernameString=null;
		String username=u.getName();
		
		//String username = "Bob";
		try {
			Class.forName(Config.driver);  //加载驱动
			con=DriverManager.getConnection(Config.url,Config.username,Config.password);  //得到连接
			if(!con.isClosed())
			{
				System.out.println("打开数据库成功！");
			}
			else {
				System.out.println("打开数据库失败！");
				return "failed";
			}
			
			Statement st=con.createStatement();
			String sql="select password from user where username=?";
			ps = (PreparedStatement) con.prepareStatement(sql);
			ps.setString(1, username);
			//ResultSet rs = st.executeQuery(sql);
			rs = ps.executeQuery();
			
			while (rs.next())
			{   
				depass=rs.getString("password");
				System.out.println(depass);
				
			}
			

			rs.close();
			con.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return depass;
		
	}

	public static void main(String[] args){	
		
		Dao a = new Dao();
		a.retPass(user);
   }
}