package com.web.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author admin
 *注册时密码注册  同时  类中运行的效果和struts提交之后同样的字符串加密是不一样的  
 *插入数据的时候 不能直接用该类的方法直接生成密码之后  插入数据库
 */
public class MD5 {  
   public byte[] eccrypt(String info) throws NoSuchAlgorithmException{  
        //根据MD5算法生成MessageDigest对象  
        MessageDigest md5 = MessageDigest.getInstance("MD5");  
        byte[] srcBytes = info.getBytes();  
        //使用srcBytes更新摘要  
        md5.update(srcBytes);  
        //完成哈希计算，得到result  
        byte[] resultBytes = md5.digest();  
        return resultBytes;  
    }  
      
  public static void main(String args[]) throws NoSuchAlgorithmException{ 
	  //主方法可用来测试
        String msg = "123";  
        MD5 md5 = new MD5();  
        System.out.println("密文是：" + md5.changeMD5(msg));  
        System.out.println(new MD5().changeMD5("123"));  
        System.out.println("明文是：" + msg);  
    }  
    
    public String changeMD5(String msg) throws NoSuchAlgorithmException{
    	 MessageDigest md5 = MessageDigest.getInstance("MD5");  
         byte[] srcBytes = msg.getBytes();  
         //使用srcBytes更新摘要  
         md5.update(srcBytes);  
         //完成哈希计算，得到result  
         byte[] resultBytes = md5.digest();  
         msg = new String(resultBytes);
     	 return msg;
    }
}
