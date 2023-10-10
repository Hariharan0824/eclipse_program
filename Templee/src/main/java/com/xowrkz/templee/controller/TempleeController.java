package com.xowrkz.templee.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.templee.dto.TempleeDTO;
import com.xworkz.templee.repo.TempleeRepository;
import com.xworkz.templee.repo.TempleeRepositoryImpl;
import com.xworkz.templee.service.TempleeService;
import com.xworkz.templee.service.TempleeServiceImpl;

@WebServlet(urlPatterns = {"/templee", "/templeeview"})
public class TempleeController  extends HttpServlet{
	private TempleeRepository templeeRepo = new TempleeRepositoryImpl();

	private TempleeService templeeService = new TempleeServiceImpl(templeeRepo);

	public TempleeController() {
		System.out.println("No-arg const");
	}	

	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String place = req.getParameter("place");
		String mainGod = req.getParameter("mainGod");
		String constYear = req.getParameter("constYear");
		String constBy = req.getParameter("constBy");
		
		TempleeDTO dto = new TempleeDTO(name, place, mainGod, constYear,constBy);
		
		templeeService.validAndSave(dto);
		RequestDispatcher dispatcher = req.getRequestDispatcher("Templee.jsp");
		dispatcher.forward(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet");
		String uri = req.getRequestURI();
		
		if(uri.endsWith("/total")) {
			req.setAttribute("total", this.templeeService.total());
			req.getRequestDispatcher("Templee.jsp").forward(req, resp);
	}
		else if(uri.endsWith("/view")) {
			req.setAttribute("view", this.templeeService.getAll());
			req.getRequestDispatcher("GroceryView.jsp").forward(req, resp);
		}
			
		}
	
	

}
