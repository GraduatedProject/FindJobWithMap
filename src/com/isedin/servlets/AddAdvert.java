package com.isedin.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.isedin.bean.AdBean;
import com.isedin.service.dao.ad.AdDAOImp;

/**
 * Servlet implementation class AddAdvert
 */
@WebServlet("/addadvert")
public class AddAdvert extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		AdBean advertbean = new AdBean();
		AdDAOImp addao = new AdDAOImp();

		advertbean.setTitle(request.getParameter("title"));
		advertbean.setCompanyname(request.getParameter("companyname"));
		advertbean.setCountry(request.getParameter("country"));
		advertbean.setNumberofpersonnel(
				Integer.parseInt(request.getParameter("numberofpersonnel")));
		advertbean.setSector(request.getParameter("sector"));
		advertbean.setPositiontype(request.getParameter("positiontype"));
		advertbean.setDescription(request.getParameter("description"));
		advertbean.setQualifications(request.getParameter("qualifications"));
		advertbean.setJobfield(request.getParameter("jobfield"));
		advertbean.setPositionlevel(request.getParameter("positionlevel"));
		advertbean.setExperience(request.getParameter("experience"));
		advertbean
				.setEducationallevel(request.getParameter("educationallevel"));

		SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-DD");

		java.util.Date postingdate = new java.util.Date();
		java.util.Date updateddate = new java.util.Date();
		java.util.Date lastapplydate = new java.util.Date();

		try

		{
			postingdate = formatter.parse(request.getParameter("postingdate"));
			java.sql.Date postingsqldate = new java.sql.Date(
					postingdate.getTime());
			advertbean.setPostingdate(postingsqldate);

			updateddate = formatter.parse(request.getParameter("updateddate"));
			java.sql.Date updatedsqldate = new java.sql.Date(
					updateddate.getTime());
			advertbean.setUpdateddate(updatedsqldate);

			lastapplydate = formatter
					.parse(request.getParameter("lastapplydate"));
			java.sql.Date sqllastapplydate = new java.sql.Date(
					lastapplydate.getTime());

			advertbean.setLastapplydate(sqllastapplydate);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		addao.addAdvert(advertbean);

	}

}
