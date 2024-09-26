package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ff
 */
@WebServlet("/test2.do")
public class RequestPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestPostServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		//요청시 전달된 데이터 => request의 parameter 영역에 있음
		
		//POST 방식의 경우 데이터를 처리하기
		request.setCharacterEncoding("UTF-8");
		
		String userName = request.getParameter("userName");
		String gender = request.getParameter("gender");
		int age = Integer.parseInt(request.getParameter("age"));
		String address = request.getParameter("address");
		double height = Double.parseDouble(request.getParameter("height"));
		
		System.out.println("이름: " + userName);
		System.out.println("gender: " + gender);
		System.out.println("age: " + age);
		System.out.println("address: " + address);
		System.out.println("heught: " + height);
		
		//같은 키값으로 여러개의 데이터가 전달되는 경우 : request.getParameterValues("키") : String[]
		String[] foods = request.getParameterValues("food"); //["한식"] | null
		//System.out.println(foods);
		
		if(foods == null) {
			System.out.println("선택된 음식 없음.");
		}else {
			System.out.println("foods : " + String.join("/", foods));
		}
		
		//--------------------------------------------
		
		/*
		 * * 순수 서블릿 방식 JaVA 코두드 내에서 html 작성
		 * * JSP (Java Server Page) 방식 : html 내에 Java 코드 작성
		 */
		
		//응답 페이지에서 필요한 데이터를 정리하여 전달
		// -> 전달하는 공간 : request 객체의 attribute 라는 공간 사용
		request.setAttribute("name", userName);
		request.setAttribute("gender", gender);
		request.setAttribute("age", age);
		request.setAttribute("address", address);
		request.setAttribute("height", height);
		request.setAttribute("foods", foods);
		
		
		
		// 응답 페이지를 jsp에게 맡기자!
		
		// jsp 페이지로 응답 : request.getRequestDispatcher(응답페이지경로);
	  RequestDispatcher view = request.getRequestDispatcher("views/responsePage.jsp");
	  view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("dopost 메소드 실행");
		doGet(request, response);
	}

}
