package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.vo.UserVO;

public class UserModelDrivenAction extends ActionSupport implements ModelDriven<UserVO>{
	private UserVO user=new UserVO();
	@Override
	public UserVO getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	public String add()
	{
		System.out.println("user.name="+user.getName());
		System.out.println("user.age="+user.getAge());
		return SUCCESS;
	}
}
