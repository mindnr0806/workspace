<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello</title>
</head>
<body>
	
	<%--
		*회원서비스
					| C(insert) | R(select) | U(update) | D(delete)
		===========================================================
		로그인		|			|  	  O		|			|
		회원가입		|	  O		| 			|			|	  
		마이페이지     |	  		| 	  O		|			|	             
		정보수정		|	  		| 			|	  O 	|	  
		회원탈퇴 	    |	  		| 			|	  O		|	  -
	[아이디중복체크]	 |	  		| 	 O		|			|	  
	===================================================================
	
	 --%>

	 <% com.kh.common.JDBCTemplate.getConnection();%>
	 
	 <%@ include file="views/common/menubar.jsp"%>
</body>
</html>