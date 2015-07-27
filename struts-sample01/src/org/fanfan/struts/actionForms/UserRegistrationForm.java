package org.fanfan.struts.actionForms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class UserRegistrationForm extends ActionForm {

	private String userName;
	private String logName;
	private String password;
	private String passwordCheck;
	private String email;
	private String phone;
	private String fax;
	
	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		userName = null;
		logName = null;
		password = null;
		passwordCheck = null;
		email = null;
		phone = null;
		fax = null;
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if(userName == null || userName.trim().equals("")){
			errors.add("userName", new ActionMessage("userRegistration.userName.problem"));
		}
		if(password == null || password.trim().equals("")){
			errors.add("password", new ActionMessage("userRegistration.password.problem"));
		}
		return errors;
	}



	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLogName() {
		return logName;
	}
	public void setLogName(String logName) {
		this.logName = logName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordCheck() {
		return passwordCheck;
	}
	public void setPasswordCheck(String passwordCheck) {
		this.passwordCheck = passwordCheck;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	
}
