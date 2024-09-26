package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class getServlet
 */
@WebServlet("/orderPizza.do")
public class getServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String name = request.getParameter("name");
      String address = request.getParameter("address");
      String tel = request.getParameter("tel");
      String memo = request.getParameter("memo");
      String flavor = request.getParameter("flavor");
      String topping = request.getParameter("topping");
      String side = request.getParameter("side");
      
      request.setAttribute("name", name);
      request.setAttribute("address", address);
      request.setAttribute("tel", tel);
      request.setAttribute("memo", memo);
      request.setAttribute("flavor", flavor);
      request.setAttribute("topping", topping);
      request.setAttribute("side", side);
      
      RequestDispatcher view = request.getRequestDispatcher("views/pizza/confirm.jsp");
      view.forward(request, response);
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      doGet(request, response);
   }

}
