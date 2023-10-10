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

@WebServlet(urlPatterns = "/products")
public class ProductServelt extends HttpServlet{
	
	public ProductServelt() {
		System.out.println("This is No Args Constructor");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method in register servlet...");
		super.init(config);
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service method in register servlet...");
		super.service(req, res);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do post in register servlet");
		String name=req.getParameter("name");
		String price=req.getParameter("price");
		String type=req.getParameter("type");
		String quantity=req.getParameter("quantity");
		
		System.out.println("name:"+name);
		System.out.println("price:"+price);
		System.out.println("type:"+type);
		System.out.println("quantity:"+quantity);
		
		req.setAttribute("Key1", name);
		req.setAttribute("Key2", price);
		req.setAttribute("Key3", type);
		req.setAttribute("Key4", quantity);
		
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("ProductsSuccess.jsp");
		requestDispatcher.forward(req,resp);
		
		
}
	
}
