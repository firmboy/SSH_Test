package com.itcast.ssh.a_spring_struts2.way1;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	

	public String test() {
		System.out.println("hehe");
		return null;
	}

}
