package com.itcast.ssh.a_spring_struts2.way2;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String test() {
		//System.out.println("hehe");
		System.out.println(this);
		userService.save();
		return null;
	}

}
