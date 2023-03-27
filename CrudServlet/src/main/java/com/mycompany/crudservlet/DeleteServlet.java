// FABRICIO CARLOS GUIMARAES CB3014886 ADS571
// BENILDES FERNANDES DE MENEZES CB3004392  ADS571

package com.mycompany.crudservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException 
		{
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		EmpDao.delete(id);
		response.sendRedirect("ViewServlet");
		}
}
