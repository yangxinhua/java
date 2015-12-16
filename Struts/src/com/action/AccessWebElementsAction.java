package com.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class AccessWebElementsAction extends ActionSupport implements RequestAware,SessionAware,ApplicationAware{

	private Map<String, Object> application;
	private Map<String, Object> session;
	private Map<String, Object> request;
	private String name;
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

	private String password;
	@Override
	public void setApplication(Map<String, Object> application) {
		// TODO Auto-generated method stub
		this.application=application;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session=session;
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.request=request;
	}
	
	public String execute() {
		request.put("r", "name="+this.name+",password="+this.password);
		session.put("s", "name="+this.name+",password="+this.password);
		application.put("a", "name="+this.name+",password="+this.password);
		return SUCCESS; 
	}

}
