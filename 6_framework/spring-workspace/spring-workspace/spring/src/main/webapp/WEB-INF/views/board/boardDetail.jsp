<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 상세보기</title>
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

table {
	width: 100%;
}

table * {
	margin: 5px;
}
</style>
</head>
<body>
	<%-- header --%>
	<jsp:include page="../common/header.jsp" />

	<div class="outer">

		<br> <br>
		<div class="inner-area">
			<h2>게시글 상세보기</h2>
			<br> <a href="list" class="btn btn-secondary" style="float: right;">목록보기</a>
			<br> <br>

			<table align="center" class="table">
				<tr>
					<th width="100">제목</th>
					<td colspan="3">${b.boardTitle}</td>
				</tr>
				<tr>
					<th>작성자</th>
					<td>${b.boardWriter}</td>
					<th>작성일</th>
					<td>${b.createDate}</td>
				</tr>
				<tr>
					<th>첨부파일</th>
					<td colspan="3"><c:choose>

							<c:when test="${not empty b.originName}">

								<a href="<%= request.getContextPath() %>/"${b.changeName }" download="${b.originName}">"${b.originName}"</a>
							</c:when>

							<c:otherwise>
                       첨부파일 없음
                       </c:otherwise>

						</c:choose></td>
				</tr>
				<tr>
					<th>내용</th>
					<td colspan="3"></td>
				</tr>
				<tr>
					<td colspan="4">
						<p style="height: 150px;">${b.boardContent}</p>
					</td>
				</tr>
			</table>
			<br>

			<div align="center">
				<!-- 작성자와 로그인한 계정이 동일한 경우만 표시 -->
				<c:if test="${loginUser.userId eq b.boardWriter}">
				<a class="btn btn-primary" onclick="postSubmit('update');">수정</a>
				<a class="btn btn-danger" onclick="postSubmit('delete');">삭제</a>
				</c:if>
			</div>
			<br> <br>
			
			<form action="" method="post" id="postForm">
				<input type="hidden" name="bno" value="${b.boardNo} "/>
			</form>
			
			<script>
				function postSubmit(type){
					const postForm = document.getElementById("postForm")
					//document.querySelector("#postForm")
					
					if(type == 'update'){
						//게시글 수정 페이지로 요청
						postForm.action = 'updateForm';
					}else if (type == 'delete'){
						//게시글 삭제 요청
						postForm.action = 'delete';
					}
					postForm.submit();
				}
			
			</script>
			
			
			<table id="replyArea" class="table" align="center">
				<thead>
				<%--로그인한 사용자만 댓글을 작성할 수 있도록 
					=> 만약, 로그인을 하지 않아다면 입력창 부분에 '로그인 후 이용가능합니다.' 메세지를 표시하고 입력하지 목하도록
					[등록] 버튼을 비활성화
				--%>
				<c:choose>
				<c:when test="${not empty loginUser}">
				<tr>
				<th colspan="2">
				<textarea id="content" cols="55" rows="2" class="form-control" style="resize:none"></textarea>
					</th>
					<th style="vertical-align:middle;">
					<button class="btn btn-secondaty" onclick="addReply();">등록</button>
					</th>
					</tr>
					</c:when>  
				
					
					
					<c:otherwise>
						<%--로그인 하지않았을 경우 --%>
						<tr>
				<th colspan="2">
				<textarea id="content" cols="55" rows="2" class="form-control" style="resize:none" placeholder="로그인후 이용 가능합니다." readonly></textarea>
					</th>
					<th style="vertical-align:middle;">
					<button class="btn btn-secondaty" onclick="addReply();" disabled>등록</button>
					</th>
					</tr>
					</c:otherwise>	
					</c:choose>
					<tr>
						<td colspan="3">댓글 (<span id="rcount">0</span>)</td>
					</tr>
				</thead>
				<tbody></tbody>
				</table>
			<br> <br>
		</div>


	</div>
	<script>	
	//onload
	$(function(){
		//해당게시글 의 댓글 목록조회(ajax)
		selectReplyList();
	});
	function selectReplyList(){
		$.ajax({
			url: "rlist",
			data: { bno:${b.boardNo} },
			success: function(result){
				console.log(result);
				
				//댓글목록이없는 경우 화면에표시
				//댓글목록
				//댓글목록
				if (result !=null && result.length > 0){
					let replyValue ="";
					for (let r of result){
						replyValue += "<tr>"
									+"<th>" + r.replyWriter + "</th>"
									+"<td>" + r.replyContent + "</td>"
									+"<td>" + r.createDate + "</td>"
									+ "</tr>";	
					} 
					$("#replyArea tbody").html(replyValue);
					$("#rcount").text(result.length);
				}
				
			},
			error:function(err){
				console.log("댓글 조회 실패!");
				console.log(err);
			}
		});
	}
	
	function addReply(){
		//alert($("#replyArea #content").val() );
		
		//입려된 내용이 있을겨우 추가 요청하도록 
		if  ($("#replyArea #content").val().length > 0){ 
		
		//댓글 추가 요청 (ajax) 
		// => /spring/board/rinsert?replyContent=입력된내용&refBno=게시글번호&replyWruter=작성자
				$.ajax({
					url: "rinsert", //요청주소

			        data: {
			            replyContent: $("#replyArea #content").val(),
			            refBno: '${b.boardNo}',  // 여기에 실제 게시글 번호를 넣어주세요
			            replyWriter: '${loginUser.userId}'  // 여기에 실제 작성자 정보를 넣어주세요
			        },

			        success: function(result) {  //요청 성공시
			           console.log(result);
			           if(result === "success") {
			        	 //댓글 추가 성공시,입력창 부분을 초기화 댓글 목록 다시 조회
			               $("#replyArea #content").val(""); // 입력창 초기화
			               selectReplyList(); // 댓글 목록 다시 조회
			           } else {
			        	 //댓글 추가 실패시, ''댓글 추가에 실패했습니다,' 메세지를 출력(alert) 
			               alert("댓글 추가에 실패했습니다.");
			           }
			       },

			        error: function(err) {		 // 요청 실패시(통신 실패)
			            alert("서버 통신 오류가 발생했습니다.");
			        	console.log('댓글 추가 요청 실패');
			        	console.log(err);
			        }
				});
		  } else {
              alert("내용 입력 후 추가 가능합니다.");
          }
	}
	</script>

	<%-- footer --%>
	<jsp:include page="../common/footer.jsp" />
</body>
</html>