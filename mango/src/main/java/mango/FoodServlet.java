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
@WebServlet(urlPatterns = "/food")
public class FoodServlet extends HttpServlet{
	
	public FoodServlet() {
		System.out.println("This is No Argument construtor");
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
		System.out.println("name:"+name);
		String Menu=req.getParameter("Menu");
		System.out.println("type:"+Menu);
		String Hotel=req.getParameter("Hotel");
		System.out.println("type:"+Hotel);
		String price=req.getParameter("price");
		int conPrice=Integer.parseInt(price);
		System.out.println("type:"+price);
		String Quantity=req.getParameter("Quantity");
		System.out.println("Quantity:"+Quantity);
		int conQuantity=Integer.parseInt(Quantity);
		int total=0;
		if(conPrice>0) {
			total=conPrice*conQuantity;
				req.setAttribute("Message", price);
				req.setAttribute("Value", Quantity);
			}
		
		
		
		req.setAttribute("Key1", name);
		req.setAttribute("Key2", Menu);
		req.setAttribute("Key3", Hotel);
		req.setAttribute("Key4", price);
		req.setAttribute("Key5", Quantity);
		req.setAttribute("Key6", total);
		
		
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("ProductsSuccess.jsp");
		requestDispatcher.forward(req,resp);
		
	super.doPost(req, resp);
	}

}
