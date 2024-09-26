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
 * Servlet implementation class UpdateMemeberController
 */
@WebServlet("/update.me")
public class UpdateMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateMemberController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 인코딩 설정
		request.setCharacterEncoding("UTF-8");
		
		// 전달된 데이터 추출 
		String userId = request.getParameter("userId");
		String userName = request.getParameter("userName");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		
		String[] interArr = request.getParameterValues("interest"); 
		// => ["야구", "게임"] || null
		
		// 문자열배열(String[]) -> 문자열(String)
		String interest="";
		if (interArr != null) {
			interest = String.join(",", interArr);
		}
		
		Member m = new Member(userId, userName, phone, email, address, interest);
		
		Member updateMem = new MemberService().updateMember(m);
		
		if (updateMem == null) {		// 정보 수정 실패
			// 정보 수정 실패 메시지와 함께 에러페이지로 응답
			request.setAttribute("errorMsg", "정보 수정에 실패했습니다. 관리자에게 문의바랍니다.");
			
			request.getRequestDispatcher("views/common/errorPage.jsp")
				.forward(request, response);
		} else {						// 정보 수정 성공
			HttpSession session = request.getSession();
			// 세션 영역에 변경된 사용자 정보를 저장
			session.setAttribute("loginUser", updateMem);
			// 수정 성공했다는 메시지를 알림창을 띄울 수 있도록 세션영역에 저장
			session.setAttribute("alertMsg", "정보 수정 성공했습니다.");
			// 마이페이지로 url 재요청 (/jsp/myPage.me)
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
