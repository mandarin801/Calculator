package org.gradle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String html = "<HTML>"+
                "<HEAD>" +
                "<TITLE>" +
                "First page" +
                "</TITLE>" +
                "</HEAD>" +
                "<BODY>" +
                "<H1>" +
                "Hello" +
                "<H1>" +
                "</BODY>" +
                "";
		resp.getWriter().println(html);
	}

    @Override
    public void init() throws ServletException
    {
        System.out.println("Servlet " + this.getServletName() + " has started.");
    }
    @Override
    public void destroy()
    {
        System.out.println("Servlet " + this.getServletName() + " has stopped.");
    }

}
