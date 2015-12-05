package com.isedin.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.isedin.bean.DepartmentBean;
import com.isedin.service.dao.map.MapDAOImp;

/**
 * Servlet implementation class AddDepartment
 */
@WebServlet("/adddepartment")
public class AddDepartment extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DepartmentBean departmentbean = new DepartmentBean();
		MapDAOImp mapdao = new MapDAOImp();

		departmentbean.setCoords(request.getParameter("coords"));
		departmentbean.setCompanyid(10);
		departmentbean
				.setDepartmentname(request.getParameter("departmentname"));

		mapdao.addDepartment(departmentbean);
		response.sendRedirect("/FindJobWithMap/Login.html");
	}

}
