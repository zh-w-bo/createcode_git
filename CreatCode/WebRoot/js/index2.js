
 function formatNumber(num,cent,isThousand) {
			    num = num.toString().replace(/\$|\,/g,'');

			    // 检查传入数值为数值类型
			     if(isNaN(num))
			      num = "0";

			    // 获取符号(正/负数)
			    sign = (num == (num = Math.abs(num)));

			    num = Math.floor(num*Math.pow(10,cent)+0.50000000001); // 把指定的小数位先转换成整数.多余的小数位四舍五入
			    cents = num%Math.pow(10,cent);       // 求出小数位数值
			    num = Math.floor(num/Math.pow(10,cent)).toString();  // 求出整数位数值
			    cents = cents.toString();        // 把小数位转换成字符串,以便求小数位长度

			    // 补足小数位到指定的位数
			    while(cents.length<cent)
			     cents = "0" + cents;

			    if(isThousand) {
			     // 对整数部分进行千分位格式化.
			     for (var i = 0; i < Math.floor((num.length-(1+i))/3); i++)
			      num = num.substring(0,num.length-(4*i+3))+','+ num.substring(num.length-(4*i+3));
			    }

			    if (cent > 0)
			     return (((sign)?'':'-') + num + '.' + cents);
			    else
			     return (((sign)?'':'-') + num);
			   }	
$(function () {
		 $('#myTab li a').each(function(){  
		        if($($(this))[0].href==String(window.location))  
		            $(this).parent().addClass('active');  
		    });  
	$.extend( $.fn.dataTable.defaults, {
		 "oLanguage" : {//国际语言转化
						"oAria" : {
							"sSortAscending" : " - click/return to sort ascending",
							"sSortDescending" : " - click/return to sort descending"
						},
						"sProcessing" : "处理中...",
						"sLengthMenu" : "显示 _MENU_ 项结果",
						"sZeroRecords" : "没有匹配结果",
						"sInfo" : "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
						"sInfoEmpty" : "显示第 0 至 0 项结果，共 0 项",
						"sInfoFiltered" : "(由 _MAX_ 项结果过滤)",
						"sInfoPostFix" : "",
						"sUrl" : "",
						"sEmptyTable" : "表中数据为空",
						"sLoadingRecords" : "",
						"sProcessing": "",    
						"sInfoThousands" : ",",
						"oPaginate" : {
							"sFirst" : "首页",
							"sPrevious" : " 上一页 ",
							"sNext" : " 下一页 ",
							"sLast" : " 尾页 "
						}
					},
		} );
	
		//轮播自动播放
		$('#myCarousel').carousel({
		//自动4秒播放
			interval : 4000,
		});
	
		//设置垂直居中
		$('.carousel-control').css('line-height', $('.carousel-inner img').height() + 'px');
		$(window).resize(function () {
			var $height = $('.carousel-inner img').eq(0).height() || 
						  $('.carousel-inner img').eq(1).height() || 
						  $('.carousel-inner img').eq(2).height();
			$('.carousel-control').css('line-height', $height + 'px');
		});
		
});