package Net_server;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStream;
	import java.io.InputStreamReader;
	import java.io.ObjectInputStream;
	import java.io.OutputStream;
	import java.io.PrintWriter;
	import java.net.ServerSocket;
	import java.net.Socket;
import java.util.Random;


import org.xml.sax.InputSource;

	
	public class ReceiveCheck 
	{
		public static void receive() throws IOException
		{
			ServerSocket ss=new ServerSocket(8888);
			User user=null;
			UserDAO dao = new UserDAO();
			while(true)
			{
				//服务器端获得客户端传来的对象
				Socket s=ss.accept();
				InputStream is=s.getInputStream();
				InputStreamReader isr=new InputStreamReader(is);
				ObjectInputStream ois=new ObjectInputStream(is);
				try {
					user=(User)ois.readObject();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				OutputStream os=s.getOutputStream();
				PrintWriter printWriter=new PrintWriter(os);	
				
				String key111 = user.getPassword();
				System.out.println(key111 + "------------------------");
				//验证
				String p=Dao.retPass(user);
				StringBuilder str=new StringBuilder();
				   Random random=new Random();
				  
				   for(int i=0;i<8;i++){
					   str.append(random.nextInt(10));
				   }
				   String key=str.toString();
				   System.out.println(key);
				
				System.out.print(p+"--------------");
				  DES1.DES_CBC_Encrypt(key111.getBytes(),key.getBytes());
				  System.out.println("加密前："+DES1.byteToHexString(key111.getBytes())); 
				  byte[] encrypted=DES1.DES_CBC_Encrypt(key111.getBytes(),key.getBytes());
				  System.out.println("加密后："+DES1.byteToHexString(encrypted));
				  byte[] decrypted=DES1.DES_CBC_Decrypt(encrypted,key.getBytes());
				 System.out.println("解密后："+DES1.byteToHexString(decrypted));
				 
				 System.out.println(p.getBytes() + "------------------------");
				if(DES1.byteToHexString(p.getBytes()).equals(DES1.byteToHexString(decrypted)))
				{
					printWriter.write("success");	
					printWriter.flush();
				}
				/*if(MD5.getResult(p).equals(MD5.getResult(user.getPassword()))  )
					
				{
					printWriter.write("success");	
					printWriter.flush();
				}*/
				else 
					printWriter.write("failed");
				
				
					   
	           ois.close();
	           isr.close();
		       is.close();
			   s.close();

				
			}
			
		}
		
			

	}



