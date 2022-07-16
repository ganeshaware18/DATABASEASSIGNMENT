package in.cdackolkata.ganesh;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/firstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("do get method");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		String firstname =request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String address = request.getParameter("addresss");
		String city = request.getParameter("city");
		String inputstate = request.getParameter("inputstate");
		String inlinegender = request.getParameter("inlinegender");
		PrintWriter out =response.getWriter();
		out.println("<br/>");
		
		out.print("NAME: " +firstname 
				 + "<br/>" + "AGE: " +lastname
				 +"<br/>" + "Email: " +email
				 +"<br/>" + "password: " +password
				 +"<br/>" + "address: " +address
				 +"<br/>" + "city: " +city
				 +"<br/>" + "state: " +inputstate
				 +"<br/>" + "Gender: " +inlinegender
				);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
