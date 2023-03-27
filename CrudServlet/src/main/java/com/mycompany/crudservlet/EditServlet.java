// FABRICIO CARLOS GUIMARAES CB3014886 ADS571
// BENILDES FERNANDES DE MENEZES CB3004392  ADS571

package com.mycompany.crudservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/EditServlet2")
public class EditServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
			{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String sid=request.getParameter("id");
			int id=Integer.parseInt(sid);
			String name=request.getParameter("name");
			String password=request.getParameter("password");
			String email=request.getParameter("email");
			String country=request.getParameter("country");
			Emp e=new Emp();
			e.setId(id);
			e.setName(name);
			e.setPassword(password);
			e.setEmail(email);
			e.setCountry(country);
			int status = EmpDao.update(e);
			if(status>0){
			response.sendRedirect("ViewServlet");
			}else{
			out.println("Sorry! unable to update record");
			}
			out.close();
			}
} 
