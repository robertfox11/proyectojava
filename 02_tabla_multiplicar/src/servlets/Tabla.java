package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Tabla")
public class Tabla extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		response.setContentType("text/html");
		try(PrintWriter out=response.getWriter();){
			out.println("<html>");
			
			out.println("<body><center><table border='1'>");
				for(int i=1;i<=10;i++) {
					out.println("<tr>");
					for(int k=1;k<=10;k++) {
						out.println("<td>"+i*k+"</td>");
					}
					out.println("</tr>");
				}
			out.println("</table></center></body>");
			out.println("</html>");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
