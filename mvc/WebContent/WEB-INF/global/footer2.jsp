<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
	<img src="${img}/twi.gif"" alt="" /><br />
	<% 
		int sum=0,i=1;
		for(;i<=10;++i){
			sum+=i;
		}
		%>1~10까지합은 : <%=sum %>
</body>
</html>