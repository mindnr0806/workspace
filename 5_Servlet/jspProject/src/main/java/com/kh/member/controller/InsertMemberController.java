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
 * Servlet implementation class InsertMemberController
 */
@WebServlet("/insert.me")
public class InsertMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertMemberController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청 시 전달되는 데이터에 한글이 포함되어 있으므로, 인코딩 처리 (POST)
		request.setCharacterEncoding("UTF-8");
		
		// 전달된 데이터 추출 (8개의 데이터)
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		// String userPwdCheck = request.getParameter("userPwdCheck");
		String userName = request.getParameter("userName");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String[] interestArr = request.getParameterValues("interest");
		
		// ["야구", "만화"] --> "야구, 만화"
		String interest = "";
		if (interestArr != null) {
			interest = String.join(",", interestArr);
		}
		
		// * 기본생성자로 객체 생성 후 setter 메소드 이용
		// * 전달된 데이터로만 생성할 수 있는 생성자 이용(추가 필요*)
		Member m = new Member(userId, userPwd, userName
								, phone, email, address, interest);
		
		int result = new MemberService().insertMember(m);
		
		if (result > 0) {	// 회원가입 성공
			HttpSession session = request.getSession();
			session.setAttribute("alertMsg", "회원가입에 성공했습니다!");
			
			// url 재요청 (/jsp)
			response.sendRedirect(request.getContextPath());
		} else {			// 회원가입 실패
			request.setAttribute("errorMsg", "회원가입에 실패했습니다.");
			
			// 에러페이지로 응답 (errorPage.jsp 페이지 포워딩)
			request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
		}
	}

}
