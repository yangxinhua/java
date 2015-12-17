package com.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserDynamicResultAction extends ActionSupport {
	private String r;
	public String getR() {
		return r;
	}
	public void setR(String r) {
		this.r = r;
	}

	private int type;
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	public String execute()
	{
		if(1==type){
			r="/html/UserActionSuccess.jsp";
		}else if(2==type)
		{
			r="/html/UserActionError.jsp";
		}
		return SUCCESS;
	}
}
