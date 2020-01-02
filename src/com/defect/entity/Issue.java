package com.defect.entity;

public class Issue {

	private String issueName;
	private String issueType;
	private String issueProject;
	private String issueClient;

	public Issue() {

	}

	public Issue(String issueName, String issueType, String issueProject, String issueClient) {
		super();
		this.issueName = issueName;
		this.issueType = issueType;
		this.issueProject = issueProject;
		this.issueClient = issueClient;
	}

	public String getIssueName() {
		return issueName;
	}

	public void setIssueName(String issueName) {
		this.issueName = issueName;
	}

	public String getIssueType() {
		return issueType;
	}

	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}

	public String getIssueProject() {
		return issueProject;
	}

	public void setIssueProject(String issueProject) {
		this.issueProject = issueProject;
	}

	public String getIssueClient() {
		return issueClient;
	}

	public void setIssueClient(String issueClient) {
		this.issueClient = issueClient;
	}
}