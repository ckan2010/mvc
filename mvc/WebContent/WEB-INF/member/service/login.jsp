<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- <jsp:include page="../../global/top.jsp" />
<jsp:include page="../../global/header.jsp" /> -->
<link rel="stylesheet" href="${css}/global.css" />
<style type="text/css">
	span.meta{position:absolute;margin:3px 0 0 -65px;}
</style>	
	<div class="box">
	<h1>회원관리 로그인</h1>
	<form action="${context}/member/result/login.jsp" method="post">
		<span class=meta>ID</span><input type="text" name="id" /><br />
		<span class=meta>비밀번호</span><input type="password" name="pw" /><br />
		<br /><br /><br />
		<input type="submit" value="로그인" />
		<input type="reset" onclick=" location='${context}/index.jsp'" value="취소" />
	</form>
	</div>
	<!-- <jsp:include page="../../global/footer.jsp"/>
	<jsp:include page="../../global/end.jsp"/> -->