package com.isedin.service.dao.ad;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.isedin.bean.AdBean;
import com.isedin.service.db.ConnectionHelper;

public class AdDAOImp implements IAdDAO {

	static ConnectionHelper conn = new ConnectionHelper();

	public void addAdvert(AdBean advert) {

		Connection con = conn.getConnection();
		PreparedStatement stmt = null;

		String query = "INSERT INTO tblAdvert(Title,CompanyName,CountryCity,PostingDate,UpdatedDate,LastApplyDate,NumberOfPersonnel,Sector,PositionType,Description,Qualifications,JobField,PositionLevel,Experience,EducationalLevel) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		stmt = conn.getStatement(con, query);
		// stmt.setInt(1, 2);
		try {
			System.out.println(advert.getTitle());
			stmt.setString(1, advert.getTitle());
			stmt.setString(2, advert.getCompanyname());
			stmt.setString(3, advert.getCountry());
			stmt.setDate(4, advert.getPostingdate());
			stmt.setDate(5, advert.getUpdateddate());
			stmt.setDate(6, advert.getLastapplydate());
			stmt.setInt(7, advert.getNumberofpersonnel());
			stmt.setString(8, advert.getSector());
			stmt.setString(9, advert.getPositiontype());
			stmt.setString(10, advert.getDescription());
			stmt.setString(11, advert.getQualifications());
			stmt.setString(12, advert.getJobfield());
			stmt.setString(13, advert.getPositionlevel());
			stmt.setString(14, advert.getExperience());
			stmt.setString(15, advert.getEducationallevel());

			stmt.executeUpdate();

		} catch (

		SQLException e)

		{
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

}
