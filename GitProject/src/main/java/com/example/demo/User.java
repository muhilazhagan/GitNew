package com.example.demo;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "user_details")
public class User {

	@Id
	private String userCode;
	private String password;
	private String userName;
	private boolean isActive;
	private boolean isEnabled;
	private String role;
	@Basic
	@Temporal(TemporalType.DATE)
	private Date cr_dt;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userCode, String password, String userName, boolean isActive, boolean isEnabled, String role, Date cr_dt) {
		super();
		this.userCode = userCode;
		this.password = password;
		this.userName = userName;
		this.isActive = isActive;
		this.isEnabled = isEnabled;
		this.role = role;
		this.cr_dt = cr_dt;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Date getCr_dt() {
		return cr_dt;
	}

	public void setCr_dt(Date cr_dt) {
		this.cr_dt = cr_dt;
	}

}
