package com.defect.service;

import java.sql.SQLException;
import java.util.List;

import com.defect.entity.Issue;

public interface IssueBl {

	int addIssue(Issue issue) throws ClassNotFoundException, SQLException;

	int updateIssue(Issue issue) throws ClassNotFoundException, SQLException;

	Issue getIssue(String issueName) throws ClassNotFoundException, SQLException;

	List<Issue> getIssuesByClient(String clientName) throws ClassNotFoundException, SQLException;

	List<Issue> getIssuesByProject(String projectName) throws ClassNotFoundException, SQLException;

	List<Issue> getIssuesByType(String issueType) throws ClassNotFoundException, SQLException;

	int deleteIssue(String issueName) throws ClassNotFoundException, SQLException;

	List<Issue> getAllIssues()  throws ClassNotFoundException, SQLException;

}
