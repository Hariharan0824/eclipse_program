package mango;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/vendor")
public class VendorServlet extends HttpServlet{
	
	public VendorServlet() {
		System.out.println("This is No Args Constructor");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method in Vendor servlet...");
		super.init(config);
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service method in Vendor servlet...");
		super.service(req, res);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do post in Vendor servlet");
		String name=req.getParameter("name");
		String GST=req.getParameter("GST");
		String owner=req.getParameter("owner");
		String location=req.getParameter("location");
		
		System.out.println("name:"+name);
		System.out.println("price:"+GST);
		System.out.println("type:"+owner);
		System.out.println("quantity:"+location);
		
		req.setAttribute("Key1", name);
		req.setAttribute("Key2", GST);
		req.setAttribute("Key3", owner);
		req.setAttribute("Key4", location);
		
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("VendorSuccess.jsp");
		requestDispatcher.forward(req,resp);
		
		
	}
	
	@Override
	public void destroy() {
		System.out.println("Destory Method in Vendor servlet");
		super.destroy();
	}
	

}