<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>  
<html>
  <head>
    <title>create world</title>
     <%@include file="/WEB-INF/pages/include/script.jsp"%>
    <style type="text/css">
    </style>
  </head>
  <body>
  	<div class="Canvas">
   <canvas id="myCanvas" width="500" height="60"></canvas>
  	 <div>
  	 </div>
   </div>
       <div class="nav-r" >
        <a href="#" class="loginmmd">Start</a>
    </div>
    	<div class="Canvas2">
   <canvas id="myCanvas2" width="500" height="60" ></canvas>
   </div>
   
   

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <center><h4 class="modal-title" id="myModalLabel">Welcome to use the product  system </h4></center>
      </div>
      <div class="modal-body">
    <form>
    <div class="form-group">
    <label for="exampleInputEmail1">Url</label>
    <input type="url" name="url_name" id="url_id" class="form-control" id="exampleInputEmail1" value="jdbc:sqlserver://xx:xx;DatabaseName=xx" placeholder="Data Url">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Username</label>
    <input type="text"name="username_name" id="username_id" class="form-control" id="exampleInputEmail1" placeholder="Data Username">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" name="password_name" id="password_id"class="form-control" id="exampleInputPassword1" placeholder="Data Password">
  </div>
  <div class="form-group">
   <label for="exampleInputPassword1">Please Select Data</label>
<select  id="select_id"  class="form-control" onchange="selectChange()">
  <option value="0">SQL Server</option>
  <option value="1">Mysql</option>
  <option value="2">Oracle</option>
</select>
  </div>
</form>
      </div>
      <div class="modal-footer">
         <button type="button" class="btn btn-primary" onclick="testConnectClick()">Test Connect</button>
        <button type="button" class="btn btn-primary">Connect</button>
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>
  </body>
</html>
	<!--ajax请求js块  -->
	<script type="text/javascript">
	function testConnectClick(){
		  $.ajax({
             type: "POST",
             url: "test.json",
             data: {url:$("#url_id").val(), username:$("#username_id").val(),password:$("#password_id").val(),datatype:$("#select_id option:selected").val()},
             dataType: "json",
             success: function(data){
             
             }
     });
	}
	</script>
	<!-- js效果块 -->
    <script type="text/javascript">
		   function selectChange(){
		   	   var objS = document.getElementById("select_id");
		   	   var index = objS.selectedIndex; 
		   	   if(index==0){
		   	   		$("#url_id").val("jdbc:sqlserver://xx:xx;DatabaseName=xx");
		   	   }
		   	   if(index==1){
		   	   		$("#url_id").val("jdbc:mysql://xx:xx/xx");
		   	   }
		   	   if(index==2){
		   	   		$("#url_id").val("jdbc:oracle:thin:@localhost:xx:xx");
		   	   }
		   }
        	$(".loginmmd").click(function() {
    		$('#myModal').modal("show");
   		 });
    </script>

<!--  -->
       <script text/javascript>
var c=document.getElementById("myCanvas");
var ctx=c.getContext("2d");
ctx.font="50px Arial";
ctx.strokeText("Create Code",120,50);

var c=document.getElementById("myCanvas2");
var ctx=c.getContext("2d");
ctx.font="50px Arial";
ctx.strokeText("Create Code",120,50);
</script>