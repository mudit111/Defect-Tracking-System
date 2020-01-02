package com.defect.client;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.defect.entity.Issue;
import com.defect.entity.Password;
import com.defect.persistence.IssueDao;
import com.defect.persistence.IssueDaoImpl;
import com.defect.service.IssueBl;
import com.defect.service.IssueBlImpl;
import com.defect.service.PasswordBl;
import com.defect.service.PasswordBlImpl;

public class MyMainClass {

	public static void main(String[] args) {
		PasswordBl passwordBl = new PasswordBlImpl();
		Password password = null;
		try {
			password = passwordBl.getPassword("amin");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println(password);

		IssueBl issueBl = new IssueBlImpl();

		/*
		 * Issue issue = new Issue("en-1", "enhancements", "testing", "amazon"); try {
		 * System.out.println(issueBl.addIssue(issue)); } catch (ClassNotFoundException
		 * | SQLException e) { e.printStackTrace(); }
		 */

		/*
		 * Issue issue1 = new Issue("bug-2", "work_request", "testing", "amazon"); try {
		 * System.out.println(issueBl.updateIssue(issue1)); } catch
		 * (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
		 */

		// Issue issue1 = new Issue("bug-2", "work_request", "testing", "amazon");
		/*
		 * try { System.out.println(issueBl.getIssue("bug-2").getIssueProject()); }
		 * catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
		 */
		/*
		 * try { List<Issue> issueList= new ArrayList<>(); issueList =
		 * issueBl.getIssuesByClient("sunlife"); System.out.println(issueList.size());
		 * for (Issue iterator : issueList) System.out.println(iterator.getIssueName());
		 * } catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }
		 */

//		try {
//			List<Issue> issueList = new ArrayList<>();
//			issueList = issueBl.getIssuesByProject("java");
//			System.out.println(issueList.size());
//			for (Issue iterator : issueList)
//				System.out.println(iterator.getIssueName());
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}

//		try {
//			List<Issue> issueList = new ArrayList<>();
//			issueList = issueBl.getIssuesByType("work_request");
//			System.out.println(issueList.size());
//			for (Issue iterator : issueList)
//				System.out.println(iterator.getIssueName());
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
		try {
			System.out.println(issueBl.deleteIssue("bug-1"));
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}
