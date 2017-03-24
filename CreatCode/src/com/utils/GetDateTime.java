package com.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class GetDateTime {

	public static String getStrDateTime(String stDateTime){
		String datetime = "";
		System.out.println("stDateTime == "+stDateTime);
		if(stDateTime != null && !"null".equals(stDateTime) && stDateTime.length() > 0){
			int cnt = stDateTime.indexOf("(");
			stDateTime = stDateTime.substring(0, cnt - 1);
			stDateTime = stDateTime.replace("GMT 08", "GMT+08:");
			SimpleDateFormat sf = new SimpleDateFormat( "EEE MMM dd yyyy hh:mm:ss z", Locale.ENGLISH);
			Date d;
			try {
				d = sf.parse(stDateTime);
				Date date = parse(d.toString(), "EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);

				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				datetime = format.format(date);
				System.out.println("datetime ==== "+datetime);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return datetime;
	}
	
	public static Date parse(String str, String pattern, Locale locale) {
		if (str == null || pattern == null) {
			return null;
		}
		try {
			return new SimpleDateFormat(pattern, locale).parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String format(Date date, String pattern, Locale locale) {
		if (date == null || pattern == null) {
			return null;
		}
		return new SimpleDateFormat(pattern, locale).format(date);
	}
	/**
	 * ��ȡ��ǰ���·� ʱ�����ʽ��ʱ���ʽ
	 * @return
	 */
	public static String getThisFormatDate(){
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(date);
	}
}
