package com.defect.persistence;

import java.sql.SQLException;
import java.util.List;

import com.defect.entity.Issue;

public interface IssueDao {

	int addRecord(Issue issue) throws ClassNotFoundException, SQLException;

	int updateRecord(Issue issue) throws ClassNotFoundException, SQLException;

	Issue getRecord(String issueName) throws ClassNotFoundException, SQLException;

	List<Issue> getRecordsByClient(String clientName) throws ClassNotFoundException, SQLException;

	List<Issue> getRecordsByProject(String projectName) throws ClassNotFoundException, SQLException;

	List<Issue> getRecordsByType(String issueType) throws ClassNotFoundException, SQLException;

	int deleteRecord(String issueName) throws ClassNotFoundException, SQLException;

}
