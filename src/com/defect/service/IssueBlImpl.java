package com.defect.service;

import java.sql.SQLException;
import java.util.List;

import com.defect.entity.Issue;
import com.defect.persistence.IssueDao;
import com.defect.persistence.IssueDaoImpl;

public class IssueBlImpl implements IssueBl {

	private IssueDao issueDao;

	public IssueBlImpl() {
		issueDao = new IssueDaoImpl();
	}
	
	@Override
	public int addIssue(Issue issue) throws ClassNotFoundException, SQLException {
		return issueDao.addRecord(issue);
	}

	@Override
	public int updateIssue(Issue issue) throws ClassNotFoundException, SQLException {
		return issueDao.updateRecord(issue);
	}

	@Override
	public Issue getIssue(String issueName) throws ClassNotFoundException, SQLException {
		return issueDao.getRecord(issueName);
	}

	@Override
	public List<Issue> getIssuesByClient(String clientName) throws ClassNotFoundException, SQLException {
		return issueDao.getRecordsByClient(clientName);
	}

	@Override
	public List<Issue> getIssuesByProject(String projectName) throws ClassNotFoundException, SQLException {
		return issueDao.getRecordsByProject(projectName);
	}

	@Override
	public List<Issue> getIssuesByType(String issueType) throws ClassNotFoundException, SQLException {
		return issueDao.getRecordsByType(issueType);
	}

	@Override
	public int deleteIssue(String issueName) throws ClassNotFoundException, SQLException {
		return issueDao.deleteRecord(issueName);
	}

	@Override
	public List<Issue> getAllIssues() throws ClassNotFoundException, SQLException {
		return issueDao.getAllRecords();
	}
}
