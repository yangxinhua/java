package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserResultParamAction extends ActionSupport{
	private int type;
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String execute()
	{
		return SUCCESS;
	}
}
