package com.utils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class SmsSender {

	public static boolean sendSms(String phonex, String smsContent)
			throws Exception {
		boolean result = false;

		String phoneresult = "86";
		String smsresult = "";
		String command = "MT_REQUEST";

		// 处理接收�?
		String[] phones = phonex.split(",");
		if (phones.length > 1) {
			phoneresult = phoneresult + phonex;
			phoneresult = phoneresult.replace(",", ",86");
			command = "MULTI_MT_REQUEST";
		} else {
			phoneresult = phoneresult + phonex;
		}

		// 处理短信内容
		byte[] ns = smsContent.getBytes("gbk");
		for (int i = 0; i < ns.length; i++) {
			smsresult += Integer.toHexString(ns[i] & 0x00ff);
		}

		// 发�?短信内容
		String surl = "http://42.121.96.85:6025/SMSPlatform/submit";
		URL url = new URL(surl);
		URLConnection connection = url.openConnection();
		connection.setDoOutput(true);
		OutputStreamWriter out = new OutputStreamWriter(
				connection.getOutputStream(), "UTF-8");
		out.write("command=" + command + "&cpid=testmt1&cppwd=testmt_()&da="
				+ phoneresult + "&dc=15&sm=" + smsresult);
		out.flush();
		out.close();

		String sCurrentLine;
		String sTotalString;
		sCurrentLine = "";
		sTotalString = "";
		InputStream l_urlStream;
		l_urlStream = connection.getInputStream();
		BufferedReader l_reader = new BufferedReader(new InputStreamReader(
				l_urlStream));
		while ((sCurrentLine = l_reader.readLine()) != null) {
			sTotalString += sCurrentLine;

		}
		//返回信息包括000表示发�?成功
		if (sTotalString.contains("000")) {
			result = true;
		}
		System.out.println("result:"+result);
		return result;
	}

}
