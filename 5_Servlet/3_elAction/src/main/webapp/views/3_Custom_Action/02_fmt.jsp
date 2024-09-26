<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri= "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL - fmt</title>
</head>
<body>
	<h1>JSTL - Formatting Library</h1>
	
	<h3>1. formatNumber</h3>
	<p>
		숫자데이터 형식(포맷)지정 <br>
		*표현하고자 하는 숫자 데이터의 형식을 통화기호, % 등 원하는 쓰임에 맞게 지정하는 태그
		(fmt:formatNumber value="출력할 값" [griupingUsed="true|false"
										type="percent|currency"
										currencySymbol="문자"
										])
	</p>
	
	<%-- n1, n2, n3 변수에 각각 123456789, 0.77 50000이라는 값을 저장 --%>
	<c:set var="n1" value="123456789"/>
	<c:set var="n2" value="0.77"/>
	<c:set var="n3" value="50000"/>
	
	* n1의 값을 그대로 출력 : <c:out value="${ n1 }"/>, ${ bn1 }<br>
	* 세자리마다 구분하여 출력 : <fmt:formatNumber value="${n1}"/>
	<%-- groupingUsed 속성의 기본값 : true false --%>
	* 그대로 출력: < fmt:formatNumber value="${ n1 }" groupingUsed="false"/><br>

	*type=percent : <fmt:formatNumber value="${ n2 }" type="percent"/><br>
	*type=currency : <fmt:formatNumber value="${ n2 }" type="currency"/><br>

	*type=currency : <fmt:formatNumber value="${ n3 }" type="currency"/><br>
	*심볼 변경: <fmt:formatNumber value="${n3}" type="currency" currencySymbol="$"/>

	<hr>

	<h3>2. formatDate</h3>
	<p>
		날짜 밒 시간 데이터의 포맷(형식) 지정 <br>
		* java.util.Date 객체 사용
	</p>

	<%-- today라는 변수에 현재 낳짜 데이터를 저장 --%>
	*<c:set var="today" value="<%= new java.util.Date() %>"/>

	*현재 날짜 출력 : ${ today } <br>
	<ul>
		<li>
			현재 날짜: <fmt:formatDate value="${ today }"/>
		</li>
		<li>
		    현재 시간: <fmt:formatDate value="${ today }" type="time"/>
		</li>
		<li>
			현재 날짜+시간: <fmt:formatDate value="${ today }"  type="both"/>
		</li>
		<li>
			medium스타일: <fmt:formatDate value="${ today }"  type="both" dateStyle="medium" timeStyle="medium"/>
		</li>
		<li>
			long 스타일: <fmt:formatDate value="${ today }"  type="both" dateStyle="long" timeStyle="long"/>
		</li>
		<li>
			full 스타일: <fmt:formatDate value="${ today }"  type="both" dateStyle="full" timeStyle="full"/>
		</li>
		<li>
			short 스타일: <fmt:formatDate value="${ today }"  type="both" dateStyle="short" timeStyle="short"/>
		</li>
		<li>
			나만의 스타일: <fmt:formatDate value="${ today }"  type="both" pattern="yyyy-MM-dd (E) HH:mm:ss"/>
		</li>
	</ul>
</body>
</html>