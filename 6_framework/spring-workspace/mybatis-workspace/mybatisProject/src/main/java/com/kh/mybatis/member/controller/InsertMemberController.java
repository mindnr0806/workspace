package com.kh.mybatis.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.mybatis.member.model.vo.Member;
import com.kh.mybatis.member.service.MemberServiceImpl;

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
		request.setCharacterEncoding("UTF-8");
		
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		String userName = request.getParameter("userName");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String[] interestArr = request.getParameterValues("interest");
		
	
				String interest = "";
				if (interestArr != null) {
					interest = String.join(",", interestArr);
				}
				
			
				Member m = new Member( userId, userPwd, userName
										, phone, email, address, interest);
				
				int result = new MemberServiceImpl().insertMember(m);
				
				if (result > 0) {	
					HttpSession session = request.getSession();
					session.setAttribute("alertMsg", "회원가입에 성공했습니다!");
					
				
					response.sendRedirect(request.getContextPath());
				} else {		
					request.setAttribute("errorMsg", "회원가입에 실패했습니다.");
					
			
					request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
				}
			}

		

		 
                                                                     
		
		
	}


