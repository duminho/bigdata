package bean;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Dispatchservlet")
public class Dispatchservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Dispatchservlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get호출됌 ");
		String url = request.getRequestURI();
		System.out.println("uri");
		String path = url.substring(url.lastIndexOf("/"));
		System.out.println(path);
		if(path.equals("/start.do")) {
			System.out.println("시작하는 컨트롤러 메소드 호출");
		}else if(path.equals("/bye.do")) {
			System.out.println("끝내는 컨트롤러 메소드 호출");
		}else{
			System.out.println("처리할 수 있는 컨트롤러가 없습니다.");
		}
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post호출됌 ");
	}

}
