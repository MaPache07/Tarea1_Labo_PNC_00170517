package com.uca.capas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String reqUser, reqPass;
		String user = "admin";
		String pass = "admin";
		
		reqUser = request.getParameter("user");
		reqPass = request.getParameter("pass");
		
		PrintWriter out = response.getWriter();
		
		if(reqUser.equals(user) && reqPass.equals(pass)) {
			out.println("<html>");
			out.println("<body>");
			out.println("<label>Login successful</label>");
			out.println("</body>");
			out.println("</html>");
		} else {
			out.println("<html>");
			out.println("<body>");
			out.println("<label>Login failed</label>");
			out.println("</body>");
			out.println("</html>");
		}
	}

}
