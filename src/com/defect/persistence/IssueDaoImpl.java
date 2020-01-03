package com.defect.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.defect.entity.Issue;
import com.defect.util.DbConnection;

public class IssueDaoImpl implements IssueDao {

	@Override
	public int addRecord(Issue issue) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		connection = DbConnection.getDatabaseConnection();
		preparedStatement = connection.prepareStatement("insert into Issue values(?,?,?,?)");
		preparedStatement.setString(1, issue.getIssueName());
		preparedStatement.setString(2, issue.getIssueType());
		preparedStatement.setString(3, issue.getIssueProject());
		preparedStatement.setString(4, issue.getIssueClient());
		int status = preparedStatement.executeUpdate();
		connection.close();
		return status;
	}

	@Override
	public int updateRecord(Issue issue) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		connection = DbConnection.getDatabaseConnection();
		preparedStatement = connection.prepareStatement("update Issue set type=? where name=?");
		preparedStatement.setString(1, issue.getIssueType());
		preparedStatement.setString(2, issue.getIssueName());
		int status = preparedStatement.executeUpdate();
		connection.close();
		return status;
	}

	@Override
	public Issue getRecord(String issueName) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		connection = DbConnection.getDatabaseConnection();
		preparedStatement = connection.prepareStatement("select * from Issue where name = ?");
		preparedStatement.setString(1, issueName);
		resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			Issue issue = new Issue();
			issue.setIssueName(resultSet.getString("name"));
			issue.setIssueType(resultSet.getString("type"));
			issue.setIssueProject(resultSet.getString("project"));
			issue.setIssueClient(resultSet.getString("client"));
			connection.close();
			return issue;
		}
		return null;
	}

	@Override
	public List<Issue> getRecordsByClient(String clientName) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		connection = DbConnection.getDatabaseConnection();
		List<Issue> issueList = null;
		preparedStatement = connection.prepareStatement("select * from Issue where client = ?");
		preparedStatement.setString(1, clientName.trim());
		resultSet = preparedStatement.executeQuery();
		issueList = new ArrayList<>();
		while (resultSet.next()) {
			Issue issue = new Issue();
			issue.setIssueName(resultSet.getString("name"));
			issue.setIssueType(resultSet.getString("type"));
			issue.setIssueClient(resultSet.getString("client"));
			issue.setIssueProject(resultSet.getString("project"));
			issueList.add(issue);
		}
		connection.close();
		return issueList;
	}

	@Override
	public List<Issue> getRecordsByProject(String projectName) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		connection = DbConnection.getDatabaseConnection();
		List<Issue> issueList = null;
		preparedStatement = connection.prepareStatement("select * from Issue where project = ?");
		preparedStatement.setString(1, projectName);
		resultSet = preparedStatement.executeQuery();
		issueList = new ArrayList<>();
		while (resultSet.next()) {
			Issue issue = new Issue();
			issue.setIssueName(resultSet.getString("name"));
			issue.setIssueType(resultSet.getString("type"));
			issue.setIssueClient(resultSet.getString("client"));
			issue.setIssueProject(resultSet.getString("project"));
			issueList.add(issue);
		}
		connection.close();
		return issueList;
	}

	@Override
	public List<Issue> getRecordsByType(String issueType) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		connection = DbConnection.getDatabaseConnection();
		List<Issue> issueList = null;
		preparedStatement = connection.prepareStatement("select * from Issue where type = ?");
		preparedStatement.setString(1, issueType);
		resultSet = preparedStatement.executeQuery();
		issueList = new ArrayList<>();
		while (resultSet.next()) {
			Issue issue = new Issue();
			issue.setIssueName(resultSet.getString("name"));
			issue.setIssueType(resultSet.getString("type"));
			issue.setIssueClient(resultSet.getString("client"));
			issue.setIssueProject(resultSet.getString("project"));
			issueList.add(issue);
		}
		connection.close();
		return issueList;
	}

	@Override
	public int deleteRecord(String issueName) throws ClassNotFoundException, SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		connection = DbConnection.getDatabaseConnection();
		preparedStatement = connection.prepareStatement("delete from Issue where name=?");
		preparedStatement.setString(1, issueName);
		int status = preparedStatement.executeUpdate();
		connection.close();
		return status;
	}

	@Override
	public List<Issue> getAllRecords() throws ClassNotFoundException, SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		connection = DbConnection.getDatabaseConnection();
		List<Issue> issueList = null;
		preparedStatement = connection.prepareStatement("select * from Issue");
		resultSet = preparedStatement.executeQuery();
		issueList = new ArrayList<>();
		while (resultSet.next()) {
			Issue issue = new Issue();
			issue.setIssueName(resultSet.getString("name"));
			issue.setIssueType(resultSet.getString("type"));
			issue.setIssueClient(resultSet.getString("client"));
			issue.setIssueProject(resultSet.getString("project"));
			issueList.add(issue);
		}
		connection.close();
		return issueList;
	}
}
