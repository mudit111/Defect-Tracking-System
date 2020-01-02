package com.defect.service;

import java.sql.SQLException;

import com.defect.entity.Password;
import com.defect.persistence.PasswordDao;
import com.defect.persistence.PasswordDaoImpl;

public class PasswordBlImpl implements PasswordBl {

	private PasswordDao passwordDao;

	public PasswordBlImpl() {
		passwordDao = new PasswordDaoImpl();
	}

	@Override
	public Password getPassword(String userPassword) throws ClassNotFoundException, SQLException {
		return passwordDao.getRecord(userPassword);
	}
}
