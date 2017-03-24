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
    <label for="exampleInputEmail1">username</label>
    <input type="email" class="form-control" id="exampleInputEmail1" placeholder="data username">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="data Password">
  </div>
  <div class="form-group">
   <label for="exampleInputPassword1">Please Select Data</label>
<select class="form-control">
  <option>SQL Server</option>
  <option>Mysql</option>
  <option>oracle</option>
</select>
  </div>
</form>
      </div>
      <div class="modal-footer">
         <button type="button" class="btn btn-primary">Test connect</button>
        <button type="button" class="btn btn-primary">connect</button>
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>
  </body>
</html>

    <script type="text/javascript">
        	$(".loginmmd").click(function() {
    		$('#myModal').modal("show");
   		 });
    </script>







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