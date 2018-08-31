<%
	String redirectURL = "http://www.example.com/";
	/*Changes for ASAP(Application Security Assessment Platform) : start 	 	 Vulnerability: Unvalidated Redirect 
 	 Vulnerable Line: response._sendRedirect(redirectURL);*/
 	if (canRedirect(redirectURL)) /*To check the URL against the whitelist */  
 				  /*Changes for ASAP(Application Security Assessment Platform) : start 	 	 Vulnerability: Unvalidated Redirect 
 	 Vulnerable Line: response._sendRedirect(redirectURL);*/
 	if (canRedirect(redirectURL)) /*To check the URL against the whitelist */  
 				  response.sendRedirect(redirectURL);
/*Add following code and whitelist 
 public static bool canRedirect(forwardUrl)
	{
		String list[]=new String[50]; 		  Whitelist
		List valid = Arrays.asList(list);
		return valid.contains(forwardUrl);
	}*/

 	 /* Changes for ASAP(Application Security Assessment Platform) : End */

/*Add following code and whitelist 
 public static bool canRedirect(forwardUrl)
	{
		String list[]=new String[50]; 		  Whitelist
		List valid = Arrays.asList(list);
		return valid.contains(forwardUrl);
	}*/

 	 /* Changes for ASAP(Application Security Assessment Platform) : End */

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
        /*Changes for ASAP(Application Security Assessment Platform) : start 	 	 Vulnerability: Unvalidated Forward 
 	 Vulnerable Line: request.getRequestDispatcher(fwd).forward(request,_response); */
 	if (canRedirect(fwd)) /*To check the URL against the whitelist */  
 				  /*Changes for ASAP(Application Security Assessment Platform) : start 	 	 Vulnerability: Unvalidated Forward 
 	 Vulnerable Line: request.getRequestDispatcher(fwd).forward(request,_response); */
 	if (canRedirect(fwd)) /*To check the URL against the whitelist */  
 				  request.getRequestDispatcher(fwd).forward(request, response);
/*Add following code and whitelist 
 public static bool canRedirect(forwardUrl)
	{
		String list[]=new String[50]; 		  Whitelist
		List valid = Arrays.asList(list);
		return valid.contains(forwardUrl);
	}*/

 	 /* Changes for ASAP(Application Security Assessment Platform) : End */

/*Add following code and whitelist 
 public static bool canRedirect(forwardUrl)
	{
		String list[]=new String[50]; 		  Whitelist
		List valid = Arrays.asList(list);
		return valid.contains(forwardUrl);
	}*/

 	 /* Changes for ASAP(Application Security Assessment Platform) : End */

      } 
      catch (ServletException e) 
      {
        e.printStackTrace();
      }
    }
  }
}