package com.isedin.service.dao.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.isedin.bean.CompanyBean;
import com.isedin.bean.UserBean;
import com.isedin.service.db.ConnectionHelper;

public class UserDAOImp implements IUserDAO {

	static ConnectionHelper conn = new ConnectionHelper();

	public void AddEmployerUser(UserBean user, CompanyBean company)
			throws SQLException {

		Connection con = conn.getConnection();
		PreparedStatement stmt = null;

		String query = "INSERT INTO tblUserRegistration(UserName,Name,Surname,Email,Password,Cellphone) VALUES(?,?,?,?,?,?)";
		String query2 = "INSERT INTO tblCompanyInformation(Name,Sector,PhoneNumber,City,Town,District,UserName) VALUES(?,?,?,?,?,?,?)";
		String query3 = "INSERT INTO tblUser_Roles(UserName,RoleName) VALUES(?,?)";
		try {

			con.setAutoCommit(false);

			stmt = conn.getStatement(con, query);

			stmt.setString(1, user.getUsername());
			stmt.setString(2, user.getName());
			stmt.setString(3, user.getSurname());
			stmt.setString(4, user.getEmail());
			stmt.setString(5, user.getPassword());
			stmt.setString(6, user.getCellphone());

			stmt.executeUpdate();

			stmt = conn.getStatement(con, query2);

			stmt.setString(1, company.getName());
			stmt.setString(2, company.getSector());
			stmt.setString(3, company.getPhonenumber());
			stmt.setString(4, company.getCity());
			stmt.setString(5, company.getTown());
			stmt.setString(6, company.getDistrict());
			stmt.setString(7, user.getUsername());

			stmt.executeUpdate();

			stmt = conn.getStatement(con, query3);

			stmt.setString(1, user.getUsername());
			stmt.setString(2, "employer");

			stmt.executeUpdate();

			con.commit();
		} catch (

		SQLException e)

		{
			// TODO Auto-generated catch block
			e.printStackTrace();

			con.rollback();

		} finally {
			conn.closeConnection(con);
			conn.closeStatement(stmt);

		}
	}

}
