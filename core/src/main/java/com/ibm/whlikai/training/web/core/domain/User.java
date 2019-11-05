package com.ibm.whlikai.training.web.core.domain;

public class User {
	private String id;
	private String name;
	private String password;
	private String project;
	private String repositoryAddress;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRepositoryAddress() {
		return repositoryAddress;
	}

	public void setRepositoryAddress(String repositoryAddress) {
		this.repositoryAddress = repositoryAddress;
	}

}
