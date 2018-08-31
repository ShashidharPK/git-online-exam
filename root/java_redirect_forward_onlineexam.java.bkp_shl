<%
	String redirectURL = "http://www.example.com/";
	response.sendRedirect(redirectURL);
	response.sendForward(redirectURL);
	return;
%>
 
 public class ForwardServlet extends HttpServlet 
{
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String query = request.getQueryString();
    if (query.contains("fwd")) 
    {
      String fwd = request.getParameter("fwd");
      try 
      {
        request.getRequestDispatcher(fwd).forward(request, response);
      } 
      catch (ServletException e) 
      {
        e.printStackTrace();
      }
    }
  }
}