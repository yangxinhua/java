package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserSimpleValidAction extends ActionSupport{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String add()
	{
		if(null==name||!"admin".equals(name))
		{
			this.addFieldError("name", "name is error");
			return ERROR;
		}
		return SUCCESS;
	}
}
