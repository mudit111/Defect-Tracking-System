package com.defect.service;

import java.sql.SQLException;

import com.defect.entity.Password;

public interface PasswordBl {

	Password getPassword(String userPassword) throws ClassNotFoundException, SQLException;
}
