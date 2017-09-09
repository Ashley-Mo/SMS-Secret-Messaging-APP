package demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servlet implementation class MyServlet

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	// response)

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String message = request.getParameter("message");
		String numKey = request.getParameter("key");
		int num = Integer.parseInt(numKey);

		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + "</h1>");

		PrintWriter outKey = response.getWriter();
		outKey.println("<h1>" + numKey + "</h1>");

		secretMessages sms = new secretMessages();
		System.out.println("Object created");

		String outTwo = sms.secret(message, num);
		System.out.println("method invoked");
		System.out.println("Output: " + outTwo);
		request.setAttribute("message", message);
		request.setAttribute("key", numKey);
		request.setAttribute("encode", outTwo);

		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
