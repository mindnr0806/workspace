package com.kh.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.member.model.service.MemberService;
import com.kh.member.model.vo.Member;

/**
 * Servlet implementation class UpdatePwdController
 */
@WebServlet("/updatePwd.me")
public class UpdatePwdController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePwdController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//전달된 데이터 추출(현재 비밀번호, 변경할 비밀번호)
		String userPwd = request.getParameter("userPwd");
		String newPassword = request.getParameter("newPassword");
		
		HttpSession session = request.getSession();

		//세션영역에서 사용자의 정보 중 아이디 추출 
		Member user = (Member)session.getAttribute("loginUser");
		String userId = user.getUserId();
		//서비스객체로 아이디, 현재 비밀번호 변경할 비밀번호 전달하면서 비민번호 변경 요청
		Member updateMem = new MemberService().updatePassword(userId, userPwd, newPassword);
		//변결 실패 했을 때는 에러페이지로 응답	
		if(updateMem == null) {
			request.setAttribute("errorMsg", "비밀번호 변경에 실패했습니다.");
			request.getRequestDispatcher("views/common/errorpage.jsp")
				.forward(request, response);
		}else {
		
		//변경 성공 했을 때 마이 페이지로 이동 (url 재요청), 성공했습니다. 메세지 알림창 띄우기
		session.setAttribute("alertMsg", "비밀번호 변경이 성공했습니다.");
		
		session.setAttribute("loginUser", updateMem);
		
		response.sendRedirect(request.getContextPath()+ "/myPage.me");
	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
