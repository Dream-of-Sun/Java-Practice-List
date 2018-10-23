package Net_server;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class DES1 {  
	  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
          
        //String content="qqqqqqqqqq";  
       /* String key111="22222222";  
//      
//       // System.out.println("加密前："+byteToHexString(content.getBytes())); 
        System.out.println("加密前："+byteToHexString(key111.getBytes())); 
        byte[] encrypted=DES_CBC_Encrypt(key111.getBytes(), key111.getBytes());  
        System.out.println("加密后："+byteToHexString(encrypted));  
        byte[] decrypted=DES_CBC_Decrypt(encrypted, key111.getBytes());  
        System.out.println("解密后："+byteToHexString(decrypted));   */
    }  
  
    public static byte[] DES_CBC_Encrypt(byte[] key111, byte[] keyBytes){        
        try {  
            DESKeySpec keySpec=new DESKeySpec(keyBytes);  
            SecretKeyFactory keyFactory=SecretKeyFactory.getInstance("DES");              
            SecretKey key=keyFactory.generateSecret(keySpec);         
              
            Cipher cipher=Cipher.getInstance("DES/CBC/PKCS5Padding");  
            cipher.init(Cipher.ENCRYPT_MODE, key, new IvParameterSpec(keySpec.getKey()));             
            byte[] result=cipher.doFinal(key111);  
            return result;  
        } catch (Exception e) {  
            // TODO Auto-generated catch block  
            System.out.println("exception:"+e.toString());  
        }  
        return null;  
    }  
      
    public static byte[] DES_CBC_Decrypt(byte[] key111, byte[] keyBytes){        
        try {  
            DESKeySpec keySpec=new DESKeySpec(keyBytes);  
            SecretKeyFactory keyFactory=SecretKeyFactory.getInstance("DES");  
            SecretKey key=keyFactory.generateSecret(keySpec);  
              
            Cipher cipher=Cipher.getInstance("DES/CBC/PKCS5Padding");  
            cipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(keyBytes));  
            byte[] result=cipher.doFinal(key111);  
            return result;  
        } catch (Exception e) {  
            // TODO Auto-generated catch block  
            System.out.println("exception:"+e.toString());  
        }  
        return null;  
    }  
      
    public static String byteToHexString(byte[] bytes) {  
        StringBuffer sb = new StringBuffer(bytes.length);  
        String sTemp;  
        for (int i = 0; i < bytes.length; i++) {  
            sTemp = Integer.toHexString(0xFF & bytes[i]);  
            if (sTemp.length() < 2)  
                sb.append(0);  
            sb.append(sTemp.toUpperCase());  
        }  
        return sb.toString();  
    }  
        
     private static byte toByte(char c) {  
        byte b = (byte) "0123456789ABCDEF".indexOf(c);  
        return b;  
     }  
}  

