
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>피자 주문하기</title>
</head>
<body>
   <% String name = (String)request.getAttribute("name"); 
       String address = (String)request.getAttribute("address");
      String tel = (String)request.getAttribute("tel");
      String memo = (String)request.getAttribute("memo");
      String flavor = (String)request.getAttribute("flavor");
      String topping = (String)request.getAttribute("topping");
      String side = (String)request.getAttribute("side");
    %>
    <h2>피자 주문 내역</h2>
    <h4>주문자 정보</h4>
    <div style="color: blue"><%= address%></div>
    <div style="color: blue"><%= tel%></div>
    <h4>요청 사항</h4>
    <div>
    <%= memo%>
    <% if(memo == null){ %>
       없음
    <% } else { %>
       <%= memo%>
       <% } %>
    </div>
    <hr>
    <h4>주문 정보</h4>
    <ul><%= flavor%>
        <li>
            토핑
            <ul>
                <li><%= topping%></li>
            </ul>
        </li>
        <li>
            사이드 선택 항목
            <ul>
                <li><%= side%></li>
            </ul>
        </li>
    </ul>
    <hr>
    <h2><%=name%>님!</h2>
    <h2><span style="color: blue">즐거운 </span><span style="color: red">식사</span><span> 되세요</span><span style="color:yellow"> :)</span></h2>
    </body>
</html>