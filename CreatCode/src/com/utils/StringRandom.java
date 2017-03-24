package com.utils;
import java.util.Random;

public class StringRandom {
	public StringRandom() {
		// TODO Auto-generated constructor stub
	}
	public static String RandomString(int length)
	{
		String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random random = new Random();
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < length; i++) {
			int num = random.nextInt(62);
			buf.append(str.charAt(num));
		}

		return buf.toString();
	}

 
	public static String getNulltoValue(String param){
		if(param != null && param.length() > 0 && !"null".equals(param)&& !"NULL".equals(param)){
			return param;
		}
		else{
			return "";
		}
	}
 /**
  * @param args
  */
/* public static void main(String[] args) {
  // TODO Auto-generated method stub

  System.out.println(new StringRandom().RandomString(10));
 }
*/
}
