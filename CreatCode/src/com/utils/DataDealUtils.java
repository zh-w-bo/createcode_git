package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 各个数据库支持的工具类
 * @author cjj
 *
 */
public class DataDealUtils {
private static Connection conn = null;
private static final String SqlServer_Driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
private static final String Mysql_Driver = "com.mysql.jdbc.Driver";
private static final String Oracle_Driver = "oracle.jdbc.driver.OracleDriver";
	/**
	 * 处理不同数据库
	 * @return
	 * dataType：0：sqlserver 1:mysql 2:oracle
	 */
	public static Connection getData(String dataType,String url,String userName,String password){
		if(dataType.equals("0")){
			try {
				Class.forName(SqlServer_Driver);
				conn = DriverManager.getConnection(url, userName, password);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("连接sqlserver失败");
			}
		}
		if(dataType.equals("1")){
			
		}
		if(dataType.equals("2")){
			
		}
		return conn;
	}
}
