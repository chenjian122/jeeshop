package com.sinspark.jeeshop.modules.sys.entity;

import java.io.Serializable;

/**
 * 用户Entity
 * @author sinspark
 * @version 2017/4/19
 */
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String id;					//编号
	private String loginName;		// 登录名
	private String password;		// 密码
	private String no;					// 工号
	private String name;				// 姓名
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
