package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletSaludo
 */
@WebServlet("/ServletSaludo")//anotacion informar lo que esta debajo de algo indica que no es una clase cualquiera
public class ServletSaludo extends HttpServlet {
	

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body><center>");
		out.println("<table>");
		for(int i=1;i<=6;i++) {
			
			out.println("<h"+ i +">Bienvenido a mi servlet Otra vez</h" +i + ">");

		}
		out.println("</table>");
		out.println("</center></body>");
		out.println("</html>");
		
		out.close();
	}

}
