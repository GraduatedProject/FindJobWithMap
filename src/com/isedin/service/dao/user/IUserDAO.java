package com.isedin.service.dao.user;

import java.sql.SQLException;

import com.isedin.bean.CompanyBean;
import com.isedin.bean.UserBean;

public interface IUserDAO {

	public void AddEmployerUser(UserBean user, CompanyBean company)
			throws SQLException;

}
