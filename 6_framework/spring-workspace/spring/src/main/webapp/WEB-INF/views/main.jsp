<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="common/header.jsp"/>
	
	<div class="outer">
	
	<div class="inner-area">
	
	<table id="topList" class="table table-hover" align="center">
                <thead>
                    <th>글번호</th>
                    <th>제목</th>
                    <th>작성자</th>
                    <th>조회수</th>
                    <th>작성일</th>
                    <th>첨부파일</th>
                </thead>

				<tbody></tbody>
                </table>
                </div>
                </div>
                
                
                <script>
                	$(function(){
                		boardTopList();
                	});
                	
                	function boardTopList(){
                		$.ajax({
                			url: 'board/top5',
                			success:function(result){
                				console.log(result);
                				
                			if(result != null && result.length > 0){
                				let value = '';
                				
                				for(let b of result){
                					value += '<tr>'
                							+ '<td>' + b.boardNo + '</td>'
                							+ '<td>' + b.boardTitle + '</td>'
                							+ '<td>' + b.boardWriter+ '</td>'
                							+ '<td>' + b.count + '</td>'
                							+ '<td>' + b.createDate + '</td>'
                							+"<td>";
                							if(b.originName != null){
                								value += '■';
                							}
                							value += '</td></tr>';
                						
                				}
                				$("#topList tbody").html(value);
                			}	
                			
                		},
                		error: function(err){
                			console.log("인기 게시글 조회 실패");
                			console.log(err);
                		}
                	});
                	}
                
                </script>
                </div>
                <c:forEach var="b" items="${list}">
                    <tr>
                        <td class="bno">${b.boardNo }</td>
                        <td>${b.boardTitle }</td>
                        <td>${b.boardWriter}</td>
                        <td>${b.count }</td>
                        <td>${b.createDate }</td>
                        <td>
                        	<c:if test="${ not empty b.originName} }">■</c:if>
                        </td>
                    </tr>
                    </c:forEach>
                    </tbody>
                    </table>                                  
                </tbody>
               
            </table>
	</div>
		
		
	
</body>
</html>