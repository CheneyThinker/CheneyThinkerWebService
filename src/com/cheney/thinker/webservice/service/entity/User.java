package com.cheney.thinker.webservice.service.entity;

public class User {
	
	private Integer id;
	private String realName;
	
	public User() {
	}
	public User(Integer id, String realName) {
		this.id = id;
		this.realName = realName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

}
