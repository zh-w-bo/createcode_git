package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.utils.DataDealUtils;

@Controller
@RequestMapping("/Data")//请求包名
public class DealDataController {
	private static Connection conn = null;
	@RequestMapping("/login")//请求方法名
	@ResponseBody//会直接返回json数据。而不是跳转页面
	public Map<String,Object> home(HttpServletRequest request,HttpServletResponse response,String name) throws IOException{
		 	System.out.println(name);
	        Map<String,Object> map = new HashMap<String,Object>();  
	        return map;  
	}
	/**
	 * 
	 * @param request
	 * @param response
	 * @param name
	 * @return 用于测试连接是否可用
	 * @throws IOException
	 */
	@RequestMapping("/testconn")//请求方法名
	@ResponseBody//会直接返回json数据。而不是跳转页面
	public Map<String,Object> testConn(HttpServletRequest request,HttpServletResponse response,String name) throws IOException{
		 	System.out.println(name); 
		 	String msg="";
	        Map<String,Object> map = new HashMap<String,Object>();  
	        msg=(conn.toString()!=null&&conn.toString().length()>0)?(msg="成功"):(msg="失败");
	        map.put("msg", msg);
	        return map;  
	}
}
