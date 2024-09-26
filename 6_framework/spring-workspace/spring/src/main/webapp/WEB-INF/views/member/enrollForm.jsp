<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

        .outer {
            background-color: #e7e7e7;
            width: 80%;
            margin: auto;
        }
        .inner-area {
            border: 1px solid #000025;
            width: 80%;
            margin: auto;
            padding: 5% 15%;
            background: #e7ecf7;
        }
    </style>
</head>
<body>

 <%-- header --%>
 <%-- <jsp:include page="../common/header.jsp"/> --%>
 
    <%@ include file="../common/header.jsp" %>

    <div class="outer">
        <br><br>
        <div class="inner-area">
            
            <h2>회원가입</h2>
            <br>
            <form action="<%= contextPath %>/member/insert" method="post">
            <%-- 상대 경로 요청 시 action="insert" 로 작성  --%>

                <div class="form-group">
                    <label for="userId">* 아이디 </label>
                    <input type="text" class="form-control mb-3" name="userId" id="userId" placeholder="아이디를 입력하세요" required>

                    <label for="userPwd">* 비밀번호 </label>
                    <input type="password" class="form-control mb-3" name="userPwd" id="userPwd" placeholder="Enter Password.." required>

                    <label for="checkPwd">*  비밀번호 확인 </label>
                    <input type="password" class="form-control mb-3" id="checkPwd" placeholder="Enter Password.." required>
                    
                    <label for="userName">* 이름 </label>
                    <input type="text" class="form-control mb-3" name="userName" id="userName" placeholder="Enter Name.." required>

                    <label for="email"> &nbsp; 이메일 </label>
                    <input type="email" class="form-control mb-3" name="email" id="email" placeholder="Enter Email..">  
                    
                    <label for="age"> &nbsp; 나이 </label>
                    <input type="number" class="form-control mb-3" name="age" id="age" placeholder="Enter Age..">  
                    
                    <label for="phone"> &nbsp; 전화번호 </label>
                    <input type="tel" class="form-control mb-3" name="phone" id="phone" placeholder="Enter Phone(-제외)..">  
                    
                    <label for="address"> &nbsp; 주소 </label>
                    <input type="text" class="form-control mb-3" name="address" id="address" placeholder="Enter Address..">

                    <label for=""> &nbsp; 성별</label> &nbsp;&nbsp;
                    <input type="radio" class="mb-3" name="gender" id="Male" value="M">
                    <label for="Male">남자</label> &nbsp;&nbsp;
                    <input type="radio" class="mb-3" name="gender" id="Female" value="F">
                    <label for="Female">여자</label><br>

                </div>
                <br>
                <div class="btns"  align="center">
                    <button type="submit" class="btn btn-primary">회원가입</button>
                    <button type="reset" class="btn btn-danger">초기화</button>
                </div>
            </form>
        </div>
        <br><br>
    </div>

    <%-- footer --%>
    <jsp:include page="../common/footer.jsp" />
</body>
