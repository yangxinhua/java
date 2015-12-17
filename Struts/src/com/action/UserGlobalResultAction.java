package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserGlobalResultAction extends ActionSupport {
	private int type;
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public String execute()
	{
		if(1==type)
		{
			return SUCCESS;
		}else if(2==type)
		{
			return ERROR;
		}else
		{
			return "mainpage";
		}
	}

}
