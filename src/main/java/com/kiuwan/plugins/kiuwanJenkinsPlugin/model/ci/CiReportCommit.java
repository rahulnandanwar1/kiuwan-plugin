package com.kiuwan.plugins.kiuwanJenkinsPlugin.model.ci;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Bean for CI report commit
 *
 * @author <a href="mailto:felix.carnicero@kiuwan.com">fcarnicero</a>
 *
 */
public class CiReportCommit implements Serializable {

	private static final long serialVersionUID = -2096754050011277052L;
	
	private String branch;
	private String commitId;
	private List<String> parentCommitIds;
	private String commitMessage;
	private String author;
	private String commitDate;
	private List<CiReportFile> files = new ArrayList<>();

	public String getBranch() { return branch; }
	public void setBranch(String branch) { this.branch = branch; }

	public String getCommitId() { return commitId; }
	public void setCommitId(String commitId) { this.commitId = commitId; }

	public List<String> getParentCommitIds() { return parentCommitIds; }
	public void setParentCommitIds(List<String> parentCommitIds) { this.parentCommitIds = parentCommitIds; }

	public String getCommitMessage() { return commitMessage; }
	public void setCommitMessage(String commitMessage) { this.commitMessage = commitMessage; }

	public String getAuthor() { return author; }
	public void setAuthor(String author) { this.author = author; }

	public String getCommitDate() { return commitDate; }
	public void setCommitDate(String commitDate) { this.commitDate = commitDate; }

	public List<CiReportFile> getFiles() { return files; }
	public void setFiles(List<CiReportFile> files) { this.files = files; }
}