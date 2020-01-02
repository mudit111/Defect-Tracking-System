package com.defect.persistence;

import java.sql.SQLException;

import com.defect.entity.Password;

public interface PasswordDao {

	Password getRecord(String userPassword) throws SQLException, ClassNotFoundException;
}
