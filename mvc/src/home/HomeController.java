package home;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javafx.scene.shape.Path;
import jdk.nashorn.internal.ir.RuntimeNode.Request;

/**
 * Servlet implementation class HomeController
 */
@WebServlet({"/home.do","/top.do","/header.do","/footer.do","/end.do"})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String servletPath = request.getServletPath();
		String path = servletPath.split("/")[1];
		String view = path.substring(0, path.indexOf("."));
		System.out.println("가야할경로 : "+view);
		RequestDispatcher dis = request.getRequestDispatcher("/WEB-INF/global/"+view+".jsp");
		dis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
