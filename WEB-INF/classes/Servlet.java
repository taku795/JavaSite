import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/first")
public class Servlet extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException{

    response.setContentType("text/html;charset=utf-8");
    PrintWriter out = response.getWriter();

    out.println("<html><head>Sample</head><body>");
    out.println("<p>Hello World!</p>");
    out.println("</body></html>");
  }
}