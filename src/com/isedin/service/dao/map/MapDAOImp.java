package com.isedin.service.dao.map;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.isedin.bean.DepartmentBean;
import com.isedin.service.db.ConnectionHelper;

public class MapDAOImp implements IMapDAO {

	static ConnectionHelper conn = new ConnectionHelper();

	@Override
	public void addDepartment(DepartmentBean dept) {
		// TODO Auto-generated method stub
		Connection con = conn.getConnection();
		PreparedStatement stmt = null;

		String query = "INSERT INTO tblDepartment(Coords,CompanyId,DepartmentName) VALUES(?,?,?)";

		stmt = conn.getStatement(con, query);

		try {
			stmt.setString(1, dept.getCoords());
			stmt.setInt(2, dept.getCompanyid());
			stmt.setString(3, dept.getDepartmentname());
			stmt.executeUpdate();

		} catch (

		SQLException e)

		{
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

}