package Login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
 private static final long serialVersionUID = 1L;
 public LoginServlet(){
	 super();
 }
 public void destroy(){
	 super.destroy();
 }
 public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
	 response.setCharacterEncoding("utf-8");
	 response.setContentType("text/html");
	 PrintWriter out = response.getWriter();
	 
	 String user = request.getParameter("user");
	 String pass = request.getParameter("pass");
	 
	 if("abc".equals(user) && "123456".equals(pass)){
		 out.print("<font seize=20 color=red>welcome,abc</font>");
	 }else{
		 out.print("<h2>username or psw error!</h2>");
	 }
	 out.flush();
	 out.close();
 }
 
 public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
	 doGet(request, response);
 }
}
