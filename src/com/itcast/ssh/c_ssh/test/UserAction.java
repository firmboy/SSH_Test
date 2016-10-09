package com.itcast.ssh.c_ssh.test;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String test() {
		User user = new User();
		user.setName("玛利亚");
		userService.save(user);
		//System.out.println("struts整合成功");
		return null;
	}

}
