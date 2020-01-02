package com.defect.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.defect.entity.Password;
import com.defect.util.DbConnection;

public class PasswordDaoImpl implements PasswordDao {

	@Override
	public Password getRecord(String userPassword) throws SQLException, ClassNotFoundException {
		Connection connection = DbConnection.getDatabaseConnection();
		PreparedStatement preparedStatement = connection.prepareStatement("select * from Password where password = ?");
		preparedStatement.setString(1, userPassword);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			Password password = new Password();
			password.setPassword(resultSet.getString("password"));
			connection.close();
			return password;
		}
		return null;
	}
}