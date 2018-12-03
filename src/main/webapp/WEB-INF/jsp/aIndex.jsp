<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.8.0.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$.ajax({
			type : "POST",
			async : false,
			url : "http://api.itmayiedu.com/b/getBInfo",
			dataType : "json",
			success : function(data) {
				alert(data["respCode"]);
			},
			error : function() {
				alert('fail');
			}
		});

	});
</script>
</head>
<body>

我是A项目，正在调用B项目

</body>
</html>