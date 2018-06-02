package br.com.tiagodevelop.firstejb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.tiagodevelop.firstejb.sessionBean.PrimeiroSessionBean;

@WebServlet(urlPatterns={"/cumprimentar"})
public class ApplicationServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3458651241584629794L;
	
	@EJB
	private PrimeiroSessionBean primeiroSessionBean;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		String nome = req.getParameter("nome");
		
		
		
		out.println(primeiroSessionBean.sayHello(nome));
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		
		
	
		out.println("Foi!!");
	}
}
