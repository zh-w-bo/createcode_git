<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>test index</title>
<!-- jquery -->
<script src="../css/jquery-2.1.4.min.js"></script>
<link href="../bootstrap/css/bootstrap.css"
	rel="stylesheet">
<script src="../bootstrap/js/bootstrap.js"></script>
<script src="../datatable/js/jquery.dataTables.min.js"></script>
<link href="../datatable/css/jquery.dataTables.min.css"rel="stylesheet">
<link href="../css/header.css"rel="stylesheet">
      <style type="text/css"> 
 .footer{position:fixed;bottom:0px;left:0px;right:0px;background-color: #9BA5A8;}
 	  </style>
  </head>
  <body>
  	        <div nav class="navbar navbar-inverse" role="navigation">
            <div class="container">
                <div class="navbar-header"> 
        <a class="navbar-brand" href="#">主页面头部</a> 
    </div> 
                <nav class="nav-main mega-menu">
                    <ul class="nav nav-pills nav-main" id="mainMenu">
                        <li>
                            <a class="n" href="quote-create.html">在线询价</a>
                        </li>
                        <li>
                            <a class="n" href="quote-list.html">我的询价</a>
                        </li>
                        <li>
                            <a class="n" href="order-list.html">我的运单</a>
                        </li>
                    </ul>
                </nav>
            </div>
  		</div>
  		<div class="panel panel-default" >
  		  <div class="panel-heading">
        <h1 class="panel-title">
         	   菜单一标题
        </h1>
   		 </div>
   		   <div class="panel-body">
       		<div class="table-responsive">
			<table id="dataTable"
				class="table table-striped table-bordered table-hover dataTable no-footer" width="100%">
				<thead>
				<tr>
					<th>活动名称
					</th>
					<th>活动类别
					</th>
					  <tr>
     			 <td>双11</td>
      				<td>购物</td>
   					 </tr>
  					  <tr>
			      <td>双12</td>
			      <td>旅游</td>
			    </tr>
			</thead>
					<tbody></tbody>
			</table>
		</div>
		</div>
		</div>
	<div class="jumbotron footer" >
    <div class="container">
        <h1>底部 可采取栅格布局显示多列数据</h1>
    </div>
</div>
</body>
  </html>  