package com.isedin.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.isedin.bean.CompanyBean;
import com.isedin.bean.UserBean;
import com.isedin.service.dao.user.UserDAOImp;

/**
 * Servlet implementation class AddEmployerUser
 */
@WebServlet("/addemployeruser")
public class AddEmployerUser extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		UserBean user = new UserBean();
		CompanyBean company = new CompanyBean();
		UserDAOImp userdao = new UserDAOImp();

		// Firma Bilgileri
		company.setName(request.getParameter("companyname"));
		company.setSector(request.getParameter("sector"));
		company.setDistrict(request.getParameter("district"));
		company.setCity(request.getParameter("city"));
		company.setPhonenumber(request.getParameter("phonenumber"));
		company.setTown(request.getParameter("sector"));

		// Kiþi Bilgileri
		user.setUsername(request.getParameter("username"));
		user.setName(request.getParameter("name"));
		user.setSurname(request.getParameter("surname"));
		user.setEmail(request.getParameter("email"));
		user.setCellphone(request.getParameter("cellphone"));
		user.setPassword(request.getParameter("password"));

		try {
			userdao.AddEmployerUser(user, company);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("/FindJobWithMap/AddDepartment.html");
	}

}
