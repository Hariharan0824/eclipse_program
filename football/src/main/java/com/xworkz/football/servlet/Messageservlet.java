package com.xworkz.football.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/message.dosa")
public class Messageservlet extends HttpServlet{

	public Messageservlet() {
		System.out.println("Create Messageservelt.....");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking Message Servelt Program.....");
		String name=req.getParameter("name");
		String message=req.getParameter("message");
		System.out.println("Name:"+name);
		System.out.println("Message:"+message);
	}



}
