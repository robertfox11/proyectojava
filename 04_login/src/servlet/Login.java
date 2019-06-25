package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter out=response.getWriter();){
			String Usuario=request.getParameter("user");
			String Password=request.getParameter("pwd");
			if(Usuario.equals("root")&&Password.equals("root")) {
				out.println("<h1>Autenticado!</h1>");
				
			}else {
				out.println("<h1>Error de autenticacion</h1>");
			}
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
					}
	}

}
