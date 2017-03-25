package com.service;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DealDataService {
	public static String getDataAll(Connection conn){
		try {
			   DatabaseMetaData dmd = conn.getMetaData();
			   DatabaseMetaData metaData = conn.getMetaData();
			    String[] types = {"TABLE"};
			   ResultSet rs = metaData.getTables(null, null, "%", types);
			   while(rs.next()){
                   System.out.println("表名:"+rs.getString(3));
               }
               rs.close();
               conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	/**
	 * 传入表格，获取表格里面所有列信息
	 * @param metaData
	 * @param Table
	 */
	public static void getTableinColumns(DatabaseMetaData metaData,String Table){
		ResultSet rs2;
		try {
			rs2 = metaData.getColumns(null, null, Table, null);
			 while(rs2.next()) {  
		       	  // System.out.println( "表名："+rs2.getString("TABLE_NAME"));
		       	   System.out.println("列名"+rs2.getString("COLUMN_NAME"));
		          }
			 rs2.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
