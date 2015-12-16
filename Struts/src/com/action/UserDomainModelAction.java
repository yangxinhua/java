package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.vo.UserVO;

public class UserDomainModelAction extends ActionSupport {
	private UserVO user;
	
	public UserVO getUser() {
		return user;
	}

	public void setUser(UserVO user) {
		this.user = user;
	}

	public String add()
	{
		System.out.println("user.name="+user.getName());
		System.out.println("user.age="+user.getAge());
		return SUCCESS;
	}
}
