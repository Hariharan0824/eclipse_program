package com.xworkz.vegetable.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.vegetable.Repo.VegetableRepo;
import com.xworkz.vegetable.Repo.VegetableRepoimpl;
import com.xworkz.vegetable.services.VegetableService;
import com.xworkz.vegetable.services.VegetableServiceimpl;
import com.xwrokz.Vegetable.DTO.VegetableDTO;

@WebServlet(urlPatterns = { "/vegetable", "/vegetableview" })
public class VegetableController extends HttpServlet {

	private VegetableRepo vegetableRepo = new VegetableRepoimpl();
	private VegetableService vegetableService = new VegetableServiceimpl(vegetableRepo);

	public VegetableController() {
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
		
		String id = req.getParameter("id");
		int id1 = Integer.parseInt(id);
		String name = req.getParameter("name");
		String price = req.getParameter("price");
		int price1 = Integer.parseInt(price);
		String weight = req.getParameter("weight");
		double weight1 = Double.parseDouble(weight);
		
		VegetableDTO dto= new VegetableDTO(id1,name,price1,weight1); 
      	vegetableService.ValidAndSave(dto);
		RequestDispatcher dispatcher = req.getRequestDispatcher("Vegeable.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet");
		String uri = req.getRequestURI();
	}
}
